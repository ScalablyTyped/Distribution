package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginIsTodayMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isToday", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginIsTodayMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def isToday(): Boolean
    }
    object Dayjs {
      
      inline def apply(isToday: () => Boolean): Dayjs = {
        val __obj = js.Dynamic.literal(isToday = js.Any.fromFunction0(isToday))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        inline def setIsToday(value: () => Boolean): Self = StObject.set(x, "isToday", js.Any.fromFunction0(value))
      }
    }
  }
}
