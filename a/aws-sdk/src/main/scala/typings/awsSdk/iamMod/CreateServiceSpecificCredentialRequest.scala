package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceSpecificCredentialRequest extends js.Object {
  /**
    * The name of the AWS service that is to be associated with the credentials. The service you specify here is the only service that can be accessed using these credentials.
    */
  var ServiceName: serviceName = js.native
  /**
    * The name of the IAM user that is to be associated with the credentials. The new service-specific credentials have the same permissions as the associated user except that they can be used only to access the specified service. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType = js.native
}

object CreateServiceSpecificCredentialRequest {
  @scala.inline
  def apply(ServiceName: serviceName, UserName: userNameType): CreateServiceSpecificCredentialRequest = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceSpecificCredentialRequest]
  }
  @scala.inline
  implicit class CreateServiceSpecificCredentialRequestOps[Self <: CreateServiceSpecificCredentialRequest] (val x: Self) extends AnyVal {
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
    def setServiceName(value: serviceName): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: userNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
  
}

