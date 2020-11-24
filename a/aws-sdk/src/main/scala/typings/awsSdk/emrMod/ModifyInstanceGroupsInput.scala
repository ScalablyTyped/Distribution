package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyInstanceGroupsInput extends js.Object {
  
  /**
    * The ID of the cluster to which the instance group belongs.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.emrMod.ClusterId] = js.native
  
  /**
    * Instance groups to change.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupModifyConfigList] = js.native
}
object ModifyInstanceGroupsInput {
  
  @scala.inline
  def apply(): ModifyInstanceGroupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceGroupsInput]
  }
  
  @scala.inline
  implicit class ModifyInstanceGroupsInputOps[Self <: ModifyInstanceGroupsInput] (val x: Self) extends AnyVal {
    
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
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterId: Self = this.set("ClusterId", js.undefined)
    
    @scala.inline
    def setInstanceGroupsVarargs(value: InstanceGroupModifyConfig*): Self = this.set("InstanceGroups", js.Array(value :_*))
    
    @scala.inline
    def setInstanceGroups(value: InstanceGroupModifyConfigList): Self = this.set("InstanceGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceGroups: Self = this.set("InstanceGroups", js.undefined)
  }
}
