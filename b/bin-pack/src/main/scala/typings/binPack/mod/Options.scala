package typings.binPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Packing options. */
trait Options extends js.Object {
  /** Use inPlace=true to add x,y fields to the bins argument. */
  var inPlace: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(inPlace: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inPlace)) __obj.updateDynamic("inPlace")(inPlace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

