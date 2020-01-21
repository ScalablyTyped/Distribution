package typings.awsSdkClientDynamodbBrowser.typesGlobalTableAlreadyExistsExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableAlreadyExistsExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object GlobalTableAlreadyExistsExceptionDetails {
  @scala.inline
  def apply(message: String = null): GlobalTableAlreadyExistsExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableAlreadyExistsExceptionDetails]
  }
}

