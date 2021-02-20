package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCompatibleKafkaVersionsRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster check.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
}
object GetCompatibleKafkaVersionsRequest {
  
  @scala.inline
  def apply(): GetCompatibleKafkaVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleKafkaVersionsRequest]
  }
  
  @scala.inline
  implicit class GetCompatibleKafkaVersionsRequestMutableBuilder[Self <: GetCompatibleKafkaVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
  }
}
