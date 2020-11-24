package typings.awsSdkClientDynamodbBrowser.typesReplicaUpdateMod

import typings.awsSdkClientDynamodbBrowser.typesCreateReplicaActionMod.UnmarshalledCreateReplicaAction
import typings.awsSdkClientDynamodbBrowser.typesDeleteReplicaActionMod.UnmarshalledDeleteReplicaAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledReplicaUpdate extends ReplicaUpdate {
  
  /**
    * <p>The parameters required for creating a replica on an existing global table.</p>
    */
  @JSName("Create")
  var Create_UnmarshalledReplicaUpdate: js.UndefOr[UnmarshalledCreateReplicaAction] = js.native
  
  /**
    * <p>The name of the existing replica to be removed.</p>
    */
  @JSName("Delete")
  var Delete_UnmarshalledReplicaUpdate: js.UndefOr[UnmarshalledDeleteReplicaAction] = js.native
}
object UnmarshalledReplicaUpdate {
  
  @scala.inline
  def apply(): UnmarshalledReplicaUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledReplicaUpdate]
  }
  
  @scala.inline
  implicit class UnmarshalledReplicaUpdateOps[Self <: UnmarshalledReplicaUpdate] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: UnmarshalledCreateReplicaAction): Self = this.set("Create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("Create", js.undefined)
    
    @scala.inline
    def setDelete(value: UnmarshalledDeleteReplicaAction): Self = this.set("Delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("Delete", js.undefined)
  }
}
