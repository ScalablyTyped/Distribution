package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isTodayMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isToday", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `isTodayMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def isToday(): Boolean
    }
    object Dayjs {
      
      @scala.inline
      def apply(isToday: () => Boolean): Dayjs = {
        val __obj = js.Dynamic.literal(isToday = js.Any.fromFunction0(isToday))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit class DayjsMutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsToday(value: () => Boolean): Self = StObject.set(x, "isToday", js.Any.fromFunction0(value))
      }
    }
  }
}
