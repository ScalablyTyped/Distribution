package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribedSecurityPolicy extends StObject {
  
  /**
    * Specifies whether this policy enables Federal Information Processing Standards (FIPS).
    */
  var Fips: js.UndefOr[typings.awsSdk.transferMod.Fips] = js.native
  
  /**
    * Specifies the name of the security policy that is attached to the server.
    */
  var SecurityPolicyName: typings.awsSdk.transferMod.SecurityPolicyName = js.native
  
  /**
    * Specifies the enabled Secure Shell (SSH) cipher encryption algorithms in the security policy that is attached to the server.
    */
  var SshCiphers: js.UndefOr[SecurityPolicyOptions] = js.native
  
  /**
    * Specifies the enabled SSH key exchange (KEX) encryption algorithms in the security policy that is attached to the server.
    */
  var SshKexs: js.UndefOr[SecurityPolicyOptions] = js.native
  
  /**
    * Specifies the enabled SSH message authentication code (MAC) encryption algorithms in the security policy that is attached to the server.
    */
  var SshMacs: js.UndefOr[SecurityPolicyOptions] = js.native
  
  /**
    * Specifies the enabled Transport Layer Security (TLS) cipher encryption algorithms in the security policy that is attached to the server.
    */
  var TlsCiphers: js.UndefOr[SecurityPolicyOptions] = js.native
}
object DescribedSecurityPolicy {
  
  @scala.inline
  def apply(SecurityPolicyName: SecurityPolicyName): DescribedSecurityPolicy = {
    val __obj = js.Dynamic.literal(SecurityPolicyName = SecurityPolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedSecurityPolicy]
  }
  
  @scala.inline
  implicit class DescribedSecurityPolicyMutableBuilder[Self <: DescribedSecurityPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFips(value: Fips): Self = StObject.set(x, "Fips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFipsUndefined: Self = StObject.set(x, "Fips", js.undefined)
    
    @scala.inline
    def setSecurityPolicyName(value: SecurityPolicyName): Self = StObject.set(x, "SecurityPolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshCiphers(value: SecurityPolicyOptions): Self = StObject.set(x, "SshCiphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshCiphersUndefined: Self = StObject.set(x, "SshCiphers", js.undefined)
    
    @scala.inline
    def setSshCiphersVarargs(value: SecurityPolicyOption*): Self = StObject.set(x, "SshCiphers", js.Array(value :_*))
    
    @scala.inline
    def setSshKexs(value: SecurityPolicyOptions): Self = StObject.set(x, "SshKexs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshKexsUndefined: Self = StObject.set(x, "SshKexs", js.undefined)
    
    @scala.inline
    def setSshKexsVarargs(value: SecurityPolicyOption*): Self = StObject.set(x, "SshKexs", js.Array(value :_*))
    
    @scala.inline
    def setSshMacs(value: SecurityPolicyOptions): Self = StObject.set(x, "SshMacs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshMacsUndefined: Self = StObject.set(x, "SshMacs", js.undefined)
    
    @scala.inline
    def setSshMacsVarargs(value: SecurityPolicyOption*): Self = StObject.set(x, "SshMacs", js.Array(value :_*))
    
    @scala.inline
    def setTlsCiphers(value: SecurityPolicyOptions): Self = StObject.set(x, "TlsCiphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsCiphersUndefined: Self = StObject.set(x, "TlsCiphers", js.undefined)
    
    @scala.inline
    def setTlsCiphersVarargs(value: SecurityPolicyOption*): Self = StObject.set(x, "TlsCiphers", js.Array(value :_*))
  }
}
