package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSourceRequest extends StObject {
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The credentials QuickSight that uses to connect to your underlying source. Currently, only credentials based on user name and password are supported.
    */
  var Credentials: js.UndefOr[DataSourceCredentials] = js.undefined
  
  /**
    * An ID for the data source. This ID is unique per AWS Region for each AWS account. 
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
    * A list of resource permissions on the data source.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.undefined
  
  /**
    * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
    */
  var SslProperties: js.UndefOr[typings.awsSdk.quicksightMod.SslProperties] = js.undefined
  
  /**
    * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of the data source. Currently, the supported types for this operation are: ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA. Use ListDataSources to return a list of all data sources.
    */
  var Type: DataSourceType
  
  /**
    * Use this parameter only when you want QuickSight to use a VPC connection when connecting to your underlying source.
    */
  var VpcConnectionProperties: js.UndefOr[typings.awsSdk.quicksightMod.VpcConnectionProperties] = js.undefined
}
object CreateDataSourceRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSourceId: ResourceId, Name: ResourceName, Type: DataSourceType): CreateDataSourceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSourceId = DataSourceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceRequest]
  }
  
  @scala.inline
  implicit class CreateDataSourceRequestMutableBuilder[Self <: CreateDataSourceRequest] (val x: Self) extends AnyVal {
    
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
    def setPermissions(value: ResourcePermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "Permissions", js.Array(value :_*))
    
    @scala.inline
    def setSslProperties(value: SslProperties): Self = StObject.set(x, "SslProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslPropertiesUndefined: Self = StObject.set(x, "SslProperties", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: DataSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConnectionProperties(value: VpcConnectionProperties): Self = StObject.set(x, "VpcConnectionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConnectionPropertiesUndefined: Self = StObject.set(x, "VpcConnectionProperties", js.undefined)
  }
}
