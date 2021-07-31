package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VaultLockPolicy extends StObject {
  
  /**
    * The vault lock policy.
    */
  var Policy: js.UndefOr[String] = js.undefined
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
