package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginIsYesterdayMod extends Shortcut {
  
  @JSImport("dayjs/plugin/isYesterday", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginIsYesterdayMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def isYesterday(): Boolean
    }
    object Dayjs {
      
      @scala.inline
      def apply(isYesterday: () => Boolean): Dayjs = {
        val __obj = js.Dynamic.literal(isYesterday = js.Any.fromFunction0(isYesterday))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit class DayjsMutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsYesterday(value: () => Boolean): Self = StObject.set(x, "isYesterday", js.Any.fromFunction0(value))
      }
    }
  }
}
