package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchBaselineIdentity extends js.Object {
  /**
    * The description of the patch baseline.
    */
  var BaselineDescription: js.UndefOr[typings.awsSdk.ssmMod.BaselineDescription] = js.native
  /**
    * The ID of the patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.native
  /**
    * The name of the patch baseline.
    */
  var BaselineName: js.UndefOr[typings.awsSdk.ssmMod.BaselineName] = js.native
  /**
    * Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.
    */
  var DefaultBaseline: js.UndefOr[typings.awsSdk.ssmMod.DefaultBaseline] = js.native
  /**
    * Defines the operating system the patch baseline applies to. The Default value is WINDOWS. 
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.ssmMod.OperatingSystem] = js.native
}

object PatchBaselineIdentity {
  @scala.inline
  def apply(
    BaselineDescription: BaselineDescription = null,
    BaselineId: BaselineId = null,
    BaselineName: BaselineName = null,
    DefaultBaseline: js.UndefOr[DefaultBaseline] = js.undefined,
    OperatingSystem: OperatingSystem = null
  ): PatchBaselineIdentity = {
    val __obj = js.Dynamic.literal()
    if (BaselineDescription != null) __obj.updateDynamic("BaselineDescription")(BaselineDescription.asInstanceOf[js.Any])
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId.asInstanceOf[js.Any])
    if (BaselineName != null) __obj.updateDynamic("BaselineName")(BaselineName.asInstanceOf[js.Any])
    if (!js.isUndefined(DefaultBaseline)) __obj.updateDynamic("DefaultBaseline")(DefaultBaseline.get.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchBaselineIdentity]
  }
}

