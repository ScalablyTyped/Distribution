package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterStyleHyphenFallback extends js.Object {
  var `additive-symbols`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var fallback: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var negative: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var pad: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var prefix: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var range: js.UndefOr[CounterStyleRangeProperty | js.Array[CounterStyleRangeProperty]] = js.undefined
  var `speak-as`: js.UndefOr[CounterStyleSpeakAsProperty | js.Array[CounterStyleSpeakAsProperty]] = js.undefined
  var suffix: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var symbols: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var system: js.UndefOr[CounterStyleSystemProperty | js.Array[CounterStyleSystemProperty]] = js.undefined
}

object CounterStyleHyphenFallback {
  @scala.inline
  def apply(
    `additive-symbols`: java.lang.String | js.Array[java.lang.String] = null,
    fallback: java.lang.String | js.Array[java.lang.String] = null,
    negative: java.lang.String | js.Array[java.lang.String] = null,
    pad: java.lang.String | js.Array[java.lang.String] = null,
    prefix: java.lang.String | js.Array[java.lang.String] = null,
    range: CounterStyleRangeProperty | js.Array[CounterStyleRangeProperty] = null,
    `speak-as`: CounterStyleSpeakAsProperty | js.Array[CounterStyleSpeakAsProperty] = null,
    suffix: java.lang.String | js.Array[java.lang.String] = null,
    symbols: java.lang.String | js.Array[java.lang.String] = null,
    system: CounterStyleSystemProperty | js.Array[CounterStyleSystemProperty] = null
  ): CounterStyleHyphenFallback = {
    val __obj = js.Dynamic.literal()
    if (`additive-symbols` != null) __obj.updateDynamic("additive-symbols")(`additive-symbols`.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (negative != null) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (`speak-as` != null) __obj.updateDynamic("speak-as")(`speak-as`.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (symbols != null) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterStyleHyphenFallback]
  }
}

