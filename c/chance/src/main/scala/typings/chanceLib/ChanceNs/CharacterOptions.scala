package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterOptions extends js.Object {
  var alpha: scala.Boolean
  var casing: chanceLib.chanceLibStrings.upper | chanceLib.chanceLibStrings.lower
  var numeric: scala.Boolean
  var pool: java.lang.String
  var symbols: java.lang.String
}

object CharacterOptions {
  @scala.inline
  def apply(
    alpha: scala.Boolean,
    casing: chanceLib.chanceLibStrings.upper | chanceLib.chanceLibStrings.lower,
    numeric: scala.Boolean,
    pool: java.lang.String,
    symbols: java.lang.String
  ): CharacterOptions = {
    val __obj = js.Dynamic.literal(alpha = alpha, casing = casing.asInstanceOf[js.Any], numeric = numeric, pool = pool, symbols = symbols)
  
    __obj.asInstanceOf[CharacterOptions]
  }
}

