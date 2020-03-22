package typings.chance

import typings.chance.chanceStrings.all
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chance.Chance.PrefixOptions, 'gender'> */
trait PickPrefixOptionsgender extends js.Object {
  var gender: male | female | all
}

object PickPrefixOptionsgender {
  @scala.inline
  def apply(gender: male | female | all): PickPrefixOptionsgender = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickPrefixOptionsgender]
  }
}

