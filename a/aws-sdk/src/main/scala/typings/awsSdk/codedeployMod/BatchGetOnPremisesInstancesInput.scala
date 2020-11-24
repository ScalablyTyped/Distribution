package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetOnPremisesInstancesInput extends js.Object {
  
  /**
    * The names of the on-premises instances about which to get information. The maximum number of instance names you can specify is 25.
    */
  var instanceNames: InstanceNameList = js.native
}
object BatchGetOnPremisesInstancesInput {
  
  @scala.inline
  def apply(instanceNames: InstanceNameList): BatchGetOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetOnPremisesInstancesInput]
  }
  
  @scala.inline
  implicit class BatchGetOnPremisesInstancesInputOps[Self <: BatchGetOnPremisesInstancesInput] (val x: Self) extends AnyVal {
    
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
    def setInstanceNamesVarargs(value: InstanceName*): Self = this.set("instanceNames", js.Array(value :_*))
    
    @scala.inline
    def setInstanceNames(value: InstanceNameList): Self = this.set("instanceNames", value.asInstanceOf[js.Any])
  }
}
