package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterStyle extends js.Object {
  var additiveSymbols: js.UndefOr[java.lang.String] = js.undefined
  var fallback: js.UndefOr[java.lang.String] = js.undefined
  var negative: js.UndefOr[java.lang.String] = js.undefined
  var pad: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[CounterStyleRangeProperty] = js.undefined
  var speakAs: js.UndefOr[CounterStyleSpeakAsProperty] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  var symbols: js.UndefOr[java.lang.String] = js.undefined
  var system: js.UndefOr[CounterStyleSystemProperty] = js.undefined
}

object CounterStyle {
  @scala.inline
  def apply(
    additiveSymbols: java.lang.String = null,
    fallback: java.lang.String = null,
    negative: java.lang.String = null,
    pad: java.lang.String = null,
    prefix: java.lang.String = null,
    range: CounterStyleRangeProperty = null,
    speakAs: CounterStyleSpeakAsProperty = null,
    suffix: java.lang.String = null,
    symbols: java.lang.String = null,
    system: CounterStyleSystemProperty = null
  ): CounterStyle = {
    val __obj = js.Dynamic.literal()
    if (additiveSymbols != null) __obj.updateDynamic("additiveSymbols")(additiveSymbols)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (negative != null) __obj.updateDynamic("negative")(negative)
    if (pad != null) __obj.updateDynamic("pad")(pad)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (speakAs != null) __obj.updateDynamic("speakAs")(speakAs.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (symbols != null) __obj.updateDynamic("symbols")(symbols)
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterStyle]
  }
}

