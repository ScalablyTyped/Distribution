package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Images extends StObject {
  
  var digital_delivery: Boolean
  
  var images: Boolean
  
  var physical_delivery: Boolean
  
  var rich_embed: Boolean
  
  var video: Boolean
}
object Images {
  
  inline def apply(
    digital_delivery: Boolean,
    images: Boolean,
    physical_delivery: Boolean,
    rich_embed: Boolean,
    video: Boolean
  ): Images = {
    val __obj = js.Dynamic.literal(digital_delivery = digital_delivery.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], physical_delivery = physical_delivery.asInstanceOf[js.Any], rich_embed = rich_embed.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Images]
  }
  
  extension [Self <: Images](x: Self) {
    
    inline def setDigital_delivery(value: Boolean): Self = StObject.set(x, "digital_delivery", value.asInstanceOf[js.Any])
    
    inline def setImages(value: Boolean): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setPhysical_delivery(value: Boolean): Self = StObject.set(x, "physical_delivery", value.asInstanceOf[js.Any])
    
    inline def setRich_embed(value: Boolean): Self = StObject.set(x, "rich_embed", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
