package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectSupportMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/objectSupport", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `objectSupportMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def add(argument: js.Object): Dayjs
      
      def set(argument: js.Object): Dayjs
      
      def subtract(argument: js.Object): Dayjs
    }
    object Dayjs {
      
      inline def apply(add: js.Object => Dayjs, set: js.Object => Dayjs, subtract: js.Object => Dayjs): Dayjs = {
        val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), set = js.Any.fromFunction1(set), subtract = js.Any.fromFunction1(subtract))
        __obj.asInstanceOf[Dayjs]
      }
      
      extension [Self <: Dayjs](x: Self) {
        
        inline def setAdd(value: js.Object => Dayjs): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
        
        inline def setSet(value: js.Object => Dayjs): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
        
        inline def setSubtract(value: js.Object => Dayjs): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
      }
    }
  }
}
