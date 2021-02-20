package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.ConfigType
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/calendar", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `calendarMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def calendar(): String = js.native
      def calendar(referenceTime: js.UndefOr[ConfigType], formats: js.Object): String = js.native
      def calendar(referenceTime: ConfigType): String = js.native
    }
  }
}
