package typings.canvasjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): scala.Unit = typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[scala.Unit]
  
  /**
    * Adds a new chart color set
    * @param colorSetName name of the color set
    * @param colorSetArray array of colors.
    */
  @scala.inline
  def addColorSet(colorSetName: java.lang.String, colorSetArray: js.Array[java.lang.String]): scala.Unit = (typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addColorSet")(colorSetName.asInstanceOf[js.Any], colorSetArray.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * Adds a new culture info for your chart
    * @param culture the name of the culture
    * @param info information used by this culture
    */
  @scala.inline
  def addCultureInfo(culture: java.lang.String, info: typings.canvasjs.mod.CultureInfo): scala.Unit = (typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addCultureInfo")(culture.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def formatDate(date: scala.Double): scala.Unit = typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def formatDate(date: scala.Double, formatString: js.UndefOr[scala.Nothing], culture: java.lang.String): scala.Unit = (typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def formatDate(date: scala.Double, formatString: java.lang.String): scala.Unit = (typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def formatDate(date: scala.Double, formatString: java.lang.String, culture: java.lang.String): scala.Unit = (typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /**
    * Formats date/timestamp according to the given formatString(optional) & culture(optional).
    * @param date Date type or timestamp number.
    * @param formatString Default formatString is “DD MMM YYYY”.
    * @param culture Default culture is “en”.
    */
  @scala.inline
  def formatDate(date: typings.std.Date): scala.Unit = typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def formatDate(date: typings.std.Date, formatString: js.UndefOr[scala.Nothing], culture: java.lang.String): scala.Unit = (typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def formatDate(date: typings.std.Date, formatString: java.lang.String): scala.Unit = (typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def formatDate(date: typings.std.Date, formatString: java.lang.String, culture: java.lang.String): scala.Unit = (typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * Formats number according to the given formatString(optional) & culture(optional).
    * @param number Number to format.
    * @param formatString Default formatString is “#,##0.##” .
    * @param culture Default culture is “en”
    */
  @scala.inline
  def formatNumber(number: scala.Double): java.lang.String = typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def formatNumber(number: scala.Double, formatString: js.UndefOr[scala.Nothing], culture: java.lang.String): java.lang.String = (typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatNumber(number: scala.Double, formatString: java.lang.String): java.lang.String = (typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatNumber(number: scala.Double, formatString: java.lang.String, culture: java.lang.String): java.lang.String = (typings.canvasjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
