package typings.columnify.columnifyMod

import org.scalablytyped.runtime.StringDictionary
import typings.columnify.columnifyStrings.center
import typings.columnify.columnifyStrings.centre
import typings.columnify.columnifyStrings.left
import typings.columnify.columnifyStrings.maxWidth
import typings.columnify.columnifyStrings.minWidth
import typings.columnify.columnifyStrings.right
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalOptions extends Options {
  var columnSplitter: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  var config: js.UndefOr[StringDictionary[Options]] = js.undefined
  var maxLineWidth: js.UndefOr[Double] = js.undefined
  var truncate: js.UndefOr[Boolean] = js.undefined
  var widths: js.UndefOr[StringDictionary[Pick[Options, minWidth | maxWidth]]] = js.undefined
}

object GlobalOptions {
  @scala.inline
  def apply(
    align: left | center | centre | right = null,
    columnSplitter: String = null,
    columns: js.Array[String] = null,
    config: StringDictionary[Options] = null,
    dataTransform: /* data */ String => String = null,
    headingTransform: /* data */ String => String = null,
    maxLineWidth: Int | Double = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    paddingChr: String = null,
    preserveNewLines: js.UndefOr[Boolean] = js.undefined,
    showHeaders: js.UndefOr[Boolean] = js.undefined,
    truncate: js.UndefOr[Boolean] = js.undefined,
    truncateMarker: String = null,
    widths: StringDictionary[Pick[Options, minWidth | maxWidth]] = null
  ): GlobalOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (columnSplitter != null) __obj.updateDynamic("columnSplitter")(columnSplitter)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (config != null) __obj.updateDynamic("config")(config)
    if (dataTransform != null) __obj.updateDynamic("dataTransform")(js.Any.fromFunction1(dataTransform))
    if (headingTransform != null) __obj.updateDynamic("headingTransform")(js.Any.fromFunction1(headingTransform))
    if (maxLineWidth != null) __obj.updateDynamic("maxLineWidth")(maxLineWidth.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (paddingChr != null) __obj.updateDynamic("paddingChr")(paddingChr)
    if (!js.isUndefined(preserveNewLines)) __obj.updateDynamic("preserveNewLines")(preserveNewLines)
    if (!js.isUndefined(showHeaders)) __obj.updateDynamic("showHeaders")(showHeaders)
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate)
    if (truncateMarker != null) __obj.updateDynamic("truncateMarker")(truncateMarker)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[GlobalOptions]
  }
}

