package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCognitoEventsRequest extends js.Object {
  /**
    * The Cognito Identity Pool ID for the request
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId = js.native
}

object GetCognitoEventsRequest {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): GetCognitoEventsRequest = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCognitoEventsRequest]
  }
  @scala.inline
  implicit class GetCognitoEventsRequestOps[Self <: GetCognitoEventsRequest] (val x: Self) extends AnyVal {
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
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
  }
  
}

