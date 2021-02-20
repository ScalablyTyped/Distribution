package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMitigationActionResponse extends StObject {
  
  /**
    * The ARN for the new mitigation action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.native
  
  /**
    * A unique identifier for the mitigation action.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.native
}
object UpdateMitigationActionResponse {
  
  @scala.inline
  def apply(): UpdateMitigationActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMitigationActionResponse]
  }
  
  @scala.inline
  implicit class UpdateMitigationActionResponseMutableBuilder[Self <: UpdateMitigationActionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionArn(value: MitigationActionArn): Self = StObject.set(x, "actionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionArnUndefined: Self = StObject.set(x, "actionArn", js.undefined)
    
    @scala.inline
    def setActionId(value: MitigationActionId): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
  }
}
