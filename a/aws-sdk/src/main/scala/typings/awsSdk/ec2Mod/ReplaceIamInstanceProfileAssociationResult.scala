package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceIamInstanceProfileAssociationResult extends StObject {
  
  /**
    * Information about the IAM instance profile association.
    */
  var IamInstanceProfileAssociation: js.UndefOr[typings.awsSdk.ec2Mod.IamInstanceProfileAssociation] = js.undefined
}
object ReplaceIamInstanceProfileAssociationResult {
  
  @scala.inline
  def apply(): ReplaceIamInstanceProfileAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceIamInstanceProfileAssociationResult]
  }
  
  @scala.inline
  implicit class ReplaceIamInstanceProfileAssociationResultMutableBuilder[Self <: ReplaceIamInstanceProfileAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamInstanceProfileAssociation(value: IamInstanceProfileAssociation): Self = StObject.set(x, "IamInstanceProfileAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileAssociationUndefined: Self = StObject.set(x, "IamInstanceProfileAssociation", js.undefined)
  }
}
