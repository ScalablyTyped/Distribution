package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceNumberRange extends StObject {
  
  /**
    * The ending sequence number for the range. Shards that are in the OPEN state have an ending sequence number of null.
    */
  var EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
  
  /**
    * The starting sequence number for the range.
    */
  var StartingSequenceNumber: SequenceNumber
}
object SequenceNumberRange {
  
  inline def apply(StartingSequenceNumber: SequenceNumber): SequenceNumberRange = {
    val __obj = js.Dynamic.literal(StartingSequenceNumber = StartingSequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceNumberRange]
  }
  
  extension [Self <: SequenceNumberRange](x: Self) {
    
    inline def setEndingSequenceNumber(value: SequenceNumber): Self = StObject.set(x, "EndingSequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setEndingSequenceNumberUndefined: Self = StObject.set(x, "EndingSequenceNumber", js.undefined)
    
    inline def setStartingSequenceNumber(value: SequenceNumber): Self = StObject.set(x, "StartingSequenceNumber", value.asInstanceOf[js.Any])
  }
}
