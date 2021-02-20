package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceNumberRange extends StObject {
  
  /**
    * The ending sequence number for the range. Shards that are in the OPEN state have an ending sequence number of null.
    */
  var EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.native
  
  /**
    * The starting sequence number for the range.
    */
  var StartingSequenceNumber: SequenceNumber = js.native
}
object SequenceNumberRange {
  
  @scala.inline
  def apply(StartingSequenceNumber: SequenceNumber): SequenceNumberRange = {
    val __obj = js.Dynamic.literal(StartingSequenceNumber = StartingSequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceNumberRange]
  }
  
  @scala.inline
  implicit class SequenceNumberRangeMutableBuilder[Self <: SequenceNumberRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndingSequenceNumber(value: SequenceNumber): Self = StObject.set(x, "EndingSequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndingSequenceNumberUndefined: Self = StObject.set(x, "EndingSequenceNumber", js.undefined)
    
    @scala.inline
    def setStartingSequenceNumber(value: SequenceNumber): Self = StObject.set(x, "StartingSequenceNumber", value.asInstanceOf[js.Any])
  }
}
