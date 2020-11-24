package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateIamInstanceProfileRequest extends js.Object {
  
  /**
    * The ID of the IAM instance profile association.
    */
  var AssociationId: IamInstanceProfileAssociationId = js.native
}
object DisassociateIamInstanceProfileRequest {
  
  @scala.inline
  def apply(AssociationId: IamInstanceProfileAssociationId): DisassociateIamInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateIamInstanceProfileRequest]
  }
  
  @scala.inline
  implicit class DisassociateIamInstanceProfileRequestOps[Self <: DisassociateIamInstanceProfileRequest] (val x: Self) extends AnyVal {
    
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
    def setAssociationId(value: IamInstanceProfileAssociationId): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
  }
}
