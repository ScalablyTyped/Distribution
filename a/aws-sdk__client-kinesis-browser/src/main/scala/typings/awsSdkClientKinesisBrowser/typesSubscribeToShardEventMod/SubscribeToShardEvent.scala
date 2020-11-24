package typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod

import typings.awsSdkClientKinesisBrowser.typesRecordMod.Record
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeToShardEvent extends js.Object {
  
  /**
    * <p>Use this as <code>StartingSequenceNumber</code> in the next call to <a>SubscribeToShard</a>.</p>
    */
  var ContinuationSequenceNumber: String = js.native
  
  /**
    * <p>The number of milliseconds the read records are from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.</p>
    */
  var MillisBehindLatest: Double = js.native
  
  /**
    * <p/>
    */
  var Records: js.Array[Record] | Iterable[Record] = js.native
}
object SubscribeToShardEvent {
  
  @scala.inline
  def apply(
    ContinuationSequenceNumber: String,
    MillisBehindLatest: Double,
    Records: js.Array[Record] | Iterable[Record]
  ): SubscribeToShardEvent = {
    val __obj = js.Dynamic.literal(ContinuationSequenceNumber = ContinuationSequenceNumber.asInstanceOf[js.Any], MillisBehindLatest = MillisBehindLatest.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToShardEvent]
  }
  
  @scala.inline
  implicit class SubscribeToShardEventOps[Self <: SubscribeToShardEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContinuationSequenceNumber(value: String): Self = this.set("ContinuationSequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisBehindLatest(value: Double): Self = this.set("MillisBehindLatest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: Record*): Self = this.set("Records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: js.Array[Record] | Iterable[Record]): Self = this.set("Records", value.asInstanceOf[js.Any])
  }
}
