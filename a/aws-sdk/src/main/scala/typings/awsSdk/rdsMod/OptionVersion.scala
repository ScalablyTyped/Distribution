package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionVersion extends js.Object {
  /**
    * True if the version is the default version of the option, and otherwise false.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The version of the option.
    */
  var Version: js.UndefOr[String] = js.native
}

object OptionVersion {
  @scala.inline
  def apply(IsDefault: js.UndefOr[Boolean] = js.undefined, Version: String = null): OptionVersion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault.get.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionVersion]
  }
}

