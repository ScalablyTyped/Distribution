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
    Schedule: InventorySchedule,
    Filter: InventoryFilter = null,
    OptionalFields: InventoryOptionalFields = null
  ): InventoryConfiguration = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (OptionalFields != null) __obj.updateDynamic("OptionalFields")(OptionalFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryConfiguration]
  }
}

