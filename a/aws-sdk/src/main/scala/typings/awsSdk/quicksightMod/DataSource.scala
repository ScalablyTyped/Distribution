package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /**
    * A set of alternate data source parameters that you want to share for the credentials stored with this data source. The credentials are applied in tandem with the data source parameters when you copy a data source by using a create or update request. The API operation compares the DataSourceParameters structure that's in the request with the structures in the AlternateDataSourceParameters allow list. If the structures are an exact match, the request is allowed to use the credentials from this existing data source. If the AlternateDataSourceParameters list is null, the Credentials originally used with this DataSourceParameters are automatically allowed.
    */
  var AlternateDataSourceParameters: js.UndefOr[DataSourceParametersList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the data source.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The time that this data source was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.undefined
  
  /**
    * The ID of the data source. This ID is unique per AWS Region for each AWS account.
    */
  var DataSourceId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The parameters that Amazon QuickSight uses to connect to your underlying source. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  var DataSourceParameters: js.UndefOr[typings.awsSdk.quicksightMod.DataSourceParameters] = js.undefined
  
  /**
    * Error information from the last update or the creation of the data source.
    */
  var ErrorInfo: js.UndefOr[DataSourceErrorInfo] = js.undefined
  
  /**
    * The last time that this data source was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.undefined
  
  /**
    * A display name for the data source.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
    */
  var SslProperties: js.UndefOr[typings.awsSdk.quicksightMod.SslProperties] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The type of the data source. This type indicates which database engine the data source connects to.
    */
  var Type: js.UndefOr[DataSourceType] = js.undefined
  
  /**
    * The VPC connection information. You need to use this parameter only when you want QuickSight to use a VPC connection when connecting to your underlying source.
    */
  var VpcConnectionProperties: js.UndefOr[typings.awsSdk.quicksightMod.VpcConnectionProperties] = js.undefined
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateDataSourceParameters(value: DataSourceParametersList): Self = StObject.set(x, "AlternateDataSourceParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateDataSourceParametersUndefined: Self = StObject.set(x, "AlternateDataSourceParameters", js.undefined)
    
    @scala.inline
    def setAlternateDataSourceParametersVarargs(value: DataSourceParameters*): Self = StObject.set(x, "AlternateDataSourceParameters", js.Array(value :_*))
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: ResourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
    
    @scala.inline
    def setDataSourceParameters(value: DataSourceParameters): Self = StObject.set(x, "DataSourceParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceParametersUndefined: Self = StObject.set(x, "DataSourceParameters", js.undefined)
    
    @scala.inline
    def setErrorInfo(value: DataSourceErrorInfo): Self = StObject.set(x, "ErrorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorInfoUndefined: Self = StObject.set(x, "ErrorInfo", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Timestamp_): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSslProperties(value: SslProperties): Self = StObject.set(x, "SslProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslPropertiesUndefined: Self = StObject.set(x, "SslProperties", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setType(value: DataSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVpcConnectionProperties(value: VpcConnectionProperties): Self = StObject.set(x, "VpcConnectionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConnectionPropertiesUndefined: Self = StObject.set(x, "VpcConnectionProperties", js.undefined)
  }
}
