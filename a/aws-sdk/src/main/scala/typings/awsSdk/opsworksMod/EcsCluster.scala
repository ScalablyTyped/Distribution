package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcsCluster extends StObject {
  
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * The cluster name.
    */
  var EcsClusterName: js.UndefOr[String] = js.undefined
  
  /**
    * The time and date that the cluster was registered with the stack.
    */
  var RegisteredAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object EcsCluster {
  
  inline def apply(): EcsCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcsCluster]
  }
  
  extension [Self <: EcsCluster](x: Self) {
    
    inline def setEcsClusterArn(value: String): Self = StObject.set(x, "EcsClusterArn", value.asInstanceOf[js.Any])
    
    inline def setEcsClusterArnUndefined: Self = StObject.set(x, "EcsClusterArn", js.undefined)
    
    inline def setEcsClusterName(value: String): Self = StObject.set(x, "EcsClusterName", value.asInstanceOf[js.Any])
    
    inline def setEcsClusterNameUndefined: Self = StObject.set(x, "EcsClusterName", js.undefined)
    
    inline def setRegisteredAt(value: DateTime): Self = StObject.set(x, "RegisteredAt", value.asInstanceOf[js.Any])
    
    inline def setRegisteredAtUndefined: Self = StObject.set(x, "RegisteredAt", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
