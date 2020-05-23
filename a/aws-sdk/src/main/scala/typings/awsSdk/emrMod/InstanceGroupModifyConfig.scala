package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupModifyConfig extends js.Object {
  /**
    * A list of new or modified configurations to apply for an instance group.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to its original requested size.
    */
  var EC2InstanceIdsToTerminate: js.UndefOr[EC2InstanceIdsToTerminateList] = js.native
  /**
    * Target size for the instance group.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * Unique ID of the instance group to expand or shrink.
    */
  var InstanceGroupId: XmlStringMaxLen256 = js.native
  /**
    * Policy for customizing shrink operations.
    */
  var ShrinkPolicy: js.UndefOr[typings.awsSdk.emrMod.ShrinkPolicy] = js.native
}

object InstanceGroupModifyConfig {
  @scala.inline
  def apply(
    InstanceGroupId: XmlStringMaxLen256,
    Configurations: ConfigurationList = null,
    EC2InstanceIdsToTerminate: EC2InstanceIdsToTerminateList = null,
    InstanceCount: js.UndefOr[Integer] = js.undefined,
    ShrinkPolicy: ShrinkPolicy = null
  ): InstanceGroupModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceGroupId = InstanceGroupId.asInstanceOf[js.Any])
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations.asInstanceOf[js.Any])
    if (EC2InstanceIdsToTerminate != null) __obj.updateDynamic("EC2InstanceIdsToTerminate")(EC2InstanceIdsToTerminate.asInstanceOf[js.Any])
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount.get.asInstanceOf[js.Any])
    if (ShrinkPolicy != null) __obj.updateDynamic("ShrinkPolicy")(ShrinkPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupModifyConfig]
  }
}

