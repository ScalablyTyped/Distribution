package typings.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceNumberRange extends js.Object {
  
  /**
    * <p>The ending sequence number for the range. Shards that are in the OPEN state have an ending sequence number of <code>null</code>.</p>
    */
  var EndingSequenceNumber: js.UndefOr[String] = js.native
  
  /**
    * <p>The starting sequence number for the range.</p>
    */
  var StartingSequenceNumber: String = js.native
}
object SequenceNumberRange {
  
  @scala.inline
  def apply(StartingSequenceNumber: String): SequenceNumberRange = {
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
    def setStartingSequenceNumber(value: String): Self = this.set("StartingSequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndingSequenceNumber(value: String): Self = this.set("EndingSequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndingSequenceNumber: Self = this.set("EndingSequenceNumber", js.undefined)
  }
}
