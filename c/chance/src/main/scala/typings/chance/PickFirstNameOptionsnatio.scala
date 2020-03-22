package typings.chance

import typings.chance.Chance.FirstNameNationalities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chance.Chance.FirstNameOptions, 'nationality'> */
trait PickFirstNameOptionsnatio extends js.Object {
  var nationality: FirstNameNationalities
}

object PickFirstNameOptionsnatio {
  @scala.inline
  def apply(nationality: FirstNameNationalities): PickFirstNameOptionsnatio = {
    val __obj = js.Dynamic.literal(nationality = nationality.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickFirstNameOptionsnatio]
  }
}

