package typings.canvasjs

import typings.canvasjs.mod.ChartOptions
import typings.canvasjs.mod.CultureInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CanvasJS {
    
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    
    @JSGlobal("CanvasJS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CanvasJS.Chart")
    @js.native
    open class Chart protected ()
      extends typings.canvasjs.mod.Chart {
      /**
        * Initializes a new instance of CanvasJS Chart.
        * @param containerId the DOM ID of the location where the chart is to be rendered
        * @param options the options used to render the chart
        */
      def this(containerId: String) = this()
      def this(containerId: String, options: ChartOptions) = this()
    }
    
    /**
      * Adds a new chart color set
      * @param colorSetName name of the color set
      * @param colorSetArray array of colors.
      */
    inline def addColorSet(colorSetName: String, colorSetArray: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColorSet")(colorSetName.asInstanceOf[js.Any], colorSetArray.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Adds a new culture info for your chart
      * @param culture the name of the culture
      * @param info information used by this culture
      */
    inline def addCultureInfo(culture: String, info: CultureInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCultureInfo")(culture.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Formats date/timestamp according to the given formatString(optional) & culture(optional).
      * @param date Date type or timestamp number.
      * @param formatString Default formatString is “DD MMM YYYY”.
      * @param culture Default culture is “en”.
      */
    inline def formatDate(date: js.Date): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def formatDate(date: js.Date, formatString: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def formatDate(date: js.Date, formatString: String, culture: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def formatDate(date: js.Date, formatString: Unit, culture: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def formatDate(date: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def formatDate(date: Double, formatString: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def formatDate(date: Double, formatString: String, culture: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def formatDate(date: Double, formatString: Unit, culture: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Formats number according to the given formatString(optional) & culture(optional).
      * @param number Number to format.
      * @param formatString Default formatString is “#,##0.##” .
      * @param culture Default culture is “en”
      */
    inline def formatNumber(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def formatNumber(number: Double, formatString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatNumber(number: Double, formatString: String, culture: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatNumber(number: Double, formatString: Unit, culture: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
