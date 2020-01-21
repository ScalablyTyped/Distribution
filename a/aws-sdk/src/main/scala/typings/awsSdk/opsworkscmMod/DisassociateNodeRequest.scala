package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateNodeRequest extends js.Object {
  /**
    * Engine attributes that are used for disassociating the node. No attributes are required for Puppet.   Attributes required in a DisassociateNode request for Chef     CHEF_ORGANIZATION: The Chef organization with which the node was associated. By default only one organization named default can exist.   
    */
  var EngineAttributes: js.UndefOr[typings.awsSdk.opsworkscmMod.EngineAttributes] = js.native
  /**
    * The name of the client node. 
    */
  var NodeName: typings.awsSdk.opsworkscmMod.NodeName = js.native
  /**
    * The name of the server from which to disassociate the node. 
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName = js.native
}

object DisassociateNodeRequest {
  @scala.inline
  def apply(NodeName: NodeName, ServerName: ServerName, EngineAttributes: EngineAttributes = null): DisassociateNodeRequest = {
    val __obj = js.Dynamic.literal(NodeName = NodeName.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    if (EngineAttributes != null) __obj.updateDynamic("EngineAttributes")(EngineAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateNodeRequest]
  }
}

