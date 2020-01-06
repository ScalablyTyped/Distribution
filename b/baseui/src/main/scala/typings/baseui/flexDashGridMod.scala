package typings.baseui

import typings.baseui.blockMod.BlockProps
import typings.baseui.blockMod.Responsive
import typings.baseui.blockMod.Scale
import typings.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/flex-grid", JSImport.Namespace)
@js.native
object flexDashGridMod extends js.Object {
  @js.native
  trait FlexGridItemProps extends FlexGridProps {
    var flexGridItemCount: js.UndefOr[Double] = js.native
    var flexGridItemIndex: js.UndefOr[Double] = js.native
  }
  
  @js.native
  trait FlexGridProps extends BlockProps {
    var flexGridColumnCount: js.UndefOr[Responsive[Double]] = js.native
    var flexGridColumnGap: js.UndefOr[Responsive[Scale]] = js.native
    var flexGridRowGap: js.UndefOr[Responsive[Scale]] = js.native
  }
  
  val FlexGrid: FC[FlexGridProps] = js.native
  val FlexGridItem: FC[FlexGridItemProps] = js.native
}

