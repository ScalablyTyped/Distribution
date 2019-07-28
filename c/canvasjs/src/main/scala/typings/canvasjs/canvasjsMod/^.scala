package typings.canvasjs.canvasjsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvasjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Unit = js.native
  /**
    * Adds a new chart color set
    * @param colorSetName name of the color set
    * @param colorSetArray array of colors.
    */
  def addColorSet(colorSetName: String, colorSetArray: js.Array[String]): Unit = js.native
  /**
    * Adds a new culture info for your chart
    * @param culture the name of the culture
    * @param info information used by this culture
    */
  def addCultureInfo(culture: String, info: CultureInfo): Unit = js.native
  def formatDate(date: Double): Unit = js.native
  def formatDate(date: Double, formatString: String): Unit = js.native
  def formatDate(date: Double, formatString: String, culture: String): Unit = js.native
  /**
    * Formats date/timestamp according to the given formatString(optional) & culture(optional).
    * @param date Date type or timestamp number.
    * @param formatString Default formatString is “DD MMM YYYY”.
    * @param culture Default culture is “en”.
    */
  def formatDate(date: Date): Unit = js.native
  def formatDate(date: Date, formatString: String): Unit = js.native
  def formatDate(date: Date, formatString: String, culture: String): Unit = js.native
  /**
    * Formats number according to the given formatString(optional) & culture(optional).
    * @param number Number to format.
    * @param formatString Default formatString is “#,##0.##” .
    * @param culture Default culture is “en”
    */
  def formatNumber(number: Double): String = js.native
  def formatNumber(number: Double, formatString: String): String = js.native
  def formatNumber(number: Double, formatString: String, culture: String): String = js.native
}

