package typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalServerErrorDetails extends js.Object {
  /**
    * <p>The server encountered an internal error trying to fulfill the request.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object InternalServerErrorDetails {
  @scala.inline
  def apply(message: String = null): InternalServerErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalServerErrorDetails]
  }
}

