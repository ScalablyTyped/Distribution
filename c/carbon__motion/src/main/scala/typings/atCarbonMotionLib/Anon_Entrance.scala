package typings
package atCarbonMotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entrance extends js.Object {
  var entrance: Anon_Expressive
  var exit: Anon_Expressive
  var standard: Anon_Expressive
}

object Anon_Entrance {
  @scala.inline
  def apply(entrance: Anon_Expressive, exit: Anon_Expressive, standard: Anon_Expressive): Anon_Entrance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entrance")(entrance)
    __obj.updateDynamic("exit")(exit)
    __obj.updateDynamic("standard")(standard)
    __obj.asInstanceOf[Anon_Entrance]
  }
}

