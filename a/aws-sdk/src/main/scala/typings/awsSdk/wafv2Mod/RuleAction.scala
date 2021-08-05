package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleAction extends StObject {
  
  /**
    * Instructs AWS WAF to allow the web request.
    */
  var Allow: js.UndefOr[AllowAction] = js.undefined
  
  /**
    * Instructs AWS WAF to block the web request.
    */
  var Block: js.UndefOr[BlockAction] = js.undefined
  
  /**
    * Instructs AWS WAF to count the web request and allow it.
    */
  var Count: js.UndefOr[CountAction] = js.undefined
}
object RuleAction {
  
  inline def apply(): RuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleAction]
  }
  
  extension [Self <: RuleAction](x: Self) {
    
    inline def setAllow(value: AllowAction): Self = StObject.set(x, "Allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "Allow", js.undefined)
    
    inline def setBlock(value: BlockAction): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "Block", js.undefined)
    
    inline def setCount(value: CountAction): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
  }
}
