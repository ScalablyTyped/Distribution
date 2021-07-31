package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssociationStatusRequest extends StObject {
  
  /**
    * The association status.
    */
  var AssociationStatus: typings.awsSdk.ssmMod.AssociationStatus
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ssmMod.InstanceId
  
  /**
    * The name of the Systems Manager document.
    */
  var Name: DocumentARN
}
object UpdateAssociationStatusRequest {
  
  @scala.inline
  def apply(AssociationStatus: AssociationStatus, InstanceId: InstanceId, Name: DocumentARN): UpdateAssociationStatusRequest = {
    val __obj = js.Dynamic.literal(AssociationStatus = AssociationStatus.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssociationStatusRequest]
  }
  
  @scala.inline
  implicit class UpdateAssociationStatusRequestMutableBuilder[Self <: UpdateAssociationStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationStatus(value: AssociationStatus): Self = StObject.set(x, "AssociationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
