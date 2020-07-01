package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainRequest extends js.Object {
  /**
    * A collection of settings.
    */
  var DefaultUserSettings: js.UndefOr[UserSettings] = js.native
  /**
    * The ID of the domain to be updated.
    */
  var DomainId: typings.awsSdk.sagemakerMod.DomainId = js.native
}

object UpdateDomainRequest {
  @scala.inline
  def apply(DomainId: DomainId, DefaultUserSettings: UserSettings = null): UpdateDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    if (DefaultUserSettings != null) __obj.updateDynamic("DefaultUserSettings")(DefaultUserSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainRequest]
  }
}

