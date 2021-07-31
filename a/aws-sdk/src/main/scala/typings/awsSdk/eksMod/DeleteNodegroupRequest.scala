package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNodegroupRequest extends StObject {
  
  /**
    * The name of the Amazon EKS cluster that is associated with your node group.
    */
  var clusterName: String
  
  /**
    * The name of the node group to delete.
    */
  var nodegroupName: String
}
object DeleteNodegroupRequest {
  
  @scala.inline
  def apply(clusterName: String, nodegroupName: String): DeleteNodegroupRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNodegroupRequest]
  }
  
  @scala.inline
  implicit class DeleteNodegroupRequestMutableBuilder[Self <: DeleteNodegroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodegroupName(value: String): Self = StObject.set(x, "nodegroupName", value.asInstanceOf[js.Any])
  }
}
