package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesItemCollectionSizeLimitExceededExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ItemCollectionSizeLimitExceededExceptionDetails extends js.Object {
  /**
    * <p>The total size of an item collection has exceeded the maximum limit of 10 gigabytes.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _ItemCollectionSizeLimitExceededExceptionDetails {
  @scala.inline
  def apply(message: String = null): _ItemCollectionSizeLimitExceededExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ItemCollectionSizeLimitExceededExceptionDetails]
  }
}

