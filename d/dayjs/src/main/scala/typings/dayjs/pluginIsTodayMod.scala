package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginIsTodayMod extends Shortcut {
  
  @JSImport("dayjs/plugin/isToday", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginIsTodayMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def isToday(): Boolean
    }
    object Dayjs {
      
      inline def apply(isToday: () => Boolean): Dayjs = {
        val __obj = js.Dynamic.literal(isToday = js.Any.fromFunction0(isToday))
        __obj.asInstanceOf[Dayjs]
      }
      
      extension [Self <: Dayjs](x: Self) {
        
        inline def setIsToday(value: () => Boolean): Self = StObject.set(x, "isToday", js.Any.fromFunction0(value))
      }
    }
  }
}
