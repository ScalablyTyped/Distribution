package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterStyle extends js.Object {
  var additiveSymbols: js.UndefOr[String] = js.undefined
  var fallback: js.UndefOr[String] = js.undefined
  var negative: js.UndefOr[String] = js.undefined
  var pad: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[CounterStyleRangeProperty] = js.undefined
  var speakAs: js.UndefOr[CounterStyleSpeakAsProperty] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var symbols: js.UndefOr[String] = js.undefined
  var system: js.UndefOr[CounterStyleSystemProperty] = js.undefined
}

object CounterStyle {
  @scala.inline
  def apply(
    additiveSymbols: String = null,
    fallback: String = null,
    negative: String = null,
    pad: String = null,
    prefix: String = null,
    range: CounterStyleRangeProperty = null,
    speakAs: CounterStyleSpeakAsProperty = null,
    suffix: String = null,
    symbols: String = null,
    system: CounterStyleSystemProperty = null
  ): CounterStyle = {
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
    __obj.asInstanceOf[CounterStyle]
  }
}

