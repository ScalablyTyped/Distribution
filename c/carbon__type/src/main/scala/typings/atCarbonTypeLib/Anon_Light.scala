package typings
package atCarbonTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Light extends js.Object {
  var light: scala.Double
  var regular: scala.Double
  var semibold: scala.Double
}

object Anon_Light {
  @scala.inline
  def apply(light: scala.Double, regular: scala.Double, semibold: scala.Double): Anon_Light = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("light")(light)
    __obj.updateDynamic("regular")(regular)
    __obj.updateDynamic("semibold")(semibold)
    __obj.asInstanceOf[Anon_Light]
  }
}

