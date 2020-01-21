package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceProfile extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The description of the instance profile.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * An array of strings containing the list of app packages that should not be cleaned up from the device after a test run completes. The list of packages is considered only if you set packageCleanup to true.
    */
  var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.native
  /**
    * The name of the instance profile.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * When set to true, Device Farm removes app packages after a test run. The default value is false for private devices.
    */
  var packageCleanup: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, Device Farm reboots the instance after a test run. The default value is true.
    */
  var rebootAfterUse: js.UndefOr[Boolean] = js.native
}

object InstanceProfile {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    description: Message = null,
    excludeAppPackagesFromCleanup: PackageIds = null,
    name: Name = null,
    packageCleanup: js.UndefOr[scala.Boolean] = js.undefined,
    rebootAfterUse: js.UndefOr[scala.Boolean] = js.undefined
  ): InstanceProfile = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (excludeAppPackagesFromCleanup != null) __obj.updateDynamic("excludeAppPackagesFromCleanup")(excludeAppPackagesFromCleanup.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(packageCleanup)) __obj.updateDynamic("packageCleanup")(packageCleanup.asInstanceOf[js.Any])
    if (!js.isUndefined(rebootAfterUse)) __obj.updateDynamic("rebootAfterUse")(rebootAfterUse.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceProfile]
  }
}

