package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFlowRequest extends StObject {
  
  /**
    * The ARN of the flow that you want to describe.
    */
  var FlowArn: string = js.native
}
object DescribeFlowRequest {
  
  @scala.inline
  def apply(FlowArn: string): DescribeFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowRequest]
  }
  
  @scala.inline
  implicit class DescribeFlowRequestMutableBuilder[Self <: DescribeFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
  }
}
