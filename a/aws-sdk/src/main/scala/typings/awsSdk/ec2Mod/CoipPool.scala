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
  
  inline def apply(): CoipPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoipPool]
  }
  
  extension [Self <: CoipPool](x: Self) {
    
    inline def setLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "LocalGatewayRouteTableId", js.undefined)
    
    inline def setPoolArn(value: ResourceArn): Self = StObject.set(x, "PoolArn", value.asInstanceOf[js.Any])
    
    inline def setPoolArnUndefined: Self = StObject.set(x, "PoolArn", js.undefined)
    
    inline def setPoolCidrs(value: ValueStringList): Self = StObject.set(x, "PoolCidrs", value.asInstanceOf[js.Any])
    
    inline def setPoolCidrsUndefined: Self = StObject.set(x, "PoolCidrs", js.undefined)
    
    inline def setPoolCidrsVarargs(value: String*): Self = StObject.set(x, "PoolCidrs", js.Array(value :_*))
    
    inline def setPoolId(value: CoipPoolId): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
