package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoipPool extends js.Object {
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayRoutetableId] = js.native
  
  /**
    * The ARN of the address pool.
    */
  var PoolArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The address ranges of the address pool.
    */
  var PoolCidrs: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The ID of the address pool.
    */
  var PoolId: js.UndefOr[CoipPoolId] = js.native
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CoipPool {
  
  @scala.inline
  def apply(): CoipPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoipPool]
  }
  
  @scala.inline
  implicit class CoipPoolOps[Self <: CoipPool] (val x: Self) extends AnyVal {
    
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
    def setLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = this.set("LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayRouteTableId: Self = this.set("LocalGatewayRouteTableId", js.undefined)
    
    @scala.inline
    def setPoolArn(value: ResourceArn): Self = this.set("PoolArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolArn: Self = this.set("PoolArn", js.undefined)
    
    @scala.inline
    def setPoolCidrsVarargs(value: String*): Self = this.set("PoolCidrs", js.Array(value :_*))
    
    @scala.inline
    def setPoolCidrs(value: ValueStringList): Self = this.set("PoolCidrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolCidrs: Self = this.set("PoolCidrs", js.undefined)
    
    @scala.inline
    def setPoolId(value: CoipPoolId): Self = this.set("PoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolId: Self = this.set("PoolId", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
