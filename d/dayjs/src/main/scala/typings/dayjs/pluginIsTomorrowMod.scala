package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginIsTomorrowMod extends Shortcut {
  
  @JSImport("dayjs/plugin/isTomorrow", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginIsTomorrowMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isTomorrow(): Boolean = js.native
    }
    object Dayjs {
      
      @scala.inline
      def apply(isTomorrow: () => Boolean): Dayjs = {
        val __obj = js.Dynamic.literal(isTomorrow = js.Any.fromFunction0(isTomorrow))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit class DayjsMutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsTomorrow(value: () => Boolean): Self = StObject.set(x, "isTomorrow", js.Any.fromFunction0(value))
      }
    }
  }
}
