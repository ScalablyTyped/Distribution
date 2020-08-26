package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceSpecificCredentialMetadata extends js.Object {
  /**
    * The date and time, in ISO 8601 date-time format, when the service-specific credential were created.
    */
  var CreateDate: dateType = js.native
  /**
    * The name of the service associated with the service-specific credential.
    */
  var ServiceName: serviceName = js.native
  /**
    * The unique identifier for the service-specific credential.
    */
  var ServiceSpecificCredentialId: serviceSpecificCredentialId = js.native
  /**
    * The generated user name for the service-specific credential.
    */
  var ServiceUserName: serviceUserName = js.native
  /**
    * The status of the service-specific credential. Active means that the key is valid for API calls, while Inactive means it is not.
    */
  var Status: statusType = js.native
  /**
    * The name of the IAM user associated with the service-specific credential.
    */
  var UserName: userNameType = js.native
}

object ServiceSpecificCredentialMetadata {
  @scala.inline
  def apply(
    CreateDate: dateType,
    ServiceName: serviceName,
    ServiceSpecificCredentialId: serviceSpecificCredentialId,
    ServiceUserName: serviceUserName,
    Status: statusType,
    UserName: userNameType
  ): ServiceSpecificCredentialMetadata = {
    val __obj = js.Dynamic.literal(CreateDate = CreateDate.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ServiceSpecificCredentialId = ServiceSpecificCredentialId.asInstanceOf[js.Any], ServiceUserName = ServiceUserName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSpecificCredentialMetadata]
  }
  @scala.inline
  implicit class ServiceSpecificCredentialMetadataOps[Self <: ServiceSpecificCredentialMetadata] (val x: Self) extends AnyVal {
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
    def setCreateDate(value: dateType): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceName(value: serviceName): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceSpecificCredentialId(value: serviceSpecificCredentialId): Self = this.set("ServiceSpecificCredentialId", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceUserName(value: serviceUserName): Self = this.set("ServiceUserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: statusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: userNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
  
}

