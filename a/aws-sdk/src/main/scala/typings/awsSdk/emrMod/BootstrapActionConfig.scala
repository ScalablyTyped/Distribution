package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapActionConfig extends js.Object {
  /**
    * The name of the bootstrap action.
    */
  var Name: XmlStringMaxLen256 = js.native
  /**
    * The script run by the bootstrap action.
    */
  var ScriptBootstrapAction: ScriptBootstrapActionConfig = js.native
}

object BootstrapActionConfig {
  @scala.inline
  def apply(Name: XmlStringMaxLen256, ScriptBootstrapAction: ScriptBootstrapActionConfig): BootstrapActionConfig = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ScriptBootstrapAction = ScriptBootstrapAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapActionConfig]
  }
}

