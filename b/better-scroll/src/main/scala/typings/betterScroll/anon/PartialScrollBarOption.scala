package typings.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.ScrollBarOption> */
trait PartialScrollBarOption extends js.Object {
  var fade: js.UndefOr[Boolean] = js.undefined
}

object PartialScrollBarOption {
  @scala.inline
  def apply(fade: js.UndefOr[Boolean] = js.undefined): PartialScrollBarOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScrollBarOption]
  }
}

