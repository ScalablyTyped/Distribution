package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPoliciesGrantingServiceAccessRequest extends StObject {
  
  /**
    * The ARN of the IAM identity (user, group, or role) whose policies you want to list.
    */
  var Arn: arnType
  
  /**
    * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
    */
  var Marker: js.UndefOr[markerType] = js.undefined
  
  /**
    * The service namespace for the AWS services whose policies you want to list. To learn the service namespace for a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
    */
  var ServiceNamespaces: serviceNamespaceListType
}
object ListPoliciesGrantingServiceAccessRequest {
  
  @scala.inline
  def apply(Arn: arnType, ServiceNamespaces: serviceNamespaceListType): ListPoliciesGrantingServiceAccessRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ServiceNamespaces = ServiceNamespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPoliciesGrantingServiceAccessRequest]
  }
  
  @scala.inline
  implicit class ListPoliciesGrantingServiceAccessRequestMutableBuilder[Self <: ListPoliciesGrantingServiceAccessRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: markerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setServiceNamespaces(value: serviceNamespaceListType): Self = StObject.set(x, "ServiceNamespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNamespacesVarargs(value: serviceNamespaceType*): Self = StObject.set(x, "ServiceNamespaces", js.Array(value :_*))
  }
}
