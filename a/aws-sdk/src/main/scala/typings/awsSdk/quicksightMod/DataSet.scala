package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSet extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported.
    */
  var ColumnGroups: js.UndefOr[ColumnGroupList] = js.undefined
  
  /**
    * A set of one or more definitions of a  ColumnLevelPermissionRule .
    */
  var ColumnLevelPermissionRules: js.UndefOr[ColumnLevelPermissionRuleList] = js.undefined
  
  /**
    * The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't imported into SPICE.
    */
  var ConsumedSpiceCapacityInBytes: js.UndefOr[Long_] = js.undefined
  
  /**
    * The time that this dataset was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.undefined
  
  /**
    * The ID of the dataset.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * Indicates whether you want to import the data into SPICE.
    */
  var ImportMode: js.UndefOr[DataSetImportMode] = js.undefined
  
  /**
    * The last time that this dataset was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.undefined
  
  /**
    * Configures the combination and transformation of the data from the physical tables.
    */
  var LogicalTableMap: js.UndefOr[typings.awsSdk.quicksightMod.LogicalTableMap] = js.undefined
  
  /**
    * A display name for the dataset.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The list of columns after all transforms. These columns are available in templates, analyses, and dashboards.
    */
  var OutputColumns: js.UndefOr[OutputColumnList] = js.undefined
  
  /**
    * Declares the physical tables that are available in the underlying data sources.
    */
  var PhysicalTableMap: js.UndefOr[typings.awsSdk.quicksightMod.PhysicalTableMap] = js.undefined
  
  /**
    * The row-level security configuration for the dataset.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typings.awsSdk.quicksightMod.RowLevelPermissionDataSet] = js.undefined
}
object DataSet {
  
  @scala.inline
  def apply(): DataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSet]
  }
  
  @scala.inline
  implicit class DataSetMutableBuilder[Self <: DataSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setColumnGroups(value: ColumnGroupList): Self = StObject.set(x, "ColumnGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGroupsUndefined: Self = StObject.set(x, "ColumnGroups", js.undefined)
    
    @scala.inline
    def setColumnGroupsVarargs(value: ColumnGroup*): Self = StObject.set(x, "ColumnGroups", js.Array(value :_*))
    
    @scala.inline
    def setColumnLevelPermissionRules(value: ColumnLevelPermissionRuleList): Self = StObject.set(x, "ColumnLevelPermissionRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnLevelPermissionRulesUndefined: Self = StObject.set(x, "ColumnLevelPermissionRules", js.undefined)
    
    @scala.inline
    def setColumnLevelPermissionRulesVarargs(value: ColumnLevelPermissionRule*): Self = StObject.set(x, "ColumnLevelPermissionRules", js.Array(value :_*))
    
    @scala.inline
    def setConsumedSpiceCapacityInBytes(value: Long_): Self = StObject.set(x, "ConsumedSpiceCapacityInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedSpiceCapacityInBytesUndefined: Self = StObject.set(x, "ConsumedSpiceCapacityInBytes", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDataSetId(value: ResourceId): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetIdUndefined: Self = StObject.set(x, "DataSetId", js.undefined)
    
    @scala.inline
    def setImportMode(value: DataSetImportMode): Self = StObject.set(x, "ImportMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportModeUndefined: Self = StObject.set(x, "ImportMode", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Timestamp_): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setLogicalTableMap(value: LogicalTableMap): Self = StObject.set(x, "LogicalTableMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalTableMapUndefined: Self = StObject.set(x, "LogicalTableMap", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOutputColumns(value: OutputColumnList): Self = StObject.set(x, "OutputColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputColumnsUndefined: Self = StObject.set(x, "OutputColumns", js.undefined)
    
    @scala.inline
    def setOutputColumnsVarargs(value: OutputColumn*): Self = StObject.set(x, "OutputColumns", js.Array(value :_*))
    
    @scala.inline
    def setPhysicalTableMap(value: PhysicalTableMap): Self = StObject.set(x, "PhysicalTableMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalTableMapUndefined: Self = StObject.set(x, "PhysicalTableMap", js.undefined)
    
    @scala.inline
    def setRowLevelPermissionDataSet(value: RowLevelPermissionDataSet): Self = StObject.set(x, "RowLevelPermissionDataSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowLevelPermissionDataSetUndefined: Self = StObject.set(x, "RowLevelPermissionDataSet", js.undefined)
  }
}
