package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateSecurityProfileBehaviorsRequest extends js.Object {
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
}

