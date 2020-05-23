package typings.chessJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerboseBoolean extends js.Object {
  /**
    * Pass true if you want this function to output verbose objects
    * instead of strings.
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object VerboseBoolean {
  @scala.inline
  def apply(verbose: js.UndefOr[Boolean] = js.undefined): VerboseBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerboseBoolean]
  }
}

