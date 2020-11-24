package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSetSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * Indicates if the dataset has column level permission configured. 
    */
  var ColumnLevelPermissionRulesApplied: js.UndefOr[Boolean] = js.native
  
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
    * A display name for the dataset.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The row-level security configuration for the dataset.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typings.awsSdk.quicksightMod.RowLevelPermissionDataSet] = js.native
}
object DataSetSummary {
  
  @scala.inline
  def apply(): DataSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetSummary]
  }
  
  @scala.inline
  implicit class DataSetSummaryOps[Self <: DataSetSummary] (val x: Self) extends AnyVal {
    
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
    def setColumnLevelPermissionRulesApplied(value: Boolean): Self = this.set("ColumnLevelPermissionRulesApplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnLevelPermissionRulesApplied: Self = this.set("ColumnLevelPermissionRulesApplied", js.undefined)
    
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
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRowLevelPermissionDataSet(value: RowLevelPermissionDataSet): Self = this.set("RowLevelPermissionDataSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowLevelPermissionDataSet: Self = this.set("RowLevelPermissionDataSet", js.undefined)
  }
}
