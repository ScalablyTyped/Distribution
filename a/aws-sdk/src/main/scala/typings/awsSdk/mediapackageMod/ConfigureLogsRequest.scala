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
  
  @scala.inline
  def apply(Id: string): ConfigureLogsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureLogsRequest]
  }
  
  @scala.inline
  implicit class ConfigureLogsRequestMutableBuilder[Self <: ConfigureLogsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEgressAccessLogs(value: EgressAccessLogs): Self = StObject.set(x, "EgressAccessLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressAccessLogsUndefined: Self = StObject.set(x, "EgressAccessLogs", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressAccessLogs(value: IngressAccessLogs): Self = StObject.set(x, "IngressAccessLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressAccessLogsUndefined: Self = StObject.set(x, "IngressAccessLogs", js.undefined)
  }
}
