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
}

