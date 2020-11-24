package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageQuality extends js.Object {
  
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
  implicit class ImageQualityOps[Self <: ImageQuality] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrightness(value: Float): Self = this.set("Brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightness: Self = this.set("Brightness", js.undefined)
    
    @scala.inline
    def setSharpness(value: Float): Self = this.set("Sharpness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharpness: Self = this.set("Sharpness", js.undefined)
  }
}
