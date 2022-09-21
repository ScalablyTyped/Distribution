package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.`0`
import typings.baseui.baseuiStrings.div
import typings.baseui.blockTypesMod.BlockComponentType
import typings.baseui.blockTypesMod.StyledBlockProps
import typings.baseui.flexGridTypesMod.FlexGridProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexGridFlexGridMod extends Shortcut {
  
  @JSImport("baseui/flex-grid/flex-grid", JSImport.Default)
  @js.native
  val default: FlexGridComponentType[div] = js.native
  
  @JSImport("baseui/flex-grid/flex-grid", "BaseFlexGrid")
  @js.native
  val BaseFlexGrid: BlockComponentType[div] = js.native
  
  @js.native
  trait FlexGridComponentType[D /* <: ElementType[Any] */] extends StObject {
    
    def apply[C /* <: ElementType[Any] */](
      props: FlexGridProps[C] & (js.Object | `0`) & (Omit[
          StyledBlockProps & ComponentProps[C], 
          /* keyof baseui.baseui/flex-grid/types.FlexGridProps<react.react.ElementType<any>> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 71 */ Any
        ])
    ): Element = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type _To = FlexGridComponentType[div]
  
  /* This means you don't have to write `default`, but can instead just say `flexGridFlexGridMod.foo` */
  override def _to: FlexGridComponentType[div] = default
}
