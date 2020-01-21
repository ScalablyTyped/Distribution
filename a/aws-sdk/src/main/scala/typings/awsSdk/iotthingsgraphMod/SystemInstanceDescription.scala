package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInstanceDescription extends js.Object {
  var definition: js.UndefOr[DefinitionDocument] = js.native
  /**
    * The AWS Identity and Access Management (IAM) role that AWS IoT Things Graph assumes during flow execution in a cloud deployment. This role must have read and write permissionss to AWS Lambda and AWS IoT and to any other AWS services that the flow uses.
    */
  var flowActionsRoleArn: js.UndefOr[RoleArn] = js.native
  var metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.native
  /**
    * The Amazon Simple Storage Service bucket where information about a system instance is stored.
    */
  var s3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * An object that contains summary information about a system instance.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.native
  /**
    * A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used in a system instance.
    */
  var validatedDependencyRevisions: js.UndefOr[DependencyRevisions] = js.native
  /**
    * The version of the user's namespace against which the system instance was validated.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.native
}

object SystemInstanceDescription {
  @scala.inline
  def apply(
    definition: DefinitionDocument = null,
    flowActionsRoleArn: RoleArn = null,
    metricsConfiguration: MetricsConfiguration = null,
    s3BucketName: S3BucketName = null,
    summary: SystemInstanceSummary = null,
    validatedDependencyRevisions: DependencyRevisions = null,
    validatedNamespaceVersion: Int | Double = null
  ): SystemInstanceDescription = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (flowActionsRoleArn != null) __obj.updateDynamic("flowActionsRoleArn")(flowActionsRoleArn.asInstanceOf[js.Any])
    if (metricsConfiguration != null) __obj.updateDynamic("metricsConfiguration")(metricsConfiguration.asInstanceOf[js.Any])
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (validatedDependencyRevisions != null) __obj.updateDynamic("validatedDependencyRevisions")(validatedDependencyRevisions.asInstanceOf[js.Any])
    if (validatedNamespaceVersion != null) __obj.updateDynamic("validatedNamespaceVersion")(validatedNamespaceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInstanceDescription]
  }
}

