package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZookeeperNodeInfo extends js.Object {
  
  /**
    * 
    The attached elastic network interface of the broker.
    
    */
  var AttachedENIId: js.UndefOr[string] = js.native
  
  /**
    * 
    The virtual private cloud (VPC) IP address of the client.
    
    */
  var ClientVpcIpAddress: js.UndefOr[string] = js.native
  
  /**
    * 
    Endpoints for accessing the ZooKeeper.
    
    */
  var Endpoints: js.UndefOr[listOfString] = js.native
  
  /**
    * 
    The role-specific ID for Zookeeper.
    
    */
  var ZookeeperId: js.UndefOr[double] = js.native
  
  /**
    * 
    The version of Zookeeper.
    
    */
  var ZookeeperVersion: js.UndefOr[string] = js.native
}
object ZookeeperNodeInfo {
  
  @scala.inline
  def apply(): ZookeeperNodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZookeeperNodeInfo]
  }
  
  @scala.inline
  implicit class ZookeeperNodeInfoOps[Self <: ZookeeperNodeInfo] (val x: Self) extends AnyVal {
    
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
    def setAttachedENIId(value: string): Self = this.set("AttachedENIId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedENIId: Self = this.set("AttachedENIId", js.undefined)
    
    @scala.inline
    def setClientVpcIpAddress(value: string): Self = this.set("ClientVpcIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientVpcIpAddress: Self = this.set("ClientVpcIpAddress", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: string*): Self = this.set("Endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: listOfString): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
    
    @scala.inline
    def setZookeeperId(value: double): Self = this.set("ZookeeperId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZookeeperId: Self = this.set("ZookeeperId", js.undefined)
    
    @scala.inline
    def setZookeeperVersion(value: string): Self = this.set("ZookeeperVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZookeeperVersion: Self = this.set("ZookeeperVersion", js.undefined)
  }
}
