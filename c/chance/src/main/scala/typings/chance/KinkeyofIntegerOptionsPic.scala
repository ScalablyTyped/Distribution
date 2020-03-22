package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof chance.Chance.IntegerOptions ]: std.Pick<chance.Chance.IntegerOptions, K>} */
trait KinkeyofIntegerOptionsPic extends js.Object {
  var max: PickIntegerOptionsmax
  var min: PickIntegerOptionsmin
}

object KinkeyofIntegerOptionsPic {
  @scala.inline
  def apply(max: PickIntegerOptionsmax, min: PickIntegerOptionsmin): KinkeyofIntegerOptionsPic = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinkeyofIntegerOptionsPic]
  }
}

