package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelJournalKinesisStreamResponse extends StObject {
  
  /**
    * The unique ID that QLDB assigns to each QLDB journal stream.
    */
  var StreamId: js.UndefOr[UniqueId] = js.native
}
object CancelJournalKinesisStreamResponse {
  
  @scala.inline
  def apply(): CancelJournalKinesisStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelJournalKinesisStreamResponse]
  }
  
  @scala.inline
  implicit class CancelJournalKinesisStreamResponseMutableBuilder[Self <: CancelJournalKinesisStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamId(value: UniqueId): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
  }
}
