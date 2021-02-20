package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesVaultLockPolicyMod {
  
  type UnmarshalledVaultLockPolicy = VaultLockPolicy
  
  @js.native
  trait VaultLockPolicy extends StObject {
    
    /**
      * <p>The vault lock policy.</p>
      */
    var Policy: js.UndefOr[String] = js.native
  }
  object VaultLockPolicy {
    
    @scala.inline
    def apply(): VaultLockPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultLockPolicy]
    }
    
    @scala.inline
    implicit class VaultLockPolicyMutableBuilder[Self <: VaultLockPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    }
  }
}
