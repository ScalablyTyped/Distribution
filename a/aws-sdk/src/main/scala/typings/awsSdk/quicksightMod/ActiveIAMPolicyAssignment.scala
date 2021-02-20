package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveIAMPolicyAssignment extends StObject {
  
  /**
    * A name for the IAM policy assignment.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var PolicyArn: js.UndefOr[Arn] = js.native
}
object ActiveIAMPolicyAssignment {
  
  @scala.inline
  def apply(): ActiveIAMPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveIAMPolicyAssignment]
  }
  
  @scala.inline
  implicit class ActiveIAMPolicyAssignmentMutableBuilder[Self <: ActiveIAMPolicyAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentName(value: IAMPolicyAssignmentName): Self = StObject.set(x, "AssignmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentNameUndefined: Self = StObject.set(x, "AssignmentName", js.undefined)
    
    @scala.inline
    def setPolicyArn(value: Arn): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
  }
}
