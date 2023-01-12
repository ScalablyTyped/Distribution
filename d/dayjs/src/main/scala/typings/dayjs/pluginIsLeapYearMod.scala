package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginIsLeapYearMod extends Shortcut {
  
  @JSImport("dayjs/plugin/isLeapYear", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginIsLeapYearMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def isLeapYear(): Boolean
    }
    object Dayjs {
      
      inline def apply(isLeapYear: () => Boolean): Dayjs = {
        val __obj = js.Dynamic.literal(isLeapYear = js.Any.fromFunction0(isLeapYear))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        inline def setIsLeapYear(value: () => Boolean): Self = StObject.set(x, "isLeapYear", js.Any.fromFunction0(value))
      }
    }
  }
}
