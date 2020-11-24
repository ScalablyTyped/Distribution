package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterNode extends js.Object {
  
  /**
    * Whether the node is a leader node or a compute node.
    */
  var NodeRole: js.UndefOr[String] = js.native
  
  /**
    * The private IP address of a node within a cluster.
    */
  var PrivateIPAddress: js.UndefOr[String] = js.native
  
  /**
    * The public IP address of a node within a cluster.
    */
  var PublicIPAddress: js.UndefOr[String] = js.native
}
object ClusterNode {
  
  @scala.inline
  def apply(): ClusterNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterNode]
  }
  
  @scala.inline
  implicit class ClusterNodeOps[Self <: ClusterNode] (val x: Self) extends AnyVal {
    
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
    def setNodeRole(value: String): Self = this.set("NodeRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeRole: Self = this.set("NodeRole", js.undefined)
    
    @scala.inline
    def setPrivateIPAddress(value: String): Self = this.set("PrivateIPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIPAddress: Self = this.set("PrivateIPAddress", js.undefined)
    
    @scala.inline
    def setPublicIPAddress(value: String): Self = this.set("PublicIPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIPAddress: Self = this.set("PublicIPAddress", js.undefined)
  }
}
