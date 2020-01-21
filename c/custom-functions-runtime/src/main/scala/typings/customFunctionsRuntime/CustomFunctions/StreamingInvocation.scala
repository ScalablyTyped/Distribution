package typings.customFunctionsRuntime.CustomFunctions

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the invocation of a streaming custom function.
  * A streaming custom function can provide results which can change over time.
  *
  * Call `setResult()` one or more times to provide the result instead of returning
  * a result from the function.
  */
@js.native
trait StreamingInvocation[ResultType] extends CancelableInvocation {
  /**
    * Set the result for the custom function. May be called more than once.
    */
  def setResult(value: ResultType): Unit = js.native
  def setResult(value: Error): Unit = js.native
}

