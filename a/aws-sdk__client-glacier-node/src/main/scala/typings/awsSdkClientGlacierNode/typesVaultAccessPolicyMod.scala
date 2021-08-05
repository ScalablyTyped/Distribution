package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesVaultAccessPolicyMod {
  
  type UnmarshalledVaultAccessPolicy = VaultAccessPolicy
  
  trait VaultAccessPolicy extends StObject {
    
    /**
      * <p>The vault access policy.</p>
      */
    var Policy: js.UndefOr[String] = js.undefined
  }
  object VaultAccessPolicy {
    
    inline def apply(): VaultAccessPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultAccessPolicy]
    }
    
    extension [Self <: VaultAccessPolicy](x: Self) {
      
      inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    }
  }
}
