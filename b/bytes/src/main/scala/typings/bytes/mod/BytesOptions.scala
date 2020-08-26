package typings.bytes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BytesOptions extends js.Object {
  var decimalPlaces: js.UndefOr[Double] = js.native
  var fixedDecimals: js.UndefOr[Boolean] = js.native
  var thousandsSeparator: js.UndefOr[String] = js.native
  var unit: js.UndefOr[Unit] = js.native
  var unitSeparator: js.UndefOr[String] = js.native
}

object BytesOptions {
  @scala.inline
  def apply(): BytesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BytesOptions]
  }
  @scala.inline
  implicit class BytesOptionsOps[Self <: BytesOptions] (val x: Self) extends AnyVal {
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
    def setDecimalPlaces(value: Double): Self = this.set("decimalPlaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalPlaces: Self = this.set("decimalPlaces", js.undefined)
    @scala.inline
    def setFixedDecimals(value: Boolean): Self = this.set("fixedDecimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedDecimals: Self = this.set("fixedDecimals", js.undefined)
    @scala.inline
    def setThousandsSeparator(value: String): Self = this.set("thousandsSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousandsSeparator: Self = this.set("thousandsSeparator", js.undefined)
    @scala.inline
    def setUnit(value: Unit): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setUnitSeparator(value: String): Self = this.set("unitSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitSeparator: Self = this.set("unitSeparator", js.undefined)
  }
  
}

