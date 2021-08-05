package typings.countdown

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countdown {
  
  @js.native
  trait CountdownStatic extends StObject {
    
    def apply(start: DateTime): Timespan | Double = js.native
    def apply(start: DateTime, end: Unit, units: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: Unit, units: Double, max: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: Unit, units: Double, max: Double, digits: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: Unit, units: Double, max: Unit, digits: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: Unit, units: Unit, max: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: Unit, units: Unit, max: Double, digits: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: Unit, units: Unit, max: Unit, digits: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: DateTime): Timespan | Double = js.native
    def apply(start: DateTime, end: DateTime, units: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: DateTime, units: Double, max: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: DateTime, units: Double, max: Double, digits: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: DateTime, units: Double, max: Unit, digits: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: DateTime, units: Unit, max: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: DateTime, units: Unit, max: Double, digits: Double): Timespan | Double = js.native
    def apply(start: DateTime, end: DateTime, units: Unit, max: Unit, digits: Double): Timespan | Double = js.native
    
    var ALL: Double = js.native
    
    var CENTURIES: Double = js.native
    
    var DAYS: Double = js.native
    
    var DECADES: Double = js.native
    
    var DEFAULTS: Double = js.native
    
    var HOURS: Double = js.native
    
    var MILLENNIA: Double = js.native
    
    var MILLISECONDS: Double = js.native
    
    var MINUTES: Double = js.native
    
    var MONTHS: Double = js.native
    
    var SECONDS: Double = js.native
    
    var WEEKS: Double = js.native
    
    var YEARS: Double = js.native
    
    def resetFormat(): Unit = js.native
    
    def resetLabels(): Unit = js.native
    
    def setFormat(format: Format): Unit = js.native
    
    def setLabels(
      singular: js.UndefOr[String],
      plural: js.UndefOr[String],
      last: js.UndefOr[String],
      delim: js.UndefOr[String],
      empty: js.UndefOr[String],
      formatNumber: js.UndefOr[js.Function1[/* value */ Double, String]],
      formatter: js.UndefOr[js.Function2[/* value */ Double, /* unit */ Double, String]]
    ): Unit = js.native
  }
  
  type DateFunction = js.Function1[/* timespan */ Timespan, Unit]
  
  type DateTime = js.UndefOr[Double | Date | DateFunction | Null]
  
  trait Format extends StObject {
    
    var delim: js.UndefOr[String] = js.undefined
    
    var empty: js.UndefOr[String] = js.undefined
    
    var formatNumber: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
    
    var formatter: js.UndefOr[js.Function2[/* value */ Double, /* unit */ Double, String]] = js.undefined
    
    var last: js.UndefOr[String] = js.undefined
    
    var plural: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var singular: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Format {
    
    inline def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setDelim(value: String): Self = StObject.set(x, "delim", value.asInstanceOf[js.Any])
      
      inline def setDelimUndefined: Self = StObject.set(x, "delim", js.undefined)
      
      inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setFormatNumber(value: /* value */ Double => String): Self = StObject.set(x, "formatNumber", js.Any.fromFunction1(value))
      
      inline def setFormatNumberUndefined: Self = StObject.set(x, "formatNumber", js.undefined)
      
      inline def setFormatter(value: (/* value */ Double, /* unit */ Double) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setPlural(value: String | js.Array[String]): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
      
      inline def setPluralVarargs(value: String*): Self = StObject.set(x, "plural", js.Array(value :_*))
      
      inline def setSingular(value: String | js.Array[String]): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      inline def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
      
      inline def setSingularVarargs(value: String*): Self = StObject.set(x, "singular", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Timespan extends StObject {
    
    var centuries: js.UndefOr[Double] = js.native
    
    var days: js.UndefOr[Double] = js.native
    
    var decades: js.UndefOr[Double] = js.native
    
    var end: js.UndefOr[Date] = js.native
    
    var hours: js.UndefOr[Double] = js.native
    
    var millennia: js.UndefOr[Double] = js.native
    
    var milliseconds: js.UndefOr[Double] = js.native
    
    var minutes: js.UndefOr[Double] = js.native
    
    var months: js.UndefOr[Double] = js.native
    
    var seconds: js.UndefOr[Double] = js.native
    
    var start: js.UndefOr[Date] = js.native
    
    def toHTML(): String = js.native
    def toHTML(tagName: String): String = js.native
    def toHTML(tagName: String, label: String): String = js.native
    def toHTML(tagName: Unit, label: String): String = js.native
    
    def toString(label: String): String = js.native
    
    var units: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[Double] = js.native
    
    var weeks: js.UndefOr[Double] = js.native
    
    var years: js.UndefOr[Double] = js.native
  }
}
