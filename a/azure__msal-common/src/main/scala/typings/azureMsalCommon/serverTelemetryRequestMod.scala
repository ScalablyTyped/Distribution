package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverTelemetryRequestMod {
  
  trait ServerTelemetryRequest extends StObject {
    
    var apiId: Double
    
    var clientId: String
    
    var correlationId: String
    
    var forceRefresh: js.UndefOr[Boolean] = js.undefined
    
    var wrapperSKU: js.UndefOr[String] = js.undefined
    
    var wrapperVer: js.UndefOr[String] = js.undefined
  }
  object ServerTelemetryRequest {
    
    inline def apply(apiId: Double, clientId: String, correlationId: String): ServerTelemetryRequest = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerTelemetryRequest]
    }
    
    extension [Self <: ServerTelemetryRequest](x: Self) {
      
      inline def setApiId(value: Double): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
      
      inline def setWrapperSKU(value: String): Self = StObject.set(x, "wrapperSKU", value.asInstanceOf[js.Any])
      
      inline def setWrapperSKUUndefined: Self = StObject.set(x, "wrapperSKU", js.undefined)
      
      inline def setWrapperVer(value: String): Self = StObject.set(x, "wrapperVer", value.asInstanceOf[js.Any])
      
      inline def setWrapperVerUndefined: Self = StObject.set(x, "wrapperVer", js.undefined)
    }
  }
}
