package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualProxySettings[M, P] extends StObject {
  
  /** Settings for FTP proxy. */
  var FTPProxy: js.UndefOr[P] = js.undefined
  
  /** Settings for HTTP proxy. */
  var HTTPProxy: js.UndefOr[P] = js.undefined
  
  /** Settings for SOCKS proxy. */
  var SOCKS: js.UndefOr[P] = js.undefined
  
  /** Settings for secure HTTP proxy. */
  var SecureHTTPProxy: js.UndefOr[P] = js.undefined
}
object ManualProxySettings {
  
  inline def apply[M, P](): ManualProxySettings[M, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualProxySettings[M, P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManualProxySettings[?, ?], M, P] (val x: Self & (ManualProxySettings[M, P])) extends AnyVal {
    
    inline def setFTPProxy(value: P): Self = StObject.set(x, "FTPProxy", value.asInstanceOf[js.Any])
    
    inline def setFTPProxyUndefined: Self = StObject.set(x, "FTPProxy", js.undefined)
    
    inline def setHTTPProxy(value: P): Self = StObject.set(x, "HTTPProxy", value.asInstanceOf[js.Any])
    
    inline def setHTTPProxyUndefined: Self = StObject.set(x, "HTTPProxy", js.undefined)
    
    inline def setSOCKS(value: P): Self = StObject.set(x, "SOCKS", value.asInstanceOf[js.Any])
    
    inline def setSOCKSUndefined: Self = StObject.set(x, "SOCKS", js.undefined)
    
    inline def setSecureHTTPProxy(value: P): Self = StObject.set(x, "SecureHTTPProxy", value.asInstanceOf[js.Any])
    
    inline def setSecureHTTPProxyUndefined: Self = StObject.set(x, "SecureHTTPProxy", js.undefined)
  }
}
