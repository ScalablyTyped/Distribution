package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityNotificationAttributesRequest extends js.Object {
  /**
    * A list of one or more identities. You can specify an identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com.
    */
  var Identities: IdentityList = js.native
}

object GetIdentityNotificationAttributesRequest {
  @scala.inline
  def apply(Identities: IdentityList): GetIdentityNotificationAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetIdentityNotificationAttributesRequest]
  }
}

