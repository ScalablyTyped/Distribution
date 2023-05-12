package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait And extends StObject {
  
  var and: js.UndefOr[js.Array[CSSToken]] = js.undefined
  
  var media: js.UndefOr[MediaCondition] = js.undefined
  
  var mediaType: js.Array[CSSToken]
  
  var modifier: js.Array[CSSToken]
  
  var string: java.lang.String
  
  var `type`: NodeType
}
object And {
  
  inline def apply(
    mediaType: js.Array[CSSToken],
    modifier: js.Array[CSSToken],
    string: java.lang.String,
    `type`: NodeType
  ): And = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[And]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: And] (val x: Self) extends AnyVal {
    
    inline def setAnd(value: js.Array[CSSToken]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    inline def setAndVarargs(value: CSSToken*): Self = StObject.set(x, "and", js.Array(value*))
    
    inline def setMedia(value: MediaCondition): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: js.Array[CSSToken]): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeVarargs(value: CSSToken*): Self = StObject.set(x, "mediaType", js.Array(value*))
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setModifier(value: js.Array[CSSToken]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierVarargs(value: CSSToken*): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
