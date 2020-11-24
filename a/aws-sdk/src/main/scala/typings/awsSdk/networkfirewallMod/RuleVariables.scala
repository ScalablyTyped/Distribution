package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleVariables extends js.Object {
  
  /**
    * A list of IP addresses and address ranges, in CIDR notation. 
    */
  var IPSets: js.UndefOr[typings.awsSdk.networkfirewallMod.IPSets] = js.native
  
  /**
    * A list of port ranges. 
    */
  var PortSets: js.UndefOr[typings.awsSdk.networkfirewallMod.PortSets] = js.native
}
object RuleVariables {
  
  @scala.inline
  def apply(): RuleVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleVariables]
  }
  
  @scala.inline
  implicit class RuleVariablesOps[Self <: RuleVariables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIPSets(value: IPSets): Self = this.set("IPSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPSets: Self = this.set("IPSets", js.undefined)
    
    @scala.inline
    def setPortSets(value: PortSets): Self = this.set("PortSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortSets: Self = this.set("PortSets", js.undefined)
  }
}
