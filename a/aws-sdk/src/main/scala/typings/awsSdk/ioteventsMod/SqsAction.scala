package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqsAction extends js.Object {
  /**
    * The URL of the SQS queue where the data is written.
    */
  var queueUrl: QueueUrl = js.native
  /**
    * Set this to TRUE if you want the data to be base-64 encoded before it is written to the queue. Otherwise, set this to FALSE.
    */
  var useBase64: js.UndefOr[UseBase64] = js.native
}

object SqsAction {
  @scala.inline
  def apply(queueUrl: QueueUrl, useBase64: js.UndefOr[Boolean] = js.undefined): SqsAction = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(useBase64)) __obj.updateDynamic("useBase64")(useBase64.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqsAction]
  }
}

