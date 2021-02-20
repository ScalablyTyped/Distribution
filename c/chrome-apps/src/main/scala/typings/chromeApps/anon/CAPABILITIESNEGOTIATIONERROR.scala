package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.capabilities_negotiation_error_
import typings.chromeApps.chromeAppsStrings.connection_error_
import typings.chromeApps.chromeAppsStrings.media_pipeline_error_
import typings.chromeApps.chromeAppsStrings.timeout_error_
import typings.chromeApps.chromeAppsStrings.unknown_error_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPABILITIESNEGOTIATIONERROR extends StObject {
  
  var CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error_ = js.native
  
  var CONNECTION_ERROR: connection_error_ = js.native
  
  var MEDIA_PIPELINE_ERROR: media_pipeline_error_ = js.native
  
  var TIMEOUT_ERROR: timeout_error_ = js.native
  
  var UNKNOWN_ERROR: unknown_error_ = js.native
}
object CAPABILITIESNEGOTIATIONERROR {
  
  @scala.inline
  def apply(
    CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error_,
    CONNECTION_ERROR: connection_error_,
    MEDIA_PIPELINE_ERROR: media_pipeline_error_,
    TIMEOUT_ERROR: timeout_error_,
    UNKNOWN_ERROR: unknown_error_
  ): CAPABILITIESNEGOTIATIONERROR = {
    val __obj = js.Dynamic.literal(CAPABILITIES_NEGOTIATION_ERROR = CAPABILITIES_NEGOTIATION_ERROR.asInstanceOf[js.Any], CONNECTION_ERROR = CONNECTION_ERROR.asInstanceOf[js.Any], MEDIA_PIPELINE_ERROR = MEDIA_PIPELINE_ERROR.asInstanceOf[js.Any], TIMEOUT_ERROR = TIMEOUT_ERROR.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any])
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
