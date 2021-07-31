package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataSourceRequest extends StObject {
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The credentials that QuickSight that uses to connect to your underlying source. Currently, only credentials based on user name and password are supported.
    */
  var Credentials: js.UndefOr[DataSourceCredentials] = js.undefined
  
  /**
    * The ID of the data source. This ID is unique per AWS Region for each AWS account. 
    */
  var DataSourceId: ResourceId
  
  /**
    * The parameters that QuickSight uses to connect to your underlying source.
    */
  var DataSourceParameters: js.UndefOr[typings.awsSdk.quicksightMod.DataSourceParameters] = js.undefined
  
  /**
    * A display name for the data source.
    */
  var Name: ResourceName
  
  /**
    * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
    */
  var SslProperties: js.UndefOr[typings.awsSdk.quicksightMod.SslProperties] = js.undefined
  
  /**
    * Use this parameter only when you want QuickSight to use a VPC connection when connecting to your underlying source.
    */
  var VpcConnectionProperties: js.UndefOr[typings.awsSdk.quicksightMod.VpcConnectionProperties] = js.undefined
}
object UpdateDataSourceRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSourceId: ResourceId, Name: ResourceName): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSourceId = DataSourceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
  
  @scala.inline
  implicit class UpdateDataSourceRequestMutableBuilder[Self <: UpdateDataSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentials(value: DataSourceCredentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: ResourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceParameters(value: DataSourceParameters): Self = StObject.set(x, "DataSourceParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceParametersUndefined: Self = StObject.set(x, "DataSourceParameters", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslProperties(value: SslProperties): Self = StObject.set(x, "SslProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslPropertiesUndefined: Self = StObject.set(x, "SslProperties", js.undefined)
    
    @scala.inline
    def setVpcConnectionProperties(value: VpcConnectionProperties): Self = StObject.set(x, "VpcConnectionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConnectionPropertiesUndefined: Self = StObject.set(x, "VpcConnectionProperties", js.undefined)
  }
}
