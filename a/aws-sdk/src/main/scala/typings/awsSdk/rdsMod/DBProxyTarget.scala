package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBProxyTarget extends StObject {
  
  /**
    * The writer endpoint for the RDS DB instance or Aurora DB cluster.
    */
  var Endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The port that the RDS Proxy uses to connect to the target RDS DB instance or Aurora DB cluster.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  
  /**
    * The identifier representing the target. It can be the instance identifier for an RDS DB instance, or the cluster identifier for an Aurora DB cluster.
    */
  var RdsResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the target of the proxy can be used for read/write or read-only operations.
    */
  var Role: js.UndefOr[TargetRole] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB cluster.
    */
  var TargetArn: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the connection health of the RDS Proxy target.
    */
  var TargetHealth: js.UndefOr[typings.awsSdk.rdsMod.TargetHealth] = js.undefined
  
  /**
    * The DB cluster identifier when the target represents an Aurora DB cluster. This field is blank when the target represents an RDS DB instance.
    */
  var TrackedClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target represents.
    */
  var Type: js.UndefOr[TargetType] = js.undefined
}
object DBProxyTarget {
  
  inline def apply(): DBProxyTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBProxyTarget]
  }
  
  extension [Self <: DBProxyTarget](x: Self) {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setRdsResourceId(value: String): Self = StObject.set(x, "RdsResourceId", value.asInstanceOf[js.Any])
    
    inline def setRdsResourceIdUndefined: Self = StObject.set(x, "RdsResourceId", js.undefined)
    
    inline def setRole(value: TargetRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setTargetArn(value: String): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
    
    inline def setTargetHealth(value: TargetHealth): Self = StObject.set(x, "TargetHealth", value.asInstanceOf[js.Any])
    
    inline def setTargetHealthUndefined: Self = StObject.set(x, "TargetHealth", js.undefined)
    
    inline def setTrackedClusterId(value: String): Self = StObject.set(x, "TrackedClusterId", value.asInstanceOf[js.Any])
    
    inline def setTrackedClusterIdUndefined: Self = StObject.set(x, "TrackedClusterId", js.undefined)
    
    inline def setType(value: TargetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
