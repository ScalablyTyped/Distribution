package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableAWSServiceAccessRequest extends js.Object {
  /**
    * The service principal name of the AWS service for which you want to disable integration with your organization. This is typically in the form of a URL, such as  service-abbreviation.amazonaws.com.
    */
  var ServicePrincipal: typings.awsSdk.organizationsMod.ServicePrincipal = js.native
}

object DisableAWSServiceAccessRequest {
  @scala.inline
  def apply(ServicePrincipal: ServicePrincipal): DisableAWSServiceAccessRequest = {
    val __obj = js.Dynamic.literal(ServicePrincipal = ServicePrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableAWSServiceAccessRequest]
  }
  @scala.inline
  implicit class DisableAWSServiceAccessRequestOps[Self <: DisableAWSServiceAccessRequest] (val x: Self) extends AnyVal {
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
    def setServicePrincipal(value: ServicePrincipal): Self = this.set("ServicePrincipal", value.asInstanceOf[js.Any])
  }
  
}

