package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlowRequest extends StObject {
  
  /**
    * The ARN of the flow that you want to describe.
    */
  var FlowArn: string
}
object DescribeFlowRequest {
  
  inline def apply(FlowArn: string): DescribeFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowRequest]
  }
  
  extension [Self <: DescribeFlowRequest](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
  }
}
