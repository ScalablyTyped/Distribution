package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstNameOptions extends js.Object {
  var gender: chanceLib.chanceLibStrings.male | chanceLib.chanceLibStrings.female
  var nationality: FirstNameNationalities
}

object FirstNameOptions {
  @scala.inline
  def apply(
    gender: chanceLib.chanceLibStrings.male | chanceLib.chanceLibStrings.female,
    nationality: FirstNameNationalities
  ): FirstNameOptions = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any], nationality = nationality)
  
    __obj.asInstanceOf[FirstNameOptions]
  }
}

