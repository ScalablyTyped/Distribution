package typings.dayjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object durationMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/duration", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  @js.native
  trait Duration
    extends StObject
       with Instantiable1[/* input */ DurationInputType, Duration]
       with Instantiable2[/* input */ DurationInputType, /* unit */ String, Duration]
       with Instantiable3[
          /* input */ DurationInputType, 
          (/* unit */ String) | (/* unit */ Unit), 
          /* locale */ String, 
          Duration
        ] {
    
    def add(input: DurationAddType): Duration = js.native
    def add(input: DurationAddType, unit: String): Duration = js.native
    
    def as(unit: String): Double = js.native
    
    def asDays(): Double = js.native
    
    def asHours(): Double = js.native
    
    def asMilliseconds(): Double = js.native
    
    def asMinutes(): Double = js.native
    
    def asMonths(): Double = js.native
    
    def asSeconds(): Double = js.native
    
    def asWeeks(): Double = js.native
    
    def asYears(): Double = js.native
    
    def days(): Double = js.native
    
    def get(unit: String): Double = js.native
    
    def hours(): Double = js.native
    
    def humanize(): String = js.native
    def humanize(withSuffix: Boolean): String = js.native
    
    def locale(locale: String): Duration = js.native
    
    def milliseconds(): Double = js.native
    
    def minutes(): Double = js.native
    
    def months(): Double = js.native
    
    def seconds(): Double = js.native
    
    def subtract(input: DurationAddType): Duration = js.native
    def subtract(input: DurationAddType, unit: String): Duration = js.native
    
    def toISOString(): String = js.native
    
    def toJSON(): String = js.native
    
    def weeks(): Double = js.native
    
    def years(): Double = js.native
  }
  
  type DurationAddType = Double | js.Object | Duration
  
  type DurationInputType = String | Double | js.Object
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `durationMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def add(value: Duration): Dayjs
      
      def subtract(value: Duration): Dayjs
    }
    object Dayjs {
      
      @scala.inline
      def apply(add: Duration => Dayjs, subtract: Duration => Dayjs): Dayjs = {
        val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), subtract = js.Any.fromFunction1(subtract))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit class DayjsMutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdd(value: Duration => Dayjs): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSubtract(value: Duration => Dayjs): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
      }
    }
  }
}
