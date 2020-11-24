package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePublishingDestinationRequest extends js.Object {
  
  /**
    * The ID of the publishing destination to update.
    */
  var DestinationId: String = js.native
  
  /**
    * A DestinationProperties object that includes the DestinationArn and KmsKeyArn of the publishing destination.
    */
  var DestinationProperties: js.UndefOr[typings.awsSdk.guarddutyMod.DestinationProperties] = js.native
  
  /**
    * The ID of the detector associated with the publishing destinations to update.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}
object UpdatePublishingDestinationRequest {
  
  @scala.inline
  def apply(DestinationId: String, DetectorId: DetectorId): UpdatePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePublishingDestinationRequest]
  }
  
  @scala.inline
  implicit class UpdatePublishingDestinationRequestOps[Self <: UpdatePublishingDestinationRequest] (val x: Self) extends AnyVal {
    
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
    def setDestinationId(value: String): Self = this.set("DestinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationProperties(value: DestinationProperties): Self = this.set("DestinationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationProperties: Self = this.set("DestinationProperties", js.undefined)
  }
}
