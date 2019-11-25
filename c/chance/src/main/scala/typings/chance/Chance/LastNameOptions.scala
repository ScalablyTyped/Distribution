package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastNameOptions extends js.Object {
  var nationality: LastNameNationalities
}

object LastNameOptions {
  @scala.inline
  def apply(nationality: LastNameNationalities): LastNameOptions = {
    val __obj = js.Dynamic.literal(nationality = nationality.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LastNameOptions]
  }
}

