package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformBranchSummary extends js.Object {
  /**
    * The name of the platform branch.
    */
  var BranchName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.BranchName] = js.native
  /**
    * An ordinal number that designates the order in which platform branches have been added to a platform. This can be helpful, for example, if your code calls the ListPlatformBranches action and then displays a list of platform branches. A larger BranchOrder value designates a newer platform branch within the platform.
    */
  var BranchOrder: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.BranchOrder] = js.native
  /**
    * The support life cycle state of the platform branch. Possible values: beta | supported | deprecated | retired 
    */
  var LifecycleState: js.UndefOr[PlatformBranchLifecycleState] = js.native
  /**
    * The name of the platform to which this platform branch belongs.
    */
  var PlatformName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformName] = js.native
  /**
    * The environment tiers that platform versions in this branch support. Possible values: WebServer/Standard | Worker/SQS/HTTP 
    */
  var SupportedTierList: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SupportedTierList] = js.native
}

object PlatformBranchSummary {
  @scala.inline
  def apply(
    BranchName: BranchName = null,
    BranchOrder: Int | Double = null,
    LifecycleState: PlatformBranchLifecycleState = null,
    PlatformName: PlatformName = null,
    SupportedTierList: SupportedTierList = null
  ): PlatformBranchSummary = {
    val __obj = js.Dynamic.literal()
    if (BranchName != null) __obj.updateDynamic("BranchName")(BranchName.asInstanceOf[js.Any])
    if (BranchOrder != null) __obj.updateDynamic("BranchOrder")(BranchOrder.asInstanceOf[js.Any])
    if (LifecycleState != null) __obj.updateDynamic("LifecycleState")(LifecycleState.asInstanceOf[js.Any])
    if (PlatformName != null) __obj.updateDynamic("PlatformName")(PlatformName.asInstanceOf[js.Any])
    if (SupportedTierList != null) __obj.updateDynamic("SupportedTierList")(SupportedTierList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformBranchSummary]
  }
}

