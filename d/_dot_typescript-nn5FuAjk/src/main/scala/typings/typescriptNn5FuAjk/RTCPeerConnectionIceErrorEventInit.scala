package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCPeerConnectionIceErrorEventInit
  extends StObject
     with EventInit {
  
  var address: js.UndefOr[java.lang.String | Null] = js.undefined
  
  var errorCode: Double
  
  var errorText: js.UndefOr[java.lang.String] = js.undefined
  
  var port: js.UndefOr[Double | Null] = js.undefined
  
  var url: js.UndefOr[java.lang.String] = js.undefined
}
object RTCPeerConnectionIceErrorEventInit {
  
  inline def apply(errorCode: Double): RTCPeerConnectionIceErrorEventInit = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionIceErrorEventInit]
  }
  
  extension [Self <: RTCPeerConnectionIceErrorEventInit](x: Self) {
    
    inline def setAddress(value: java.lang.String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorText(value: java.lang.String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
