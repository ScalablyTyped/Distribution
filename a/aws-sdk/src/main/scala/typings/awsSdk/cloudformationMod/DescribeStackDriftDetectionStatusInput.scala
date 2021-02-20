package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackDriftDetectionStatusInput extends StObject {
  
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
  implicit class DescribeStackDriftDetectionStatusInputMutableBuilder[Self <: DescribeStackDriftDetectionStatusInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackDriftDetectionId(value: StackDriftDetectionId): Self = StObject.set(x, "StackDriftDetectionId", value.asInstanceOf[js.Any])
  }
}
