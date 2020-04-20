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
  var symbols: Boolean
}

object CharacterOptions {
  @scala.inline
  def apply(alpha: Boolean, casing: upper | lower, numeric: Boolean, pool: String, symbols: Boolean): CharacterOptions = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], casing = casing.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterOptions]
  }
}

