package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServiceSpecificCredentialsRequest extends js.Object {
  /**
    * Filters the returned results to only those for the specified AWS service. If not specified, then AWS returns service-specific credentials for all services.
    */
  var ServiceName: js.UndefOr[serviceName] = js.native
  /**
    * The name of the user whose service-specific credentials you want information about. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[userNameType] = js.native
}

object ListServiceSpecificCredentialsRequest {
  @scala.inline
  def apply(): ListServiceSpecificCredentialsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceSpecificCredentialsRequest]
  }
  @scala.inline
  implicit class ListServiceSpecificCredentialsRequestOps[Self <: ListServiceSpecificCredentialsRequest] (val x: Self) extends AnyVal {
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
    def deleteServiceName: Self = this.set("ServiceName", js.undefined)
    @scala.inline
    def setUserName(value: userNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
  
}

