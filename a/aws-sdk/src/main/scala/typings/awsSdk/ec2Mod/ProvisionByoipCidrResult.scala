package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionByoipCidrResult extends StObject {
  
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.ec2Mod.ByoipCidr] = js.undefined
}
object ProvisionByoipCidrResult {
  
  @scala.inline
  def apply(): ProvisionByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionByoipCidrResult]
  }
  
  @scala.inline
  implicit class ProvisionByoipCidrResultMutableBuilder[Self <: ProvisionByoipCidrResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
