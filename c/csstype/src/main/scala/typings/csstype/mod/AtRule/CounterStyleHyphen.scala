package typings.csstype.mod.AtRule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CounterStyleHyphen[TLength, TTime] extends js.Object {
  var `additive-symbols`: js.UndefOr[String] = js.native
  var fallback: js.UndefOr[String] = js.native
  var negative: js.UndefOr[String] = js.native
  var pad: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var range: js.UndefOr[Range] = js.native
  var `speak-as`: js.UndefOr[SpeakAs] = js.native
  var suffix: js.UndefOr[String] = js.native
  var symbols: js.UndefOr[String] = js.native
  var system: js.UndefOr[System] = js.native
}

object CounterStyleHyphen {
  @scala.inline
  def apply[TLength, TTime](): CounterStyleHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStyleHyphen[TLength, TTime]]
  }
  @scala.inline
  implicit class CounterStyleHyphenOps[Self <: CounterStyleHyphen[_, _], TLength, TTime] (val x: Self with (CounterStyleHyphen[TLength, TTime])) extends AnyVal {
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
    def `setAdditive-symbols`(value: String): Self = this.set("additive-symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAdditive-symbols`: Self = this.set("additive-symbols", js.undefined)
    @scala.inline
    def setFallback(value: String): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setNegative(value: String): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    @scala.inline
    def setPad(value: String): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def `setSpeak-as`(value: SpeakAs): Self = this.set("speak-as", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSpeak-as`: Self = this.set("speak-as", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setSymbols(value: String): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    @scala.inline
    def setSystem(value: System): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
  
}

