package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryConfiguration extends js.Object {
  /**
    * Contains information about where to publish the inventory results.
    */
  var Destination: InventoryDestination = js.native
  /**
    * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.
    */
  var Filter: js.UndefOr[InventoryFilter] = js.native
  /**
    * The ID used to identify the inventory configuration.
    */
  var Id: InventoryId = js.native
  /**
    * Object versions to include in the inventory list. If set to All, the list includes all the object versions, which adds the version-related fields VersionId, IsLatest, and DeleteMarker to the list. If set to Current, the list does not contain these version-related fields.
    */
  var IncludedObjectVersions: InventoryIncludedObjectVersions = js.native
  /**
    * Specifies whether the inventory is enabled or disabled. If set to True, an inventory list is generated. If set to False, no inventory list is generated.
    */
  var IsEnabled: typings.awsSdk.s3Mod.IsEnabled = js.native
  /**
    * Contains the optional fields that are included in the inventory results.
    */
  var OptionalFields: js.UndefOr[InventoryOptionalFields] = js.native
  /**
    * Specifies the schedule for generating inventory results.
    */
  var Schedule: InventorySchedule = js.native
}

object InventoryConfiguration {
  @scala.inline
  def apply(
    Destination: InventoryDestination,
    Id: InventoryId,
    IncludedObjectVersions: InventoryIncludedObjectVersions,
    IsEnabled: IsEnabled,
    Schedule: InventorySchedule
  ): InventoryConfiguration = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryConfiguration]
  }
  @scala.inline
  implicit class InventoryConfigurationOps[Self <: InventoryConfiguration] (val x: Self) extends AnyVal {
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
    def setDestination(value: InventoryDestination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: InventoryId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludedObjectVersions(value: InventoryIncludedObjectVersions): Self = this.set("IncludedObjectVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: IsEnabled): Self = this.set("IsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedule(value: InventorySchedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: InventoryFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    @scala.inline
    def setOptionalFieldsVarargs(value: InventoryOptionalField*): Self = this.set("OptionalFields", js.Array(value :_*))
    @scala.inline
    def setOptionalFields(value: InventoryOptionalFields): Self = this.set("OptionalFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalFields: Self = this.set("OptionalFields", js.undefined)
  }
  
}

