package typings.creditCardType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<credit-card-type.credit-card-type/dist/types.CreditCardType> */
@js.native
trait PartialCreditCardType extends js.Object {
  var code: js.UndefOr[Name] = js.native
  var gaps: js.UndefOr[js.Array[Double]] = js.native
  var lengths: js.UndefOr[js.Array[Double]] = js.native
  var matchStrength: js.UndefOr[Double] = js.native
  var niceType: js.UndefOr[String] = js.native
  var patterns: js.UndefOr[js.Array[js.Array[Double] | Double]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object PartialCreditCardType {
  @scala.inline
  def apply(): PartialCreditCardType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreditCardType]
  }
  @scala.inline
  implicit class PartialCreditCardTypeOps[Self <: PartialCreditCardType] (val x: Self) extends AnyVal {
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
    def setCode(value: Name): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setGapsVarargs(value: Double*): Self = this.set("gaps", js.Array(value :_*))
    @scala.inline
    def setGaps(value: js.Array[Double]): Self = this.set("gaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGaps: Self = this.set("gaps", js.undefined)
    @scala.inline
    def setLengthsVarargs(value: Double*): Self = this.set("lengths", js.Array(value :_*))
    @scala.inline
    def setLengths(value: js.Array[Double]): Self = this.set("lengths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengths: Self = this.set("lengths", js.undefined)
    @scala.inline
    def setMatchStrength(value: Double): Self = this.set("matchStrength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchStrength: Self = this.set("matchStrength", js.undefined)
    @scala.inline
    def setNiceType(value: String): Self = this.set("niceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNiceType: Self = this.set("niceType", js.undefined)
    @scala.inline
    def setPatternsVarargs(value: (js.Array[Double] | Double)*): Self = this.set("patterns", js.Array(value :_*))
    @scala.inline
    def setPatterns(value: js.Array[js.Array[Double] | Double]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatterns: Self = this.set("patterns", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

