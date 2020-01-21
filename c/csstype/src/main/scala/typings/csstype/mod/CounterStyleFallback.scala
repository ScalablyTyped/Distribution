package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterStyleFallback extends js.Object {
  var additiveSymbols: js.UndefOr[String | js.Array[String]] = js.undefined
  var fallback: js.UndefOr[String | js.Array[String]] = js.undefined
  var negative: js.UndefOr[String | js.Array[String]] = js.undefined
  var pad: js.UndefOr[String | js.Array[String]] = js.undefined
  var prefix: js.UndefOr[String | js.Array[String]] = js.undefined
  var range: js.UndefOr[CounterStyleRangeProperty | js.Array[CounterStyleRangeProperty]] = js.undefined
  var speakAs: js.UndefOr[CounterStyleSpeakAsProperty | js.Array[CounterStyleSpeakAsProperty]] = js.undefined
  var suffix: js.UndefOr[String | js.Array[String]] = js.undefined
  var symbols: js.UndefOr[String | js.Array[String]] = js.undefined
  var system: js.UndefOr[CounterStyleSystemProperty | js.Array[CounterStyleSystemProperty]] = js.undefined
}

object CounterStyleFallback {
  @scala.inline
  def apply(
    additiveSymbols: String | js.Array[String] = null,
    fallback: String | js.Array[String] = null,
    negative: String | js.Array[String] = null,
    pad: String | js.Array[String] = null,
    prefix: String | js.Array[String] = null,
    range: CounterStyleRangeProperty | js.Array[CounterStyleRangeProperty] = null,
    speakAs: CounterStyleSpeakAsProperty | js.Array[CounterStyleSpeakAsProperty] = null,
    suffix: String | js.Array[String] = null,
    symbols: String | js.Array[String] = null,
    system: CounterStyleSystemProperty | js.Array[CounterStyleSystemProperty] = null
  ): CounterStyleFallback = {
    val __obj = js.Dynamic.literal()
    if (additiveSymbols != null) __obj.updateDynamic("additiveSymbols")(additiveSymbols.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (negative != null) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (speakAs != null) __obj.updateDynamic("speakAs")(speakAs.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (symbols != null) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterStyleFallback]
  }
}

