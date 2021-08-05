package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSourceRequest extends StObject {
  
  /**
    * A token that you provide to identify the request to create a data source. Multiple calls to the CreateDataSource operation with the same client token will create only one data source.
    */
  var ClientToken: js.UndefOr[ClientTokenName] = js.undefined
  
  /**
    * The connector configuration information that is required to access the repository. You can't specify the Configuration parameter when the Type parameter is set to CUSTOM. If you do, you receive a ValidationException exception. The Configuration parameter is required for all other data sources.
    */
  var Configuration: js.UndefOr[DataSourceConfiguration] = js.undefined
  
  /**
    * A description for the data source.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.undefined
  
  /**
    * The identifier of the index that should be associated with this data source.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
  
  /**
    * A unique name for the data source. A data source name can't be changed without deleting and recreating the data source.
    */
  var Name: DataSourceName
  
  /**
    * The Amazon Resource Name (ARN) of a role with permission to access the data source. For more information, see IAM Roles for Amazon Kendra. You can't specify the RoleArn parameter when the Type parameter is set to CUSTOM. If you do, you receive a ValidationException exception. The RoleArn parameter is required for all other data sources.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.undefined
  
  /**
    * Sets the frequency that Amazon Kendra will check the documents in your repository and update the index. If you don't set a schedule Amazon Kendra will not periodically update the index. You can call the StartDataSourceSyncJob operation to update the index. You can't specify the Schedule parameter when the Type parameter is set to CUSTOM. If you do, you receive a ValidationException exception.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.undefined
  
  /**
    * A list of key-value pairs that identify the data source. You can use the tags to identify and organize your resources and to control access to resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of repository that contains the data source.
    */
  var Type: DataSourceType
}
object CreateDataSourceRequest {
  
  inline def apply(IndexId: IndexId, Name: DataSourceName, Type: DataSourceType): CreateDataSourceRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceRequest]
  }
  
  extension [Self <: CreateDataSourceRequest](x: Self) {
    
    inline def setClientToken(value: ClientTokenName): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setConfiguration(value: DataSourceConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setName(value: DataSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSchedule(value: ScanSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setType(value: DataSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
