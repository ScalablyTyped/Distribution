package typings.chance.Chance

import typings.chance.chanceStrings.all
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined chance.Chance.FullNameOptions & chance.Chance.FirstNameOptions & chance.Chance.LastNameOptions & chance.Chance.PrefixOptions */
@js.native
trait NameOptions extends js.Object {
  var full: Boolean = js.native
  var gender: (male | female) with (male | female | all) = js.native
  var middle: Boolean = js.native
  var middle_initial: Boolean = js.native
  var nationality: FirstNameNationalities with LastNameNationalities = js.native
  var prefix: Boolean = js.native
  var suffix: Boolean = js.native
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
  @scala.inline
  implicit class NameOptionsOps[Self <: NameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFull(value: Boolean): Self = this.set("full", value.asInstanceOf[js.Any])
    @scala.inline
    def setGender(value: (male | female) with (male | female | all)): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiddle(value: Boolean): Self = this.set("middle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiddle_initial(value: Boolean): Self = this.set("middle_initial", value.asInstanceOf[js.Any])
    @scala.inline
    def setNationality(value: FirstNameNationalities with LastNameNationalities): Self = this.set("nationality", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: Boolean): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffix(value: Boolean): Self = this.set("suffix", value.asInstanceOf[js.Any])
  }
  
}

