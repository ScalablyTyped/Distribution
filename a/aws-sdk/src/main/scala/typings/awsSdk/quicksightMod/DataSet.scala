package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSet extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported.
    */
  var ColumnGroups: js.UndefOr[ColumnGroupList] = js.native
  /**
    * The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't imported into SPICE.
    */
  var ConsumedSpiceCapacityInBytes: js.UndefOr[Long_] = js.native
  /**
    * The time that this dataset was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * The ID of the dataset.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.native
  /**
    * Indicates whether you want to import the data into SPICE.
    */
  var ImportMode: js.UndefOr[DataSetImportMode] = js.native
  /**
    * The last time that this dataset was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * Configures the combination and transformation of the data from the physical tables.
    */
  var LogicalTableMap: js.UndefOr[typings.awsSdk.quicksightMod.LogicalTableMap] = js.native
  /**
    * A display name for the dataset.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The list of columns after all transforms. These columns are available in templates, analyses, and dashboards.
    */
  var OutputColumns: js.UndefOr[OutputColumnList] = js.native
  /**
    * Declares the physical tables that are available in the underlying data sources.
    */
  var PhysicalTableMap: js.UndefOr[typings.awsSdk.quicksightMod.PhysicalTableMap] = js.native
  /**
    * The row-level security configuration for the dataset.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typings.awsSdk.quicksightMod.RowLevelPermissionDataSet] = js.native
}

object DataSet {
  @scala.inline
  def apply(
    Arn: Arn = null,
    ColumnGroups: ColumnGroupList = null,
    ConsumedSpiceCapacityInBytes: js.UndefOr[Long_] = js.undefined,
    CreatedTime: Timestamp_ = null,
    DataSetId: ResourceId = null,
    ImportMode: DataSetImportMode = null,
    LastUpdatedTime: Timestamp_ = null,
    LogicalTableMap: LogicalTableMap = null,
    Name: ResourceName = null,
    OutputColumns: OutputColumnList = null,
    PhysicalTableMap: PhysicalTableMap = null,
    RowLevelPermissionDataSet: RowLevelPermissionDataSet = null
  ): DataSet = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (ColumnGroups != null) __obj.updateDynamic("ColumnGroups")(ColumnGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(ConsumedSpiceCapacityInBytes)) __obj.updateDynamic("ConsumedSpiceCapacityInBytes")(ConsumedSpiceCapacityInBytes.get.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DataSetId != null) __obj.updateDynamic("DataSetId")(DataSetId.asInstanceOf[js.Any])
    if (ImportMode != null) __obj.updateDynamic("ImportMode")(ImportMode.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (LogicalTableMap != null) __obj.updateDynamic("LogicalTableMap")(LogicalTableMap.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OutputColumns != null) __obj.updateDynamic("OutputColumns")(OutputColumns.asInstanceOf[js.Any])
    if (PhysicalTableMap != null) __obj.updateDynamic("PhysicalTableMap")(PhysicalTableMap.asInstanceOf[js.Any])
    if (RowLevelPermissionDataSet != null) __obj.updateDynamic("RowLevelPermissionDataSet")(RowLevelPermissionDataSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSet]
  }
}

