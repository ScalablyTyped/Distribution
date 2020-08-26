package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Region extends js.Object {
  /**
    * The Availability Zones. Follows the format us-east-2a (case-sensitive).
    */
  var availabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  /**
    * The continent code (e.g., NA, meaning North America).
    */
  var continentCode: js.UndefOr[String] = js.native
  /**
    * The description of the AWS Region (e.g., This region is recommended to serve users in the eastern United States and eastern Canada).
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The display name (e.g., Ohio).
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The region name (e.g., us-east-2).
    */
  var name: js.UndefOr[RegionName] = js.native
  /**
    * The Availability Zones for databases. Follows the format us-east-2a (case-sensitive).
    */
  var relationalDatabaseAvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
}

object Region {
  @scala.inline
  def apply(): Region = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Region]
  }
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = this.set("availabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("availabilityZones", js.undefined)
    @scala.inline
    def setContinentCode(value: String): Self = this.set("continentCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinentCode: Self = this.set("continentCode", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setName(value: RegionName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRelationalDatabaseAvailabilityZonesVarargs(value: AvailabilityZone*): Self = this.set("relationalDatabaseAvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setRelationalDatabaseAvailabilityZones(value: AvailabilityZoneList): Self = this.set("relationalDatabaseAvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationalDatabaseAvailabilityZones: Self = this.set("relationalDatabaseAvailabilityZones", js.undefined)
  }
  
}

