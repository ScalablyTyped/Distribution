package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateSecurityProfileBehaviorsRequest extends StObject {
  
  /**
    * Specifies the behaviors that, when violated by a device (thing), cause an alert.
    */
  var behaviors: Behaviors = js.native
}
object ValidateSecurityProfileBehaviorsRequest {
  
  @scala.inline
  def apply(behaviors: Behaviors): ValidateSecurityProfileBehaviorsRequest = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateSecurityProfileBehaviorsRequest]
  }
  
  @scala.inline
  implicit class ValidateSecurityProfileBehaviorsRequestMutableBuilder[Self <: ValidateSecurityProfileBehaviorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehaviors(value: Behaviors): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorsVarargs(value: Behavior*): Self = StObject.set(x, "behaviors", js.Array(value :_*))
  }
}
