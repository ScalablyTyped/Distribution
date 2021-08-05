package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesVaultLockPolicyMod {
  
  type UnmarshalledVaultLockPolicy = VaultLockPolicy
  
  trait VaultLockPolicy extends StObject {
    
    /**
      * <p>The vault lock policy.</p>
      */
    var Policy: js.UndefOr[String] = js.undefined
  }
  object VaultLockPolicy {
    
    inline def apply(): VaultLockPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultLockPolicy]
    }
    
    extension [Self <: VaultLockPolicy](x: Self) {
      
      inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    }
  }
}
