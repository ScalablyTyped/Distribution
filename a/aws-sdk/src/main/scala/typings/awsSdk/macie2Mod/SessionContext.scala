package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionContext extends js.Object {
  /**
    * The date and time when the credentials were issued, and whether the credentials were authenticated with a multi-factor authentication (MFA) device.
    */
  var attributes: js.UndefOr[SessionContextAttributes] = js.native
  /**
    * The source and type of credentials that the entity obtained.
    */
  var sessionIssuer: js.UndefOr[SessionIssuer] = js.native
}

object SessionContext {
  @scala.inline
  def apply(attributes: SessionContextAttributes = null, sessionIssuer: SessionIssuer = null): SessionContext = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (sessionIssuer != null) __obj.updateDynamic("sessionIssuer")(sessionIssuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionContext]
  }
}

