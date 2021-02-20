package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EcsCluster extends StObject {
  
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: js.UndefOr[String] = js.native
  
  /**
    * The cluster name.
    */
  var EcsClusterName: js.UndefOr[String] = js.native
  
  /**
    * The time and date that the cluster was registered with the stack.
    */
  var RegisteredAt: js.UndefOr[DateTime] = js.native
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}
object EcsCluster {
  
  @scala.inline
  def apply(): EcsCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcsCluster]
  }
  
  @scala.inline
  implicit class EcsClusterMutableBuilder[Self <: EcsCluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEcsClusterArn(value: String): Self = StObject.set(x, "EcsClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsClusterArnUndefined: Self = StObject.set(x, "EcsClusterArn", js.undefined)
    
    @scala.inline
    def setEcsClusterName(value: String): Self = StObject.set(x, "EcsClusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsClusterNameUndefined: Self = StObject.set(x, "EcsClusterName", js.undefined)
    
    @scala.inline
    def setRegisteredAt(value: DateTime): Self = StObject.set(x, "RegisteredAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredAtUndefined: Self = StObject.set(x, "RegisteredAt", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
