package typings.chance

import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chance.Chance.NameOptions, 'gender'> */
trait PickNameOptionsgender extends js.Object {
  var gender: male | female
}

object PickNameOptionsgender {
  @scala.inline
  def apply(gender: male | female): PickNameOptionsgender = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickNameOptionsgender]
  }
}

