package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualProxySettings[M, P] extends StObject {
  
  /** Settings for FTP proxy. */
  var FTPProxy: js.UndefOr[P] = js.native
  
  /** Settings for HTTP proxy. */
  var HTTPProxy: js.UndefOr[P] = js.native
  
  /** Settings for SOCKS proxy. */
  var SOCKS: js.UndefOr[P] = js.native
  
  /** Settings for secure HTTP proxy. */
  var SecureHTTPProxy: js.UndefOr[P] = js.native
}
object ManualProxySettings {
  
  @scala.inline
  def apply[M, P](): ManualProxySettings[M, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualProxySettings[M, P]]
  }
  
  @scala.inline
  implicit class ManualProxySettingsMutableBuilder[Self <: ManualProxySettings[_, _], M, P] (val x: Self with (ManualProxySettings[M, P])) extends AnyVal {
    
    @scala.inline
    def setFTPProxy(value: P): Self = StObject.set(x, "FTPProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFTPProxyUndefined: Self = StObject.set(x, "FTPProxy", js.undefined)
    
    @scala.inline
    def setHTTPProxy(value: P): Self = StObject.set(x, "HTTPProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTTPProxyUndefined: Self = StObject.set(x, "HTTPProxy", js.undefined)
    
    @scala.inline
    def setSOCKS(value: P): Self = StObject.set(x, "SOCKS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSOCKSUndefined: Self = StObject.set(x, "SOCKS", js.undefined)
    
    @scala.inline
    def setSecureHTTPProxy(value: P): Self = StObject.set(x, "SecureHTTPProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureHTTPProxyUndefined: Self = StObject.set(x, "SecureHTTPProxy", js.undefined)
  }
}
