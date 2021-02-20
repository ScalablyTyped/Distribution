package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMonitoringResponse extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster operation.
    
    */
  var ClusterOperationArn: js.UndefOr[string] = js.native
}
object UpdateMonitoringResponse {
  
  @scala.inline
  def apply(): UpdateMonitoringResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMonitoringResponse]
  }
  
  @scala.inline
  implicit class UpdateMonitoringResponseMutableBuilder[Self <: UpdateMonitoringResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setClusterOperationArn(value: string): Self = StObject.set(x, "ClusterOperationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterOperationArnUndefined: Self = StObject.set(x, "ClusterOperationArn", js.undefined)
  }
}
