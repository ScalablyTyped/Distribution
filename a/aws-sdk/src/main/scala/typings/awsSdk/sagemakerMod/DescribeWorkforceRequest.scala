package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkforceRequest extends StObject {
  
  /**
    * The name of the private workforce whose access you want to restrict. WorkforceName is automatically set to default when a workforce is created and cannot be modified. 
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName
}
object DescribeWorkforceRequest {
  
  @scala.inline
  def apply(WorkforceName: WorkforceName): DescribeWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkforceRequest]
  }
  
  @scala.inline
  implicit class DescribeWorkforceRequestMutableBuilder[Self <: DescribeWorkforceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkforceName(value: WorkforceName): Self = StObject.set(x, "WorkforceName", value.asInstanceOf[js.Any])
  }
}
