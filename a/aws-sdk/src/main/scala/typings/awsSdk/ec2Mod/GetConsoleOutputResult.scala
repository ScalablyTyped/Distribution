package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConsoleOutputResult extends js.Object {
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The console output, base64-encoded. If you are using a command line tool, the tool decodes the output for you.
    */
  var Output: js.UndefOr[String] = js.native
  /**
    * The time at which the output was last updated.
    */
  var Timestamp: js.UndefOr[DateTime] = js.native
}

object GetConsoleOutputResult {
  @scala.inline
  def apply(InstanceId: String = null, Output: String = null, Timestamp: DateTime = null): GetConsoleOutputResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (Output != null) __obj.updateDynamic("Output")(Output.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConsoleOutputResult]
  }
}

