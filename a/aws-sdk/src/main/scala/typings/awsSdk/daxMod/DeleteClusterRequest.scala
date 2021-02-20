package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteClusterRequest extends StObject {
  
  /**
    * The name of the cluster to be deleted.
    */
  var ClusterName: String = js.native
}
object DeleteClusterRequest {
  
  @scala.inline
  def apply(ClusterName: String): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterRequest]
  }
  
  @scala.inline
  implicit class DeleteClusterRequestMutableBuilder[Self <: DeleteClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
  }
}
