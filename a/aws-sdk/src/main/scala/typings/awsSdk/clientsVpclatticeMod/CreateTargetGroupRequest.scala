package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTargetGroupRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a request that completed successfully using the same client token and parameters, the retry succeeds without performing any actions. If the parameters aren't identical, the retry fails.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The target group configuration. If type is set to LAMBDA, this parameter doesn't apply.
    */
  var config: js.UndefOr[TargetGroupConfig] = js.undefined
  
  /**
    * The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
    */
  var name: TargetGroupName
  
  /**
    * The tags for the target group.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of target group.
    */
  var `type`: TargetGroupType
}
object CreateTargetGroupRequest {
  
  inline def apply(name: TargetGroupName, `type`: TargetGroupType): CreateTargetGroupRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTargetGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTargetGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setConfig(value: TargetGroupConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setName(value: TargetGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: TargetGroupType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
