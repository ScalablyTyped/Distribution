package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toObjectMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/toObject", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  @js.native
  trait DayjsObject extends StObject {
    
    var date: Double = js.native
    
    var hours: Double = js.native
    
    var milliseconds: Double = js.native
    
    var minutes: Double = js.native
    
    var months: Double = js.native
    
    var seconds: Double = js.native
    
    var years: Double = js.native
  }
  object DayjsObject {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DayjsObjectMutableBuilder[Self <: DayjsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `toObjectMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def toObject(): DayjsObject = js.native
    }
    object Dayjs {
      
      @scala.inline
      def apply(toObject: () => DayjsObject): Dayjs = {
        val __obj = js.Dynamic.literal(toObject = js.Any.fromFunction0(toObject))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit class DayjsMutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setToObject(value: () => DayjsObject): Self = StObject.set(x, "toObject", js.Any.fromFunction0(value))
      }
    }
  }
}
