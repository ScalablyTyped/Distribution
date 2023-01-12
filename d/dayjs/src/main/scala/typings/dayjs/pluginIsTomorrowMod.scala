package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginIsTomorrowMod extends Shortcut {
  
  @JSImport("dayjs/plugin/isTomorrow", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginIsTomorrowMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def isTomorrow(): Boolean
    }
    object Dayjs {
      
      inline def apply(isTomorrow: () => Boolean): Dayjs = {
        val __obj = js.Dynamic.literal(isTomorrow = js.Any.fromFunction0(isTomorrow))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        inline def setIsTomorrow(value: () => Boolean): Self = StObject.set(x, "isTomorrow", js.Any.fromFunction0(value))
      }
    }
  }
}
