package typings.baconjs.typesRetryMod

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
    val __obj = js.Dynamic.literal(error = error, retriesDone = retriesDone)
  
    __obj.asInstanceOf[RetryContext]
  }
}

