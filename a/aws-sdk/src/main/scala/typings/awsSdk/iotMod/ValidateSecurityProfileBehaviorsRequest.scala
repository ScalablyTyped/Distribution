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
  @scala.inline
  implicit class ValidateSecurityProfileBehaviorsRequestOps[Self <: ValidateSecurityProfileBehaviorsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBehaviorsVarargs(value: Behavior*): Self = this.set("behaviors", js.Array(value :_*))
    @scala.inline
    def setBehaviors(value: Behaviors): Self = this.set("behaviors", value.asInstanceOf[js.Any])
  }
  
}

