package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderableDBInstanceOption extends js.Object {
  /**
    * A list of Availability Zones for an instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  /**
    * The instance class for an instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The engine type of an instance.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The engine version of an instance.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The license model for an instance.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Indicates whether an instance is in a virtual private cloud (VPC).
    */
  var Vpc: js.UndefOr[Boolean] = js.native
}

object OrderableDBInstanceOption {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZoneList = null,
    DBInstanceClass: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    LicenseModel: String = null,
    Vpc: js.UndefOr[scala.Boolean] = js.undefined
  ): OrderableDBInstanceOption = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel.asInstanceOf[js.Any])
    if (!js.isUndefined(Vpc)) __obj.updateDynamic("Vpc")(Vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderableDBInstanceOption]
  }
}

