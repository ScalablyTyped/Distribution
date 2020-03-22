package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof chance.Chance.StringOptions ]: std.Pick<chance.Chance.StringOptions, K>} */
trait KinkeyofStringOptionsPick extends js.Object {
  var alpha: PickStringOptionsalpha
  var casing: PickStringOptionscasing
  var length: PickStringOptionslength
  var numeric: PickStringOptionsnumeric
  var pool: PickStringOptionspool
  var symbols: PickStringOptionssymbols
}

object KinkeyofStringOptionsPick {
  @scala.inline
  def apply(
    alpha: PickStringOptionsalpha,
    casing: PickStringOptionscasing,
    length: PickStringOptionslength,
    numeric: PickStringOptionsnumeric,
    pool: PickStringOptionspool,
    symbols: PickStringOptionssymbols
  ): KinkeyofStringOptionsPick = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], casing = casing.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinkeyofStringOptionsPick]
  }
}

