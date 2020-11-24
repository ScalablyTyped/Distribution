package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectStackDriftInput extends js.Object {
  
  /**
    * The logical names of any resources you want to use as filters.
    */
  var LogicalResourceIds: js.UndefOr[typings.awsSdk.cloudformationMod.LogicalResourceIds] = js.native
  
  /**
    * The name of the stack for which you want to detect drift. 
    */
  var StackName: StackNameOrId = js.native
}
object DetectStackDriftInput {
  
  @scala.inline
  def apply(StackName: StackNameOrId): DetectStackDriftInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackDriftInput]
  }
  
  @scala.inline
  implicit class DetectStackDriftInputOps[Self <: DetectStackDriftInput] (val x: Self) extends AnyVal {
    
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
    def setStackName(value: StackNameOrId): Self = this.set("StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalResourceIdsVarargs(value: LogicalResourceId*): Self = this.set("LogicalResourceIds", js.Array(value :_*))
    
    @scala.inline
    def setLogicalResourceIds(value: LogicalResourceIds): Self = this.set("LogicalResourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogicalResourceIds: Self = this.set("LogicalResourceIds", js.undefined)
  }
}
