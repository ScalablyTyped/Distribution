package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * A set of one or more definitions of a  ColumnLevelPermissionRule .
    */
  var ColumnLevelPermissionRules: js.UndefOr[ColumnLevelPermissionRuleList] = js.native
  
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
  def apply(): DataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSet]
  }
  
  @scala.inline
  implicit class DataSetOps[Self <: DataSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setColumnGroupsVarargs(value: ColumnGroup*): Self = this.set("ColumnGroups", js.Array(value :_*))
    
    @scala.inline
    def setColumnGroups(value: ColumnGroupList): Self = this.set("ColumnGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnGroups: Self = this.set("ColumnGroups", js.undefined)
    
    @scala.inline
    def setColumnLevelPermissionRulesVarargs(value: ColumnLevelPermissionRule*): Self = this.set("ColumnLevelPermissionRules", js.Array(value :_*))
    
    @scala.inline
    def setColumnLevelPermissionRules(value: ColumnLevelPermissionRuleList): Self = this.set("ColumnLevelPermissionRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnLevelPermissionRules: Self = this.set("ColumnLevelPermissionRules", js.undefined)
    
    @scala.inline
    def setConsumedSpiceCapacityInBytes(value: Long_): Self = this.set("ConsumedSpiceCapacityInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumedSpiceCapacityInBytes: Self = this.set("ConsumedSpiceCapacityInBytes", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDataSetId(value: ResourceId): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSetId: Self = this.set("DataSetId", js.undefined)
    
    @scala.inline
    def setImportMode(value: DataSetImportMode): Self = this.set("ImportMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportMode: Self = this.set("ImportMode", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Timestamp_): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setLogicalTableMap(value: LogicalTableMap): Self = this.set("LogicalTableMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogicalTableMap: Self = this.set("LogicalTableMap", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOutputColumnsVarargs(value: OutputColumn*): Self = this.set("OutputColumns", js.Array(value :_*))
    
    @scala.inline
    def setOutputColumns(value: OutputColumnList): Self = this.set("OutputColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputColumns: Self = this.set("OutputColumns", js.undefined)
    
    @scala.inline
    def setPhysicalTableMap(value: PhysicalTableMap): Self = this.set("PhysicalTableMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhysicalTableMap: Self = this.set("PhysicalTableMap", js.undefined)
    
    @scala.inline
    def setRowLevelPermissionDataSet(value: RowLevelPermissionDataSet): Self = this.set("RowLevelPermissionDataSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowLevelPermissionDataSet: Self = this.set("RowLevelPermissionDataSet", js.undefined)
  }
}
