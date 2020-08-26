package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  decimalPlaces :number | undefined} & d3pie.d3pie.ID3PieStyleOptions */
@js.native
trait decimalPlacesnumberundefi extends js.Object {
  var color: js.UndefOr[String] = js.native
  var decimalPlaces: js.UndefOr[Double] = js.native
  var font: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
}

object decimalPlacesnumberundefi {
  @scala.inline
  def apply(): decimalPlacesnumberundefi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[decimalPlacesnumberundefi]
  }
  @scala.inline
  implicit class decimalPlacesnumberundefiOps[Self <: decimalPlacesnumberundefi] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDecimalPlaces(value: Double): Self = this.set("decimalPlaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalPlaces: Self = this.set("decimalPlaces", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
  }
  
}

