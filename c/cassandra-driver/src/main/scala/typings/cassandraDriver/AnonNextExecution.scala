package typings.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNextExecution extends js.Object {
  var nextExecution: js.Function
}

object AnonNextExecution {
  @scala.inline
  def apply(nextExecution: js.Function): AnonNextExecution = {
    val __obj = js.Dynamic.literal(nextExecution = nextExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextExecution]
  }
}

