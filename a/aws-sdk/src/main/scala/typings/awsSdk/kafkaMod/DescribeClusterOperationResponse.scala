package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClusterOperationResponse extends StObject {
  
  /**
    * 
    Cluster operation information
    
    */
  var ClusterOperationInfo: js.UndefOr[typings.awsSdk.kafkaMod.ClusterOperationInfo] = js.native
}
object DescribeClusterOperationResponse {
  
  @scala.inline
  def apply(): DescribeClusterOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterOperationResponse]
  }
  
  @scala.inline
  implicit class DescribeClusterOperationResponseMutableBuilder[Self <: DescribeClusterOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterOperationInfo(value: ClusterOperationInfo): Self = StObject.set(x, "ClusterOperationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterOperationInfoUndefined: Self = StObject.set(x, "ClusterOperationInfo", js.undefined)
  }
}
