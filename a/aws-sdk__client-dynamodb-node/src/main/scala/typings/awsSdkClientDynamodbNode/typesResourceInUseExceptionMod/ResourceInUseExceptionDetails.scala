package typings.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceInUseExceptionDetails extends js.Object {
  /**
    * <p>The resource which is being attempted to be changed is in use.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object ResourceInUseExceptionDetails {
  @scala.inline
  def apply(message: String = null): ResourceInUseExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceInUseExceptionDetails]
  }
}

