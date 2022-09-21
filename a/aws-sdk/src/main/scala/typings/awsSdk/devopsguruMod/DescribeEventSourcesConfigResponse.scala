package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventSourcesConfigResponse extends StObject {
  
  /**
    * Lists the event sources in the configuration.
    */
  var EventSources: js.UndefOr[EventSourcesConfig] = js.undefined
}
object DescribeEventSourcesConfigResponse {
  
  inline def apply(): DescribeEventSourcesConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventSourcesConfigResponse]
  }
  
  extension [Self <: DescribeEventSourcesConfigResponse](x: Self) {
    
    inline def setEventSources(value: EventSourcesConfig): Self = StObject.set(x, "EventSources", value.asInstanceOf[js.Any])
    
    inline def setEventSourcesUndefined: Self = StObject.set(x, "EventSources", js.undefined)
  }
}
