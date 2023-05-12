package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTargetGroupResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var arn: js.UndefOr[TargetGroupArn] = js.undefined
  
  /**
    * The target group configuration.
    */
  var config: js.UndefOr[TargetGroupConfig] = js.undefined
  
  /**
    * The ID of the target group.
    */
  var id: js.UndefOr[TargetGroupId] = js.undefined
  
  /**
    * The name of the target group.
    */
  var name: js.UndefOr[TargetGroupName] = js.undefined
  
  /**
    * The status.
    */
  var status: js.UndefOr[TargetGroupStatus] = js.undefined
  
  /**
    * The target group type.
    */
  var `type`: js.UndefOr[TargetGroupType] = js.undefined
}
object UpdateTargetGroupResponse {
  
  inline def apply(): UpdateTargetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTargetGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTargetGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TargetGroupArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setConfig(value: TargetGroupConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setId(value: TargetGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: TargetGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: TargetGroupStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: TargetGroupType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
