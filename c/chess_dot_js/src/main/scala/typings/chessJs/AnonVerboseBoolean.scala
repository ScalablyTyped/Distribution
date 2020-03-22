package typings.chessJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVerboseBoolean extends js.Object {
  /**
    * Pass true if you want this function to output verbose objects
    * instead of strings.
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object AnonVerboseBoolean {
  @scala.inline
  def apply(verbose: js.UndefOr[Boolean] = js.undefined): AnonVerboseBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVerboseBoolean]
  }
}

