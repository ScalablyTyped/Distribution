package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBrokerCountRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string = js.native
  
  /**
    * 
    The version of cluster to update from. A successful operation will then generate a new version.
    
    */
  var CurrentVersion: string = js.native
  
  /**
    * 
    The number of broker nodes that you want the cluster to have after this operation completes successfully.
    
    */
  var TargetNumberOfBrokerNodes: integerMin1Max15 = js.native
}
object UpdateBrokerCountRequest {
  
  @scala.inline
  def apply(ClusterArn: string, CurrentVersion: string, TargetNumberOfBrokerNodes: integerMin1Max15): UpdateBrokerCountRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any], TargetNumberOfBrokerNodes = TargetNumberOfBrokerNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBrokerCountRequest]
  }
  
  @scala.inline
  implicit class UpdateBrokerCountRequestMutableBuilder[Self <: UpdateBrokerCountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNumberOfBrokerNodes(value: integerMin1Max15): Self = StObject.set(x, "TargetNumberOfBrokerNodes", value.asInstanceOf[js.Any])
  }
}
