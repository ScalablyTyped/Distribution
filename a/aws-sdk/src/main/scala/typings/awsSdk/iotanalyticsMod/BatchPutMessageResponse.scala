package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutMessageResponse extends js.Object {
  /**
    * A list of any errors encountered when sending the messages to the channel.
    */
  var batchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries] = js.native
}

object BatchPutMessageResponse {
  @scala.inline
  def apply(batchPutMessageErrorEntries: BatchPutMessageErrorEntries = null): BatchPutMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (batchPutMessageErrorEntries != null) __obj.updateDynamic("batchPutMessageErrorEntries")(batchPutMessageErrorEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutMessageResponse]
  }
}

