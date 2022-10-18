package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpRuleItem extends StObject {
  
  /**
    * The IP address range, in CIDR notation.
    */
  var ipRule: js.UndefOr[IpRule] = js.undefined
  
  /**
    * The description.
    */
  var ruleDesc: js.UndefOr[IpRuleDesc] = js.undefined
}
object IpRuleItem {
  
  inline def apply(): IpRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpRuleItem]
  }
  
  extension [Self <: IpRuleItem](x: Self) {
    
    inline def setIpRule(value: IpRule): Self = StObject.set(x, "ipRule", value.asInstanceOf[js.Any])
    
    inline def setIpRuleUndefined: Self = StObject.set(x, "ipRule", js.undefined)
    
    inline def setRuleDesc(value: IpRuleDesc): Self = StObject.set(x, "ruleDesc", value.asInstanceOf[js.Any])
    
    inline def setRuleDescUndefined: Self = StObject.set(x, "ruleDesc", js.undefined)
  }
}
