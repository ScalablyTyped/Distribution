package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDataSourceResponse extends StObject {
  
  /**
    * Information that describes where the data source is located and how the data source is configured. The specific information in the description depends on the data source provider.
    */
  var Configuration: js.UndefOr[DataSourceConfiguration] = js.native
  
  /**
    * The Unix timestamp of when the data source was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the data source.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  
  /**
    * When the Status field value is FAILED, the ErrorMessage field contains a description of the error that caused the data source to fail.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kendraMod.ErrorMessage] = js.native
  
  /**
    * The identifier of the data source.
    */
  var Id: js.UndefOr[DataSourceId] = js.native
  
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: js.UndefOr[typings.awsSdk.kendraMod.IndexId] = js.native
  
  /**
    * The name that you gave the data source when it was created.
    */
  var Name: js.UndefOr[DataSourceName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the role that enables the data source to access its resources.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.native
  
  /**
    * The schedule that Amazon Kendra will update the data source.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.native
  
  /**
    * The current status of the data source. When the status is ACTIVE the data source is ready to use. When the status is FAILED, the ErrorMessage field contains the reason that the data source failed.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.native
  
  /**
    * The type of the data source.
    */
  var Type: js.UndefOr[DataSourceType] = js.native
  
  /**
    * The Unix timestamp of when the data source was last updated.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}
object DescribeDataSourceResponse {
  
  @scala.inline
  def apply(): DescribeDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSourceResponse]
  }
  
  @scala.inline
  implicit class DescribeDataSourceResponseMutableBuilder[Self <: DescribeDataSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: DataSourceConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexIdUndefined: Self = StObject.set(x, "IndexId", js.undefined)
    
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
    
    @scala.inline
    def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setType(value: DataSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
