package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNodegroupRequest extends js.Object {
  /**
    * The name of the Amazon EKS cluster that is associated with your node group.
    */
  var clusterName: String = js.native
  /**
    * The name of the node group to delete.
    */
  var nodegroupName: String = js.native
}

object DeleteNodegroupRequest {
  @scala.inline
  def apply(clusterName: String, nodegroupName: String): DeleteNodegroupRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteNodegroupRequest]
  }
}

