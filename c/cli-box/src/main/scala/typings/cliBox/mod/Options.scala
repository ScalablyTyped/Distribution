package typings.cliBox.mod

import typings.cliBox.anon.PartialMarks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var h: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var marks: js.UndefOr[PartialMarks] = js.undefined
  var stringify: js.UndefOr[Boolean] = js.undefined
  var w: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    h: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    marks: PartialMarks = null,
    stringify: js.UndefOr[Boolean] = js.undefined,
    w: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(h)) __obj.updateDynamic("h")(h.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(w)) __obj.updateDynamic("w")(w.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

