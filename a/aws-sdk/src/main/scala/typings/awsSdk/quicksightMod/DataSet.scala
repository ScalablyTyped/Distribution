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
  var ConsumedSpiceCapacityInBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The time that this dataset was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the dataset.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The usage configuration to apply to child datasets that reference this dataset as a source.
    */
  var DataSetUsageConfiguration: js.UndefOr[typings.awsSdk.quicksightMod.DataSetUsageConfiguration] = js.undefined
  
  /**
    * The folder that contains fields and nested subfolders for your dataset.
    */
  var FieldFolders: js.UndefOr[FieldFolderMap] = js.undefined
  
  /**
    * A value that indicates whether you want to import the data into SPICE.
    */
  var ImportMode: js.UndefOr[DataSetImportMode] = js.undefined
  
  /**
    * The last time that this dataset was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
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
  
  /**
    * The element you can use to define tags for row-level security.
    */
  var RowLevelPermissionTagConfiguration: js.UndefOr[typings.awsSdk.quicksightMod.RowLevelPermissionTagConfiguration] = js.undefined
}
object DataSet {
  
  inline def apply(): DataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSet]
  }
  
  extension [Self <: DataSet](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setColumnGroups(value: ColumnGroupList): Self = StObject.set(x, "ColumnGroups", value.asInstanceOf[js.Any])
    
    inline def setColumnGroupsUndefined: Self = StObject.set(x, "ColumnGroups", js.undefined)
    
    inline def setColumnGroupsVarargs(value: ColumnGroup*): Self = StObject.set(x, "ColumnGroups", js.Array(value*))
    
    inline def setColumnLevelPermissionRules(value: ColumnLevelPermissionRuleList): Self = StObject.set(x, "ColumnLevelPermissionRules", value.asInstanceOf[js.Any])
    
    inline def setColumnLevelPermissionRulesUndefined: Self = StObject.set(x, "ColumnLevelPermissionRules", js.undefined)
    
    inline def setColumnLevelPermissionRulesVarargs(value: ColumnLevelPermissionRule*): Self = StObject.set(x, "ColumnLevelPermissionRules", js.Array(value*))
    
    inline def setConsumedSpiceCapacityInBytes(value: Long): Self = StObject.set(x, "ConsumedSpiceCapacityInBytes", value.asInstanceOf[js.Any])
    
    inline def setConsumedSpiceCapacityInBytesUndefined: Self = StObject.set(x, "ConsumedSpiceCapacityInBytes", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDataSetId(value: ResourceId): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetIdUndefined: Self = StObject.set(x, "DataSetId", js.undefined)
    
    inline def setDataSetUsageConfiguration(value: DataSetUsageConfiguration): Self = StObject.set(x, "DataSetUsageConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataSetUsageConfigurationUndefined: Self = StObject.set(x, "DataSetUsageConfiguration", js.undefined)
    
    inline def setFieldFolders(value: FieldFolderMap): Self = StObject.set(x, "FieldFolders", value.asInstanceOf[js.Any])
    
    inline def setFieldFoldersUndefined: Self = StObject.set(x, "FieldFolders", js.undefined)
    
    inline def setImportMode(value: DataSetImportMode): Self = StObject.set(x, "ImportMode", value.asInstanceOf[js.Any])
    
    inline def setImportModeUndefined: Self = StObject.set(x, "ImportMode", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setLogicalTableMap(value: LogicalTableMap): Self = StObject.set(x, "LogicalTableMap", value.asInstanceOf[js.Any])
    
    inline def setLogicalTableMapUndefined: Self = StObject.set(x, "LogicalTableMap", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutputColumns(value: OutputColumnList): Self = StObject.set(x, "OutputColumns", value.asInstanceOf[js.Any])
    
    inline def setOutputColumnsUndefined: Self = StObject.set(x, "OutputColumns", js.undefined)
    
    inline def setOutputColumnsVarargs(value: OutputColumn*): Self = StObject.set(x, "OutputColumns", js.Array(value*))
    
    inline def setPhysicalTableMap(value: PhysicalTableMap): Self = StObject.set(x, "PhysicalTableMap", value.asInstanceOf[js.Any])
    
    inline def setPhysicalTableMapUndefined: Self = StObject.set(x, "PhysicalTableMap", js.undefined)
    
    inline def setRowLevelPermissionDataSet(value: RowLevelPermissionDataSet): Self = StObject.set(x, "RowLevelPermissionDataSet", value.asInstanceOf[js.Any])
    
    inline def setRowLevelPermissionDataSetUndefined: Self = StObject.set(x, "RowLevelPermissionDataSet", js.undefined)
    
    inline def setRowLevelPermissionTagConfiguration(value: RowLevelPermissionTagConfiguration): Self = StObject.set(x, "RowLevelPermissionTagConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRowLevelPermissionTagConfigurationUndefined: Self = StObject.set(x, "RowLevelPermissionTagConfiguration", js.undefined)
  }
}
