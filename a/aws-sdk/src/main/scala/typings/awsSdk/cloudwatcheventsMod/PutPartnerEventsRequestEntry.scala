package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPartnerEventsRequestEntry extends StObject {
  
  /**
    * A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested subobjects.
    */
  var Detail: js.UndefOr[String] = js.native
  
  /**
    * A free-form string used to decide what fields to expect in the event detail.
    */
  var DetailType: js.UndefOr[String] = js.native
  
  /**
    * AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number, including zero, may be present.
    */
  var Resources: js.UndefOr[EventResourceList] = js.native
  
  /**
    * The event source that is generating the evntry.
    */
  var Source: js.UndefOr[EventSourceName] = js.native
  
  /**
    * The date and time of the event.
    */
  var Time: js.UndefOr[EventTime] = js.native
}
object PutPartnerEventsRequestEntry {
  
  @scala.inline
  def apply(): PutPartnerEventsRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPartnerEventsRequestEntry]
  }
  
  @scala.inline
  implicit class PutPartnerEventsRequestEntryMutableBuilder[Self <: PutPartnerEventsRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "Detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailType(value: String): Self = StObject.set(x, "DetailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailTypeUndefined: Self = StObject.set(x, "DetailType", js.undefined)
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "Detail", js.undefined)
    
    @scala.inline
    def setResources(value: EventResourceList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: EventResource*): Self = StObject.set(x, "Resources", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: EventSourceName): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setTime(value: EventTime): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "Time", js.undefined)
  }
}
