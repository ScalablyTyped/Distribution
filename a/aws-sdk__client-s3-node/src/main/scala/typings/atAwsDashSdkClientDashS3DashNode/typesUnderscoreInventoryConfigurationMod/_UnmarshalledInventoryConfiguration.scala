package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryConfigurationMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.All
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Current
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ETag
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.EncryptionStatus
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.IsMultipartUploaded
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.LastModifiedDate
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ReplicationStatus
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Size
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.StorageClass
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryDestinationMod._UnmarshalledInventoryDestination
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryFilterMod._UnmarshalledInventoryFilter
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryScheduleMod._UnmarshalledInventorySchedule
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
    val __obj = js.Dynamic.literal(Destination = Destination, Id = Id, IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled, Schedule = Schedule)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (OptionalFields != null) __obj.updateDynamic("OptionalFields")(OptionalFields)
    __obj.asInstanceOf[_UnmarshalledInventoryConfiguration]
  }
}

