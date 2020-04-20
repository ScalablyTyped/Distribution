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
}

