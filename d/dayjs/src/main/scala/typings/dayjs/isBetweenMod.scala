package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.dayjsStrings.LeftparenthesisRightparenthesis
import typings.dayjs.dayjsStrings.`Leftparenthesis]`
import typings.dayjs.dayjsStrings.`[Rightparenthesis`
import typings.dayjs.dayjsStrings.`[]`
import typings.dayjs.esmMod.ConfigType
import typings.dayjs.esmMod.OpUnitType
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isBetweenMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isBetween", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `isBetweenMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isBetween(a: ConfigType, b: ConfigType): Boolean = js.native
      def isBetween(
        a: ConfigType,
        b: ConfigType,
        c: Null,
        d: LeftparenthesisRightparenthesis | `[]` | `[Rightparenthesis` | `Leftparenthesis]`
      ): Boolean = js.native
      def isBetween(
        a: ConfigType,
        b: ConfigType,
        c: Unit,
        d: LeftparenthesisRightparenthesis | `[]` | `[Rightparenthesis` | `Leftparenthesis]`
      ): Boolean = js.native
      def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType): Boolean = js.native
      def isBetween(
        a: ConfigType,
        b: ConfigType,
        c: OpUnitType,
        d: LeftparenthesisRightparenthesis | `[]` | `[Rightparenthesis` | `Leftparenthesis]`
      ): Boolean = js.native
    }
  }
}
