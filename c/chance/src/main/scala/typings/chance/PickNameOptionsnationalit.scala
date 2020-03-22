package typings.chance

import typings.chance.Chance.FirstNameNationalities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chance.Chance.NameOptions, 'nationality'> */
trait PickNameOptionsnationalit extends js.Object {
  var nationality: FirstNameNationalities
}

object PickNameOptionsnationalit {
  @scala.inline
  def apply(nationality: FirstNameNationalities): PickNameOptionsnationalit = {
    val __obj = js.Dynamic.literal(nationality = nationality.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickNameOptionsnationalit]
  }
}

