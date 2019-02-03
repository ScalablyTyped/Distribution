package typings
package atBlueprintjsCoreLib.libEsmComponentsToastToastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/toast/toast", "Toast")
@js.native
class Toast ()
  extends atBlueprintjsCoreLib.libEsmCommonAbstractPureComponentMod.AbstractPureComponent[IToastProps, js.Object] {
  var handleActionClick: js.Any = js.native
  var handleCloseClick: js.Any = js.native
  var startTimeout: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MToast(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MToast(prevProps: IToastProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MToast(): scala.Unit = js.native
  /* private */ def maybeRenderActionButton(): js.Any = js.native
  /* private */ def triggerDismiss(didTimeoutExpire: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/toast/toast", "Toast")
@js.native
object Toast extends js.Object {
  var defaultProps: atBlueprintjsCoreLib.libEsmComponentsToastToastMod.IToastProps = js.native
  var displayName: java.lang.String = js.native
}

