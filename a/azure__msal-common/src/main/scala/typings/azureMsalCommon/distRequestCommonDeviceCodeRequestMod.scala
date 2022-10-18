package typings.azureMsalCommon

import typings.azureMsalCommon.distRequestBaseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.distResponseDeviceCodeResponseMod.DeviceCodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestCommonDeviceCodeRequestMod {
  
  trait CommonDeviceCodeRequest
    extends StObject
       with BaseAuthRequest {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    def deviceCodeCallback(response: DeviceCodeResponse): Unit
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object CommonDeviceCodeRequest {
    
    inline def apply(
      authority: String,
      correlationId: String,
      deviceCodeCallback: DeviceCodeResponse => Unit,
      scopes: js.Array[String]
    ): CommonDeviceCodeRequest = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], deviceCodeCallback = js.Any.fromFunction1(deviceCodeCallback), scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonDeviceCodeRequest]
    }
    
    extension [Self <: CommonDeviceCodeRequest](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDeviceCodeCallback(value: DeviceCodeResponse => Unit): Self = StObject.set(x, "deviceCodeCallback", js.Any.fromFunction1(value))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
