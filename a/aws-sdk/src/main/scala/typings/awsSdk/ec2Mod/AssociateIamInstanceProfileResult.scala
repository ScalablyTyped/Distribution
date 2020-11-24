package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateIamInstanceProfileResult extends js.Object {
  
  /**
    * Information about the IAM instance profile association.
    */
  var IamInstanceProfileAssociation: js.UndefOr[typings.awsSdk.ec2Mod.IamInstanceProfileAssociation] = js.native
}
object AssociateIamInstanceProfileResult {
  
  @scala.inline
  def apply(): AssociateIamInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateIamInstanceProfileResult]
  }
  
  @scala.inline
  implicit class AssociateIamInstanceProfileResultOps[Self <: AssociateIamInstanceProfileResult] (val x: Self) extends AnyVal {
    
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
    def setIamInstanceProfileAssociation(value: IamInstanceProfileAssociation): Self = this.set("IamInstanceProfileAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamInstanceProfileAssociation: Self = this.set("IamInstanceProfileAssociation", js.undefined)
  }
}
