package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFargateProfileRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon EKS cluster to apply the Fargate profile to.
    */
  var clusterName: String = js.native
  /**
    * The name of the Fargate profile.
    */
  var fargateProfileName: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate profile. The pod execution role allows Fargate infrastructure to register with your cluster as a node, and it provides read access to Amazon ECR image repositories. For more information, see Pod Execution Role in the Amazon EKS User Guide.
    */
  var podExecutionRoleArn: String = js.native
  /**
    * The selectors to match for pods to use this Fargate profile. Each selector must have an associated namespace. Optionally, you can also specify labels for a namespace. You may specify up to five selectors in a Fargate profile.
    */
  var selectors: js.UndefOr[FargateProfileSelectors] = js.native
  /**
    * The IDs of subnets to launch your pods into. At this time, pods running on Fargate are not assigned public IP addresses, so only private subnets (with no direct route to an Internet Gateway) are accepted for this parameter.
    */
  var subnets: js.UndefOr[StringList] = js.native
  /**
    * The metadata to apply to the Fargate profile to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other resources associated with the Fargate profile, such as the pods that are scheduled with it.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateFargateProfileRequest {
  @scala.inline
  def apply(clusterName: String, fargateProfileName: String, podExecutionRoleArn: String): CreateFargateProfileRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], fargateProfileName = fargateProfileName.asInstanceOf[js.Any], podExecutionRoleArn = podExecutionRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFargateProfileRequest]
  }
  @scala.inline
  implicit class CreateFargateProfileRequestOps[Self <: CreateFargateProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFargateProfileName(value: String): Self = this.set("fargateProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPodExecutionRoleArn(value: String): Self = this.set("podExecutionRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: String): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    @scala.inline
    def setSelectorsVarargs(value: FargateProfileSelector*): Self = this.set("selectors", js.Array(value :_*))
    @scala.inline
    def setSelectors(value: FargateProfileSelectors): Self = this.set("selectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
    @scala.inline
    def setSubnetsVarargs(value: String*): Self = this.set("subnets", js.Array(value :_*))
    @scala.inline
    def setSubnets(value: StringList): Self = this.set("subnets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnets: Self = this.set("subnets", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

