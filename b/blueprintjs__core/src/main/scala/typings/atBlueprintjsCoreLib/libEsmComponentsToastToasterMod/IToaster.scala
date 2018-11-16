package typings
package atBlueprintjsCoreLib.libEsmComponentsToastToasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToaster extends js.Object {
  /** Dismiss all toasts instantly. */
  def clear(): scala.Unit = js.native
  /** Dismiss the given toast instantly. */
  def dismiss(key: java.lang.String): scala.Unit = js.native
  /** Returns the props for all current toasts. */
  def getToasts(): js.Array[IToastOptions] = js.native
  /**
       * Shows a new toast to the user, or updates an existing toast corresponding to the provided key (optional).
       *
       * Returns the unique key of the toast.
       */
  def show(props: atBlueprintjsCoreLib.libEsmComponentsToastToastMod.IToastProps): java.lang.String = js.native
  /**
       * Shows a new toast to the user, or updates an existing toast corresponding to the provided key (optional).
       *
       * Returns the unique key of the toast.
       */
  def show(props: atBlueprintjsCoreLib.libEsmComponentsToastToastMod.IToastProps, key: java.lang.String): java.lang.String = js.native
}

