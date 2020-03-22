package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof chance.Chance.CharacterOptions ]: std.Pick<chance.Chance.CharacterOptions, K>} */
trait KinkeyofCharacterOptionsP extends js.Object {
  var alpha: PickCharacterOptionsalpha
  var casing: PickCharacterOptionscasin
  var numeric: PickCharacterOptionsnumer
  var pool: PickCharacterOptionspool
  var symbols: PickCharacterOptionssymbo
}

object KinkeyofCharacterOptionsP {
  @scala.inline
  def apply(
    alpha: PickCharacterOptionsalpha,
    casing: PickCharacterOptionscasin,
    numeric: PickCharacterOptionsnumer,
    pool: PickCharacterOptionspool,
    symbols: PickCharacterOptionssymbo
  ): KinkeyofCharacterOptionsP = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], casing = casing.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinkeyofCharacterOptionsP]
  }
}

