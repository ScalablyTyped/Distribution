package typings.baseui

import typings.baseui.anon.FlexGridColumnCount
import typings.baseui.anon.FlexGridColumnGap
import typings.baseui.anon.Readonlyxstringanywidthst
import typings.baseui.anon.`0`
import typings.baseui.baseuiStrings.div
import typings.baseui.blockTypesMod.Responsive
import typings.baseui.blockTypesMod.StyledBlockProps
import typings.baseui.flexGridTypesMod.FlexGridItemProps
import typings.baseui.overridesMod.StyleOverride
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexGridItemMod {
  
  @JSImport("baseui/flex-grid/flex-grid-item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/flex-grid/flex-grid-item", JSImport.Default)
  @js.native
  val default: FlexGridItemComponentType[div] = js.native
  
  inline def flexGridItemMediaQueryStyle(has$themeColCountFlexGridColumnGapFlexGridRowGapItemIndexItemCount: FlexGridColumnCount): Readonlyxstringanywidthst = ^.asInstanceOf[js.Dynamic].applyDynamic("flexGridItemMediaQueryStyle")(has$themeColCountFlexGridColumnGapFlexGridRowGapItemIndexItemCount.asInstanceOf[js.Any]).asInstanceOf[Readonlyxstringanywidthst]
  
  inline def flexGridItemStyle(
    hasDollarflexGridColumnCountDollarflexGridColumnGapDollarflexGridRowGapDollarflexGridItemIndexDollarflexGridItemCountDollartheme: FlexGridColumnGap
  ): StyleOverride = ^.asInstanceOf[js.Dynamic].applyDynamic("flexGridItemStyle")(hasDollarflexGridColumnCountDollarflexGridColumnGapDollarflexGridRowGapDollarflexGridItemIndexDollarflexGridItemCountDollartheme.asInstanceOf[js.Any]).asInstanceOf[StyleOverride]
  
  inline def getResponsiveValue[T](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveValue")().asInstanceOf[js.UndefOr[T]]
  inline def getResponsiveValue[T](responsive: Unit, i: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveValue")(responsive.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def getResponsiveValue[T](responsive: Responsive[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveValue")(responsive.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def getResponsiveValue[T](responsive: Responsive[T], i: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveValue")(responsive.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @js.native
  trait FlexGridItemComponentType[D /* <: ElementType[Any] */] extends StObject {
    
    def apply[C /* <: ElementType[Any] */](
      props: FlexGridItemProps[C] & (js.Object | `0`) & (Omit[
          StyledBlockProps & ComponentProps[C], 
          /* keyof baseui.baseui/flex-grid/types.FlexGridItemProps<react.react.ElementType<any>> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 73 */ Any
        ])
    ): Element = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
}
