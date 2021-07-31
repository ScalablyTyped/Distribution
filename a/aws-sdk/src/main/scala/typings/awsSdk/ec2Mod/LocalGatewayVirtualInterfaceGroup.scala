package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalGatewayVirtualInterfaceGroup extends StObject {
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId] = js.undefined
  
  /**
    * The IDs of the virtual interfaces.
    */
  var LocalGatewayVirtualInterfaceIds: js.UndefOr[LocalGatewayVirtualInterfaceIdSet] = js.undefined
  
  /**
    * The AWS account ID that owns the local gateway virtual interface group.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The tags assigned to the virtual interface group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object LocalGatewayVirtualInterfaceGroup {
  
  @scala.inline
  def apply(): LocalGatewayVirtualInterfaceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayVirtualInterfaceGroup]
  }
  
  @scala.inline
  implicit class LocalGatewayVirtualInterfaceGroupMutableBuilder[Self <: LocalGatewayVirtualInterfaceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalGatewayId(value: String): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayIdUndefined: Self = StObject.set(x, "LocalGatewayId", js.undefined)
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupId(value: LocalGatewayVirtualInterfaceGroupId): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupIdUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupId", js.undefined)
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceIds(value: LocalGatewayVirtualInterfaceIdSet): Self = StObject.set(x, "LocalGatewayVirtualInterfaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceIdsUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaceIds", js.undefined)
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceIdsVarargs(value: LocalGatewayVirtualInterfaceId*): Self = StObject.set(x, "LocalGatewayVirtualInterfaceIds", js.Array(value :_*))
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
