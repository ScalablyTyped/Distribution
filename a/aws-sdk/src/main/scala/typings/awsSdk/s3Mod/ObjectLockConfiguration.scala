package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLockConfiguration extends js.Object {
  /**
    * Indicates whether this bucket has an Object Lock configuration enabled.
    */
  var ObjectLockEnabled: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockEnabled] = js.native
  /**
    * The Object Lock rule in place for the specified object.
    */
  var Rule: js.UndefOr[ObjectLockRule] = js.native
}

object ObjectLockConfiguration {
  @scala.inline
  def apply(ObjectLockEnabled: ObjectLockEnabled = null, Rule: ObjectLockRule = null): ObjectLockConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ObjectLockEnabled != null) __obj.updateDynamic("ObjectLockEnabled")(ObjectLockEnabled.asInstanceOf[js.Any])
    if (Rule != null) __obj.updateDynamic("Rule")(Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectLockConfiguration]
  }
}

