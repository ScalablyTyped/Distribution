package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackConfigurationManager extends js.Object {
  /**
    * The name. This parameter must be set to "Chef".
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The Chef version. This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows stacks. The default value for Linux stacks is 11.4.
    */
  var Version: js.UndefOr[String] = js.native
}

object StackConfigurationManager {
  @scala.inline
  def apply(Name: String = null, Version: String = null): StackConfigurationManager = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackConfigurationManager]
  }
}

