package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVaultAccessPolicyOutput extends StObject {
  
  /**
    * Contains the returned vault access policy as a JSON string.
    */
  var policy: js.UndefOr[VaultAccessPolicy] = js.undefined
}
object GetVaultAccessPolicyOutput {
  
  inline def apply(): GetVaultAccessPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVaultAccessPolicyOutput]
  }
  
  extension [Self <: GetVaultAccessPolicyOutput](x: Self) {
    
    inline def setPolicy(value: VaultAccessPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
