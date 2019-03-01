package typings
package cliDashBoxLib.cliDashBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  var h: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var marks: js.UndefOr[stdLib.Partial[cliDashBoxLib.Marks]] = js.undefined
  var stringify: js.UndefOr[scala.Boolean] = js.undefined
  var w: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    h: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    marks: stdLib.Partial[cliDashBoxLib.Marks] = null,
    stringify: js.UndefOr[scala.Boolean] = js.undefined,
    w: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

