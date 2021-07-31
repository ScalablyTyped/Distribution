package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterClusterNode extends StObject {
  
  /**
    * The role of the node. A node might be a leader node or a compute node.
    */
  var NodeRole: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The private IP address of the node.
    */
  var PrivateIpAddress: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The public IP address of the node.
    */
  var PublicIpAddress: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterClusterNode {
  
  @scala.inline
  def apply(): AwsRedshiftClusterClusterNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterNode]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterClusterNodeMutableBuilder[Self <: AwsRedshiftClusterClusterNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeRole(value: NonEmptyString): Self = StObject.set(x, "NodeRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRoleUndefined: Self = StObject.set(x, "NodeRole", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: NonEmptyString): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    @scala.inline
    def setPublicIpAddress(value: NonEmptyString): Self = StObject.set(x, "PublicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpAddressUndefined: Self = StObject.set(x, "PublicIpAddress", js.undefined)
  }
}
