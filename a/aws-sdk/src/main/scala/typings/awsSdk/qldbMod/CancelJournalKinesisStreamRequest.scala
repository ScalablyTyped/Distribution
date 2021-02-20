package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelJournalKinesisStreamRequest extends StObject {
  
  /**
    * The name of the ledger.
    */
  var LedgerName: typings.awsSdk.qldbMod.LedgerName = js.native
  
  /**
    * The unique ID that QLDB assigns to each QLDB journal stream.
    */
  var StreamId: UniqueId = js.native
}
object CancelJournalKinesisStreamRequest {
  
  @scala.inline
  def apply(LedgerName: LedgerName, StreamId: UniqueId): CancelJournalKinesisStreamRequest = {
    val __obj = js.Dynamic.literal(LedgerName = LedgerName.asInstanceOf[js.Any], StreamId = StreamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJournalKinesisStreamRequest]
  }
  
  @scala.inline
  implicit class CancelJournalKinesisStreamRequestMutableBuilder[Self <: CancelJournalKinesisStreamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLedgerName(value: LedgerName): Self = StObject.set(x, "LedgerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: UniqueId): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
  }
}
