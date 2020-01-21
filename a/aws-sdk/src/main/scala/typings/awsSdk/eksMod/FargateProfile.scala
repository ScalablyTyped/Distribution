package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FargateProfile extends js.Object {
  /**
    * The name of the Amazon EKS cluster that the Fargate profile belongs to.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * The Unix epoch timestamp in seconds for when the Fargate profile was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * The full Amazon Resource Name (ARN) of the Fargate profile.
    */
  var fargateProfileArn: js.UndefOr[String] = js.native
  /**
    * The name of the Fargate profile.
    */
  var fargateProfileName: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate profile. For more information, see Pod Execution Role in the Amazon EKS User Guide.
    */
  var podExecutionRoleArn: js.UndefOr[String] = js.native
  /**
    * The selectors to match for pods to use this Fargate profile.
    */
  var selectors: js.UndefOr[FargateProfileSelectors] = js.native
  /**
    * The current status of the Fargate profile.
    */
  var status: js.UndefOr[FargateProfileStatus] = js.native
  /**
    * The IDs of subnets to launch pods into.
    */
  var subnets: js.UndefOr[StringList] = js.native
  /**
    * The metadata applied to the Fargate profile to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other resources associated with the Fargate profile, such as the pods that are scheduled with it.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object FargateProfile {
  @scala.inline
  def apply(
    clusterName: String = null,
    createdAt: Timestamp = null,
    fargateProfileArn: String = null,
    fargateProfileName: String = null,
    podExecutionRoleArn: String = null,
    selectors: FargateProfileSelectors = null,
    status: FargateProfileStatus = null,
    subnets: StringList = null,
    tags: TagMap = null
  ): FargateProfile = {
    val __obj = js.Dynamic.literal()
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (fargateProfileArn != null) __obj.updateDynamic("fargateProfileArn")(fargateProfileArn.asInstanceOf[js.Any])
    if (fargateProfileName != null) __obj.updateDynamic("fargateProfileName")(fargateProfileName.asInstanceOf[js.Any])
    if (podExecutionRoleArn != null) __obj.updateDynamic("podExecutionRoleArn")(podExecutionRoleArn.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subnets != null) __obj.updateDynamic("subnets")(subnets.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FargateProfile]
  }
}

