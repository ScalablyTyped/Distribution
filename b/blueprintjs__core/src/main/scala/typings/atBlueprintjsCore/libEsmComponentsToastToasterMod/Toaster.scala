package typings.atBlueprintjsCore.libEsmComponentsToastToasterMod

import typings.atBlueprintjsCore.Anon_Toasts
import typings.atBlueprintjsCore.libEsmCommonAbstractPureComponentMod.AbstractPureComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster")
@js.native
class Toaster ()
  extends AbstractPureComponent[IToasterProps, IToasterState]
     with IToaster {
  var getDismissHandler: js.Any = js.native
  var handleClose: js.Any = js.native
  @JSName("state")
  var state_Toaster: Anon_Toasts = js.native
  var toastId: js.Any = js.native
  /* private */ def createToastOptions(props: js.Any): js.Any = js.native
  /* private */ def createToastOptions(props: js.Any, key: js.Any): js.Any = js.native
  def dismiss(key: String, timeoutExpired: Boolean): Unit = js.native
  /* private */ def getPositionClasses(): js.Any = js.native
  /* private */ def isNewToastKey(key: js.Any): js.Any = js.native
  /* private */ def renderToast(toast: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/toast/toaster", "Toaster")
@js.native
object Toaster extends js.Object {
  var defaultProps: IToasterProps = js.native
  var displayName: String = js.native
  /**
    * Create a new `Toaster` instance that can be shared around your application.
    * The `Toaster` will be rendered into a new element appended to the given container.
    */
  def create(): IToaster = js.native
  def create(props: IToasterProps): IToaster = js.native
  def create(props: IToasterProps, container: HTMLElement): IToaster = js.native
}

