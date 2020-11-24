package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeInfo extends js.Object {
  
  /**
    * 
    The start time.
    
    */
  var AddedToClusterTime: js.UndefOr[string] = js.native
  
  /**
    * 
    The broker node info.
    
    */
  var BrokerNodeInfo: js.UndefOr[typings.awsSdk.kafkaMod.BrokerNodeInfo] = js.native
  
  /**
    * 
    The instance type.
    
    */
  var InstanceType: js.UndefOr[string] = js.native
  
  /**
    * 
    The Amazon Resource Name (ARN) of the node.
    
    */
  var NodeARN: js.UndefOr[string] = js.native
  
  /**
    * 
    The node type.
    
    */
  var NodeType: js.UndefOr[typings.awsSdk.kafkaMod.NodeType] = js.native
  
  /**
    * 
    The ZookeeperNodeInfo.
    
    */
  var ZookeeperNodeInfo: js.UndefOr[typings.awsSdk.kafkaMod.ZookeeperNodeInfo] = js.native
}
object NodeInfo {
  
  @scala.inline
  def apply(): NodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeInfo]
  }
  
  @scala.inline
  implicit class NodeInfoOps[Self <: NodeInfo] (val x: Self) extends AnyVal {
    
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
    def setAddedToClusterTime(value: string): Self = this.set("AddedToClusterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddedToClusterTime: Self = this.set("AddedToClusterTime", js.undefined)
    
    @scala.inline
    def setBrokerNodeInfo(value: BrokerNodeInfo): Self = this.set("BrokerNodeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerNodeInfo: Self = this.set("BrokerNodeInfo", js.undefined)
    
    @scala.inline
    def setInstanceType(value: string): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setNodeARN(value: string): Self = this.set("NodeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeARN: Self = this.set("NodeARN", js.undefined)
    
    @scala.inline
    def setNodeType(value: NodeType): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    
    @scala.inline
    def setZookeeperNodeInfo(value: ZookeeperNodeInfo): Self = this.set("ZookeeperNodeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZookeeperNodeInfo: Self = this.set("ZookeeperNodeInfo", js.undefined)
  }
}
