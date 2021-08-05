package typings.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceNumberRange extends StObject {
  
  /**
    * The last sequence number for the stream records contained within a shard. String contains numeric characters only.
    */
  var EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
  
  /**
    * The first sequence number for the stream records contained within a shard. String contains numeric characters only.
    */
  var StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
}
object SequenceNumberRange {
  
  inline def apply(): SequenceNumberRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceNumberRange]
  }
  
  extension [Self <: SequenceNumberRange](x: Self) {
    
    inline def setEndingSequenceNumber(value: SequenceNumber): Self = StObject.set(x, "EndingSequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setEndingSequenceNumberUndefined: Self = StObject.set(x, "EndingSequenceNumber", js.undefined)
    
    inline def setStartingSequenceNumber(value: SequenceNumber): Self = StObject.set(x, "StartingSequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setStartingSequenceNumberUndefined: Self = StObject.set(x, "StartingSequenceNumber", js.undefined)
  }
}
