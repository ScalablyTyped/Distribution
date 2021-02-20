package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthInfo extends StObject {
  
  /**
    * The type of action for which the principal is being authorized.
    */
  var actionType: js.UndefOr[ActionType] = js.native
  
  /**
    * The resources for which the principal is being authorized to perform the specified action.
    */
  var resources: Resources = js.native
}
object AuthInfo {
  
  @scala.inline
  def apply(resources: Resources): AuthInfo = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthInfo]
  }
  
  @scala.inline
  implicit class AuthInfoMutableBuilder[Self <: AuthInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: ActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    @scala.inline
    def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
