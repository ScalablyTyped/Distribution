package typings.chance.Chance

import typings.chance.chanceStrings.lower
import typings.chance.chanceStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined chance.Chance.CharacterOptions & {  length  :number} */
trait StringOptions extends js.Object {
  var alpha: Boolean
  var casing: upper | lower
  var length: Double
  var numeric: Boolean
  var pool: String
  var symbols: Boolean
}

object StringOptions {
  @scala.inline
  def apply(
    alpha: Boolean,
    casing: upper | lower,
    length: Double,
    numeric: Boolean,
    pool: String,
    symbols: Boolean
  ): StringOptions = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], casing = casing.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringOptions]
  }
}

