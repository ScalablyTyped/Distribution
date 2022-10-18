package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribedSecurityPolicy extends StObject {
  
  /**
    * Specifies whether this policy enables Federal Information Processing Standards (FIPS).
    */
  var Fips: js.UndefOr[typings.awsSdk.clientsTransferMod.Fips] = js.undefined
  
  /**
    * Specifies the name of the security policy that is attached to the server.
    */
  var SecurityPolicyName: typings.awsSdk.clientsTransferMod.SecurityPolicyName
  
  /**
    * Specifies the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached to the server.
    */
  var SshCiphers: js.UndefOr[SecurityPolicyOptions] = js.undefined
  
  /**
    * Specifies the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to the server.
    */
  var SshKexs: js.UndefOr[SecurityPolicyOptions] = js.undefined
  
  /**
    * Specifies the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that is attached to the server.
    */
  var SshMacs: js.UndefOr[SecurityPolicyOptions] = js.undefined
  
  /**
    * Specifies the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that is attached to the server.
    */
  var TlsCiphers: js.UndefOr[SecurityPolicyOptions] = js.undefined
}
object DescribedSecurityPolicy {
  
  inline def apply(SecurityPolicyName: SecurityPolicyName): DescribedSecurityPolicy = {
    val __obj = js.Dynamic.literal(SecurityPolicyName = SecurityPolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedSecurityPolicy]
  }
  
  extension [Self <: DescribedSecurityPolicy](x: Self) {
    
    inline def setFips(value: Fips): Self = StObject.set(x, "Fips", value.asInstanceOf[js.Any])
    
    inline def setFipsUndefined: Self = StObject.set(x, "Fips", js.undefined)
    
    inline def setSecurityPolicyName(value: SecurityPolicyName): Self = StObject.set(x, "SecurityPolicyName", value.asInstanceOf[js.Any])
    
    inline def setSshCiphers(value: SecurityPolicyOptions): Self = StObject.set(x, "SshCiphers", value.asInstanceOf[js.Any])
    
    inline def setSshCiphersUndefined: Self = StObject.set(x, "SshCiphers", js.undefined)
    
    inline def setSshCiphersVarargs(value: SecurityPolicyOption*): Self = StObject.set(x, "SshCiphers", js.Array(value*))
    
    inline def setSshKexs(value: SecurityPolicyOptions): Self = StObject.set(x, "SshKexs", value.asInstanceOf[js.Any])
    
    inline def setSshKexsUndefined: Self = StObject.set(x, "SshKexs", js.undefined)
    
    inline def setSshKexsVarargs(value: SecurityPolicyOption*): Self = StObject.set(x, "SshKexs", js.Array(value*))
    
    inline def setSshMacs(value: SecurityPolicyOptions): Self = StObject.set(x, "SshMacs", value.asInstanceOf[js.Any])
    
    inline def setSshMacsUndefined: Self = StObject.set(x, "SshMacs", js.undefined)
    
    inline def setSshMacsVarargs(value: SecurityPolicyOption*): Self = StObject.set(x, "SshMacs", js.Array(value*))
    
    inline def setTlsCiphers(value: SecurityPolicyOptions): Self = StObject.set(x, "TlsCiphers", value.asInstanceOf[js.Any])
    
    inline def setTlsCiphersUndefined: Self = StObject.set(x, "TlsCiphers", js.undefined)
    
    inline def setTlsCiphersVarargs(value: SecurityPolicyOption*): Self = StObject.set(x, "TlsCiphers", js.Array(value*))
  }
}
