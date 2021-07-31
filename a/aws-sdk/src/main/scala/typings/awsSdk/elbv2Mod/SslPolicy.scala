package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslPolicy extends StObject {
  
  /**
    * The ciphers.
    */
  var Ciphers: js.UndefOr[typings.awsSdk.elbv2Mod.Ciphers] = js.undefined
  
  /**
    * The name of the policy.
    */
  var Name: js.UndefOr[SslPolicyName] = js.undefined
  
  /**
    * The protocols.
    */
  var SslProtocols: js.UndefOr[typings.awsSdk.elbv2Mod.SslProtocols] = js.undefined
}
object SslPolicy {
  
  @scala.inline
  def apply(): SslPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslPolicy]
  }
  
  @scala.inline
  implicit class SslPolicyMutableBuilder[Self <: SslPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCiphers(value: Ciphers): Self = StObject.set(x, "Ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphersUndefined: Self = StObject.set(x, "Ciphers", js.undefined)
    
    @scala.inline
    def setCiphersVarargs(value: Cipher*): Self = StObject.set(x, "Ciphers", js.Array(value :_*))
    
    @scala.inline
    def setName(value: SslPolicyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSslProtocols(value: SslProtocols): Self = StObject.set(x, "SslProtocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslProtocolsUndefined: Self = StObject.set(x, "SslProtocols", js.undefined)
    
    @scala.inline
    def setSslProtocolsVarargs(value: SslProtocol*): Self = StObject.set(x, "SslProtocols", js.Array(value :_*))
  }
}
