package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceNumberRange extends js.Object {
  
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
  implicit class SequenceNumberRangeOps[Self <: SequenceNumberRange] (val x: Self) extends AnyVal {
    
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
    def setStartingSequenceNumber(value: SequenceNumber): Self = this.set("StartingSequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndingSequenceNumber(value: SequenceNumber): Self = this.set("EndingSequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndingSequenceNumber: Self = this.set("EndingSequenceNumber", js.undefined)
  }
}
