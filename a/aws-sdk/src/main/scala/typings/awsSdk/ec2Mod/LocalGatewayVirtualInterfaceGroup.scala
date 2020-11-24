package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalGatewayVirtualInterfaceGroup extends js.Object {
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId] = js.native
  
  /**
    * The IDs of the virtual interfaces.
    */
  var LocalGatewayVirtualInterfaceIds: js.UndefOr[LocalGatewayVirtualInterfaceIdSet] = js.native
  
  /**
    * The AWS account ID that owns the local gateway virtual interface group.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The tags assigned to the virtual interface group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object LocalGatewayVirtualInterfaceGroup {
  
  @scala.inline
  def apply(): LocalGatewayVirtualInterfaceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayVirtualInterfaceGroup]
  }
  
  @scala.inline
  implicit class LocalGatewayVirtualInterfaceGroupOps[Self <: LocalGatewayVirtualInterfaceGroup] (val x: Self) extends AnyVal {
    
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
    def setLocalGatewayId(value: String): Self = this.set("LocalGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayId: Self = this.set("LocalGatewayId", js.undefined)
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupId(value: LocalGatewayVirtualInterfaceGroupId): Self = this.set("LocalGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayVirtualInterfaceGroupId: Self = this.set("LocalGatewayVirtualInterfaceGroupId", js.undefined)
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceIdsVarargs(value: LocalGatewayVirtualInterfaceId*): Self = this.set("LocalGatewayVirtualInterfaceIds", js.Array(value :_*))
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceIds(value: LocalGatewayVirtualInterfaceIdSet): Self = this.set("LocalGatewayVirtualInterfaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayVirtualInterfaceIds: Self = this.set("LocalGatewayVirtualInterfaceIds", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
