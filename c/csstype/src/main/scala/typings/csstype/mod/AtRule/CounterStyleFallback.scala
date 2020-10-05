package typings.csstype.mod.AtRule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof csstype.csstype.AtRule.CounterStyle<TLength, TTime> ]: csstype.csstype.AtRule.CounterStyle<TLength, TTime>[P] | std.Array<csstype.csstype.AtRule.CounterStyle<TLength, TTime>[P]>} */
@js.native
trait CounterStyleFallback[TLength, TTime] extends js.Object {
  var additiveSymbols: js.UndefOr[String | js.Array[js.UndefOr[String]]] = js.native
  var fallback: js.UndefOr[String | js.Array[js.UndefOr[String]]] = js.native
  var negative: js.UndefOr[String | js.Array[js.UndefOr[String]]] = js.native
  var pad: js.UndefOr[String | js.Array[js.UndefOr[String]]] = js.native
  var prefix: js.UndefOr[String | js.Array[js.UndefOr[String]]] = js.native
  var range: js.UndefOr[Range | js.Array[js.UndefOr[Range]]] = js.native
  var speakAs: js.UndefOr[SpeakAs | js.Array[js.UndefOr[SpeakAs]]] = js.native
  var suffix: js.UndefOr[String | js.Array[js.UndefOr[String]]] = js.native
  var symbols: js.UndefOr[String | js.Array[js.UndefOr[String]]] = js.native
  var system: js.UndefOr[System | js.Array[js.UndefOr[System]]] = js.native
}

object CounterStyleFallback {
  @scala.inline
  def apply[TLength, TTime](): CounterStyleFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStyleFallback[TLength, TTime]]
  }
  @scala.inline
  implicit class CounterStyleFallbackOps[Self <: CounterStyleFallback[_, _], TLength, TTime] (val x: Self with (CounterStyleFallback[TLength, TTime])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditiveSymbolsVarargs(value: js.UndefOr[String]*): Self = this.set("additiveSymbols", js.Array(value :_*))
    @scala.inline
    def setAdditiveSymbols(value: String | js.Array[js.UndefOr[String]]): Self = this.set("additiveSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditiveSymbols: Self = this.set("additiveSymbols", js.undefined)
    @scala.inline
    def setFallbackVarargs(value: js.UndefOr[String]*): Self = this.set("fallback", js.Array(value :_*))
    @scala.inline
    def setFallback(value: String | js.Array[js.UndefOr[String]]): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setNegativeVarargs(value: js.UndefOr[String]*): Self = this.set("negative", js.Array(value :_*))
    @scala.inline
    def setNegative(value: String | js.Array[js.UndefOr[String]]): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    @scala.inline
    def setPadVarargs(value: js.UndefOr[String]*): Self = this.set("pad", js.Array(value :_*))
    @scala.inline
    def setPad(value: String | js.Array[js.UndefOr[String]]): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    @scala.inline
    def setPrefixVarargs(value: js.UndefOr[String]*): Self = this.set("prefix", js.Array(value :_*))
    @scala.inline
    def setPrefix(value: String | js.Array[js.UndefOr[String]]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRangeVarargs(value: js.UndefOr[Range]*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: Range | js.Array[js.UndefOr[Range]]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setSpeakAsVarargs(value: js.UndefOr[SpeakAs]*): Self = this.set("speakAs", js.Array(value :_*))
    @scala.inline
    def setSpeakAs(value: SpeakAs | js.Array[js.UndefOr[SpeakAs]]): Self = this.set("speakAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeakAs: Self = this.set("speakAs", js.undefined)
    @scala.inline
    def setSuffixVarargs(value: js.UndefOr[String]*): Self = this.set("suffix", js.Array(value :_*))
    @scala.inline
    def setSuffix(value: String | js.Array[js.UndefOr[String]]): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setSymbolsVarargs(value: js.UndefOr[String]*): Self = this.set("symbols", js.Array(value :_*))
    @scala.inline
    def setSymbols(value: String | js.Array[js.UndefOr[String]]): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    @scala.inline
    def setSystemVarargs(value: js.UndefOr[System]*): Self = this.set("system", js.Array(value :_*))
    @scala.inline
    def setSystem(value: System | js.Array[js.UndefOr[System]]): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
  
}

