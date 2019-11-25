package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreSubscribeToShardEventMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreRecordMod._Record
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SubscribeToShardEvent extends js.Object {
  /**
    * <p>Use this as <code>StartingSequenceNumber</code> in the next call to <a>SubscribeToShard</a>.</p>
    */
  var ContinuationSequenceNumber: String
  /**
    * <p>The number of milliseconds the read records are from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.</p>
    */
  var MillisBehindLatest: Double
  /**
    * <p/>
    */
  var Records: js.Array[_Record] | Iterable[_Record]
}

object _SubscribeToShardEvent {
  @scala.inline
  def apply(
    ContinuationSequenceNumber: String,
    MillisBehindLatest: Double,
    Records: js.Array[_Record] | Iterable[_Record]
  ): _SubscribeToShardEvent = {
    val __obj = js.Dynamic.literal(ContinuationSequenceNumber = ContinuationSequenceNumber.asInstanceOf[js.Any], MillisBehindLatest = MillisBehindLatest.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SubscribeToShardEvent]
  }
}

