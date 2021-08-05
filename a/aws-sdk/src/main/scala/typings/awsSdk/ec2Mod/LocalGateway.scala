package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalGateway extends StObject {
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS account ID that owns the local gateway.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the local gateway.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * The tags assigned to the local gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object LocalGateway {
  
  inline def apply(): LocalGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGateway]
  }
  
  extension [Self <: LocalGateway](x: Self) {
    
    inline def setLocalGatewayId(value: LocalGatewayId): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayIdUndefined: Self = StObject.set(x, "LocalGatewayId", js.undefined)
    
    inline def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
