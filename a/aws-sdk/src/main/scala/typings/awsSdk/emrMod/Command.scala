package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  /**
    * Arguments for Amazon EMR to pass to the command for execution.
    */
  var Args: js.UndefOr[StringList] = js.native
  /**
    * The name of the command.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The Amazon S3 location of the command script.
    */
  var ScriptPath: js.UndefOr[String] = js.native
}

object Command {
  @scala.inline
  def apply(Args: StringList = null, Name: String = null, ScriptPath: String = null): Command = {
    val __obj = js.Dynamic.literal()
    if (Args != null) __obj.updateDynamic("Args")(Args.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ScriptPath != null) __obj.updateDynamic("ScriptPath")(ScriptPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

