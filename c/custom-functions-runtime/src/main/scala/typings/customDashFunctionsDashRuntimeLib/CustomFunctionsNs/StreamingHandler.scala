package typings
package customDashFunctionsDashRuntimeLib.CustomFunctionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A handler passed automatically as the last parameter
  * to a streaming function. With this parameter, a
  * function can use handler.setResult to set a cell value
  * or hook into the handler.onCanceled event to
  * to handle what happens when the function stops streaming.
  * @beta
  */
@js.native
trait StreamingHandler[T] extends CancelableHandler {
  /**
    * Sets the returned result for a streaming custom function.
    * @beta
    */
  def setResult(value: T): scala.Unit = js.native
  def setResult(value: stdLib.Error): scala.Unit = js.native
}

