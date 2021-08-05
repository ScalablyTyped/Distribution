package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBrokerCountRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string
  
  /**
    * 
    The version of cluster to update from. A successful operation will then generate a new version.
    
    */
  var CurrentVersion: string
  
  /**
    * 
    The number of broker nodes that you want the cluster to have after this operation completes successfully.
    
    */
  var TargetNumberOfBrokerNodes: integerMin1Max15
}
object UpdateBrokerCountRequest {
  
  inline def apply(ClusterArn: string, CurrentVersion: string, TargetNumberOfBrokerNodes: integerMin1Max15): UpdateBrokerCountRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any], TargetNumberOfBrokerNodes = TargetNumberOfBrokerNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBrokerCountRequest]
  }
  
  extension [Self <: UpdateBrokerCountRequest](x: Self) {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetNumberOfBrokerNodes(value: integerMin1Max15): Self = StObject.set(x, "TargetNumberOfBrokerNodes", value.asInstanceOf[js.Any])
  }
}
