package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.mod.ConfigType
import typings.dayjs.mod.OpUnitType
import typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginIsSameOrAfterMod extends Shortcut {
  
  @JSImport("dayjs/plugin/isSameOrAfter", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginIsSameOrAfterMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isSameOrAfter(date: ConfigType): Boolean = js.native
      def isSameOrAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
    }
  }
}
