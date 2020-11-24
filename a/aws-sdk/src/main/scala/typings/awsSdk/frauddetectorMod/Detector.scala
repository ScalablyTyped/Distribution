package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detector extends js.Object {
  
  /**
    * The detector ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  
  /**
    * Timestamp of when the detector was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  
  /**
    * The detector description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  
  /**
    * The name of the event type.
    */
  var eventTypeName: js.UndefOr[identifier] = js.native
  
  /**
    * Timestamp of when the detector was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
}
object Detector {
  
  @scala.inline
  def apply(): Detector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detector]
  }
  
  @scala.inline
  implicit class DetectorOps[Self <: Detector] (val x: Self) extends AnyVal {
    
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
    def setArn(value: fraudDetectorArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: time): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    
    @scala.inline
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDetectorId(value: identifier): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorId: Self = this.set("detectorId", js.undefined)
    
    @scala.inline
    def setEventTypeName(value: identifier): Self = this.set("eventTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTypeName: Self = this.set("eventTypeName", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: time): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
  }
}
