package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataSourceRequest extends StObject {
  
  var Configuration: js.UndefOr[DataSourceConfiguration] = js.undefined
  
  /**
    * The new description for the data source.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.undefined
  
  /**
    * The unique identifier of the data source to update.
    */
  var Id: DataSourceId
  
  /**
    * The identifier of the index that contains the data source to update.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
  
  /**
    * The name of the data source to update. The name of the data source can't be updated. To rename a data source you must delete the data source and re-create it.
    */
  var Name: js.UndefOr[DataSourceName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the new role to use when the data source is accessing resources on your behalf.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.undefined
  
  /**
    * The new update schedule for the data source.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.undefined
}
object UpdateDataSourceRequest {
  
  @scala.inline
  def apply(Id: DataSourceId, IndexId: IndexId): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
  
  @scala.inline
  implicit class UpdateDataSourceRequestMutableBuilder[Self <: UpdateDataSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: DataSourceConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DataSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setSchedule(value: ScanSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
  }
}
