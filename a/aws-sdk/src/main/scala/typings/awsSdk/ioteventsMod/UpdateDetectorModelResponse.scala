package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDetectorModelResponse extends js.Object {
  
  /**
    * Information about how the detector model is configured.
    */
  var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.native
}
object UpdateDetectorModelResponse {
  
  @scala.inline
  def apply(): UpdateDetectorModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDetectorModelResponse]
  }
  
  @scala.inline
  implicit class UpdateDetectorModelResponseOps[Self <: UpdateDetectorModelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetectorModelConfiguration(value: DetectorModelConfiguration): Self = this.set("detectorModelConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorModelConfiguration: Self = this.set("detectorModelConfiguration", js.undefined)
  }
}
