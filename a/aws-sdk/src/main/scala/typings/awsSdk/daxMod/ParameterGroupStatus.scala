package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterGroupStatus extends js.Object {
  
  /**
    * The node IDs of one or more nodes to be rebooted.
    */
  var NodeIdsToReboot: js.UndefOr[NodeIdentifierList] = js.native
  
  /**
    * The status of parameter updates. 
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.native
  
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
}
object ParameterGroupStatus {
  
  @scala.inline
  def apply(): ParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterGroupStatus]
  }
  
  @scala.inline
  implicit class ParameterGroupStatusOps[Self <: ParameterGroupStatus] (val x: Self) extends AnyVal {
    
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
    def setNodeIdsToRebootVarargs(value: String*): Self = this.set("NodeIdsToReboot", js.Array(value :_*))
    
    @scala.inline
    def setNodeIdsToReboot(value: NodeIdentifierList): Self = this.set("NodeIdsToReboot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeIdsToReboot: Self = this.set("NodeIdsToReboot", js.undefined)
    
    @scala.inline
    def setParameterApplyStatus(value: String): Self = this.set("ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterApplyStatus: Self = this.set("ParameterApplyStatus", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: String): Self = this.set("ParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroupName: Self = this.set("ParameterGroupName", js.undefined)
  }
}
