package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputGroup extends js.Object {
  /**
    * Custom output group name optionally defined by the user.  Only letters, numbers, and the underscore character allowed; only 32 characters allowed.
    */
  var Name: js.UndefOr[stringMax32] = js.native
  /**
    * Settings associated with the output group.
    */
  var OutputGroupSettings: typings.awsSdk.medialiveMod.OutputGroupSettings = js.native
  var Outputs: listOfOutput = js.native
}

object OutputGroup {
  @scala.inline
  def apply(OutputGroupSettings: OutputGroupSettings, Outputs: listOfOutput, Name: stringMax32 = null): OutputGroup = {
    val __obj = js.Dynamic.literal(OutputGroupSettings = OutputGroupSettings.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputGroup]
  }
}

