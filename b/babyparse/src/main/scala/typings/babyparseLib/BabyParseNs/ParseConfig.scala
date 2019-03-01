package typings
package babyparseLib.BabyParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseConfig extends js.Object {
                // default: false
  var comments: js.UndefOr[scala.Boolean] = js.undefined
    // default: undefined
  var complete: js.UndefOr[js.Function1[/* results */ ParseResult, scala.Unit]] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
              // default: false
  var download: js.UndefOr[scala.Boolean] = js.undefined
                // default: false
  var dynamicTyping: js.UndefOr[scala.Boolean] = js.undefined
                // default: 0
  var encoding: js.UndefOr[java.lang.String] = js.undefined
        // default: false
  var fastMode: js.UndefOr[scala.Boolean] = js.undefined
                // default: ""
  var header: js.UndefOr[scala.Boolean] = js.undefined
              // default: ""
  var newline: js.UndefOr[java.lang.String] = js.undefined
         // default: false
  var preview: js.UndefOr[scala.Double] = js.undefined
              // default: false
  var skipEmptyLines: js.UndefOr[scala.Boolean] = js.undefined
              // default: undefined
  // Callbacks
  var step: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, scala.Unit]] = js.undefined
               // default: ""
  var worker: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseConfig {
  @scala.inline
  def apply(
    comments: js.UndefOr[scala.Boolean] = js.undefined,
    complete: js.Function1[/* results */ ParseResult, scala.Unit] = null,
    delimiter: java.lang.String = null,
    download: js.UndefOr[scala.Boolean] = js.undefined,
    dynamicTyping: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    fastMode: js.UndefOr[scala.Boolean] = js.undefined,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    newline: java.lang.String = null,
    preview: scala.Int | scala.Double = null,
    skipEmptyLines: js.UndefOr[scala.Boolean] = js.undefined,
    step: js.Function2[/* results */ ParseResult, /* parser */ Parser, scala.Unit] = null,
    worker: js.UndefOr[scala.Boolean] = js.undefined
  ): ParseConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download)
    if (!js.isUndefined(dynamicTyping)) __obj.updateDynamic("dynamicTyping")(dynamicTyping)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(fastMode)) __obj.updateDynamic("fastMode")(fastMode)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyLines)) __obj.updateDynamic("skipEmptyLines")(skipEmptyLines)
    if (step != null) __obj.updateDynamic("step")(step)
    if (!js.isUndefined(worker)) __obj.updateDynamic("worker")(worker)
    __obj.asInstanceOf[ParseConfig]
  }
}

