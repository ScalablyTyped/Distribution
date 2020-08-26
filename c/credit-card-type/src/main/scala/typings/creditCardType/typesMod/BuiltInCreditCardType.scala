package typings.creditCardType.typesMod

import typings.creditCardType.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltInCreditCardType extends CreditCardType {
  @JSName("code")
  var code_BuiltInCreditCardType: Size = js.native
  @JSName("niceType")
  var niceType_BuiltInCreditCardType: CreditCardTypeCardBrandNiceType = js.native
  @JSName("type")
  var type_BuiltInCreditCardType: CreditCardTypeCardBrandId = js.native
}

object BuiltInCreditCardType {
  @scala.inline
  def apply(
    code: Size,
    gaps: js.Array[Double],
    lengths: js.Array[Double],
    niceType: CreditCardTypeCardBrandNiceType,
    patterns: js.Array[js.Array[Double] | Double],
    `type`: CreditCardTypeCardBrandId
  ): BuiltInCreditCardType = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltInCreditCardType]
  }
  @scala.inline
  implicit class BuiltInCreditCardTypeOps[Self <: BuiltInCreditCardType] (val x: Self) extends AnyVal {
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
    def setCode(value: Size): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setNiceType(value: CreditCardTypeCardBrandNiceType): Self = this.set("niceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CreditCardTypeCardBrandId): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

