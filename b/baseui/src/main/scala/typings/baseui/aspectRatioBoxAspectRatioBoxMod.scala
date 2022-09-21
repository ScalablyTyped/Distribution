package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.`0`
import typings.baseui.aspectRatioBoxTypesMod.AspectRatioBoxProps
import typings.baseui.baseuiStrings.div
import typings.baseui.blockTypesMod.StyledBlockProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aspectRatioBoxAspectRatioBoxMod extends Shortcut {
  
  @JSImport("baseui/aspect-ratio-box/aspect-ratio-box", JSImport.Default)
  @js.native
  val default: AspectRatioCoxComponentType[div] = js.native
  
  @js.native
  trait AspectRatioCoxComponentType[D /* <: ElementType[Any] */] extends StObject {
    
    def apply[C /* <: ElementType[Any] */](
      props: AspectRatioBoxProps[C] & (js.Object | `0`) & (Omit[
          StyledBlockProps & ComponentProps[C], 
          /* keyof baseui.baseui/aspect-ratio-box/types.AspectRatioBoxProps<react.react.ElementType<any>> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 69 */ Any
        ])
    ): Element = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type _To = AspectRatioCoxComponentType[div]
  
  /* This means you don't have to write `default`, but can instead just say `aspectRatioBoxAspectRatioBoxMod.foo` */
  override def _to: AspectRatioCoxComponentType[div] = default
}
