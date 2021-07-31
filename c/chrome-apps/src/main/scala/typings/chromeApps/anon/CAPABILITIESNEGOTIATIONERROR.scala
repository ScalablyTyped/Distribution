package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.capabilities_negotiation_error_
import typings.chromeApps.chromeAppsStrings.connection_error_
import typings.chromeApps.chromeAppsStrings.media_pipeline_error_
import typings.chromeApps.chromeAppsStrings.timeout_error_
import typings.chromeApps.chromeAppsStrings.unknown_error_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAPABILITIESNEGOTIATIONERROR extends StObject {
  
  var CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error_
  
  var CONNECTION_ERROR: connection_error_
  
  var MEDIA_PIPELINE_ERROR: media_pipeline_error_
  
  var TIMEOUT_ERROR: timeout_error_
  
  var UNKNOWN_ERROR: unknown_error_
}
object CAPABILITIESNEGOTIATIONERROR {
  
  @scala.inline
  def apply(): CAPABILITIESNEGOTIATIONERROR = {
    val __obj = js.Dynamic.literal(CAPABILITIES_NEGOTIATION_ERROR = "capabilities_negotiation_error", CONNECTION_ERROR = "connection_error", MEDIA_PIPELINE_ERROR = "media_pipeline_error", TIMEOUT_ERROR = "timeout_error", UNKNOWN_ERROR = "unknown_error")
    __obj.asInstanceOf[CAPABILITIESNEGOTIATIONERROR]
  }
  
  @scala.inline
  implicit class CAPABILITIESNEGOTIATIONERRORMutableBuilder[Self <: CAPABILITIESNEGOTIATIONERROR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPABILITIES_NEGOTIATION_ERROR(value: capabilities_negotiation_error_): Self = StObject.set(x, "CAPABILITIES_NEGOTIATION_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONNECTION_ERROR(value: connection_error_): Self = StObject.set(x, "CONNECTION_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEDIA_PIPELINE_ERROR(value: media_pipeline_error_): Self = StObject.set(x, "MEDIA_PIPELINE_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTIMEOUT_ERROR(value: timeout_error_): Self = StObject.set(x, "TIMEOUT_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN_ERROR(value: unknown_error_): Self = StObject.set(x, "UNKNOWN_ERROR", value.asInstanceOf[js.Any])
  }
}
