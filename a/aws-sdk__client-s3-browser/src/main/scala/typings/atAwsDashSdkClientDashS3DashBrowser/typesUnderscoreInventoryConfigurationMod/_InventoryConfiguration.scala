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
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryDestinationMod._InventoryDestination
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryFilterMod._InventoryFilter
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryScheduleMod._InventorySchedule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InventoryConfiguration extends js.Object {
  /**
    * <p>Contains information about where to publish the inventory results.</p>
    */
  var Destination: _InventoryDestination
  /**
    * <p>Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.</p>
    */
  var Filter: js.UndefOr[_InventoryFilter] = js.undefined
  /**
    * <p>The ID used to identify the inventory configuration.</p>
    */
  var Id: String
  /**
    * <p>Specifies which object version(s) to included in the inventory results.</p>
    */
  var IncludedObjectVersions: All | Current | String
  /**
    * <p>Specifies whether the inventory is enabled or disabled.</p>
    */
  var IsEnabled: Boolean
  /**
    * <p>Contains the optional fields that are included in the inventory results.</p>
    */
  var OptionalFields: js.UndefOr[
    (js.Array[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ]) | (Iterable[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ])
  ] = js.undefined
  /**
    * <p>Specifies the schedule for generating inventory results.</p>
    */
  var Schedule: _InventorySchedule
}

object _InventoryConfiguration {
  @scala.inline
  def apply(
    Destination: _InventoryDestination,
    Id: String,
    IncludedObjectVersions: All | Current | String,
    IsEnabled: Boolean,
    Schedule: _InventorySchedule,
    Filter: _InventoryFilter = null,
    OptionalFields: (js.Array[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ]) | (Iterable[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ]) = null
  ): _InventoryConfiguration = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (OptionalFields != null) __obj.updateDynamic("OptionalFields")(OptionalFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InventoryConfiguration]
  }
}

