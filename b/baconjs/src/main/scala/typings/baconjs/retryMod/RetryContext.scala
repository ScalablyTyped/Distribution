package typings.baconjs.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryContext extends js.Object {
  var error: js.Any
  var retriesDone: Double
}

object RetryContext {
  @scala.inline
  def apply(error: js.Any, retriesDone: Double): RetryContext = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], retriesDone = retriesDone.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryContext]
  }
}

