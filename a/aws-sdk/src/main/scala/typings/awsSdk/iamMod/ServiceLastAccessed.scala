package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceLastAccessed extends js.Object {
  
  /**
    * The date and time, in ISO 8601 date-time format, when an authenticated entity most recently attempted to access the service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticated: js.UndefOr[dateType] = js.native
  
  /**
    * The ARN of the authenticated entity (user or role) that last attempted to access the service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticatedEntity: js.UndefOr[arnType] = js.native
  
  /**
    * The Region from which the authenticated entity (user or role) last attempted to access the service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticatedRegion: js.UndefOr[stringType] = js.native
  
  /**
    * The name of the service in which access was attempted.
    */
  var ServiceName: serviceNameType = js.native
  
  /**
    * The namespace of the service in which access was attempted. To learn the service namespace of a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
    */
  var ServiceNamespace: serviceNamespaceType = js.native
  
  /**
    * The total number of authenticated principals (root user, IAM users, or IAM roles) that have attempted to access the service. This field is null if no principals attempted to access the service within the reporting period.
    */
  var TotalAuthenticatedEntities: js.UndefOr[integerType] = js.native
  
  /**
    * An object that contains details about the most recent attempt to access a tracked action within the service. This field is null if there no tracked actions or if the principal did not use the tracked actions within the reporting period. This field is also null if the report was generated at the service level and not the action level. For more information, see the Granularity field in GenerateServiceLastAccessedDetails.
    */
  var TrackedActionsLastAccessed: js.UndefOr[typings.awsSdk.iamMod.TrackedActionsLastAccessed] = js.native
}
object ServiceLastAccessed {
  
  @scala.inline
  def apply(ServiceName: serviceNameType, ServiceNamespace: serviceNamespaceType): ServiceLastAccessed = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLastAccessed]
  }
  
  @scala.inline
  implicit class ServiceLastAccessedOps[Self <: ServiceLastAccessed] (val x: Self) extends AnyVal {
    
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
    def setServiceName(value: serviceNameType): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNamespace(value: serviceNamespaceType): Self = this.set("ServiceNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAuthenticated(value: dateType): Self = this.set("LastAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAuthenticated: Self = this.set("LastAuthenticated", js.undefined)
    
    @scala.inline
    def setLastAuthenticatedEntity(value: arnType): Self = this.set("LastAuthenticatedEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAuthenticatedEntity: Self = this.set("LastAuthenticatedEntity", js.undefined)
    
    @scala.inline
    def setLastAuthenticatedRegion(value: stringType): Self = this.set("LastAuthenticatedRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAuthenticatedRegion: Self = this.set("LastAuthenticatedRegion", js.undefined)
    
    @scala.inline
    def setTotalAuthenticatedEntities(value: integerType): Self = this.set("TotalAuthenticatedEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalAuthenticatedEntities: Self = this.set("TotalAuthenticatedEntities", js.undefined)
    
    @scala.inline
    def setTrackedActionsLastAccessedVarargs(value: TrackedActionLastAccessed*): Self = this.set("TrackedActionsLastAccessed", js.Array(value :_*))
    
    @scala.inline
    def setTrackedActionsLastAccessed(value: TrackedActionsLastAccessed): Self = this.set("TrackedActionsLastAccessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackedActionsLastAccessed: Self = this.set("TrackedActionsLastAccessed", js.undefined)
  }
}
