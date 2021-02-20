package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeInfo extends StObject {
  
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
  implicit class NodeInfoMutableBuilder[Self <: NodeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedToClusterTime(value: string): Self = StObject.set(x, "AddedToClusterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedToClusterTimeUndefined: Self = StObject.set(x, "AddedToClusterTime", js.undefined)
    
    @scala.inline
    def setBrokerNodeInfo(value: BrokerNodeInfo): Self = StObject.set(x, "BrokerNodeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerNodeInfoUndefined: Self = StObject.set(x, "BrokerNodeInfo", js.undefined)
    
    @scala.inline
    def setInstanceType(value: string): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setNodeARN(value: string): Self = StObject.set(x, "NodeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeARNUndefined: Self = StObject.set(x, "NodeARN", js.undefined)
    
    @scala.inline
    def setNodeType(value: NodeType): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    @scala.inline
    def setZookeeperNodeInfo(value: ZookeeperNodeInfo): Self = StObject.set(x, "ZookeeperNodeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZookeeperNodeInfoUndefined: Self = StObject.set(x, "ZookeeperNodeInfo", js.undefined)
  }
}
