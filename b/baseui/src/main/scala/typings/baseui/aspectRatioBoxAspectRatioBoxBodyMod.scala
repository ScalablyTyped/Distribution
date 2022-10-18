package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseuiStrings.div
import typings.baseui.blockTypesMod.BlockProps
import typings.baseui.blockTypesMod.StyledBlockProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aspectRatioBoxAspectRatioBoxBodyMod extends Shortcut {
  
  @JSImport("baseui/aspect-ratio-box/aspect-ratio-box-body", JSImport.Default)
  @js.native
  val default: AspectRatioBoxBodyComponentType[div] = js.native
  
  @JSImport("baseui/aspect-ratio-box/aspect-ratio-box-body", "AspectRatioBoxBody")
  @js.native
  val AspectRatioBoxBody: AspectRatioBoxBodyComponentType[div] = js.native
  
  @js.native
  trait AspectRatioBoxBodyComponentType[D /* <: ElementType[Any] */] extends StObject {
    
    def apply[C /* <: ElementType[Any] */](
      props: BlockProps[C] & (Omit[
          StyledBlockProps & ComponentProps[C], 
          /* keyof baseui.baseui/block/types.BlockProps<react.react.ElementType<any>> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typings.baseui.baseuiStrings.children, typings.baseui.baseuiStrings.as_, typings.baseui.baseuiStrings.overrides */ Any
        ])
    ): Element = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type _To = AspectRatioBoxBodyComponentType[div]
  
  /* This means you don't have to write `default`, but can instead just say `aspectRatioBoxAspectRatioBoxBodyMod.foo` */
  override def _to: AspectRatioBoxBodyComponentType[div] = default
}
