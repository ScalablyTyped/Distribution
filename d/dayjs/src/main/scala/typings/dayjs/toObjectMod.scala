package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toObjectMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/toObject", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  trait DayjsObject extends StObject {
    
    var date: Double
    
    var hours: Double
    
    var milliseconds: Double
    
    var minutes: Double
    
    var months: Double
    
    var seconds: Double
    
    var years: Double
  }
  object DayjsObject {
    
    inline def apply(
      date: Double,
      hours: Double,
      milliseconds: Double,
      minutes: Double,
      months: Double,
      seconds: Double,
      years: Double
    ): DayjsObject = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
      __obj.asInstanceOf[DayjsObject]
    }
    
    extension [Self <: DayjsObject](x: Self) {
      
      inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `toObjectMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def toObject(): DayjsObject
    }
    object Dayjs {
      
      inline def apply(toObject: () => DayjsObject): Dayjs = {
        val __obj = js.Dynamic.literal(toObject = js.Any.fromFunction0(toObject))
        __obj.asInstanceOf[Dayjs]
      }
      
      extension [Self <: Dayjs](x: Self) {
        
        inline def setToObject(value: () => DayjsObject): Self = StObject.set(x, "toObject", js.Any.fromFunction0(value))
      }
    }
  }
}
