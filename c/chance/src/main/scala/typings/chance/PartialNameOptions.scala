package typings.chance

import typings.chance.Chance.FirstNameNationalities
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.NameOptions> */
trait PartialNameOptions extends js.Object {
  var full: js.UndefOr[Boolean] = js.undefined
  var gender: js.UndefOr[male | female] = js.undefined
  var middle: js.UndefOr[Boolean] = js.undefined
  var middle_initial: js.UndefOr[Boolean] = js.undefined
  var nationality: js.UndefOr[FirstNameNationalities] = js.undefined
  var prefix: js.UndefOr[Boolean] = js.undefined
  var suffix: js.UndefOr[Boolean] = js.undefined
}

object PartialNameOptions {
  @scala.inline
  def apply(
    full: js.UndefOr[Boolean] = js.undefined,
    gender: male | female = null,
    middle: js.UndefOr[Boolean] = js.undefined,
    middle_initial: js.UndefOr[Boolean] = js.undefined,
    nationality: FirstNameNationalities = null,
    prefix: js.UndefOr[Boolean] = js.undefined,
    suffix: js.UndefOr[Boolean] = js.undefined
  ): PartialNameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (!js.isUndefined(middle)) __obj.updateDynamic("middle")(middle.asInstanceOf[js.Any])
    if (!js.isUndefined(middle_initial)) __obj.updateDynamic("middle_initial")(middle_initial.asInstanceOf[js.Any])
    if (nationality != null) __obj.updateDynamic("nationality")(nationality.asInstanceOf[js.Any])
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(suffix)) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialNameOptions]
  }
}

