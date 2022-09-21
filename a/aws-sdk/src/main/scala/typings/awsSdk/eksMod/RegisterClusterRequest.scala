package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterClusterRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * The configuration settings required to connect the Kubernetes cluster to the Amazon EKS control plane.
    */
  var connectorConfig: ConnectorConfigRequest
  
  /**
    * Define a unique name for this cluster for your Region.
    */
  var name: ClusterName
  
  /**
    * The metadata that you apply to the cluster to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Cluster tags do not propagate to any other resources associated with the cluster.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object RegisterClusterRequest {
  
  inline def apply(connectorConfig: ConnectorConfigRequest, name: ClusterName): RegisterClusterRequest = {
    val __obj = js.Dynamic.literal(connectorConfig = connectorConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterClusterRequest]
  }
  
  extension [Self <: RegisterClusterRequest](x: Self) {
    
    inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setConnectorConfig(value: ConnectorConfigRequest): Self = StObject.set(x, "connectorConfig", value.asInstanceOf[js.Any])
    
    inline def setName(value: ClusterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
