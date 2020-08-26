package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseOperationFailure extends js.Object {
  /**
    * Error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * Failure time.
    */
  var FailureTime: js.UndefOr[DateTime] = js.native
  /**
    * Reserved.
    */
  var MetadataList: js.UndefOr[typings.awsSdk.licensemanagerMod.MetadataList] = js.native
  /**
    * Name of the operation.
    */
  var OperationName: js.UndefOr[String] = js.native
  /**
    * The requester is "License Manager Automated Discovery".
    */
  var OperationRequestedBy: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  /**
    * ID of the AWS account that owns the resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.native
  /**
    * Resource type.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.native
}

object LicenseOperationFailure {
  @scala.inline
  def apply(): LicenseOperationFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseOperationFailure]
  }
  @scala.inline
  implicit class LicenseOperationFailureOps[Self <: LicenseOperationFailure] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setFailureTime(value: DateTime): Self = this.set("FailureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureTime: Self = this.set("FailureTime", js.undefined)
    @scala.inline
    def setMetadataListVarargs(value: Metadata*): Self = this.set("MetadataList", js.Array(value :_*))
    @scala.inline
    def setMetadataList(value: MetadataList): Self = this.set("MetadataList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataList: Self = this.set("MetadataList", js.undefined)
    @scala.inline
    def setOperationName(value: String): Self = this.set("OperationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("OperationName", js.undefined)
    @scala.inline
    def setOperationRequestedBy(value: String): Self = this.set("OperationRequestedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationRequestedBy: Self = this.set("OperationRequestedBy", js.undefined)
    @scala.inline
    def setResourceArn(value: String): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    @scala.inline
    def setResourceOwnerId(value: String): Self = this.set("ResourceOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceOwnerId: Self = this.set("ResourceOwnerId", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

