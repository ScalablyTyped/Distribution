package typings.bignumberJs.mod.BigNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** See `FORMAT` and `toFormat`. */
@js.native
trait Format extends js.Object {
  /** The decimal separator. */
  var decimalSeparator: js.UndefOr[String] = js.native
  /** The grouping separator of the fraction part. */
  var fractionGroupSeparator: js.UndefOr[String] = js.native
  /** The grouping size of the fraction part. */
  var fractionGroupSize: js.UndefOr[Double] = js.native
  /** The grouping separator of the integer part. */
  var groupSeparator: js.UndefOr[String] = js.native
  /** The primary grouping size of the integer part. */
  var groupSize: js.UndefOr[Double] = js.native
  /** The string to prepend. */
  var prefix: js.UndefOr[String] = js.native
  /** The secondary grouping size of the integer part. */
  var secondaryGroupSize: js.UndefOr[Double] = js.native
  /** The string to append. */
  var suffix: js.UndefOr[String] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
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
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    @scala.inline
    def setFractionGroupSeparator(value: String): Self = this.set("fractionGroupSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFractionGroupSeparator: Self = this.set("fractionGroupSeparator", js.undefined)
    @scala.inline
    def setFractionGroupSize(value: Double): Self = this.set("fractionGroupSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFractionGroupSize: Self = this.set("fractionGroupSize", js.undefined)
    @scala.inline
    def setGroupSeparator(value: String): Self = this.set("groupSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSeparator: Self = this.set("groupSeparator", js.undefined)
    @scala.inline
    def setGroupSize(value: Double): Self = this.set("groupSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSize: Self = this.set("groupSize", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSecondaryGroupSize(value: Double): Self = this.set("secondaryGroupSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryGroupSize: Self = this.set("secondaryGroupSize", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
  
}

