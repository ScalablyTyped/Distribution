package typings.awsSdkClientDynamodbNode.typesProvisionedThroughputExceededExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedThroughputExceededExceptionDetails extends js.Object {
  /**
    * <p>You exceeded your maximum allowed provisioned throughput.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object ProvisionedThroughputExceededExceptionDetails {
  @scala.inline
  def apply(message: String = null): ProvisionedThroughputExceededExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedThroughputExceededExceptionDetails]
  }
}

