package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataSourceResponse extends StObject {
  
  /**
    * Information that describes where the data source is located and how the data source is configured. The specific information in the description depends on the data source provider.
    */
  var Configuration: js.UndefOr[DataSourceConfiguration] = js.undefined
  
  /**
    * The Unix timestamp of when the data source was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The description of the data source.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.undefined
  
  /**
    * When the Status field value is FAILED, the ErrorMessage field contains a description of the error that caused the data source to fail.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kendraMod.ErrorMessage] = js.undefined
  
  /**
    * The identifier of the data source.
    */
  var Id: js.UndefOr[DataSourceId] = js.undefined
  
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: js.UndefOr[typings.awsSdk.kendraMod.IndexId] = js.undefined
  
  /**
    * The name that you gave the data source when it was created.
    */
  var Name: js.UndefOr[DataSourceName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role that enables the data source to access its resources.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.undefined
  
  /**
    * The schedule that Amazon Kendra will update the data source.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.undefined
  
  /**
    * The current status of the data source. When the status is ACTIVE the data source is ready to use. When the status is FAILED, the ErrorMessage field contains the reason that the data source failed.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.undefined
  
  /**
    * The type of the data source.
    */
  var Type: js.UndefOr[DataSourceType] = js.undefined
  
  /**
    * The Unix timestamp of when the data source was last updated.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.undefined
}
object DescribeDataSourceResponse {
  
  inline def apply(): DescribeDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSourceResponse]
  }
  
  extension [Self <: DescribeDataSourceResponse](x: Self) {
    
    inline def setConfiguration(value: DataSourceConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setIndexIdUndefined: Self = StObject.set(x, "IndexId", js.undefined)
    
    inline def setName(value: DataSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSchedule(value: ScanSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: DataSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
