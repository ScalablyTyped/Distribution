package typings.chessJs.anon

import typings.chessJs.chessJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  /**
    * Pass true if you want this function to output verbose objects
    * instead of strings.
    */
  var verbose: js.UndefOr[`false`] = js.undefined
}

object `0` {
  @scala.inline
  def apply(verbose: `false` = null): `0` = {
    val __obj = js.Dynamic.literal()
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

