package typings.baconjs.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryContext extends js.Object {
  var error: js.Any = js.native
  var retriesDone: Double = js.native
}

object RetryContext {
  @scala.inline
  def apply(error: js.Any, retriesDone: Double): RetryContext = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], retriesDone = retriesDone.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryContext]
  }
  @scala.inline
  implicit class RetryContextOps[Self <: RetryContext] (val x: Self) extends AnyVal {
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
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetriesDone(value: Double): Self = this.set("retriesDone", value.asInstanceOf[js.Any])
  }
  
}

