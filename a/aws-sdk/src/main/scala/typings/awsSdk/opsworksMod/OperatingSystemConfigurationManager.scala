package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystemConfigurationManager extends js.Object {
  /**
    * The name of the configuration manager, which is Chef.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The versions of the configuration manager that are supported by an operating system.
    */
  var Version: js.UndefOr[String] = js.native
}

object OperatingSystemConfigurationManager {
  @scala.inline
  def apply(Name: String = null, Version: String = null): OperatingSystemConfigurationManager = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatingSystemConfigurationManager]
  }
}

