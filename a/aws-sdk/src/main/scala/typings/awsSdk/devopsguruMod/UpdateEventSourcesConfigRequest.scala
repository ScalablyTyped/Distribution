package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventSourcesConfigRequest extends StObject {
  
  /**
    * Configuration information about the integration of DevOps Guru as the Consumer via EventBridge with another AWS Service.
    */
  var EventSources: js.UndefOr[EventSourcesConfig] = js.undefined
}
object UpdateEventSourcesConfigRequest {
  
  inline def apply(): UpdateEventSourcesConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEventSourcesConfigRequest]
  }
  
  extension [Self <: UpdateEventSourcesConfigRequest](x: Self) {
    
    inline def setEventSources(value: EventSourcesConfig): Self = StObject.set(x, "EventSources", value.asInstanceOf[js.Any])
    
    inline def setEventSourcesUndefined: Self = StObject.set(x, "EventSources", js.undefined)
  }
}
