package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTargetGroupResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var arn: js.UndefOr[TargetGroupArn] = js.undefined
  
  /**
    * The target group configuration. If type is set to LAMBDA, this parameter doesn't apply.
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
    * The operation's status. You can retry the operation if the status is CREATE_FAILED. However, if you retry it while the status is CREATE_IN_PROGRESS, there is no change in the status. 
    */
  var status: js.UndefOr[TargetGroupStatus] = js.undefined
  
  /**
    * The type of target group.
    */
  var `type`: js.UndefOr[TargetGroupType] = js.undefined
}
object CreateTargetGroupResponse {
  
  inline def apply(): CreateTargetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTargetGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTargetGroupResponse] (val x: Self) extends AnyVal {
    
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
