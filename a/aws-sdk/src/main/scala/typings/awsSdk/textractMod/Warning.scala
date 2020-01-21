package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Warning extends js.Object {
  /**
    * The error code for the warning.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.textractMod.ErrorCode] = js.native
  /**
    * A list of the pages that the warning applies to.
    */
  var Pages: js.UndefOr[typings.awsSdk.textractMod.Pages] = js.native
}

object Warning {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, Pages: Pages = null): Warning = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (Pages != null) __obj.updateDynamic("Pages")(Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
}

