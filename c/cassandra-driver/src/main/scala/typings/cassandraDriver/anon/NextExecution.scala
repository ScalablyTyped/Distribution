package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextExecution extends js.Object {
  var nextExecution: js.Function
}

object NextExecution {
  @scala.inline
  def apply(nextExecution: js.Function): NextExecution = {
    val __obj = js.Dynamic.literal(nextExecution = nextExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextExecution]
  }
}

