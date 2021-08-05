package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureLogsRequest extends StObject {
  
  var EgressAccessLogs: js.UndefOr[typings.awsSdk.mediapackageMod.EgressAccessLogs] = js.undefined
  
  /**
    * The ID of the channel to log subscription.
    */
  var Id: string
  
  var IngressAccessLogs: js.UndefOr[typings.awsSdk.mediapackageMod.IngressAccessLogs] = js.undefined
}
object ConfigureLogsRequest {
  
  inline def apply(Id: string): ConfigureLogsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureLogsRequest]
  }
  
  extension [Self <: ConfigureLogsRequest](x: Self) {
    
    inline def setEgressAccessLogs(value: EgressAccessLogs): Self = StObject.set(x, "EgressAccessLogs", value.asInstanceOf[js.Any])
    
    inline def setEgressAccessLogsUndefined: Self = StObject.set(x, "EgressAccessLogs", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIngressAccessLogs(value: IngressAccessLogs): Self = StObject.set(x, "IngressAccessLogs", value.asInstanceOf[js.Any])
    
    inline def setIngressAccessLogsUndefined: Self = StObject.set(x, "IngressAccessLogs", js.undefined)
  }
}
