package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationWarning extends js.Object {
  /**
    * The error codes and error messages.
    */
  var Errors: js.UndefOr[ErrorSet] = js.native
}

object ValidationWarning {
  @scala.inline
  def apply(Errors: ErrorSet = null): ValidationWarning = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationWarning]
  }
}

