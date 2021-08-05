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
  
  inline def apply(clusterName: String, nodegroupName: String): DeleteNodegroupRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNodegroupRequest]
  }
  
  extension [Self <: DeleteNodegroupRequest](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setNodegroupName(value: String): Self = StObject.set(x, "nodegroupName", value.asInstanceOf[js.Any])
  }
}
