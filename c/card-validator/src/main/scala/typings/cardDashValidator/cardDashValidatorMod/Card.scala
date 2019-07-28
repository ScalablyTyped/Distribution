package typings.cardDashValidator.cardDashValidatorMod

import typings.cardDashValidator.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var code: Anon_Name
  var gaps: js.Array[Double]
  var isAmex: Boolean
  var lengths: js.Array[Double]
  var niceType: String
  var pattern: String
  var `type`: String
}

object Card {
  @scala.inline
  def apply(
    code: Anon_Name,
    gaps: js.Array[Double],
    isAmex: Boolean,
    lengths: js.Array[Double],
    niceType: String,
    pattern: String,
    `type`: String
  ): Card = {
    val __obj = js.Dynamic.literal(code = code, gaps = gaps, isAmex = isAmex, lengths = lengths, niceType = niceType, pattern = pattern)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Card]
  }
}

