package typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod

import typings.awsSdkClientKinesisBrowser.typesRecordMod.UnmarshalledRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSubscribeToShardEvent extends SubscribeToShardEvent {
  /**
    * <p/>
    */
  @JSName("Records")
  var Records_UnmarshalledSubscribeToShardEvent: js.Array[UnmarshalledRecord]
}

object UnmarshalledSubscribeToShardEvent {
  @scala.inline
  def apply(
    ContinuationSequenceNumber: String,
    MillisBehindLatest: Double,
    Records: js.Array[UnmarshalledRecord]
  ): UnmarshalledSubscribeToShardEvent = {
    val __obj = js.Dynamic.literal(ContinuationSequenceNumber = ContinuationSequenceNumber.asInstanceOf[js.Any], MillisBehindLatest = MillisBehindLatest.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSubscribeToShardEvent]
  }
}

