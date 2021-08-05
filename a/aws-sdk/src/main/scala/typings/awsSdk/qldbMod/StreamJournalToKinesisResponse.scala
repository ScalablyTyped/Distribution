package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamJournalToKinesisResponse extends StObject {
  
  /**
    * The unique ID that QLDB assigns to each QLDB journal stream.
    */
  var StreamId: js.UndefOr[UniqueId] = js.undefined
}
object StreamJournalToKinesisResponse {
  
  inline def apply(): StreamJournalToKinesisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamJournalToKinesisResponse]
  }
  
  extension [Self <: StreamJournalToKinesisResponse](x: Self) {
    
    inline def setStreamId(value: UniqueId): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
  }
}
