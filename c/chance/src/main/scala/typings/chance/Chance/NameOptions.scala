package typings.chance.Chance

import typings.chance.chanceStrings.all
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined chance.Chance.FullNameOptions & chance.Chance.FirstNameOptions & chance.Chance.LastNameOptions & chance.Chance.PrefixOptions */
trait NameOptions extends js.Object {
  var full: Boolean
  var gender: (male | female) with (male | female | all)
  var middle: Boolean
  var middle_initial: Boolean
  var nationality: FirstNameNationalities with LastNameNationalities
  var prefix: Boolean
  var suffix: Boolean
}

object NameOptions {
  @scala.inline
  def apply(
    full: Boolean,
    gender: (male | female) with (male | female | all),
    middle: Boolean,
    middle_initial: Boolean,
    nationality: FirstNameNationalities with LastNameNationalities,
    prefix: Boolean,
    suffix: Boolean
  ): NameOptions = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], middle_initial = middle_initial.asInstanceOf[js.Any], nationality = nationality.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NameOptions]
  }
}

