package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBootstrapBrokersRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string
}
object GetBootstrapBrokersRequest {
  
  @scala.inline
  def apply(ClusterArn: string): GetBootstrapBrokersRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBootstrapBrokersRequest]
  }
  
  @scala.inline
  implicit class GetBootstrapBrokersRequestMutableBuilder[Self <: GetBootstrapBrokersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
  }
}
