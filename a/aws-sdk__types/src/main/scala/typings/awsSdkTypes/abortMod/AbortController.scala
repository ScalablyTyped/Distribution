package typings.awsSdkTypes.abortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortController extends js.Object {
  /**
    * An object that reports whether the action associated with this
    * {AbortController} has been cancelled.
    */
  val signal: AbortSignal
  /**
    * Declares the operation associated with this AbortController to have been
    * cancelled.
    */
  def abort(): Unit
}

object AbortController {
  @scala.inline
  def apply(abort: () => Unit, signal: AbortSignal): AbortController = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbortController]
  }
}

