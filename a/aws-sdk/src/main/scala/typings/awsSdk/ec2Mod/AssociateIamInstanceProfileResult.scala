package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateIamInstanceProfileResult extends StObject {
  
  /**
    * Information about the IAM instance profile association.
    */
  var IamInstanceProfileAssociation: js.UndefOr[typings.awsSdk.ec2Mod.IamInstanceProfileAssociation] = js.undefined
}
object AssociateIamInstanceProfileResult {
  
  @scala.inline
  def apply(): AssociateIamInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateIamInstanceProfileResult]
  }
  
  @scala.inline
  implicit class AssociateIamInstanceProfileResultMutableBuilder[Self <: AssociateIamInstanceProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamInstanceProfileAssociation(value: IamInstanceProfileAssociation): Self = StObject.set(x, "IamInstanceProfileAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileAssociationUndefined: Self = StObject.set(x, "IamInstanceProfileAssociation", js.undefined)
  }
}
