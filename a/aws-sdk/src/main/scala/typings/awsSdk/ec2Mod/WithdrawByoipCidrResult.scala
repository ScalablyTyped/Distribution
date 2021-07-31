package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithdrawByoipCidrResult extends StObject {
  
  /**
    * Information about the address pool.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.ec2Mod.ByoipCidr] = js.undefined
}
object WithdrawByoipCidrResult {
  
  @scala.inline
  def apply(): WithdrawByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithdrawByoipCidrResult]
  }
  
  @scala.inline
  implicit class WithdrawByoipCidrResultMutableBuilder[Self <: WithdrawByoipCidrResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
