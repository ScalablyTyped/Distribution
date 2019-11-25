package typings.azureDashArmDashResource.libLockModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementLockOwner extends js.Object {
  /**
    * The application ID of the lock owner.
    */
  var applicationId: js.UndefOr[String] = js.undefined
}

object ManagementLockOwner {
  @scala.inline
  def apply(applicationId: String = null): ManagementLockOwner = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementLockOwner]
  }
}

