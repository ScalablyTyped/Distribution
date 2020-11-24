package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2NetworkInterfaceAttachment extends js.Object {
  
  /**
    * Indicates when the attachment initiated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var AttachTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the network interface attachment
    */
  var AttachmentId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  
  /**
    * The device index of the network interface attachment on the instance.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The AWS account ID of the owner of the instance.
    */
  var InstanceOwnerId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The attachment state. Valid values: attaching | attached | detaching | detached 
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsEc2NetworkInterfaceAttachment {
  
  @scala.inline
  def apply(): AwsEc2NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkInterfaceAttachment]
  }
  
  @scala.inline
  implicit class AwsEc2NetworkInterfaceAttachmentOps[Self <: AwsEc2NetworkInterfaceAttachment] (val x: Self) extends AnyVal {
    
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
    def setAttachTime(value: NonEmptyString): Self = this.set("AttachTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachTime: Self = this.set("AttachTime", js.undefined)
    
    @scala.inline
    def setAttachmentId(value: NonEmptyString): Self = this.set("AttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentId: Self = this.set("AttachmentId", js.undefined)
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = this.set("DeleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("DeleteOnTermination", js.undefined)
    
    @scala.inline
    def setDeviceIndex(value: Integer): Self = this.set("DeviceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIndex: Self = this.set("DeviceIndex", js.undefined)
    
    @scala.inline
    def setInstanceId(value: NonEmptyString): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceOwnerId(value: NonEmptyString): Self = this.set("InstanceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceOwnerId: Self = this.set("InstanceOwnerId", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
