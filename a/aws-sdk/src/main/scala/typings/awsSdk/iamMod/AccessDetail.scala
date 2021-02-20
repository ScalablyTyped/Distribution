package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessDetail extends StObject {
  
  /**
    * The path of the Organizations entity (root, organizational unit, or account) from which an authenticated principal last attempted to access the service. AWS does not report unauthenticated requests. This field is null if no principals (IAM users, IAM roles, or root users) in the reported Organizations entity attempted to access the service within the reporting period.
    */
  var EntityPath: js.UndefOr[organizationsEntityPathType] = js.native
  
  /**
    * The date and time, in ISO 8601 date-time format, when an authenticated principal most recently attempted to access the service. AWS does not report unauthenticated requests. This field is null if no principals in the reported Organizations entity attempted to access the service within the reporting period.
    */
  var LastAuthenticatedTime: js.UndefOr[dateType] = js.native
  
  /**
    * The Region where the last service access attempt occurred. This field is null if no principals in the reported Organizations entity attempted to access the service within the reporting period.
    */
  var Region: js.UndefOr[stringType] = js.native
  
  /**
    * The name of the service in which access was attempted.
    */
  var ServiceName: serviceNameType = js.native
  
  /**
    * The namespace of the service in which access was attempted. To learn the service namespace of a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
    */
  var ServiceNamespace: serviceNamespaceType = js.native
  
  /**
    * The number of accounts with authenticated principals (root users, IAM users, and IAM roles) that attempted to access the service in the reporting period.
    */
  var TotalAuthenticatedEntities: js.UndefOr[integerType] = js.native
}
object AccessDetail {
  
  @scala.inline
  def apply(ServiceName: serviceNameType, ServiceNamespace: serviceNamespaceType): AccessDetail = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessDetail]
  }
  
  @scala.inline
  implicit class AccessDetailMutableBuilder[Self <: AccessDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityPath(value: organizationsEntityPathType): Self = StObject.set(x, "EntityPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityPathUndefined: Self = StObject.set(x, "EntityPath", js.undefined)
    
    @scala.inline
    def setLastAuthenticatedTime(value: dateType): Self = StObject.set(x, "LastAuthenticatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAuthenticatedTimeUndefined: Self = StObject.set(x, "LastAuthenticatedTime", js.undefined)
    
    @scala.inline
    def setRegion(value: stringType): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setServiceName(value: serviceNameType): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNamespace(value: serviceNamespaceType): Self = StObject.set(x, "ServiceNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAuthenticatedEntities(value: integerType): Self = StObject.set(x, "TotalAuthenticatedEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAuthenticatedEntitiesUndefined: Self = StObject.set(x, "TotalAuthenticatedEntities", js.undefined)
  }
}
