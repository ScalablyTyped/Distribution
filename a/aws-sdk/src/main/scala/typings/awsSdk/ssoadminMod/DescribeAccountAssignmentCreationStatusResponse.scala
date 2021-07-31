package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAssignmentCreationStatusResponse extends StObject {
  
  /**
    * The status object for the account assignment creation operation.
    */
  var AccountAssignmentCreationStatus: js.UndefOr[AccountAssignmentOperationStatus] = js.undefined
}
object DescribeAccountAssignmentCreationStatusResponse {
  
  @scala.inline
  def apply(): DescribeAccountAssignmentCreationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAssignmentCreationStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeAccountAssignmentCreationStatusResponseMutableBuilder[Self <: DescribeAccountAssignmentCreationStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountAssignmentCreationStatus(value: AccountAssignmentOperationStatus): Self = StObject.set(x, "AccountAssignmentCreationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountAssignmentCreationStatusUndefined: Self = StObject.set(x, "AccountAssignmentCreationStatus", js.undefined)
  }
}
