package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScriptOutput extends js.Object {
  /**
    * A set of properties describing the requested script.
    */
  var Script: js.UndefOr[typings.awsSdk.gameliftMod.Script] = js.native
}

object DescribeScriptOutput {
  @scala.inline
  def apply(Script: Script = null): DescribeScriptOutput = {
    val __obj = js.Dynamic.literal()
    if (Script != null) __obj.updateDynamic("Script")(Script.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScriptOutput]
  }
}

