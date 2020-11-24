package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricFilterMatchRecord extends js.Object {
  
  /**
    * The raw event data.
    */
  var eventMessage: js.UndefOr[EventMessage] = js.native
  
  /**
    * The event number.
    */
  var eventNumber: js.UndefOr[EventNumber] = js.native
  
  /**
    * The values extracted from the event data by the filter.
    */
  var extractedValues: js.UndefOr[ExtractedValues] = js.native
}
object MetricFilterMatchRecord {
  
  @scala.inline
  def apply(): MetricFilterMatchRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricFilterMatchRecord]
  }
  
  @scala.inline
  implicit class MetricFilterMatchRecordOps[Self <: MetricFilterMatchRecord] (val x: Self) extends AnyVal {
    
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
    def setEventMessage(value: EventMessage): Self = this.set("eventMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventMessage: Self = this.set("eventMessage", js.undefined)
    
    @scala.inline
    def setEventNumber(value: EventNumber): Self = this.set("eventNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventNumber: Self = this.set("eventNumber", js.undefined)
    
    @scala.inline
    def setExtractedValues(value: ExtractedValues): Self = this.set("extractedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractedValues: Self = this.set("extractedValues", js.undefined)
  }
}
