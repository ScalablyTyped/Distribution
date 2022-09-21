package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventsRequestEntry extends StObject {
  
  /**
    * A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested subobjects.
    */
  var Detail: js.UndefOr[String] = js.undefined
  
  /**
    * Free-form string used to decide what fields to expect in the event detail.
    */
  var DetailType: js.UndefOr[String] = js.undefined
  
  /**
    * The name or ARN of the event bus to receive the event. Only the rules that are associated with this event bus are used to match the event. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[NonPartnerEventBusNameOrArn] = js.undefined
  
  /**
    * Amazon Web Services resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number, including zero, may be present.
    */
  var Resources: js.UndefOr[EventResourceList] = js.undefined
  
  /**
    * The source of the event.
    */
  var Source: js.UndefOr[String] = js.undefined
  
  /**
    * The time stamp of the event, per RFC3339. If no time stamp is provided, the time stamp of the PutEvents call is used.
    */
  var Time: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An X-Ray trade header, which is an http header (X-Amzn-Trace-Id) that contains the trace-id associated with the event. To learn more about X-Ray trace headers, see Tracing header in the X-Ray Developer Guide.
    */
  var TraceHeader: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.TraceHeader] = js.undefined
}
object PutEventsRequestEntry {
  
  inline def apply(): PutEventsRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventsRequestEntry]
  }
  
  extension [Self <: PutEventsRequestEntry](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "Detail", value.asInstanceOf[js.Any])
    
    inline def setDetailType(value: String): Self = StObject.set(x, "DetailType", value.asInstanceOf[js.Any])
    
    inline def setDetailTypeUndefined: Self = StObject.set(x, "DetailType", js.undefined)
    
    inline def setDetailUndefined: Self = StObject.set(x, "Detail", js.undefined)
    
    inline def setEventBusName(value: NonPartnerEventBusNameOrArn): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    inline def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    inline def setResources(value: EventResourceList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: EventResource*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setTime(value: js.Date): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "Time", js.undefined)
    
    inline def setTraceHeader(value: TraceHeader): Self = StObject.set(x, "TraceHeader", value.asInstanceOf[js.Any])
    
    inline def setTraceHeaderUndefined: Self = StObject.set(x, "TraceHeader", js.undefined)
  }
}
