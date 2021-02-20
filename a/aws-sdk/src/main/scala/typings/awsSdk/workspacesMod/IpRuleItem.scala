package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpRuleItem extends StObject {
  
  /**
    * The IP address range, in CIDR notation.
    */
  var ipRule: js.UndefOr[IpRule] = js.native
  
  /**
    * The description.
    */
  var ruleDesc: js.UndefOr[IpRuleDesc] = js.native
}
object IpRuleItem {
  
  @scala.inline
  def apply(): IpRuleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpRuleItem]
  }
  
  @scala.inline
  implicit class IpRuleItemMutableBuilder[Self <: IpRuleItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpRule(value: IpRule): Self = StObject.set(x, "ipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpRuleUndefined: Self = StObject.set(x, "ipRule", js.undefined)
    
    @scala.inline
    def setRuleDesc(value: IpRuleDesc): Self = StObject.set(x, "ruleDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleDescUndefined: Self = StObject.set(x, "ruleDesc", js.undefined)
  }
}
