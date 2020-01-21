package typings.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableNotFoundExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object GlobalTableNotFoundExceptionDetails {
  @scala.inline
  def apply(message: String = null): GlobalTableNotFoundExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableNotFoundExceptionDetails]
  }
}

