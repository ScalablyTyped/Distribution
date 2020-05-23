package typings.byteRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * @default false
    */
  var signed: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(signed: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

