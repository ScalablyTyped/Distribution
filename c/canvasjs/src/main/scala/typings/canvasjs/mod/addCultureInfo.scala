package typings.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvasjs", "addCultureInfo")
@js.native
object addCultureInfo extends js.Object {
  /**
    * Adds a new culture info for your chart
    * @param culture the name of the culture
    * @param info information used by this culture
    */
  def apply(culture: String, info: CultureInfo): Unit = js.native
}

