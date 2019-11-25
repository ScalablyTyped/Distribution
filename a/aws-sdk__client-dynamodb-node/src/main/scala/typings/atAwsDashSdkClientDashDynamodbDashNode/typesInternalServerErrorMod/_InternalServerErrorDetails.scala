package typings.atAwsDashSdkClientDashDynamodbDashNode.typesInternalServerErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InternalServerErrorDetails extends js.Object {
  /**
    * <p>The server encountered an internal error trying to fulfill the request.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _InternalServerErrorDetails {
  @scala.inline
  def apply(message: String = null): _InternalServerErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InternalServerErrorDetails]
  }
}

