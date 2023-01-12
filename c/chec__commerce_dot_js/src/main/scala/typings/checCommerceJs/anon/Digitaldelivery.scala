package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Digitaldelivery extends StObject {
  
  var digital_delivery: Boolean
  
  var images: Boolean
  
  var physical_delivery: Boolean
  
  var video: Boolean
}
object Digitaldelivery {
  
  inline def apply(digital_delivery: Boolean, images: Boolean, physical_delivery: Boolean, video: Boolean): Digitaldelivery = {
    val __obj = js.Dynamic.literal(digital_delivery = digital_delivery.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], physical_delivery = physical_delivery.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digitaldelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Digitaldelivery] (val x: Self) extends AnyVal {
    
    inline def setDigital_delivery(value: Boolean): Self = StObject.set(x, "digital_delivery", value.asInstanceOf[js.Any])
    
    inline def setImages(value: Boolean): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setPhysical_delivery(value: Boolean): Self = StObject.set(x, "physical_delivery", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
