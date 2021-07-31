package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * Indicates if the dataset has column level permission configured. 
    */
  var ColumnLevelPermissionRulesApplied: js.UndefOr[Boolean] = js.undefined
  
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
    * A display name for the dataset.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The row-level security configuration for the dataset.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typings.awsSdk.quicksightMod.RowLevelPermissionDataSet] = js.undefined
}
object DataSetSummary {
  
  @scala.inline
  def apply(): DataSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetSummary]
  }
  
  @scala.inline
  implicit class DataSetSummaryMutableBuilder[Self <: DataSetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setColumnLevelPermissionRulesApplied(value: Boolean): Self = StObject.set(x, "ColumnLevelPermissionRulesApplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnLevelPermissionRulesAppliedUndefined: Self = StObject.set(x, "ColumnLevelPermissionRulesApplied", js.undefined)
    
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
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRowLevelPermissionDataSet(value: RowLevelPermissionDataSet): Self = StObject.set(x, "RowLevelPermissionDataSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowLevelPermissionDataSetUndefined: Self = StObject.set(x, "RowLevelPermissionDataSet", js.undefined)
  }
}
