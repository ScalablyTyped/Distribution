package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalGatewayRouteTable extends js.Object {
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the local gateway route table.
    */
  var LocalGatewayRouteTableArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  
  /**
    * The AWS account ID that owns the local gateway route table.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The state of the local gateway route table.
    */
  var State: js.UndefOr[String] = js.native
  
  /**
    * The tags assigned to the local gateway route table.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object LocalGatewayRouteTable {
  
  @scala.inline
  def apply(): LocalGatewayRouteTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayRouteTable]
  }
  
  @scala.inline
  implicit class LocalGatewayRouteTableOps[Self <: LocalGatewayRouteTable] (val x: Self) extends AnyVal {
    
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
    def setLocalGatewayId(value: LocalGatewayId): Self = this.set("LocalGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayId: Self = this.set("LocalGatewayId", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableArn(value: ResourceArn): Self = this.set("LocalGatewayRouteTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayRouteTableArn: Self = this.set("LocalGatewayRouteTableArn", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableId(value: String): Self = this.set("LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayRouteTableId: Self = this.set("LocalGatewayRouteTableId", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
