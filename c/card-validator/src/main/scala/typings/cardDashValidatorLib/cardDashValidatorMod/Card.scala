package typings
package cardDashValidatorLib.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var code: cardDashValidatorLib.Anon_Name
  var gaps: js.Array[scala.Double]
  var isAmex: scala.Boolean
  var lengths: js.Array[scala.Double]
  var niceType: java.lang.String
  var pattern: java.lang.String
  var `type`: java.lang.String
}

object Card {
  @scala.inline
  def apply(
    code: cardDashValidatorLib.Anon_Name,
    gaps: js.Array[scala.Double],
    isAmex: scala.Boolean,
    lengths: js.Array[scala.Double],
    niceType: java.lang.String,
    pattern: java.lang.String,
    `type`: java.lang.String
  ): Card = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("gaps")(gaps)
    __obj.updateDynamic("isAmex")(isAmex)
    __obj.updateDynamic("lengths")(lengths)
    __obj.updateDynamic("niceType")(niceType)
    __obj.updateDynamic("pattern")(pattern)
    __obj.asInstanceOf[Card]
  }
}

