package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortSet extends js.Object {
  
  /**
    * The set of port ranges. 
    */
  var Definition: js.UndefOr[VariableDefinitionList] = js.native
}
object PortSet {
  
  @scala.inline
  def apply(): PortSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortSet]
  }
  
  @scala.inline
  implicit class PortSetOps[Self <: PortSet] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteDefinition: Self = this.set("Definition", js.undefined)
  }
}
