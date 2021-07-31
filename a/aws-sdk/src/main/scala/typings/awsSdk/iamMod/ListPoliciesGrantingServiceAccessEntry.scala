package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPoliciesGrantingServiceAccessEntry extends StObject {
  
  /**
    * The PoliciesGrantingServiceAccess object that contains details about the policy.
    */
  var Policies: js.UndefOr[policyGrantingServiceAccessListType] = js.undefined
  
  /**
    * The namespace of the service that was accessed. To learn the service namespace of a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
    */
  var ServiceNamespace: js.UndefOr[serviceNamespaceType] = js.undefined
}
object ListPoliciesGrantingServiceAccessEntry {
  
  @scala.inline
  def apply(): ListPoliciesGrantingServiceAccessEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPoliciesGrantingServiceAccessEntry]
  }
  
  @scala.inline
  implicit class ListPoliciesGrantingServiceAccessEntryMutableBuilder[Self <: ListPoliciesGrantingServiceAccessEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicies(value: policyGrantingServiceAccessListType): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: PolicyGrantingServiceAccess*): Self = StObject.set(x, "Policies", js.Array(value :_*))
    
    @scala.inline
    def setServiceNamespace(value: serviceNamespaceType): Self = StObject.set(x, "ServiceNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNamespaceUndefined: Self = StObject.set(x, "ServiceNamespace", js.undefined)
  }
}
