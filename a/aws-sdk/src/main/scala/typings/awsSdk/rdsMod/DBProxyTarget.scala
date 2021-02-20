package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBProxyTarget extends StObject {
  
  /**
    * The writer endpoint for the RDS DB instance or Aurora DB cluster.
    */
  var Endpoint: js.UndefOr[String] = js.native
  
  /**
    * The port that the RDS Proxy uses to connect to the target RDS DB instance or Aurora DB cluster.
    */
  var Port: js.UndefOr[Integer] = js.native
  
  /**
    * The identifier representing the target. It can be the instance identifier for an RDS DB instance, or the cluster identifier for an Aurora DB cluster.
    */
  var RdsResourceId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB cluster.
    */
  var TargetArn: js.UndefOr[String] = js.native
  
  /**
    * Information about the connection health of the RDS Proxy target.
    */
  var TargetHealth: js.UndefOr[typings.awsSdk.rdsMod.TargetHealth] = js.native
  
  /**
    * The DB cluster identifier when the target represents an Aurora DB cluster. This field is blank when the target represents an RDS DB instance.
    */
  var TrackedClusterId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target represents.
    */
  var Type: js.UndefOr[TargetType] = js.native
}
object DBProxyTarget {
  
  @scala.inline
  def apply(): DBProxyTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBProxyTarget]
  }
  
  @scala.inline
  implicit class DBProxyTargetMutableBuilder[Self <: DBProxyTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setRdsResourceId(value: String): Self = StObject.set(x, "RdsResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsResourceIdUndefined: Self = StObject.set(x, "RdsResourceId", js.undefined)
    
    @scala.inline
    def setTargetArn(value: String): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
    
    @scala.inline
    def setTargetHealth(value: TargetHealth): Self = StObject.set(x, "TargetHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHealthUndefined: Self = StObject.set(x, "TargetHealth", js.undefined)
    
    @scala.inline
    def setTrackedClusterId(value: String): Self = StObject.set(x, "TrackedClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackedClusterIdUndefined: Self = StObject.set(x, "TrackedClusterId", js.undefined)
    
    @scala.inline
    def setType(value: TargetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
