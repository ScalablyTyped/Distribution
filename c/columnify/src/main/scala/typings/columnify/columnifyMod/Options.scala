package typings.columnify.columnifyMod

import typings.columnify.columnifyStrings.center
import typings.columnify.columnifyStrings.centre
import typings.columnify.columnifyStrings.left
import typings.columnify.columnifyStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var align: js.UndefOr[left | center | centre | right] = js.undefined
  var dataTransform: js.UndefOr[js.Function1[/* data */ String, String]] = js.undefined
  var headingTransform: js.UndefOr[js.Function1[/* data */ String, String]] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var paddingChr: js.UndefOr[String] = js.undefined
  var preserveNewLines: js.UndefOr[Boolean] = js.undefined
  var showHeaders: js.UndefOr[Boolean] = js.undefined
  var truncateMarker: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    align: left | center | centre | right = null,
    dataTransform: /* data */ String => String = null,
    headingTransform: /* data */ String => String = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    paddingChr: String = null,
    preserveNewLines: js.UndefOr[Boolean] = js.undefined,
    showHeaders: js.UndefOr[Boolean] = js.undefined,
    truncateMarker: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (dataTransform != null) __obj.updateDynamic("dataTransform")(js.Any.fromFunction1(dataTransform))
    if (headingTransform != null) __obj.updateDynamic("headingTransform")(js.Any.fromFunction1(headingTransform))
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (paddingChr != null) __obj.updateDynamic("paddingChr")(paddingChr)
    if (!js.isUndefined(preserveNewLines)) __obj.updateDynamic("preserveNewLines")(preserveNewLines)
    if (!js.isUndefined(showHeaders)) __obj.updateDynamic("showHeaders")(showHeaders)
    if (truncateMarker != null) __obj.updateDynamic("truncateMarker")(truncateMarker)
    __obj.asInstanceOf[Options]
  }
}

