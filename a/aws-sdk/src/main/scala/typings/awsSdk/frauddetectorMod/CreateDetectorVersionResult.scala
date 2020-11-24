package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDetectorVersionResult extends js.Object {
  
  /**
    * The ID for the created version's parent detector.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  
  /**
    * The ID for the created detector. 
    */
  var detectorVersionId: js.UndefOr[nonEmptyString] = js.native
  
  /**
    * The status of the detector version.
    */
  var status: js.UndefOr[DetectorVersionStatus] = js.native
}
object CreateDetectorVersionResult {
  
  @scala.inline
  def apply(): CreateDetectorVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDetectorVersionResult]
  }
  
  @scala.inline
  implicit class CreateDetectorVersionResultOps[Self <: CreateDetectorVersionResult] (val x: Self) extends AnyVal {
    
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
    def setDetectorId(value: identifier): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorId: Self = this.set("detectorId", js.undefined)
    
    @scala.inline
    def setDetectorVersionId(value: nonEmptyString): Self = this.set("detectorVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorVersionId: Self = this.set("detectorVersionId", js.undefined)
    
    @scala.inline
    def setStatus(value: DetectorVersionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
