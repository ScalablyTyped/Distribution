package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResultMessage extends js.Object {
  var batchId: js.UndefOr[Double] = js.undefined
  var isError: Boolean
  var message: String
  var time: js.UndefOr[String] = js.undefined
}

object IResultMessage {
  @scala.inline
  def apply(isError: Boolean, message: String, batchId: Int | Double = null, time: String = null): IResultMessage = {
    val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResultMessage]
  }
}

