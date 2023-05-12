package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait After extends StObject {
  
  var after: js.Array[CSSToken]
  
  var before: js.Array[CSSToken]
  
  var feature: Type
  
  var `type`: NodeType
}
object After {
  
  inline def apply(after: js.Array[CSSToken], before: js.Array[CSSToken], feature: Type, `type`: NodeType): After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: After] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: js.Array[CSSToken]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterVarargs(value: CSSToken*): Self = StObject.set(x, "after", js.Array(value*))
    
    inline def setBefore(value: js.Array[CSSToken]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeVarargs(value: CSSToken*): Self = StObject.set(x, "before", js.Array(value*))
    
    inline def setFeature(value: Type): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
