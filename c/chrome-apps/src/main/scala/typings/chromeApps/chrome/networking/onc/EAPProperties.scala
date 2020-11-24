package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EAPProperties extends js.Object {
  
  var AnonymousIdentity: js.UndefOr[String] = js.native
  
  /** @since Chrome 60. */
  var ClientCertPKCS11Id: js.UndefOr[String] = js.native
  
  var ClientCertPattern: js.UndefOr[CertPattern] = js.native
  
  var ClientCertRef: js.UndefOr[String] = js.native
  
  var ClientCertType: js.UndefOr[typings.chromeApps.chrome.networking.onc.ClientCertType] = js.native
  
  var Identity: js.UndefOr[String] = js.native
  
  var Inner: js.UndefOr[String] = js.native
  
  /** The outer EAP type. Required by ONC, but may not be provided when translating from Shill. */
  var Outer: js.UndefOr[String] = js.native
  
  var Password: js.UndefOr[String] = js.native
  
  var SaveCredentials: js.UndefOr[Boolean] = js.native
  
  var ServerCAPEMs: js.UndefOr[js.Array[String]] = js.native
  
  var ServerCARefs: js.UndefOr[js.Array[String]] = js.native
  
  /** @since Chrome 60. */
  var SubjectMatch: js.UndefOr[ManagedDOMString] = js.native
  
  var UseProactiveKeyCaching: js.UndefOr[Boolean] = js.native
  
  var UseSytemCAs: js.UndefOr[Boolean] = js.native
}
object EAPProperties {
  
  @scala.inline
  def apply(): EAPProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EAPProperties]
  }
  
  @scala.inline
  implicit class EAPPropertiesOps[Self <: EAPProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnonymousIdentity(value: String): Self = this.set("AnonymousIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnonymousIdentity: Self = this.set("AnonymousIdentity", js.undefined)
    
    @scala.inline
    def setClientCertPKCS11Id(value: String): Self = this.set("ClientCertPKCS11Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertPKCS11Id: Self = this.set("ClientCertPKCS11Id", js.undefined)
    
    @scala.inline
    def setClientCertPattern(value: CertPattern): Self = this.set("ClientCertPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertPattern: Self = this.set("ClientCertPattern", js.undefined)
    
    @scala.inline
    def setClientCertRef(value: String): Self = this.set("ClientCertRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertRef: Self = this.set("ClientCertRef", js.undefined)
    
    @scala.inline
    def setClientCertType(value: ClientCertType): Self = this.set("ClientCertType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertType: Self = this.set("ClientCertType", js.undefined)
    
    @scala.inline
    def setIdentity(value: String): Self = this.set("Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("Identity", js.undefined)
    
    @scala.inline
    def setInner(value: String): Self = this.set("Inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInner: Self = this.set("Inner", js.undefined)
    
    @scala.inline
    def setOuter(value: String): Self = this.set("Outer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuter: Self = this.set("Outer", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    
    @scala.inline
    def setSaveCredentials(value: Boolean): Self = this.set("SaveCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveCredentials: Self = this.set("SaveCredentials", js.undefined)
    
    @scala.inline
    def setServerCAPEMsVarargs(value: String*): Self = this.set("ServerCAPEMs", js.Array(value :_*))
    
    @scala.inline
    def setServerCAPEMs(value: js.Array[String]): Self = this.set("ServerCAPEMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerCAPEMs: Self = this.set("ServerCAPEMs", js.undefined)
    
    @scala.inline
    def setServerCARefsVarargs(value: String*): Self = this.set("ServerCARefs", js.Array(value :_*))
    
    @scala.inline
    def setServerCARefs(value: js.Array[String]): Self = this.set("ServerCARefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerCARefs: Self = this.set("ServerCARefs", js.undefined)
    
    @scala.inline
    def setSubjectMatch(value: ManagedDOMString): Self = this.set("SubjectMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectMatch: Self = this.set("SubjectMatch", js.undefined)
    
    @scala.inline
    def setUseProactiveKeyCaching(value: Boolean): Self = this.set("UseProactiveKeyCaching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseProactiveKeyCaching: Self = this.set("UseProactiveKeyCaching", js.undefined)
    
    @scala.inline
    def setUseSytemCAs(value: Boolean): Self = this.set("UseSytemCAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSytemCAs: Self = this.set("UseSytemCAs", js.undefined)
  }
}
