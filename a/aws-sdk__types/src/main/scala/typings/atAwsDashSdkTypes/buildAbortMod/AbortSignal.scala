package typings.atAwsDashSdkTypes.buildAbortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortSignal extends js.Object {
  /**
    * Whether the action represented by this signal has been cancelled.
    */
  val aborted: Boolean
  /**
    * A function to be invoked when the action represented by this signal has
    * been cancelled.
    */
  var onabort: js.UndefOr[AbortHandler] = js.undefined
}

object AbortSignal {
  @scala.inline
  def apply(aborted: Boolean, onabort: () => Unit = null): AbortSignal = {
    val __obj = js.Dynamic.literal(aborted = aborted)
    if (onabort != null) __obj.updateDynamic("onabort")(js.Any.fromFunction0(onabort))
    __obj.asInstanceOf[AbortSignal]
  }
}

