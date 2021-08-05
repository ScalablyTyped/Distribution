package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServicePrimaryTaskSetRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists in.
    */
  var cluster: String
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task set in the deployment.
    */
  var primaryTaskSet: String
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
    */
  var service: String
}
object UpdateServicePrimaryTaskSetRequest {
  
  inline def apply(cluster: String, primaryTaskSet: String, service: String): UpdateServicePrimaryTaskSetRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], primaryTaskSet = primaryTaskSet.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServicePrimaryTaskSetRequest]
  }
  
  extension [Self <: UpdateServicePrimaryTaskSetRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setPrimaryTaskSet(value: String): Self = StObject.set(x, "primaryTaskSet", value.asInstanceOf[js.Any])
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
