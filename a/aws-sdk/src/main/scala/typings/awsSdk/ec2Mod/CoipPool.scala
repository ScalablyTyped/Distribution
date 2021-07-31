package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoipPool extends StObject {
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayRoutetableId] = js.undefined
  
  /**
    * The ARN of the address pool.
    */
  var PoolArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The address ranges of the address pool.
    */
  var PoolCidrs: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The ID of the address pool.
    */
  var PoolId: js.UndefOr[CoipPoolId] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CoipPool {
  
  @scala.inline
  def apply(): CoipPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoipPool]
  }
  
  @scala.inline
  implicit class CoipPoolMutableBuilder[Self <: CoipPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "LocalGatewayRouteTableId", js.undefined)
    
    @scala.inline
    def setPoolArn(value: ResourceArn): Self = StObject.set(x, "PoolArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolArnUndefined: Self = StObject.set(x, "PoolArn", js.undefined)
    
    @scala.inline
    def setPoolCidrs(value: ValueStringList): Self = StObject.set(x, "PoolCidrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolCidrsUndefined: Self = StObject.set(x, "PoolCidrs", js.undefined)
    
    @scala.inline
    def setPoolCidrsVarargs(value: String*): Self = StObject.set(x, "PoolCidrs", js.Array(value :_*))
    
    @scala.inline
    def setPoolId(value: CoipPoolId): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
