package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDefaultPatchBaselineResult extends js.Object {
  /**
    * The ID of the default patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.native
  /**
    * The operating system for the returned patch baseline. 
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.ssmMod.OperatingSystem] = js.native
}

object GetDefaultPatchBaselineResult {
  @scala.inline
  def apply(BaselineId: BaselineId = null, OperatingSystem: OperatingSystem = null): GetDefaultPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultPatchBaselineResult]
  }
}

