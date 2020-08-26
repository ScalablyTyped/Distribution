package typings.chrome.chrome.devtools.inspectedWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationExceptionInfo extends js.Object {
  /** Set if the error occurred on the DevTools side before the expression is evaluated. */
  var code: String = js.native
  /** Set if the error occurred on the DevTools side before the expression is evaluated. */
  var description: String = js.native
  /** Set if the error occurred on the DevTools side before the expression is evaluated, contains the array of the values that may be substituted into the description string to provide more information about the cause of the error. */
  var details: js.Array[_] = js.native
  /** Set if the error occurred on the DevTools side before the expression is evaluated. */
  var isError: Boolean = js.native
  /** Set if the evaluated code produces an unhandled exception. */
  var isException: Boolean = js.native
  /** Set if the evaluated code produces an unhandled exception. */
  var value: String = js.native
}

object EvaluationExceptionInfo {
  @scala.inline
  def apply(
    code: String,
    description: String,
    details: js.Array[_],
    isError: Boolean,
    isException: Boolean,
    value: String
  ): EvaluationExceptionInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any], isException = isException.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationExceptionInfo]
  }
  @scala.inline
  implicit class EvaluationExceptionInfoOps[Self <: EvaluationExceptionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetailsVarargs(value: js.Any*): Self = this.set("details", js.Array(value :_*))
    @scala.inline
    def setDetails(value: js.Array[_]): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsError(value: Boolean): Self = this.set("isError", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsException(value: Boolean): Self = this.set("isException", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

