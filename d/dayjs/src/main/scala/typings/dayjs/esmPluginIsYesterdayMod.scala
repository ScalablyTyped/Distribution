package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginIsYesterdayMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isYesterday", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginIsYesterdayMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def isYesterday(): Boolean
    }
    object Dayjs {
      
      inline def apply(isYesterday: () => Boolean): Dayjs = {
        val __obj = js.Dynamic.literal(isYesterday = js.Any.fromFunction0(isYesterday))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        inline def setIsYesterday(value: () => Boolean): Self = StObject.set(x, "isYesterday", js.Any.fromFunction0(value))
      }
    }
  }
}
