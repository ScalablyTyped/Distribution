package typings.blueprintjsCore.toasterMod

import typings.blueprintjsCore.toastMod.IToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToaster extends js.Object {
  /** Dismiss all toasts instantly. */
  def clear(): Unit = js.native
  /** Dismiss the given toast instantly. */
  def dismiss(key: String): Unit = js.native
  /** Returns the props for all current toasts. */
  def getToasts(): js.Array[IToastOptions] = js.native
  /**
    * Shows a new toast to the user, or updates an existing toast corresponding to the provided key (optional).
    *
    * Returns the unique key of the toast.
    */
  def show(props: IToastProps): String = js.native
  def show(props: IToastProps, key: String): String = js.native
}

