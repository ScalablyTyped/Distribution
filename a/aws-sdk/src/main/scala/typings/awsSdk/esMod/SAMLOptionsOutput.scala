package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAMLOptionsOutput extends StObject {
  
  /**
    * True if SAML is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes the SAML Identity Provider's information.
    */
  var Idp: js.UndefOr[SAMLIdp] = js.undefined
  
  /**
    * The key used for matching the SAML Roles attribute.
    */
  var RolesKey: js.UndefOr[String] = js.undefined
  
  /**
    * The duration, in minutes, after which a user session becomes inactive.
    */
  var SessionTimeoutMinutes: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    * The key used for matching the SAML Subject attribute.
    */
  var SubjectKey: js.UndefOr[String] = js.undefined
}
object SAMLOptionsOutput {
  
  inline def apply(): SAMLOptionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAMLOptionsOutput]
  }
  
  extension [Self <: SAMLOptionsOutput](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setIdp(value: SAMLIdp): Self = StObject.set(x, "Idp", value.asInstanceOf[js.Any])
    
    inline def setIdpUndefined: Self = StObject.set(x, "Idp", js.undefined)
    
    inline def setRolesKey(value: String): Self = StObject.set(x, "RolesKey", value.asInstanceOf[js.Any])
    
    inline def setRolesKeyUndefined: Self = StObject.set(x, "RolesKey", js.undefined)
    
    inline def setSessionTimeoutMinutes(value: IntegerClass): Self = StObject.set(x, "SessionTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutMinutesUndefined: Self = StObject.set(x, "SessionTimeoutMinutes", js.undefined)
    
    inline def setSubjectKey(value: String): Self = StObject.set(x, "SubjectKey", value.asInstanceOf[js.Any])
    
    inline def setSubjectKeyUndefined: Self = StObject.set(x, "SubjectKey", js.undefined)
  }
}
