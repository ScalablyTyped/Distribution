package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleVariables extends StObject {
  
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
  implicit class RuleVariablesMutableBuilder[Self <: RuleVariables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIPSets(value: IPSets): Self = StObject.set(x, "IPSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPSetsUndefined: Self = StObject.set(x, "IPSets", js.undefined)
    
    @scala.inline
    def setPortSets(value: PortSets): Self = StObject.set(x, "PortSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortSetsUndefined: Self = StObject.set(x, "PortSets", js.undefined)
  }
}
