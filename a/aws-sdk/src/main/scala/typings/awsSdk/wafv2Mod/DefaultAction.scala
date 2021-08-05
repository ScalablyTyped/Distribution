package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultAction extends StObject {
  
  /**
    * Specifies that AWS WAF should allow requests by default.
    */
  var Allow: js.UndefOr[AllowAction] = js.undefined
  
  /**
    * Specifies that AWS WAF should block requests by default. 
    */
  var Block: js.UndefOr[BlockAction] = js.undefined
}
object DefaultAction {
  
  inline def apply(): DefaultAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultAction]
  }
  
  extension [Self <: DefaultAction](x: Self) {
    
    inline def setAllow(value: AllowAction): Self = StObject.set(x, "Allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "Allow", js.undefined)
    
    inline def setBlock(value: BlockAction): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "Block", js.undefined)
  }
}
