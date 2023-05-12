package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modifier extends StObject {
  
  var media: Before
  
  var modifier: js.Array[CSSToken]
  
  var `type`: NodeType
}
object Modifier {
  
  inline def apply(media: Before, modifier: js.Array[CSSToken], `type`: NodeType): Modifier = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Modifier] (val x: Self) extends AnyVal {
    
    inline def setMedia(value: Before): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setModifier(value: js.Array[CSSToken]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierVarargs(value: CSSToken*): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
