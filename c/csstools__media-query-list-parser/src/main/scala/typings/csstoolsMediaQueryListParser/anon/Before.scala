package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Before extends StObject {
  
  var after: js.Array[CSSToken]
  
  var before: js.Array[CSSToken]
  
  var media: Any
  
  var `type`: NodeType
}
object Before {
  
  inline def apply(after: js.Array[CSSToken], before: js.Array[CSSToken], media: Any, `type`: NodeType): Before = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Before] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: js.Array[CSSToken]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterVarargs(value: CSSToken*): Self = StObject.set(x, "after", js.Array(value*))
    
    inline def setBefore(value: js.Array[CSSToken]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeVarargs(value: CSSToken*): Self = StObject.set(x, "before", js.Array(value*))
    
    inline def setMedia(value: Any): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
