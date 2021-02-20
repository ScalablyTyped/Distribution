package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageQuality extends StObject {
  
  /**
    * Value representing brightness of the face. The service returns a value between 0 and 100 (inclusive). A higher value indicates a brighter face image.
    */
  var Brightness: js.UndefOr[Float] = js.native
  
  /**
    * Value representing sharpness of the face. The service returns a value between 0 and 100 (inclusive). A higher value indicates a sharper face image.
    */
  var Sharpness: js.UndefOr[Float] = js.native
}
object ImageQuality {
  
  @scala.inline
  def apply(): ImageQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageQuality]
  }
  
  @scala.inline
  implicit class ImageQualityMutableBuilder[Self <: ImageQuality] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrightness(value: Float): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightnessUndefined: Self = StObject.set(x, "Brightness", js.undefined)
    
    @scala.inline
    def setSharpness(value: Float): Self = StObject.set(x, "Sharpness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharpnessUndefined: Self = StObject.set(x, "Sharpness", js.undefined)
  }
}
