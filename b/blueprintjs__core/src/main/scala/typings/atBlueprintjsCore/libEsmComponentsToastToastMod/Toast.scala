package typings.atBlueprintjsCore.libEsmComponentsToastToastMod

import typings.atBlueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/toast/toast", "Toast")
@js.native
class Toast ()
  extends AbstractPureComponent2[IToastProps, js.Object, js.Object] {
  var handleActionClick: js.Any = js.native
  var handleCloseClick: js.Any = js.native
  var maybeRenderActionButton: js.Any = js.native
  var startTimeout: js.Any = js.native
  var triggerDismiss: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MToast(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MToast(prevProps: IToastProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MToast(): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/toast/toast", "Toast")
@js.native
object Toast extends js.Object {
  var defaultProps: IToastProps = js.native
  var displayName: String = js.native
}

