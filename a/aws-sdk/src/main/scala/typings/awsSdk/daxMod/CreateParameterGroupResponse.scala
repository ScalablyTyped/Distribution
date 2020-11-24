package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateParameterGroupResponse extends js.Object {
  
  /**
    * Represents the output of a CreateParameterGroup action.
    */
  var ParameterGroup: js.UndefOr[typings.awsSdk.daxMod.ParameterGroup] = js.native
}
object CreateParameterGroupResponse {
  
  @scala.inline
  def apply(): CreateParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParameterGroupResponse]
  }
  
  @scala.inline
  implicit class CreateParameterGroupResponseOps[Self <: CreateParameterGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameterGroup(value: ParameterGroup): Self = this.set("ParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroup: Self = this.set("ParameterGroup", js.undefined)
  }
}
