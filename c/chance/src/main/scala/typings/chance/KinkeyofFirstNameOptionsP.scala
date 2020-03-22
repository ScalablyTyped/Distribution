package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof chance.Chance.FirstNameOptions ]: std.Pick<chance.Chance.FirstNameOptions, K>} */
trait KinkeyofFirstNameOptionsP extends js.Object {
  var gender: PickFirstNameOptionsgende
  var nationality: PickFirstNameOptionsnatio
}

object KinkeyofFirstNameOptionsP {
  @scala.inline
  def apply(gender: PickFirstNameOptionsgende, nationality: PickFirstNameOptionsnatio): KinkeyofFirstNameOptionsP = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any], nationality = nationality.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinkeyofFirstNameOptionsP]
  }
}

