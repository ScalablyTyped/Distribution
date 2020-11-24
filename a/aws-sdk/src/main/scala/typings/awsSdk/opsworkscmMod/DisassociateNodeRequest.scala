package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(NodeName: NodeName, ServerName: ServerName): DisassociateNodeRequest = {
    val __obj = js.Dynamic.literal(NodeName = NodeName.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateNodeRequest]
  }
  
  @scala.inline
  implicit class DisassociateNodeRequestOps[Self <: DisassociateNodeRequest] (val x: Self) extends AnyVal {
    
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
    def setNodeName(value: NodeName): Self = this.set("NodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: ServerName): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineAttributesVarargs(value: EngineAttribute*): Self = this.set("EngineAttributes", js.Array(value :_*))
    
    @scala.inline
    def setEngineAttributes(value: EngineAttributes): Self = this.set("EngineAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineAttributes: Self = this.set("EngineAttributes", js.undefined)
  }
}
