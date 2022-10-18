package typings.dateAndTime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginTimespanMod {
  
  @JSImport("date-and-time/plugin/timespan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(date: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(date: Any, localized_date: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any], localized_date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* augmented module */
  object dateAndTimeAugmentingMod {
    
    trait TimeSpanResult extends StObject {
      
      /** Returns the result value in days. */
      def toDays(formatString: String): String
      
      /** Returns the result value in hours. */
      def toHours(formatString: String): String
      
      /** Returns the result value in milliseconds. */
      def toMilliseconds(formatString: String): String
      
      /** Returns the result value in minutes. */
      def toMinutes(formatString: String): String
      
      /** Returns the result value in seconds. */
      def toSeconds(formatString: String): String
    }
    object TimeSpanResult {
      
      inline def apply(
        toDays: String => String,
        toHours: String => String,
        toMilliseconds: String => String,
        toMinutes: String => String,
        toSeconds: String => String
      ): TimeSpanResult = {
        val __obj = js.Dynamic.literal(toDays = js.Any.fromFunction1(toDays), toHours = js.Any.fromFunction1(toHours), toMilliseconds = js.Any.fromFunction1(toMilliseconds), toMinutes = js.Any.fromFunction1(toMinutes), toSeconds = js.Any.fromFunction1(toSeconds))
        __obj.asInstanceOf[TimeSpanResult]
      }
      
      extension [Self <: TimeSpanResult](x: Self) {
        
        inline def setToDays(value: String => String): Self = StObject.set(x, "toDays", js.Any.fromFunction1(value))
        
        inline def setToHours(value: String => String): Self = StObject.set(x, "toHours", js.Any.fromFunction1(value))
        
        inline def setToMilliseconds(value: String => String): Self = StObject.set(x, "toMilliseconds", js.Any.fromFunction1(value))
        
        inline def setToMinutes(value: String => String): Self = StObject.set(x, "toMinutes", js.Any.fromFunction1(value))
        
        inline def setToSeconds(value: String => String): Self = StObject.set(x, "toSeconds", js.Any.fromFunction1(value))
      }
    }
  }
}
