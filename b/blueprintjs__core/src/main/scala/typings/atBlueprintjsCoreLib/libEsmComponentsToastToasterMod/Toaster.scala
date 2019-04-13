package typings
package atBlueprintjsCoreLib.libEsmComponentsToastToasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster")
@js.native
class Toaster ()
  extends atBlueprintjsCoreLib.libEsmCommonAbstractPureComponentMod.AbstractPureComponent[IToasterProps, IToasterState]
     with IToaster {
  var getDismissHandler: js.Any = js.native
  var handleClose: js.Any = js.native
  @JSName("state")
  var state_Toaster: atBlueprintjsCoreLib.Anon_Toasts = js.native
  var toastId: js.Any = js.native
  /* private */ def createToastOptions(props: js.Any): js.Any = js.native
  /* private */ def createToastOptions(props: js.Any, key: js.Any): js.Any = js.native
  def dismiss(key: java.lang.String, timeoutExpired: scala.Boolean): scala.Unit = js.native
  /* private */ def getPositionClasses(): js.Any = js.native
  /* private */ def isNewToastKey(key: js.Any): js.Any = js.native
  /* private */ def renderToast(toast: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster")
@js.native
object Toaster extends js.Object {
  var defaultProps: atBlueprintjsCoreLib.libEsmComponentsToastToasterMod.IToasterProps = js.native
  var displayName: java.lang.String = js.native
  /**
    * Create a new `Toaster` instance that can be shared around your application.
    * The `Toaster` will be rendered into a new element appended to the given container.
    */
  def create(): atBlueprintjsCoreLib.libEsmComponentsToastToasterMod.IToaster = js.native
  def create(props: atBlueprintjsCoreLib.libEsmComponentsToastToasterMod.IToasterProps): atBlueprintjsCoreLib.libEsmComponentsToastToasterMod.IToaster = js.native
  def create(
    props: atBlueprintjsCoreLib.libEsmComponentsToastToasterMod.IToasterProps,
    container: stdLib.HTMLElement
  ): atBlueprintjsCoreLib.libEsmComponentsToastToasterMod.IToaster = js.native
}

