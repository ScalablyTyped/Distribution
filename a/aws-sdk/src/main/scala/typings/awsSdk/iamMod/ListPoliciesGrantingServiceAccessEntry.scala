package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPoliciesGrantingServiceAccessEntry extends js.Object {
  /**
    * The PoliciesGrantingServiceAccess object that contains details about the policy.
    */
  var Policies: js.UndefOr[policyGrantingServiceAccessListType] = js.native
  /**
    * The namespace of the service that was accessed. To learn the service namespace of a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
    */
  var ServiceNamespace: js.UndefOr[serviceNamespaceType] = js.native
}

object ListPoliciesGrantingServiceAccessEntry {
  @scala.inline
  def apply(
    Policies: policyGrantingServiceAccessListType = null,
    ServiceNamespace: serviceNamespaceType = null
  ): ListPoliciesGrantingServiceAccessEntry = {
    val __obj = js.Dynamic.literal()
    if (Policies != null) __obj.updateDynamic("Policies")(Policies.asInstanceOf[js.Any])
    if (ServiceNamespace != null) __obj.updateDynamic("ServiceNamespace")(ServiceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPoliciesGrantingServiceAccessEntry]
  }
}

