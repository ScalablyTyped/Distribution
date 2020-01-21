package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystem extends js.Object {
  /**
    * Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
    */
  var ConfigurationManagers: js.UndefOr[OperatingSystemConfigurationManagers] = js.native
  /**
    * The ID of a supported operating system, such as Amazon Linux 2018.03.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The name of the operating system, such as Amazon Linux 2018.03.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A short name for the operating system manufacturer.
    */
  var ReportedName: js.UndefOr[String] = js.native
  /**
    * The version of the operating system, including the release and edition, if applicable.
    */
  var ReportedVersion: js.UndefOr[String] = js.native
  /**
    * Indicates that an operating system is not supported for new instances.
    */
  var Supported: js.UndefOr[Boolean] = js.native
  /**
    * The type of a supported operating system, either Linux or Windows.
    */
  var Type: js.UndefOr[String] = js.native
}

object OperatingSystem {
  @scala.inline
  def apply(
    ConfigurationManagers: OperatingSystemConfigurationManagers = null,
    Id: String = null,
    Name: String = null,
    ReportedName: String = null,
    ReportedVersion: String = null,
    Supported: js.UndefOr[scala.Boolean] = js.undefined,
    Type: String = null
  ): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationManagers != null) __obj.updateDynamic("ConfigurationManagers")(ConfigurationManagers.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ReportedName != null) __obj.updateDynamic("ReportedName")(ReportedName.asInstanceOf[js.Any])
    if (ReportedVersion != null) __obj.updateDynamic("ReportedVersion")(ReportedVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(Supported)) __obj.updateDynamic("Supported")(Supported.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatingSystem]
  }
}

