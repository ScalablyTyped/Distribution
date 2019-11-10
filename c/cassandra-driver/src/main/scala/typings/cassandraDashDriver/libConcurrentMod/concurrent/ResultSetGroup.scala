package typings.cassandraDashDriver.libConcurrentMod.concurrent

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
    val __obj = js.Dynamic.literal(errors = errors, resultItems = resultItems, totalExecuted = totalExecuted)
  
    __obj.asInstanceOf[ResultSetGroup]
  }
}

