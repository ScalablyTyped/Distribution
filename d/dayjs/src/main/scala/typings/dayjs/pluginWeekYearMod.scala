package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginWeekYearMod extends Shortcut {
  
  @JSImport("dayjs/plugin/weekYear", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginWeekYearMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def weekYear(): Double
    }
    object Dayjs {
      
      @scala.inline
      def apply(weekYear: () => Double): Dayjs = {
        val __obj = js.Dynamic.literal(weekYear = js.Any.fromFunction0(weekYear))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit class DayjsMutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setWeekYear(value: () => Double): Self = StObject.set(x, "weekYear", js.Any.fromFunction0(value))
      }
    }
  }
}
