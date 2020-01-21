package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallationMedia extends js.Object {
  /**
    * The custom Availability Zone (AZ) that contains the installation media.
    */
  var CustomAvailabilityZoneId: js.UndefOr[String] = js.native
  /**
    * The DB engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The path to the installation medium for the DB engine.
    */
  var EngineInstallationMediaPath: js.UndefOr[String] = js.native
  /**
    * The engine version of the DB engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * If an installation media failure occurred, the cause of the failure.
    */
  var FailureCause: js.UndefOr[InstallationMediaFailureCause] = js.native
  /**
    * The installation medium ID.
    */
  var InstallationMediaId: js.UndefOr[String] = js.native
  /**
    * The path to the installation medium for the operating system associated with the DB engine.
    */
  var OSInstallationMediaPath: js.UndefOr[String] = js.native
  /**
    * The status of the installation medium.
    */
  var Status: js.UndefOr[String] = js.native
}

object InstallationMedia {
  @scala.inline
  def apply(
    CustomAvailabilityZoneId: String = null,
    Engine: String = null,
    EngineInstallationMediaPath: String = null,
    EngineVersion: String = null,
    FailureCause: InstallationMediaFailureCause = null,
    InstallationMediaId: String = null,
    OSInstallationMediaPath: String = null,
    Status: String = null
  ): InstallationMedia = {
    val __obj = js.Dynamic.literal()
    if (CustomAvailabilityZoneId != null) __obj.updateDynamic("CustomAvailabilityZoneId")(CustomAvailabilityZoneId.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineInstallationMediaPath != null) __obj.updateDynamic("EngineInstallationMediaPath")(EngineInstallationMediaPath.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (FailureCause != null) __obj.updateDynamic("FailureCause")(FailureCause.asInstanceOf[js.Any])
    if (InstallationMediaId != null) __obj.updateDynamic("InstallationMediaId")(InstallationMediaId.asInstanceOf[js.Any])
    if (OSInstallationMediaPath != null) __obj.updateDynamic("OSInstallationMediaPath")(OSInstallationMediaPath.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationMedia]
  }
}

