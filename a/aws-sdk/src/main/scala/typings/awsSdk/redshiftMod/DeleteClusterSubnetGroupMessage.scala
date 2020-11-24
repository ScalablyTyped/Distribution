package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteClusterSubnetGroupMessage extends js.Object {
  
  /**
    * The name of the cluster subnet group name to be deleted.
    */
  var ClusterSubnetGroupName: String = js.native
}
object DeleteClusterSubnetGroupMessage {
  
  @scala.inline
  def apply(ClusterSubnetGroupName: String): DeleteClusterSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSubnetGroupName = ClusterSubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteClusterSubnetGroupMessageOps[Self <: DeleteClusterSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterSubnetGroupName(value: String): Self = this.set("ClusterSubnetGroupName", value.asInstanceOf[js.Any])
  }
}
