package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricFilterMatchRecord extends StObject {
  
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
  implicit class MetricFilterMatchRecordMutableBuilder[Self <: MetricFilterMatchRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventMessage(value: EventMessage): Self = StObject.set(x, "eventMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventMessageUndefined: Self = StObject.set(x, "eventMessage", js.undefined)
    
    @scala.inline
    def setEventNumber(value: EventNumber): Self = StObject.set(x, "eventNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNumberUndefined: Self = StObject.set(x, "eventNumber", js.undefined)
    
    @scala.inline
    def setExtractedValues(value: ExtractedValues): Self = StObject.set(x, "extractedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractedValuesUndefined: Self = StObject.set(x, "extractedValues", js.undefined)
  }
}
