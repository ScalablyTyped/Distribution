package typings.canvasjs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvasjs", "formatDate")
@js.native
object formatDate extends js.Object {
  
  def apply(date: Double): Unit = js.native
  def apply(date: Double, formatString: js.UndefOr[scala.Nothing], culture: String): Unit = js.native
  def apply(date: Double, formatString: String): Unit = js.native
  def apply(date: Double, formatString: String, culture: String): Unit = js.native
  /**
    * Formats date/timestamp according to the given formatString(optional) & culture(optional).
    * @param date Date type or timestamp number.
    * @param formatString Default formatString is “DD MMM YYYY”.
    * @param culture Default culture is “en”.
    */
  def apply(date: Date): Unit = js.native
  def apply(date: Date, formatString: js.UndefOr[scala.Nothing], culture: String): Unit = js.native
  def apply(date: Date, formatString: String): Unit = js.native
  def apply(date: Date, formatString: String, culture: String): Unit = js.native
}
