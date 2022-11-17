package typings.chartJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.distChunksHelpersDotcoreMod.TimeUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayFormats extends StObject {
  
  /**
    * Sets how different time units are displayed.
    */
  var displayFormats: StringDictionary[String]
  
  /**
    * If boolean and true and the unit is set to 'week', then the first day of the week will be Monday. Otherwise, it will be Sunday.
    * If `number`, the index of the first day of the week (0 - Sunday, 6 - Saturday).
    * @default false
    */
  var isoWeekday: Boolean | Double
  
  /**
    * The minimum display format to be used for a time unit.
    * @default 'millisecond'
    */
  var minUnit: TimeUnit
  
  /**
    * Custom parser for dates.
    */
  var parser: String | (js.Function1[/* v */ Any, Double])
  
  /**
    * If defined, dates will be rounded to the start of this unit. See Time Units below for the allowed units.
    */
  var round: false | TimeUnit
  
  /**
    * The format string to use for the tooltip.
    */
  var tooltipFormat: String
  
  /**
    * If defined, will force the unit to be a certain type. See Time Units section below for details.
    * @default false
    */
  var unit: false | TimeUnit
}
object DisplayFormats {
  
  inline def apply(
    displayFormats: StringDictionary[String],
    isoWeekday: Boolean | Double,
    minUnit: TimeUnit,
    parser: String | (js.Function1[/* v */ Any, Double]),
    round: false | TimeUnit,
    tooltipFormat: String,
    unit: false | TimeUnit
  ): DisplayFormats = {
    val __obj = js.Dynamic.literal(displayFormats = displayFormats.asInstanceOf[js.Any], isoWeekday = isoWeekday.asInstanceOf[js.Any], minUnit = minUnit.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], tooltipFormat = tooltipFormat.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayFormats]
  }
  
  extension [Self <: DisplayFormats](x: Self) {
    
    inline def setDisplayFormats(value: StringDictionary[String]): Self = StObject.set(x, "displayFormats", value.asInstanceOf[js.Any])
    
    inline def setIsoWeekday(value: Boolean | Double): Self = StObject.set(x, "isoWeekday", value.asInstanceOf[js.Any])
    
    inline def setMinUnit(value: TimeUnit): Self = StObject.set(x, "minUnit", value.asInstanceOf[js.Any])
    
    inline def setParser(value: String | (js.Function1[/* v */ Any, Double])): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserFunction1(value: /* v */ Any => Double): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    
    inline def setRound(value: false | TimeUnit): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setTooltipFormat(value: String): Self = StObject.set(x, "tooltipFormat", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: false | TimeUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
