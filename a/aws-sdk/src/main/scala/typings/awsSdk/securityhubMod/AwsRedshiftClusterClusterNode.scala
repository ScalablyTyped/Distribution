package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterClusterNode extends js.Object {
  
  /**
    * The role of the node. A node might be a leader node or a compute node.
    */
  var NodeRole: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The private IP address of the node.
    */
  var PrivateIpAddress: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The public IP address of the node.
    */
  var PublicIpAddress: js.UndefOr[NonEmptyString] = js.native
}
object AwsRedshiftClusterClusterNode {
  
  @scala.inline
  def apply(): AwsRedshiftClusterClusterNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterNode]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterClusterNodeOps[Self <: AwsRedshiftClusterClusterNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNodeRole(value: NonEmptyString): Self = this.set("NodeRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeRole: Self = this.set("NodeRole", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: NonEmptyString): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
    
    @scala.inline
    def setPublicIpAddress(value: NonEmptyString): Self = this.set("PublicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIpAddress: Self = this.set("PublicIpAddress", js.undefined)
  }
}
