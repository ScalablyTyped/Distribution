package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastNameOptions extends js.Object {
  var nationality: LastNameNationalities
}

object LastNameOptions {
  @scala.inline
  def apply(nationality: LastNameNationalities): LastNameOptions = {
    val __obj = js.Dynamic.literal(nationality = nationality)
  
    __obj.asInstanceOf[LastNameOptions]
  }
}

