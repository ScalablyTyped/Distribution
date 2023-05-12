package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTargetGroupResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var arn: js.UndefOr[TargetGroupArn] = js.undefined
  
  /**
    * The ID of the target group.
    */
  var id: js.UndefOr[TargetGroupId] = js.undefined
  
  /**
    * The status. You can retry the operation if the status is DELETE_FAILED. However, if you retry it while the status is DELETE_IN_PROGRESS, the status doesn't change.
    */
  var status: js.UndefOr[TargetGroupStatus] = js.undefined
}
object DeleteTargetGroupResponse {
  
  inline def apply(): DeleteTargetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTargetGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTargetGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TargetGroupArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: TargetGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStatus(value: TargetGroupStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
