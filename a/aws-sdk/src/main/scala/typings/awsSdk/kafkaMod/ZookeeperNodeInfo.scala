package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AttachedENIId: string = null,
    ClientVpcIpAddress: string = null,
    Endpoints: listOfString = null,
    ZookeeperId: Int | Double = null,
    ZookeeperVersion: string = null
  ): ZookeeperNodeInfo = {
    val __obj = js.Dynamic.literal()
    if (AttachedENIId != null) __obj.updateDynamic("AttachedENIId")(AttachedENIId.asInstanceOf[js.Any])
    if (ClientVpcIpAddress != null) __obj.updateDynamic("ClientVpcIpAddress")(ClientVpcIpAddress.asInstanceOf[js.Any])
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    if (ZookeeperId != null) __obj.updateDynamic("ZookeeperId")(ZookeeperId.asInstanceOf[js.Any])
    if (ZookeeperVersion != null) __obj.updateDynamic("ZookeeperVersion")(ZookeeperVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZookeeperNodeInfo]
  }
}

