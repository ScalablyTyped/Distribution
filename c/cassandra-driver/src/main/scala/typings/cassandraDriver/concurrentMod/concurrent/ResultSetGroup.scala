package typings.cassandraDriver.concurrentMod.concurrent

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetGroup extends js.Object {
  var errors: js.Array[Error]
  var resultItems: js.Array[_]
  var totalExecuted: Double
}

object ResultSetGroup {
  @scala.inline
  def apply(errors: js.Array[Error], resultItems: js.Array[_], totalExecuted: Double): ResultSetGroup = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], resultItems = resultItems.asInstanceOf[js.Any], totalExecuted = totalExecuted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetGroup]
  }
}

