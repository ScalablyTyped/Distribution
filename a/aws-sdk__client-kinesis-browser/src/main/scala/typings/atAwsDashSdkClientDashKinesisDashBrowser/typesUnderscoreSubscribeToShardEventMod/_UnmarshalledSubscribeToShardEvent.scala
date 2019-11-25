package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreSubscribeToShardEventMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreRecordMod._UnmarshalledRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSubscribeToShardEvent extends _SubscribeToShardEvent {
  /**
    * <p/>
    */
  @JSName("Records")
  var Records__UnmarshalledSubscribeToShardEvent: js.Array[_UnmarshalledRecord]
}

object _UnmarshalledSubscribeToShardEvent {
  @scala.inline
  def apply(
    ContinuationSequenceNumber: String,
    MillisBehindLatest: Double,
    Records: js.Array[_UnmarshalledRecord]
  ): _UnmarshalledSubscribeToShardEvent = {
    val __obj = js.Dynamic.literal(ContinuationSequenceNumber = ContinuationSequenceNumber.asInstanceOf[js.Any], MillisBehindLatest = MillisBehindLatest.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UnmarshalledSubscribeToShardEvent]
  }
}

