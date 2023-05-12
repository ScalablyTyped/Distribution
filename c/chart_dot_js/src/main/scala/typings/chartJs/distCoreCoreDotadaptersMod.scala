package typings.chartJs

import org.scalablytyped.runtime.Instantiable1
import typings.chartJs.anon.TypeofDateAdapterBase
import typings.chartJs.chartJsStrings.isoWeek
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ChartOptions
import typings.chartJs.distTypesIndexMod.ChartType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCoreDotadaptersMod {
  
  object default {
    
    @JSImport("chart.js/dist/core/core.adapters", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("chart.js/dist/core/core.adapters", "default._date")
    @js.native
    open class date protected ()
      extends StObject
         with DateAdapterBase {
      def this(options: AnyObject) = this()
    }
    
    @JSImport("chart.js/dist/core/core.adapters", "default._date")
    @js.native
    def date: TypeofDateAdapterBase & (Instantiable1[/* options */ AnyObject, DateAdapterBase]) = js.native
    
    inline def date_=(x: TypeofDateAdapterBase & (Instantiable1[/* options */ AnyObject, DateAdapterBase])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_date")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DateAdapter[T /* <: AnyObject */] extends StObject {
    
    /**
      * Adds the specified `amount` of `unit` to the given `timestamp`.
      * @param timestamp - the input timestamp
      * @param amount - the amount to add
      * @param unit - the unit as string
      */
    def add(timestamp: Double, amount: Double, unit: TimeUnit): Double = js.native
    
    /**
      * Returns the number of `unit` between the given timestamps.
      * @param a - the input timestamp (reference)
      * @param b - the timestamp to subtract
      * @param unit - the unit as string
      */
    def diff(a: Double, b: Double, unit: TimeUnit): Double = js.native
    
    /**
      * Returns end of `unit` for the given `timestamp`.
      * @param timestamp - the input timestamp
      * @param unit - the unit as string
      */
    def endOf(timestamp: Double, unit: TimeUnit): Double = js.native
    @JSName("endOf")
    def endOf_isoWeek(timestamp: Double, unit: isoWeek): Double = js.native
    
    /**
      * Returns the formatted date in the specified `format` for a given `timestamp`.
      * @param timestamp - the timestamp to format
      * @param format - the date/time token
      */
    def format(timestamp: Double, format: TimeUnit): String = js.native
    
    /**
      * Returns a map of time formats for the supported formatting units defined
      * in Unit as well as 'datetime' representing a detailed date/time string.
      */
    def formats(): Record[String, String] = js.native
    
    /**
      * Will called with chart options after adapter creation.
      */
    def init(chartOptions: ChartOptions[ChartType]): Unit = js.native
    
    val options: T = js.native
    
    /**
      * Parses the given `value` and return the associated timestamp.
      * @param value - the value to parse (usually comes from the data)
      * @param [format] - the expected data format
      */
    def parse(value: Any): Double | Null = js.native
    def parse(value: Any, format: TimeUnit): Double | Null = js.native
    
    /**
      * Returns start of `unit` for the given `timestamp`.
      * @param timestamp - the input timestamp
      * @param unit - the unit as string
      * @param [weekday] - the ISO day of the week with 1 being Monday
      * and 7 being Sunday (only needed if param *unit* is `isoWeek`).
      */
    def startOf(timestamp: Double, unit: TimeUnit): Double = js.native
    def startOf(timestamp: Double, unit: TimeUnit, weekday: Double): Double = js.native
    @JSName("startOf")
    def startOf_isoWeek(timestamp: Double, unit: isoWeek): Double = js.native
    @JSName("startOf")
    def startOf_isoWeek(timestamp: Double, unit: isoWeek, weekday: Double): Double = js.native
  }
  
  /**
    * Date adapter (current used by the time scale)
    * @namespace Chart._adapters._date
    * @memberof Chart._adapters
    * @private
    */
  @js.native
  trait DateAdapterBase
    extends StObject
       with DateAdapter[AnyObject] {
    
    def add(): Double = js.native
    
    def diff(): Double = js.native
    
    def endOf(): Double = js.native
    
    def format(): String = js.native
    
    def init(): Unit = js.native
    
    def parse(): Double | Null = js.native
    
    def startOf(): Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chartJs.chartJsStrings.millisecond
    - typings.chartJs.chartJsStrings.second
    - typings.chartJs.chartJsStrings.minute
    - typings.chartJs.chartJsStrings.hour
    - typings.chartJs.chartJsStrings.day
    - typings.chartJs.chartJsStrings.week
    - typings.chartJs.chartJsStrings.month
    - typings.chartJs.chartJsStrings.quarter
    - typings.chartJs.chartJsStrings.year
  */
  trait TimeUnit extends StObject
  object TimeUnit {
    
    inline def day: typings.chartJs.chartJsStrings.day = "day".asInstanceOf[typings.chartJs.chartJsStrings.day]
    
    inline def hour: typings.chartJs.chartJsStrings.hour = "hour".asInstanceOf[typings.chartJs.chartJsStrings.hour]
    
    inline def millisecond: typings.chartJs.chartJsStrings.millisecond = "millisecond".asInstanceOf[typings.chartJs.chartJsStrings.millisecond]
    
    inline def minute: typings.chartJs.chartJsStrings.minute = "minute".asInstanceOf[typings.chartJs.chartJsStrings.minute]
    
    inline def month: typings.chartJs.chartJsStrings.month = "month".asInstanceOf[typings.chartJs.chartJsStrings.month]
    
    inline def quarter: typings.chartJs.chartJsStrings.quarter = "quarter".asInstanceOf[typings.chartJs.chartJsStrings.quarter]
    
    inline def second: typings.chartJs.chartJsStrings.second = "second".asInstanceOf[typings.chartJs.chartJsStrings.second]
    
    inline def week: typings.chartJs.chartJsStrings.week = "week".asInstanceOf[typings.chartJs.chartJsStrings.week]
    
    inline def year: typings.chartJs.chartJsStrings.year = "year".asInstanceOf[typings.chartJs.chartJsStrings.year]
  }
}
