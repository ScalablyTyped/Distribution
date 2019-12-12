package typings.baseui

import typings.baseui.aspectDashRatioDashBoxMod.AspectRatioBoxProps
import typings.baseui.blockMod.BlockProps
import typings.react.reactMod.Component
import typings.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/aspect-ratio-box", JSImport.Namespace)
@js.native
object aspectDashRatioDashBoxMod extends js.Object {
  @js.native
  class AspectRatioBox ()
    extends Component[AspectRatioBoxProps, js.Object, js.Any]
  
  @js.native
  trait AspectRatioBoxProps extends BlockProps {
    /** Aspect ratio is width divided by height. */
    var aspectRatio: js.UndefOr[Double] = js.native
  }
  
  val AspectRatioBoxBody: FC[BlockProps] = js.native
}

