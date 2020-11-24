package typings.awsSdkClientDynamodbNode.typesReplicaUpdateMod

import typings.awsSdkClientDynamodbNode.typesCreateReplicaActionMod.CreateReplicaAction
import typings.awsSdkClientDynamodbNode.typesDeleteReplicaActionMod.DeleteReplicaAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicaUpdate extends js.Object {
  
  /**
    * <p>The parameters required for creating a replica on an existing global table.</p>
    */
  var Create: js.UndefOr[CreateReplicaAction] = js.native
  
  /**
    * <p>The name of the existing replica to be removed.</p>
    */
  var Delete: js.UndefOr[DeleteReplicaAction] = js.native
}
object ReplicaUpdate {
  
  @scala.inline
  def apply(): ReplicaUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaUpdate]
  }
  
  @scala.inline
  implicit class ReplicaUpdateOps[Self <: ReplicaUpdate] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: CreateReplicaAction): Self = this.set("Create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("Create", js.undefined)
    
    @scala.inline
    def setDelete(value: DeleteReplicaAction): Self = this.set("Delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("Delete", js.undefined)
  }
}
