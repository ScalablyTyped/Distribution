package typings.creditDashCardDashType.creditDashCardDashTypeMod

import typings.creditDashCardDashType.Anon_Name
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardTypeInfo extends js.Object {
  var code: js.UndefOr[Anon_Name] = js.undefined
  var exactPattern: js.UndefOr[RegExp] = js.undefined
  var gaps: js.UndefOr[js.Array[Double]] = js.undefined
  var lengths: js.UndefOr[js.Array[Double]] = js.undefined
  var niceType: js.UndefOr[String] = js.undefined
  var prefixPattern: js.UndefOr[RegExp] = js.undefined
  var `type`: js.UndefOr[CardBrand] = js.undefined
}

object CreditCardTypeInfo {
  @scala.inline
  def apply(
    code: Anon_Name = null,
    exactPattern: RegExp = null,
    gaps: js.Array[Double] = null,
    lengths: js.Array[Double] = null,
    niceType: String = null,
    prefixPattern: RegExp = null,
    `type`: CardBrand = null
  ): CreditCardTypeInfo = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (exactPattern != null) __obj.updateDynamic("exactPattern")(exactPattern)
    if (gaps != null) __obj.updateDynamic("gaps")(gaps)
    if (lengths != null) __obj.updateDynamic("lengths")(lengths)
    if (niceType != null) __obj.updateDynamic("niceType")(niceType)
    if (prefixPattern != null) __obj.updateDynamic("prefixPattern")(prefixPattern)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreditCardTypeInfo]
  }
}

