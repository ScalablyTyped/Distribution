package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableReplicaAutoScalingOutput extends js.Object {
  
  /**
    * Returns information about the auto scaling settings of a table with replicas.
    */
  var TableAutoScalingDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TableAutoScalingDescription] = js.native
}
object UpdateTableReplicaAutoScalingOutput {
  
  @scala.inline
  def apply(): UpdateTableReplicaAutoScalingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableReplicaAutoScalingOutput]
  }
  
  @scala.inline
  implicit class UpdateTableReplicaAutoScalingOutputOps[Self <: UpdateTableReplicaAutoScalingOutput] (val x: Self) extends AnyVal {
    
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
    def setTableAutoScalingDescription(value: TableAutoScalingDescription): Self = this.set("TableAutoScalingDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableAutoScalingDescription: Self = this.set("TableAutoScalingDescription", js.undefined)
  }
}
