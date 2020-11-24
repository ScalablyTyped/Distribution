package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOTAUpdateResponse extends js.Object {
  
  /**
    * The AWS IoT job ARN associated with the OTA update.
    */
  var awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.native
  
  /**
    * The AWS IoT job ID associated with the OTA update.
    */
  var awsIotJobId: js.UndefOr[AwsIotJobId] = js.native
  
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.native
  
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.native
  
  /**
    * The OTA update status.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.native
}
object CreateOTAUpdateResponse {
  
  @scala.inline
  def apply(): CreateOTAUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOTAUpdateResponse]
  }
  
  @scala.inline
  implicit class CreateOTAUpdateResponseOps[Self <: CreateOTAUpdateResponse] (val x: Self) extends AnyVal {
    
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
    def setAwsIotJobArn(value: AwsIotJobArn): Self = this.set("awsIotJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsIotJobArn: Self = this.set("awsIotJobArn", js.undefined)
    
    @scala.inline
    def setAwsIotJobId(value: AwsIotJobId): Self = this.set("awsIotJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsIotJobId: Self = this.set("awsIotJobId", js.undefined)
    
    @scala.inline
    def setOtaUpdateArn(value: OTAUpdateArn): Self = this.set("otaUpdateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtaUpdateArn: Self = this.set("otaUpdateArn", js.undefined)
    
    @scala.inline
    def setOtaUpdateId(value: OTAUpdateId): Self = this.set("otaUpdateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtaUpdateId: Self = this.set("otaUpdateId", js.undefined)
    
    @scala.inline
    def setOtaUpdateStatus(value: OTAUpdateStatus): Self = this.set("otaUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtaUpdateStatus: Self = this.set("otaUpdateStatus", js.undefined)
  }
}
