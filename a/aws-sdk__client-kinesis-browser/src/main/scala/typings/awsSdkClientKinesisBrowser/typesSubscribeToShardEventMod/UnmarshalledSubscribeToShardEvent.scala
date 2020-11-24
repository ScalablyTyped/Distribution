package typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod

import typings.awsSdkClientKinesisBrowser.typesRecordMod.UnmarshalledRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledSubscribeToShardEvent extends SubscribeToShardEvent {
  
  /**
    * <p/>
    */
  @JSName("Records")
  var Records_UnmarshalledSubscribeToShardEvent: js.Array[UnmarshalledRecord] = js.native
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
  
  @scala.inline
  implicit class UnmarshalledSubscribeToShardEventOps[Self <: UnmarshalledSubscribeToShardEvent] (val x: Self) extends AnyVal {
    
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
    def setRecordsVarargs(value: UnmarshalledRecord*): Self = this.set("Records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: js.Array[UnmarshalledRecord]): Self = this.set("Records", value.asInstanceOf[js.Any])
  }
}
