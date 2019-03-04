package typings
package customDashFunctionsDashRuntimeLib.CustomFunctionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @beta
  * Provides information about the invocation of a cancelable custom function.
  * A cancelable custom function can provide a handler for the onCanceled event.
  *
  * To indicate that a function is cancelable, in the metadata JSON file, the function options should specify:
  * `{ "cancelable": true }`
  *
  * If the metadata JSON file is being generated from JSDoc comments, include the tag `@cancelable`.
  */
trait CancelableInvocation extends Invocation {
  /**
    * @beta
    * Event handler called when the custom function is canceled.
    */
  def onCanceled(): scala.Unit
}

object CancelableInvocation {
  @scala.inline
  def apply(onCanceled: js.Function0[scala.Unit], address: java.lang.String = null): CancelableInvocation = {
    val __obj = js.Dynamic.literal(onCanceled = onCanceled)
    if (address != null) __obj.updateDynamic("address")(address)
    __obj.asInstanceOf[CancelableInvocation]
  }
}

