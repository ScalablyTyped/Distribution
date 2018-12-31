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
  /* InferMemberOverrides */
  override def forceUpdate(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def forceUpdate(callBack: js.Function0[scala.Unit]): scala.Unit = js.native
  /* private */ def getPositionClasses(): js.Any = js.native
  /* private */ def isNewToastKey(key: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def render(): reactLib.reactMod.ReactNs.ReactNode = js.native
  /* private */ def renderToast(toast: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def setState[K /* <: java.lang.String */](): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setState[K /* <: java.lang.String */](state: IToasterState): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setState[K /* <: java.lang.String */](state: IToasterState, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  // We MUST keep setState() as a unified signature because it allows proper checking of the method return type.
  // See: https://github.com/DefinitelyTyped/DefinitelyTyped/issues/18365#issuecomment-351013257
  // Also, the ` | S` allows intellisense to not be dumbisense
  /* InferMemberOverrides */
  override def setState[K /* <: java.lang.String */](
    state: js.Function2[
      /* prevState */ stdLib.Readonly[IToasterState], 
      /* props */ stdLib.Readonly[IToasterProps], 
      (stdLib.Pick[IToasterState, K]) | IToasterState | scala.Null
    ]
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setState[K /* <: java.lang.String */](
    state: js.Function2[
      /* prevState */ stdLib.Readonly[IToasterState], 
      /* props */ stdLib.Readonly[IToasterProps], 
      (stdLib.Pick[IToasterState, K]) | IToasterState | scala.Null
    ],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setState[K /* <: java.lang.String */](state: scala.Null, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setState[K /* <: java.lang.String */](state: stdLib.Pick[IToasterState, K]): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setState[K /* <: java.lang.String */](state: stdLib.Pick[IToasterState, K], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

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
    container: reactLib.HTMLElement
  ): atBlueprintjsCoreLib.libEsmComponentsToastToasterMod.IToaster = js.native
}

