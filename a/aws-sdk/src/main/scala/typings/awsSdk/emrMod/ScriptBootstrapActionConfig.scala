package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptBootstrapActionConfig extends js.Object {
  /**
    * A list of command line arguments to pass to the bootstrap action script.
    */
  var Args: js.UndefOr[XmlStringList] = js.native
  /**
    * Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file system.
    */
  var Path: XmlString = js.native
}

object ScriptBootstrapActionConfig {
  @scala.inline
  def apply(Path: XmlString, Args: XmlStringList = null): ScriptBootstrapActionConfig = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
    if (Args != null) __obj.updateDynamic("Args")(Args.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptBootstrapActionConfig]
  }
}

