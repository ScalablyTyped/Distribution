package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.All
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Current
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.ETag
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.EncryptionStatus
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.IsMultipartUploaded
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.LastModifiedDate
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.ReplicationStatus
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Size
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.StorageClass
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryDestinationMod._UnmarshalledInventoryDestination
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryFilterMod._UnmarshalledInventoryFilter
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryScheduleMod._UnmarshalledInventorySchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledInventoryConfiguration extends _InventoryConfiguration {
  /**
    * <p>Contains information about where to publish the inventory results.</p>
    */
  @JSName("Destination")
  var Destination__UnmarshalledInventoryConfiguration: _UnmarshalledInventoryDestination
  /**
    * <p>Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.</p>
    */
  @JSName("Filter")
  var Filter__UnmarshalledInventoryConfiguration: js.UndefOr[_UnmarshalledInventoryFilter] = js.undefined
  /**
    * <p>Contains the optional fields that are included in the inventory results.</p>
    */
  @JSName("OptionalFields")
  var OptionalFields__UnmarshalledInventoryConfiguration: js.UndefOr[
    js.Array[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ]
  ] = js.undefined
  /**
    * <p>Specifies the schedule for generating inventory results.</p>
    */
  @JSName("Schedule")
  var Schedule__UnmarshalledInventoryConfiguration: _UnmarshalledInventorySchedule
}

object _UnmarshalledInventoryConfiguration {
  @scala.inline
  def apply(
    Destination: _UnmarshalledInventoryDestination,
    Id: String,
    IncludedObjectVersions: All | Current | String,
    IsEnabled: Boolean,
    Schedule: _UnmarshalledInventorySchedule,
    Filter: _UnmarshalledInventoryFilter = null,
    OptionalFields: js.Array[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ] = null
  ): _UnmarshalledInventoryConfiguration = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (OptionalFields != null) __obj.updateDynamic("OptionalFields")(OptionalFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledInventoryConfiguration]
  }
}

