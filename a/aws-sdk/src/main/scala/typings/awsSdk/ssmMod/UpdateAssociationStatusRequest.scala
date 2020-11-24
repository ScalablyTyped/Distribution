package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAssociationStatusRequest extends js.Object {
  
  /**
    * The association status.
    */
  var AssociationStatus: typings.awsSdk.ssmMod.AssociationStatus = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ssmMod.InstanceId = js.native
  
  /**
    * The name of the Systems Manager document.
    */
  var Name: DocumentARN = js.native
}
object UpdateAssociationStatusRequest {
  
  @scala.inline
  def apply(AssociationStatus: AssociationStatus, InstanceId: InstanceId, Name: DocumentARN): UpdateAssociationStatusRequest = {
    val __obj = js.Dynamic.literal(AssociationStatus = AssociationStatus.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssociationStatusRequest]
  }
  
  @scala.inline
  implicit class UpdateAssociationStatusRequestOps[Self <: UpdateAssociationStatusRequest] (val x: Self) extends AnyVal {
    
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
    def setAssociationStatus(value: AssociationStatus): Self = this.set("AssociationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DocumentARN): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
