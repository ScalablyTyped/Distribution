package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkforceRequest extends js.Object {
  /**
    * The name of the private workforce whose access you want to restrict. WorkforceName is automatically set to default when a workforce is created and cannot be modified. 
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName = js.native
}

object DescribeWorkforceRequest {
  @scala.inline
  def apply(WorkforceName: WorkforceName): DescribeWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeWorkforceRequest]
  }
}

