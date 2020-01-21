package typings.chance

import typings.chance.chanceStrings.all
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAll extends js.Object {
  var gender: male | female | all
}

object AnonAll {
  @scala.inline
  def apply(gender: male | female | all): AnonAll = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAll]
  }
}

