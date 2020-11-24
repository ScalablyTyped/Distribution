package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPSet extends js.Object {
  
  /**
    * The list of IP addresses and address ranges, in CIDR notation. 
    */
  var Definition: VariableDefinitionList = js.native
}
object IPSet {
  
  @scala.inline
  def apply(Definition: VariableDefinitionList): IPSet = {
    val __obj = js.Dynamic.literal(Definition = Definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSet]
  }
  
  @scala.inline
  implicit class IPSetOps[Self <: IPSet] (val x: Self) extends AnyVal {
    
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
    def setDefinitionVarargs(value: VariableDefinition*): Self = this.set("Definition", js.Array(value :_*))
    
    @scala.inline
    def setDefinition(value: VariableDefinitionList): Self = this.set("Definition", value.asInstanceOf[js.Any])
  }
}
