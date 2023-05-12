package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Media extends StObject {
  
  var media: MediaCondition
  
  var string: java.lang.String
  
  var `type`: NodeType
}
object Media {
  
  inline def apply(media: MediaCondition, string: java.lang.String, `type`: NodeType): Media = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Media] (val x: Self) extends AnyVal {
    
    inline def setMedia(value: MediaCondition): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
