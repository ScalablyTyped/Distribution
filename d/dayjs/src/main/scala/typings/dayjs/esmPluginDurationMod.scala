package typings.dayjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginDurationMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/duration", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type AddDurationType = CreateDurationType & (js.Function1[/* duration */ Duration, Duration])
  
  type CreateDurationType = (js.Function1[/* units */ DurationUnitsObjectType, Duration]) & (js.Function2[/* time */ Double, /* unit */ js.UndefOr[DurationUnitType], Duration]) & (js.Function1[/* ISO_8601 */ String, Duration])
  
  @js.native
  trait Duration
    extends StObject
       with Instantiable1[(/* input */ Double) | (/* input */ js.Object) | (/* input */ String), Duration]
       with Instantiable2[
          (/* input */ Double) | (/* input */ js.Object) | (/* input */ String), 
          /* unit */ String, 
          Duration
        ]
       with Instantiable3[
          (/* input */ Double) | (/* input */ js.Object) | (/* input */ String), 
          (/* unit */ String) | (/* unit */ Unit), 
          /* locale */ String, 
          Duration
        ] {
    
    def add(ISO_8601: String): Duration = js.native
    def add(duration: Duration): Duration = js.native
    def add(time: Double): Duration = js.native
    def add(time: Double, unit: DurationUnitType): Duration = js.native
    def add(units: DurationUnitsObjectType): Duration = js.native
    @JSName("add")
    var add_Original: AddDurationType = js.native
    
    def as(unit: DurationUnitType): Double = js.native
    
    def asDays(): Double = js.native
    
    def asHours(): Double = js.native
    
    def asMilliseconds(): Double = js.native
    
    def asMinutes(): Double = js.native
    
    def asMonths(): Double = js.native
    
    def asSeconds(): Double = js.native
    
    def asWeeks(): Double = js.native
    
    def asYears(): Double = js.native
    
    def days(): Double = js.native
    
    def format(): String = js.native
    def format(formatStr: String): String = js.native
    
    def get(unit: DurationUnitType): Double = js.native
    
    def hours(): Double = js.native
    
    def humanize(): String = js.native
    def humanize(withSuffix: Boolean): String = js.native
    
    def locale(locale: String): Duration = js.native
    
    def milliseconds(): Double = js.native
    
    def minutes(): Double = js.native
    
    def months(): Double = js.native
    
    def seconds(): Double = js.native
    
    def subtract(ISO_8601: String): Duration = js.native
    def subtract(duration: Duration): Duration = js.native
    def subtract(time: Double): Duration = js.native
    def subtract(time: Double, unit: DurationUnitType): Duration = js.native
    def subtract(units: DurationUnitsObjectType): Duration = js.native
    @JSName("subtract")
    var subtract_Original: AddDurationType = js.native
    
    def toISOString(): String = js.native
    
    def toJSON(): String = js.native
    
    def weeks(): Double = js.native
    
    def years(): Double = js.native
  }
  
  /**
    * @deprecated Please use more strict types
    */
  type DurationAddType = Double | js.Object | Duration
  
  /**
    * @deprecated Please use more strict types
    */
  type DurationInputType = String | Double | js.Object
  
  object DurationUnitType {
    
    inline def D: "D" = "D".asInstanceOf["D"]
    
    inline def M: "M" = "M".asInstanceOf["M"]
    
    inline def d: "d" = "d".asInstanceOf["d"]
    
    inline def day: "day" = "day".asInstanceOf["day"]
    
    inline def days: "days" = "days".asInstanceOf["days"]
    
    inline def h: "h" = "h".asInstanceOf["h"]
    
    inline def hour: "hour" = "hour".asInstanceOf["hour"]
    
    inline def hours: "hours" = "hours".asInstanceOf["hours"]
    
    inline def m: "m" = "m".asInstanceOf["m"]
    
    inline def millisecond: "millisecond" = "millisecond".asInstanceOf["millisecond"]
    
    inline def milliseconds: "milliseconds" = "milliseconds".asInstanceOf["milliseconds"]
    
    inline def minute: "minute" = "minute".asInstanceOf["minute"]
    
    inline def minutes: "minutes" = "minutes".asInstanceOf["minutes"]
    
    inline def month: "month" = "month".asInstanceOf["month"]
    
    inline def months: "months" = "months".asInstanceOf["months"]
    
    inline def ms: "ms" = "ms".asInstanceOf["ms"]
    
    inline def s: "s" = "s".asInstanceOf["s"]
    
    inline def second: "second" = "second".asInstanceOf["second"]
    
    inline def seconds: "seconds" = "seconds".asInstanceOf["seconds"]
    
    inline def w: "w" = "w".asInstanceOf["w"]
    
    inline def week: "week" = "week".asInstanceOf["week"]
    
    inline def weeks: "weeks" = "weeks".asInstanceOf["weeks"]
    
    inline def y: "y" = "y".asInstanceOf["y"]
    
    inline def year: "year" = "year".asInstanceOf["year"]
    
    inline def years: "years" = "years".asInstanceOf["years"]
  }
  /* Inlined std.Exclude<dayjs.dayjs/esm.OpUnitType, 'date' | 'dates'> */
  type DurationUnitType = "hours" | "d" | "w" | "y" | "M" | "years" | "seconds" | "m" | "second" | "day" | "s" | "hour" | "days" | "week" | "minutes" | "minute" | "year" | "months" | "month" | "weeks" | "D" | "ms" | "milliseconds" | "h" | "millisecond"
  
  /* Inlined std.Partial<{[ unit in std.Exclude<dayjs.dayjs/esm.UnitTypeLongPlural, 'dates'> | 'weeks' ]: number}> */
  trait DurationUnitsObjectType extends StObject {
    
    var days: js.UndefOr[Double] = js.undefined
    
    var hours: js.UndefOr[Double] = js.undefined
    
    var milliseconds: js.UndefOr[Double] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var months: js.UndefOr[Double] = js.undefined
    
    var seconds: js.UndefOr[Double] = js.undefined
    
    var weeks: js.UndefOr[Double] = js.undefined
    
    var years: js.UndefOr[Double] = js.undefined
  }
  object DurationUnitsObjectType {
    
    inline def apply(): DurationUnitsObjectType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DurationUnitsObjectType]
    }
    
    extension [Self <: DurationUnitsObjectType](x: Self) {
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      inline def setWeeks(value: Double): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
      
      inline def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
      
      inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginDurationMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def add(duration: Duration): Dayjs
      
      def subtract(duration: Duration): Dayjs
    }
    object Dayjs {
      
      inline def apply(add: Duration => Dayjs, subtract: Duration => Dayjs): Dayjs = {
        val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), subtract = js.Any.fromFunction1(subtract))
        __obj.asInstanceOf[Dayjs]
      }
      
      extension [Self <: Dayjs](x: Self) {
        
        inline def setAdd(value: Duration => Dayjs): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
        
        inline def setSubtract(value: Duration => Dayjs): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
      }
    }
  }
}
