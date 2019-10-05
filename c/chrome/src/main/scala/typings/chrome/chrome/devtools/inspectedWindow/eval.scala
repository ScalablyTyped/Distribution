package typings.chrome.chrome.devtools.inspectedWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.devtools.inspectedWindow.eval")
@js.native
object eval extends js.Object {
  def apply[T](expression: String): Unit = js.native
  def apply[T](
    expression: String,
    callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
  ): Unit = js.native
  def apply[T](expression: String, options: EvalOptions): Unit = js.native
  def apply[T](
    expression: String,
    options: EvalOptions,
    callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
  ): Unit = js.native
}

