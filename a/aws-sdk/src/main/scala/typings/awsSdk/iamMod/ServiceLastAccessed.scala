package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    ServiceName: serviceNameType,
    ServiceNamespace: serviceNamespaceType,
    LastAuthenticated: dateType = null,
    LastAuthenticatedEntity: arnType = null,
    LastAuthenticatedRegion: stringType = null,
    TotalAuthenticatedEntities: js.UndefOr[integerType] = js.undefined,
    TrackedActionsLastAccessed: TrackedActionsLastAccessed = null
  ): ServiceLastAccessed = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    if (LastAuthenticated != null) __obj.updateDynamic("LastAuthenticated")(LastAuthenticated.asInstanceOf[js.Any])
    if (LastAuthenticatedEntity != null) __obj.updateDynamic("LastAuthenticatedEntity")(LastAuthenticatedEntity.asInstanceOf[js.Any])
    if (LastAuthenticatedRegion != null) __obj.updateDynamic("LastAuthenticatedRegion")(LastAuthenticatedRegion.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalAuthenticatedEntities)) __obj.updateDynamic("TotalAuthenticatedEntities")(TotalAuthenticatedEntities.get.asInstanceOf[js.Any])
    if (TrackedActionsLastAccessed != null) __obj.updateDynamic("TrackedActionsLastAccessed")(TrackedActionsLastAccessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLastAccessed]
  }
}

