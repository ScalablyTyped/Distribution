package typings.azureMsalCommon

import typings.azureMsalCommon.anon.Kid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAccountTokenClaimsMod {
  
  trait TokenClaims extends StObject {
    
    var amr: js.UndefOr[js.Array[String]] = js.undefined
    
    var at: js.UndefOr[String] = js.undefined
    
    /**
      * Audience
      */
    var aud: js.UndefOr[String] = js.undefined
    
    var cloud_instance_host_name: js.UndefOr[String] = js.undefined
    
    var cnf: js.UndefOr[Kid] = js.undefined
    
    var emails: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Expiration
      */
    var exp: js.UndefOr[Double] = js.undefined
    
    var home_oid: js.UndefOr[String] = js.undefined
    
    /**
      * Issued at
      */
    var iat: js.UndefOr[Double] = js.undefined
    
    var idp: js.UndefOr[String] = js.undefined
    
    /**
      * Issuer
      */
    var iss: js.UndefOr[String] = js.undefined
    
    var login_hint: js.UndefOr[String] = js.undefined
    
    var m: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Not valid before
      */
    var nbf: js.UndefOr[Double] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    /**
      * Immutable object identifier, this ID uniquely identifies the user across applications
      */
    var oid: js.UndefOr[String] = js.undefined
    
    var p: js.UndefOr[String] = js.undefined
    
    var preferred_username: js.UndefOr[String] = js.undefined
    
    var roles: js.UndefOr[js.Array[String]] = js.undefined
    
    var sid: js.UndefOr[String] = js.undefined
    
    /**
      * Immutable subject identifier, this is a pairwise identifier - it is unique to a particular application ID
      */
    var sub: js.UndefOr[String] = js.undefined
    
    /**
      * Users' tenant or '9188040d-6c67-4c5b-b112-36a304b66dad' for personal accounts.
      */
    var tid: js.UndefOr[String] = js.undefined
    
    var ts: js.UndefOr[Double] = js.undefined
    
    var u: js.UndefOr[String] = js.undefined
    
    var upn: js.UndefOr[String] = js.undefined
    
    var ver: js.UndefOr[String] = js.undefined
    
    var x5c_ca: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TokenClaims {
    
    inline def apply(): TokenClaims = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenClaims]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenClaims] (val x: Self) extends AnyVal {
      
      inline def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
      
      inline def setAmrUndefined: Self = StObject.set(x, "amr", js.undefined)
      
      inline def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value*))
      
      inline def setAt(value: String): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
      
      inline def setCloud_instance_host_name(value: String): Self = StObject.set(x, "cloud_instance_host_name", value.asInstanceOf[js.Any])
      
      inline def setCloud_instance_host_nameUndefined: Self = StObject.set(x, "cloud_instance_host_name", js.undefined)
      
      inline def setCnf(value: Kid): Self = StObject.set(x, "cnf", value.asInstanceOf[js.Any])
      
      inline def setCnfUndefined: Self = StObject.set(x, "cnf", js.undefined)
      
      inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
      
      inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
      
      inline def setHome_oid(value: String): Self = StObject.set(x, "home_oid", value.asInstanceOf[js.Any])
      
      inline def setHome_oidUndefined: Self = StObject.set(x, "home_oid", js.undefined)
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
      
      inline def setIdp(value: String): Self = StObject.set(x, "idp", value.asInstanceOf[js.Any])
      
      inline def setIdpUndefined: Self = StObject.set(x, "idp", js.undefined)
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
      
      inline def setLogin_hint(value: String): Self = StObject.set(x, "login_hint", value.asInstanceOf[js.Any])
      
      inline def setLogin_hintUndefined: Self = StObject.set(x, "login_hint", js.undefined)
      
      inline def setM(value: String): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
      
      inline def setNbfUndefined: Self = StObject.set(x, "nbf", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      inline def setOidUndefined: Self = StObject.set(x, "oid", js.undefined)
      
      inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPreferred_username(value: String): Self = StObject.set(x, "preferred_username", value.asInstanceOf[js.Any])
      
      inline def setPreferred_usernameUndefined: Self = StObject.set(x, "preferred_username", js.undefined)
      
      inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
      
      inline def setTid(value: String): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      inline def setTidUndefined: Self = StObject.set(x, "tid", js.undefined)
      
      inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
      
      inline def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      inline def setUUndefined: Self = StObject.set(x, "u", js.undefined)
      
      inline def setUpn(value: String): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
      
      inline def setUpnUndefined: Self = StObject.set(x, "upn", js.undefined)
      
      inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
      
      inline def setVerUndefined: Self = StObject.set(x, "ver", js.undefined)
      
      inline def setX5c_ca(value: js.Array[String]): Self = StObject.set(x, "x5c_ca", value.asInstanceOf[js.Any])
      
      inline def setX5c_caUndefined: Self = StObject.set(x, "x5c_ca", js.undefined)
      
      inline def setX5c_caVarargs(value: String*): Self = StObject.set(x, "x5c_ca", js.Array(value*))
    }
  }
}
