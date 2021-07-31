package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkAclAssociation extends StObject {
  
  /**
    * The ID of the association between a network ACL and a subnet.
    */
  var NetworkAclAssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
}
object NetworkAclAssociation {
  
  @scala.inline
  def apply(): NetworkAclAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAclAssociation]
  }
  
  @scala.inline
  implicit class NetworkAclAssociationMutableBuilder[Self <: NetworkAclAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkAclAssociationId(value: String): Self = StObject.set(x, "NetworkAclAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAclAssociationIdUndefined: Self = StObject.set(x, "NetworkAclAssociationId", js.undefined)
    
    @scala.inline
    def setNetworkAclId(value: String): Self = StObject.set(x, "NetworkAclId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAclIdUndefined: Self = StObject.set(x, "NetworkAclId", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
