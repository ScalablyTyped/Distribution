package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachThingPrincipalRequest extends js.Object {
  /**
    * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon Cognito ID.
    */
  var principal: Principal = js.native
  /**
    * The name of the thing.
    */
  var thingName: ThingName = js.native
}

object AttachThingPrincipalRequest {
  @scala.inline
  def apply(principal: Principal, thingName: ThingName): AttachThingPrincipalRequest = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachThingPrincipalRequest]
  }
  @scala.inline
  implicit class AttachThingPrincipalRequestOps[Self <: AttachThingPrincipalRequest] (val x: Self) extends AnyVal {
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
    def setPrincipal(value: Principal): Self = this.set("principal", value.asInstanceOf[js.Any])
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
  }
  
}

