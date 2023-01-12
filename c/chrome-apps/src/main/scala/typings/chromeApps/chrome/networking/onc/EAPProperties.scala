package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EAPProperties extends StObject {
  
  var AnonymousIdentity: js.UndefOr[String] = js.undefined
  
  /** @since Chrome 60. */
  var ClientCertPKCS11Id: js.UndefOr[String] = js.undefined
  
  var ClientCertPattern: js.UndefOr[CertPattern] = js.undefined
  
  var ClientCertRef: js.UndefOr[String] = js.undefined
  
  var ClientCertType: js.UndefOr[typings.chromeApps.chrome.networking.onc.ClientCertType] = js.undefined
  
  var Identity: js.UndefOr[String] = js.undefined
  
  var Inner: js.UndefOr[String] = js.undefined
  
  /** The outer EAP type. Required by ONC, but may not be provided when translating from Shill. */
  var Outer: js.UndefOr[String] = js.undefined
  
  var Password: js.UndefOr[String] = js.undefined
  
  var SaveCredentials: js.UndefOr[Boolean] = js.undefined
  
  var ServerCAPEMs: js.UndefOr[js.Array[String]] = js.undefined
  
  var ServerCARefs: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @since Chrome 60. */
  var SubjectMatch: js.UndefOr[ManagedDOMString] = js.undefined
  
  var UseProactiveKeyCaching: js.UndefOr[Boolean] = js.undefined
  
  var UseSytemCAs: js.UndefOr[Boolean] = js.undefined
}
object EAPProperties {
  
  inline def apply(): EAPProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EAPProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EAPProperties] (val x: Self) extends AnyVal {
    
    inline def setAnonymousIdentity(value: String): Self = StObject.set(x, "AnonymousIdentity", value.asInstanceOf[js.Any])
    
    inline def setAnonymousIdentityUndefined: Self = StObject.set(x, "AnonymousIdentity", js.undefined)
    
    inline def setClientCertPKCS11Id(value: String): Self = StObject.set(x, "ClientCertPKCS11Id", value.asInstanceOf[js.Any])
    
    inline def setClientCertPKCS11IdUndefined: Self = StObject.set(x, "ClientCertPKCS11Id", js.undefined)
    
    inline def setClientCertPattern(value: CertPattern): Self = StObject.set(x, "ClientCertPattern", value.asInstanceOf[js.Any])
    
    inline def setClientCertPatternUndefined: Self = StObject.set(x, "ClientCertPattern", js.undefined)
    
    inline def setClientCertRef(value: String): Self = StObject.set(x, "ClientCertRef", value.asInstanceOf[js.Any])
    
    inline def setClientCertRefUndefined: Self = StObject.set(x, "ClientCertRef", js.undefined)
    
    inline def setClientCertType(value: ClientCertType): Self = StObject.set(x, "ClientCertType", value.asInstanceOf[js.Any])
    
    inline def setClientCertTypeUndefined: Self = StObject.set(x, "ClientCertType", js.undefined)
    
    inline def setIdentity(value: String): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "Identity", js.undefined)
    
    inline def setInner(value: String): Self = StObject.set(x, "Inner", value.asInstanceOf[js.Any])
    
    inline def setInnerUndefined: Self = StObject.set(x, "Inner", js.undefined)
    
    inline def setOuter(value: String): Self = StObject.set(x, "Outer", value.asInstanceOf[js.Any])
    
    inline def setOuterUndefined: Self = StObject.set(x, "Outer", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setSaveCredentials(value: Boolean): Self = StObject.set(x, "SaveCredentials", value.asInstanceOf[js.Any])
    
    inline def setSaveCredentialsUndefined: Self = StObject.set(x, "SaveCredentials", js.undefined)
    
    inline def setServerCAPEMs(value: js.Array[String]): Self = StObject.set(x, "ServerCAPEMs", value.asInstanceOf[js.Any])
    
    inline def setServerCAPEMsUndefined: Self = StObject.set(x, "ServerCAPEMs", js.undefined)
    
    inline def setServerCAPEMsVarargs(value: String*): Self = StObject.set(x, "ServerCAPEMs", js.Array(value*))
    
    inline def setServerCARefs(value: js.Array[String]): Self = StObject.set(x, "ServerCARefs", value.asInstanceOf[js.Any])
    
    inline def setServerCARefsUndefined: Self = StObject.set(x, "ServerCARefs", js.undefined)
    
    inline def setServerCARefsVarargs(value: String*): Self = StObject.set(x, "ServerCARefs", js.Array(value*))
    
    inline def setSubjectMatch(value: ManagedDOMString): Self = StObject.set(x, "SubjectMatch", value.asInstanceOf[js.Any])
    
    inline def setSubjectMatchUndefined: Self = StObject.set(x, "SubjectMatch", js.undefined)
    
    inline def setUseProactiveKeyCaching(value: Boolean): Self = StObject.set(x, "UseProactiveKeyCaching", value.asInstanceOf[js.Any])
    
    inline def setUseProactiveKeyCachingUndefined: Self = StObject.set(x, "UseProactiveKeyCaching", js.undefined)
    
    inline def setUseSytemCAs(value: Boolean): Self = StObject.set(x, "UseSytemCAs", value.asInstanceOf[js.Any])
    
    inline def setUseSytemCAsUndefined: Self = StObject.set(x, "UseSytemCAs", js.undefined)
  }
}
