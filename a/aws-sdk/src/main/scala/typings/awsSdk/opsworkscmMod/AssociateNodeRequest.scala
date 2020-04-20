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
}

