package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof chance.Chance.PrefixOptions ]: std.Pick<chance.Chance.PrefixOptions, K>} */
trait KinkeyofPrefixOptionsPick extends js.Object {
  var full: PickPrefixOptionsfull
  var gender: PickPrefixOptionsgender
}

object KinkeyofPrefixOptionsPick {
  @scala.inline
  def apply(full: PickPrefixOptionsfull, gender: PickPrefixOptionsgender): KinkeyofPrefixOptionsPick = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinkeyofPrefixOptionsPick]
  }
}

