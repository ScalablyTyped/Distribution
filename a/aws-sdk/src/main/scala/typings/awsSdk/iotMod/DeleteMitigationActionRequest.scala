package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMitigationActionRequest extends StObject {
  
  /**
    * The name of the mitigation action that you want to delete.
    */
  var actionName: MitigationActionName = js.native
}
object DeleteMitigationActionRequest {
  
  @scala.inline
  def apply(actionName: MitigationActionName): DeleteMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMitigationActionRequest]
  }
  
  @scala.inline
  implicit class DeleteMitigationActionRequestMutableBuilder[Self <: DeleteMitigationActionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: MitigationActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
  }
}
