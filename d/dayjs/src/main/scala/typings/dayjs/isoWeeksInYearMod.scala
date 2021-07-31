package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isoWeeksInYearMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isoWeeksInYear", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `isoWeeksInYearMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def isoWeeksInYear(): Double
    }
    object Dayjs {
      
      @scala.inline
      def apply(isoWeeksInYear: () => Double): Dayjs = {
        val __obj = js.Dynamic.literal(isoWeeksInYear = js.Any.fromFunction0(isoWeeksInYear))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit class DayjsMutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsoWeeksInYear(value: () => Double): Self = StObject.set(x, "isoWeeksInYear", js.Any.fromFunction0(value))
      }
    }
  }
}
