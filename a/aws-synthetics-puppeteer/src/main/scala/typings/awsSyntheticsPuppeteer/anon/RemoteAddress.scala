package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteAddress extends StObject {
  
  var headers: Boolean
  
  var remoteAddress: Boolean
  
  var status: Boolean
  
  var statusText: Boolean
  
  var url: Boolean
}
object RemoteAddress {
  
  inline def apply(headers: Boolean, remoteAddress: Boolean, status: Boolean, statusText: Boolean, url: Boolean): RemoteAddress = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteAddress]
  }
  
  extension [Self <: RemoteAddress](x: Self) {
    
    inline def setHeaders(value: Boolean): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setRemoteAddress(value: Boolean): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: Boolean): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: Boolean): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
