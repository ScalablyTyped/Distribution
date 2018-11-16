package typings
package canvasjsLib.canvasjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvasjs", JSImport.Namespace)
@js.native
object canvasjsModMembers extends js.Object {
  def apply(): scala.Unit = js.native
  /**
       * Adds a new chart color set
       * @param colorSetName name of the color set
       * @param colorSetArray array of colors.
       */
  def addColorSet(colorSetName: java.lang.String, colorSetArray: js.Array[java.lang.String]): scala.Unit = js.native
  /**
       * Adds a new culture info for your chart
       * @param culture the name of the culture
       * @param info information used by this culture
       */
  def addCultureInfo(culture: java.lang.String, info: canvasjsLib.canvasjsMod.CanvasJSNs.CultureInfo): scala.Unit = js.native
  /**
       * Formats date/timestamp according to the given formatString(optional) & culture(optional).
       * @param date Date type or timestamp number.
       * @param formatString Default formatString is “DD MMM YYYY”.
       * @param culture Default culture is “en”.
       */
  def formatDate(date: scala.Double): scala.Unit = js.native
  /**
       * Formats date/timestamp according to the given formatString(optional) & culture(optional).
       * @param date Date type or timestamp number.
       * @param formatString Default formatString is “DD MMM YYYY”.
       * @param culture Default culture is “en”.
       */
  def formatDate(date: scala.Double, formatString: java.lang.String): scala.Unit = js.native
  /**
       * Formats date/timestamp according to the given formatString(optional) & culture(optional).
       * @param date Date type or timestamp number.
       * @param formatString Default formatString is “DD MMM YYYY”.
       * @param culture Default culture is “en”.
       */
  def formatDate(date: scala.Double, formatString: java.lang.String, culture: java.lang.String): scala.Unit = js.native
  /**
       * Formats date/timestamp according to the given formatString(optional) & culture(optional).
       * @param date Date type or timestamp number.
       * @param formatString Default formatString is “DD MMM YYYY”.
       * @param culture Default culture is “en”.
       */
  def formatDate(date: stdLib.Date): scala.Unit = js.native
  /**
       * Formats date/timestamp according to the given formatString(optional) & culture(optional).
       * @param date Date type or timestamp number.
       * @param formatString Default formatString is “DD MMM YYYY”.
       * @param culture Default culture is “en”.
       */
  def formatDate(date: stdLib.Date, formatString: java.lang.String): scala.Unit = js.native
  /**
       * Formats date/timestamp according to the given formatString(optional) & culture(optional).
       * @param date Date type or timestamp number.
       * @param formatString Default formatString is “DD MMM YYYY”.
       * @param culture Default culture is “en”.
       */
  def formatDate(date: stdLib.Date, formatString: java.lang.String, culture: java.lang.String): scala.Unit = js.native
  /**
       * Formats number according to the given formatString(optional) & culture(optional).
       * @param number Number to format.
       * @param formatString Default formatString is “#,##0.##” .
       * @param culture Default culture is “en”
       */
  def formatNumber(number: scala.Double): java.lang.String = js.native
  /**
       * Formats number according to the given formatString(optional) & culture(optional).
       * @param number Number to format.
       * @param formatString Default formatString is “#,##0.##” .
       * @param culture Default culture is “en”
       */
  def formatNumber(number: scala.Double, formatString: java.lang.String): java.lang.String = js.native
  /**
       * Formats number according to the given formatString(optional) & culture(optional).
       * @param number Number to format.
       * @param formatString Default formatString is “#,##0.##” .
       * @param culture Default culture is “en”
       */
  def formatNumber(number: scala.Double, formatString: java.lang.String, culture: java.lang.String): java.lang.String = js.native
}

