package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSetRequest extends StObject {
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is supported.
    */
  var ColumnGroups: js.UndefOr[ColumnGroupList] = js.undefined
  
  /**
    * A set of one or more definitions of a  ColumnLevelPermissionRule .
    */
  var ColumnLevelPermissionRules: js.UndefOr[ColumnLevelPermissionRuleList] = js.undefined
  
  /**
    * An ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: ResourceId
  
  /**
    * Indicates whether you want to import the data into SPICE.
    */
  var ImportMode: DataSetImportMode
  
  /**
    * Configures the combination and transformation of the data from the physical tables.
    */
  var LogicalTableMap: js.UndefOr[typings.awsSdk.quicksightMod.LogicalTableMap] = js.undefined
  
  /**
    * The display name for the dataset.
    */
  var Name: ResourceName
  
  /**
    * A list of resource permissions on the dataset.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.undefined
  
  /**
    * Declares the physical tables that are available in the underlying data sources.
    */
  var PhysicalTableMap: typings.awsSdk.quicksightMod.PhysicalTableMap
  
  /**
    * The row-level security configuration for the data that you want to create.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typings.awsSdk.quicksightMod.RowLevelPermissionDataSet] = js.undefined
  
  /**
    * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDataSetRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    DataSetId: ResourceId,
    ImportMode: DataSetImportMode,
    Name: ResourceName,
    PhysicalTableMap: PhysicalTableMap
  ): CreateDataSetRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], ImportMode = ImportMode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PhysicalTableMap = PhysicalTableMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSetRequest]
  }
  
  extension [Self <: CreateDataSetRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setColumnGroups(value: ColumnGroupList): Self = StObject.set(x, "ColumnGroups", value.asInstanceOf[js.Any])
    
    inline def setColumnGroupsUndefined: Self = StObject.set(x, "ColumnGroups", js.undefined)
    
    inline def setColumnGroupsVarargs(value: ColumnGroup*): Self = StObject.set(x, "ColumnGroups", js.Array(value :_*))
    
    inline def setColumnLevelPermissionRules(value: ColumnLevelPermissionRuleList): Self = StObject.set(x, "ColumnLevelPermissionRules", value.asInstanceOf[js.Any])
    
    inline def setColumnLevelPermissionRulesUndefined: Self = StObject.set(x, "ColumnLevelPermissionRules", js.undefined)
    
    inline def setColumnLevelPermissionRulesVarargs(value: ColumnLevelPermissionRule*): Self = StObject.set(x, "ColumnLevelPermissionRules", js.Array(value :_*))
    
    inline def setDataSetId(value: ResourceId): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setImportMode(value: DataSetImportMode): Self = StObject.set(x, "ImportMode", value.asInstanceOf[js.Any])
    
    inline def setLogicalTableMap(value: LogicalTableMap): Self = StObject.set(x, "LogicalTableMap", value.asInstanceOf[js.Any])
    
    inline def setLogicalTableMapUndefined: Self = StObject.set(x, "LogicalTableMap", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: ResourcePermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "Permissions", js.Array(value :_*))
    
    inline def setPhysicalTableMap(value: PhysicalTableMap): Self = StObject.set(x, "PhysicalTableMap", value.asInstanceOf[js.Any])
    
    inline def setRowLevelPermissionDataSet(value: RowLevelPermissionDataSet): Self = StObject.set(x, "RowLevelPermissionDataSet", value.asInstanceOf[js.Any])
    
    inline def setRowLevelPermissionDataSetUndefined: Self = StObject.set(x, "RowLevelPermissionDataSet", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
