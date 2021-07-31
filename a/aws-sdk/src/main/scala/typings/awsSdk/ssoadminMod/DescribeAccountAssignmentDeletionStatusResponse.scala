package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAssignmentDeletionStatusResponse extends StObject {
  
  /**
    * The status object for the account assignment deletion operation.
    */
  var AccountAssignmentDeletionStatus: js.UndefOr[AccountAssignmentOperationStatus] = js.undefined
}
object DescribeAccountAssignmentDeletionStatusResponse {
  
  @scala.inline
  def apply(): DescribeAccountAssignmentDeletionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAssignmentDeletionStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeAccountAssignmentDeletionStatusResponseMutableBuilder[Self <: DescribeAccountAssignmentDeletionStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountAssignmentDeletionStatus(value: AccountAssignmentOperationStatus): Self = StObject.set(x, "AccountAssignmentDeletionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountAssignmentDeletionStatusUndefined: Self = StObject.set(x, "AccountAssignmentDeletionStatus", js.undefined)
  }
}
