package typings.chance.Chance

import typings.chance.chanceStrings.lower
import typings.chance.chanceStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterOptions extends js.Object {
  var alpha: Boolean
  var casing: upper | lower
  var numeric: Boolean
  var pool: String
  var symbols: String
}

object CharacterOptions {
  @scala.inline
  def apply(alpha: Boolean, casing: upper | lower, numeric: Boolean, pool: String, symbols: String): CharacterOptions = {
    val __obj = js.Dynamic.literal(alpha = alpha, casing = casing.asInstanceOf[js.Any], numeric = numeric, pool = pool, symbols = symbols)
  
    __obj.asInstanceOf[CharacterOptions]
  }
}

