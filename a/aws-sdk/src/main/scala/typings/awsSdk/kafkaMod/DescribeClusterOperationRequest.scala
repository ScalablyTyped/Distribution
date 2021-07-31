package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClusterOperationRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the MSK cluster operation.
    
    */
  var ClusterOperationArn: string
}
object DescribeClusterOperationRequest {
  
  @scala.inline
  def apply(ClusterOperationArn: string): DescribeClusterOperationRequest = {
    val __obj = js.Dynamic.literal(ClusterOperationArn = ClusterOperationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterOperationRequest]
  }
  
  @scala.inline
  implicit class DescribeClusterOperationRequestMutableBuilder[Self <: DescribeClusterOperationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterOperationArn(value: string): Self = StObject.set(x, "ClusterOperationArn", value.asInstanceOf[js.Any])
  }
}
