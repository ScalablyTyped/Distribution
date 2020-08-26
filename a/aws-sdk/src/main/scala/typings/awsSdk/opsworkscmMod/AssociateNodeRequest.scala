package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateNodeRequest extends js.Object {
  /**
    * Engine attributes used for associating the node.   Attributes accepted in a AssociateNode request for Chef     CHEF_ORGANIZATION: The Chef organization with which the node is associated. By default only one organization named default can exist.     CHEF_NODE_PUBLIC_KEY: A PEM-formatted public key. This key is required for the chef-client agent to access the Chef API.     Attributes accepted in a AssociateNode request for Puppet     PUPPET_NODE_CSR: A PEM-formatted certificate-signing request (CSR) that is created by the node.   
    */
  var EngineAttributes: typings.awsSdk.opsworkscmMod.EngineAttributes = js.native
  /**
    * The name of the node. 
    */
  var NodeName: typings.awsSdk.opsworkscmMod.NodeName = js.native
  /**
    * The name of the server with which to associate the node. 
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName = js.native
}

object AssociateNodeRequest {
  @scala.inline
  def apply(EngineAttributes: EngineAttributes, NodeName: NodeName, ServerName: ServerName): AssociateNodeRequest = {
    val __obj = js.Dynamic.literal(EngineAttributes = EngineAttributes.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateNodeRequest]
  }
  @scala.inline
  implicit class AssociateNodeRequestOps[Self <: AssociateNodeRequest] (val x: Self) extends AnyVal {
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
    def setEngineAttributesVarargs(value: EngineAttribute*): Self = this.set("EngineAttributes", js.Array(value :_*))
    @scala.inline
    def setEngineAttributes(value: EngineAttributes): Self = this.set("EngineAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeName(value: NodeName): Self = this.set("NodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerName(value: ServerName): Self = this.set("ServerName", value.asInstanceOf[js.Any])
  }
  
}

