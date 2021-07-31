package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VaultAccessPolicy extends StObject {
  
  /**
    * The vault access policy.
    */
  var Policy: js.UndefOr[String] = js.undefined
}
object VaultAccessPolicy {
  
  @scala.inline
  def apply(): VaultAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultAccessPolicy]
  }
  
  @scala.inline
  implicit class VaultAccessPolicyMutableBuilder[Self <: VaultAccessPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
