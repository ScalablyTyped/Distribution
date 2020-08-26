package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetCognitoEventsRequest extends js.Object {
  /**
    * The events to configure
    */
  var Events: typings.awsSdk.cognitosyncMod.Events = js.native
  /**
    * The Cognito Identity Pool to use when configuring Cognito Events
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId = js.native
}

object SetCognitoEventsRequest {
  @scala.inline
  def apply(Events: Events, IdentityPoolId: IdentityPoolId): SetCognitoEventsRequest = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCognitoEventsRequest]
  }
  @scala.inline
  implicit class SetCognitoEventsRequestOps[Self <: SetCognitoEventsRequest] (val x: Self) extends AnyVal {
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
    def setEvents(value: Events): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
  }
  
}

