package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDataSourceRequest extends StObject {
  
  /**
    * A token that you provide to identify the request to create a data source. Multiple calls to the CreateDataSource operation with the same client token will create only one data source.
    */
  var ClientToken: js.UndefOr[ClientTokenName] = js.native
  
  /**
    * The connector configuration information that is required to access the repository. You can't specify the Configuration parameter when the Type parameter is set to CUSTOM. If you do, you receive a ValidationException exception. The Configuration parameter is required for all other data sources.
    */
  var Configuration: js.UndefOr[DataSourceConfiguration] = js.native
  
  /**
    * A description for the data source.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  
  /**
    * The identifier of the index that should be associated with this data source.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
  
  /**
    * A unique name for the data source. A data source name can't be changed without deleting and recreating the data source.
    */
  var Name: DataSourceName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of a role with permission to access the data source. For more information, see IAM Roles for Amazon Kendra. You can't specify the RoleArn parameter when the Type parameter is set to CUSTOM. If you do, you receive a ValidationException exception. The RoleArn parameter is required for all other data sources.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.native
  
  /**
    * Sets the frequency that Amazon Kendra will check the documents in your repository and update the index. If you don't set a schedule Amazon Kendra will not periodically update the index. You can call the StartDataSourceSyncJob operation to update the index. You can't specify the Schedule parameter when the Type parameter is set to CUSTOM. If you do, you receive a ValidationException exception.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.native
  
  /**
    * A list of key-value pairs that identify the data source. You can use the tags to identify and organize your resources and to control access to resources.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The type of repository that contains the data source.
    */
  var Type: DataSourceType = js.native
}
object CreateDataSourceRequest {
  
  @scala.inline
  def apply(IndexId: IndexId, Name: DataSourceName, Type: DataSourceType): CreateDataSourceRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceRequest]
  }
  
  @scala.inline
  implicit class CreateDataSourceRequestMutableBuilder[Self <: CreateDataSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientTokenName): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setConfiguration(value: DataSourceConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DataSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setSchedule(value: ScanSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: DataSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
