package typings.azdata.mod.nb

import typings.azdata.azdataStrings.abort
import typings.azdata.azdataStrings.error
import typings.azdata.azdataStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecuteReply extends js.Object {
  var execution_count: Double | Null
  var status: ok | error | abort
}

object IExecuteReply {
  @scala.inline
  def apply(status: ok | error | abort, execution_count: Int | Double = null): IExecuteReply = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReply]
  }
}

