package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof chance.Chance.NameOptions ]: std.Pick<chance.Chance.NameOptions, K>} */
trait KinkeyofNameOptionsPickNa extends js.Object {
  var full: PickNameOptionsfull
  var gender: PickNameOptionsgender
  var middle: PickNameOptionsmiddle
  var middle_initial: PickNameOptionsmiddleinit
  var nationality: PickNameOptionsnationalit
  var prefix: PickNameOptionsprefix
  var suffix: PickNameOptionssuffix
}

object KinkeyofNameOptionsPickNa {
  @scala.inline
  def apply(
    full: PickNameOptionsfull,
    gender: PickNameOptionsgender,
    middle: PickNameOptionsmiddle,
    middle_initial: PickNameOptionsmiddleinit,
    nationality: PickNameOptionsnationalit,
    prefix: PickNameOptionsprefix,
    suffix: PickNameOptionssuffix
  ): KinkeyofNameOptionsPickNa = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], middle_initial = middle_initial.asInstanceOf[js.Any], nationality = nationality.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinkeyofNameOptionsPickNa]
  }
}

