package typings.commonmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  /**
    *  if true, straight quotes will be made curly, -- will be changed to an en dash, --- will be changed to an em dash, and ... will be changed to ellipses.
    */
  var smart: js.UndefOr[Boolean] = js.undefined
  var time: js.UndefOr[Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(smart: js.UndefOr[Boolean] = js.undefined, time: js.UndefOr[Boolean] = js.undefined): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(smart)) __obj.updateDynamic("smart")(smart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

