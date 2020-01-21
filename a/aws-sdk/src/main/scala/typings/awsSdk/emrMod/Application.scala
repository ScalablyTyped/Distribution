package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  /**
    * This option is for advanced users only. This is meta information about third-party applications that third-party vendors use for testing purposes.
    */
  var AdditionalInfo: js.UndefOr[StringMap] = js.native
  /**
    * Arguments for Amazon EMR to pass to the application.
    */
  var Args: js.UndefOr[StringList] = js.native
  /**
    * The name of the application.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The version of the application.
    */
  var Version: js.UndefOr[String] = js.native
}

object Application {
  @scala.inline
  def apply(
    AdditionalInfo: StringMap = null,
    Args: StringList = null,
    Name: String = null,
    Version: String = null
  ): Application = {
    val __obj = js.Dynamic.literal()
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo.asInstanceOf[js.Any])
    if (Args != null) __obj.updateDynamic("Args")(Args.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
}

