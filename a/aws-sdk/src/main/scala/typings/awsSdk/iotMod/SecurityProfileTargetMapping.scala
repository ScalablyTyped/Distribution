package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityProfileTargetMapping extends js.Object {
  /**
    * Information that identifies the security profile.
    */
  var securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier] = js.native
  /**
    * Information about the target (thing group) associated with the security profile.
    */
  var target: js.UndefOr[SecurityProfileTarget] = js.native
}

object SecurityProfileTargetMapping {
  @scala.inline
  def apply(securityProfileIdentifier: SecurityProfileIdentifier = null, target: SecurityProfileTarget = null): SecurityProfileTargetMapping = {
    val __obj = js.Dynamic.literal()
    if (securityProfileIdentifier != null) __obj.updateDynamic("securityProfileIdentifier")(securityProfileIdentifier.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfileTargetMapping]
  }
}

