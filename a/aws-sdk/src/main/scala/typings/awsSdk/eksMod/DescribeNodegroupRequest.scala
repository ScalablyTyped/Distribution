package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNodegroupRequest extends StObject {
  
  /**
    * The name of the Amazon EKS cluster associated with the node group.
    */
  var clusterName: String
  
  /**
    * The name of the node group to describe.
    */
  var nodegroupName: String
}
object DescribeNodegroupRequest {
  
  inline def apply(clusterName: String, nodegroupName: String): DescribeNodegroupRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodegroupRequest]
  }
  
  extension [Self <: DescribeNodegroupRequest](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setNodegroupName(value: String): Self = StObject.set(x, "nodegroupName", value.asInstanceOf[js.Any])
  }
}
