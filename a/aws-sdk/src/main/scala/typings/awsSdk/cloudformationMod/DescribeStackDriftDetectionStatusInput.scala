package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackDriftDetectionStatusInput extends js.Object {
  
  /**
    * The ID of the drift detection results of this operation.  AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run. However, the number of drift results AWS CloudFormation retains for any given stack, and for how long, may vary. 
    */
  var StackDriftDetectionId: typings.awsSdk.cloudformationMod.StackDriftDetectionId = js.native
}
object DescribeStackDriftDetectionStatusInput {
  
  @scala.inline
  def apply(StackDriftDetectionId: StackDriftDetectionId): DescribeStackDriftDetectionStatusInput = {
    val __obj = js.Dynamic.literal(StackDriftDetectionId = StackDriftDetectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackDriftDetectionStatusInput]
  }
  
  @scala.inline
  implicit class DescribeStackDriftDetectionStatusInputOps[Self <: DescribeStackDriftDetectionStatusInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStackDriftDetectionId(value: StackDriftDetectionId): Self = this.set("StackDriftDetectionId", value.asInstanceOf[js.Any])
  }
}
