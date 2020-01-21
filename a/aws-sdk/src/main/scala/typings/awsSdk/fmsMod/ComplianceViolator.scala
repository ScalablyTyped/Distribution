package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceViolator extends js.Object {
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.fmsMod.ResourceId] = js.native
  /**
    * The resource type. This is in the format shown in the AWS Resource Types Reference. For example: AWS::ElasticLoadBalancingV2::LoadBalancer or AWS::CloudFront::Distribution.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.fmsMod.ResourceType] = js.native
  /**
    * The reason that the resource is not protected by the policy.
    */
  var ViolationReason: js.UndefOr[typings.awsSdk.fmsMod.ViolationReason] = js.native
}

object ComplianceViolator {
  @scala.inline
  def apply(
    ResourceId: ResourceId = null,
    ResourceType: ResourceType = null,
    ViolationReason: ViolationReason = null
  ): ComplianceViolator = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (ViolationReason != null) __obj.updateDynamic("ViolationReason")(ViolationReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceViolator]
  }
}

