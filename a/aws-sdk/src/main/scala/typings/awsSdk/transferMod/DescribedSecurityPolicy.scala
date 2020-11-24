package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribedSecurityPolicy extends js.Object {
  
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
  implicit class DescribedSecurityPolicyOps[Self <: DescribedSecurityPolicy] (val x: Self) extends AnyVal {
    
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
    def setSecurityPolicyName(value: SecurityPolicyName): Self = this.set("SecurityPolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFips(value: Fips): Self = this.set("Fips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFips: Self = this.set("Fips", js.undefined)
    
    @scala.inline
    def setSshCiphersVarargs(value: SecurityPolicyOption*): Self = this.set("SshCiphers", js.Array(value :_*))
    
    @scala.inline
    def setSshCiphers(value: SecurityPolicyOptions): Self = this.set("SshCiphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshCiphers: Self = this.set("SshCiphers", js.undefined)
    
    @scala.inline
    def setSshKexsVarargs(value: SecurityPolicyOption*): Self = this.set("SshKexs", js.Array(value :_*))
    
    @scala.inline
    def setSshKexs(value: SecurityPolicyOptions): Self = this.set("SshKexs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshKexs: Self = this.set("SshKexs", js.undefined)
    
    @scala.inline
    def setSshMacsVarargs(value: SecurityPolicyOption*): Self = this.set("SshMacs", js.Array(value :_*))
    
    @scala.inline
    def setSshMacs(value: SecurityPolicyOptions): Self = this.set("SshMacs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshMacs: Self = this.set("SshMacs", js.undefined)
    
    @scala.inline
    def setTlsCiphersVarargs(value: SecurityPolicyOption*): Self = this.set("TlsCiphers", js.Array(value :_*))
    
    @scala.inline
    def setTlsCiphers(value: SecurityPolicyOptions): Self = this.set("TlsCiphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsCiphers: Self = this.set("TlsCiphers", js.undefined)
  }
}
