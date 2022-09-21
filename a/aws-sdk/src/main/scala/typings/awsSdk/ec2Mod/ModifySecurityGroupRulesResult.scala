package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifySecurityGroupRulesResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object ModifySecurityGroupRulesResult {
  
  inline def apply(): ModifySecurityGroupRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifySecurityGroupRulesResult]
  }
  
  extension [Self <: ModifySecurityGroupRulesResult](x: Self) {
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
