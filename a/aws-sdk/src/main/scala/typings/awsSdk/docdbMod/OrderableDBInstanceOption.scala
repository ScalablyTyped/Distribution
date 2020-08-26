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
  def apply(): OrderableDBInstanceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableDBInstanceOption]
  }
  @scala.inline
  implicit class OrderableDBInstanceOptionOps[Self <: OrderableDBInstanceOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setDBInstanceClass(value: String): Self = this.set("DBInstanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceClass: Self = this.set("DBInstanceClass", js.undefined)
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    @scala.inline
    def setVpc(value: Boolean): Self = this.set("Vpc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpc: Self = this.set("Vpc", js.undefined)
  }
  
}

