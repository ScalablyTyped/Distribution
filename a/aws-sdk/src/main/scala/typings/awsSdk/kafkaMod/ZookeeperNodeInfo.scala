package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZookeeperNodeInfo extends StObject {
  
  /**
    * 
    The attached elastic network interface of the broker.
    
    */
  var AttachedENIId: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The virtual private cloud (VPC) IP address of the client.
    
    */
  var ClientVpcIpAddress: js.UndefOr[string] = js.undefined
  
  /**
    * 
    Endpoints for accessing the ZooKeeper.
    
    */
  var Endpoints: js.UndefOr[listOfString] = js.undefined
  
  /**
    * 
    The role-specific ID for Zookeeper.
    
    */
  var ZookeeperId: js.UndefOr[double] = js.undefined
  
  /**
    * 
    The version of Zookeeper.
    
    */
  var ZookeeperVersion: js.UndefOr[string] = js.undefined
}
object ZookeeperNodeInfo {
  
  inline def apply(): ZookeeperNodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZookeeperNodeInfo]
  }
  
  extension [Self <: ZookeeperNodeInfo](x: Self) {
    
    inline def setAttachedENIId(value: string): Self = StObject.set(x, "AttachedENIId", value.asInstanceOf[js.Any])
    
    inline def setAttachedENIIdUndefined: Self = StObject.set(x, "AttachedENIId", js.undefined)
    
    inline def setClientVpcIpAddress(value: string): Self = StObject.set(x, "ClientVpcIpAddress", value.asInstanceOf[js.Any])
    
    inline def setClientVpcIpAddressUndefined: Self = StObject.set(x, "ClientVpcIpAddress", js.undefined)
    
    inline def setEndpoints(value: listOfString): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: string*): Self = StObject.set(x, "Endpoints", js.Array(value*))
    
    inline def setZookeeperId(value: double): Self = StObject.set(x, "ZookeeperId", value.asInstanceOf[js.Any])
    
    inline def setZookeeperIdUndefined: Self = StObject.set(x, "ZookeeperId", js.undefined)
    
    inline def setZookeeperVersion(value: string): Self = StObject.set(x, "ZookeeperVersion", value.asInstanceOf[js.Any])
    
    inline def setZookeeperVersionUndefined: Self = StObject.set(x, "ZookeeperVersion", js.undefined)
  }
}
