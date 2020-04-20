package typings.chance.Chance

import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstNameOptions extends js.Object {
  var gender: male | female
  var nationality: FirstNameNationalities
}

object FirstNameOptions {
  @scala.inline
  def apply(gender: male | female, nationality: FirstNameNationalities): FirstNameOptions = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any], nationality = nationality.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstNameOptions]
  }
}

