package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectLockConfigurationOutput extends js.Object {
  /**
    * The specified bucket's Object Lock configuration.
    */
  var ObjectLockConfiguration: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockConfiguration] = js.native
}

object GetObjectLockConfigurationOutput {
  @scala.inline
  def apply(ObjectLockConfiguration: ObjectLockConfiguration = null): GetObjectLockConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (ObjectLockConfiguration != null) __obj.updateDynamic("ObjectLockConfiguration")(ObjectLockConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectLockConfigurationOutput]
  }
}

