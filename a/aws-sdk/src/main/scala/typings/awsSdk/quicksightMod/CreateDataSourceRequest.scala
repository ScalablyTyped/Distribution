package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSourceRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The credentials QuickSight that uses to connect to your underlying source. Currently, only credentials based on user name and password are supported.
    */
  var Credentials: js.UndefOr[DataSourceCredentials] = js.native
  /**
    * An ID for the data source. This ID is unique per AWS Region for each AWS account. 
    */
  var DataSourceId: ResourceId = js.native
  /**
    * The parameters that QuickSight uses to connect to your underlying source.
    */
  var DataSourceParameters: js.UndefOr[typings.awsSdk.quicksightMod.DataSourceParameters] = js.native
  /**
    * A display name for the data source.
    */
  var Name: ResourceName = js.native
  /**
    * A list of resource permissions on the data source.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
    */
  var SslProperties: js.UndefOr[typings.awsSdk.quicksightMod.SslProperties] = js.native
  /**
    * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The type of the data source. Currently, the supported types for this operation are: ATHENA, AURORA, AURORA_POSTGRESQL, MARIADB, MYSQL, POSTGRESQL, PRESTO, REDSHIFT, S3, SNOWFLAKE, SPARK, SQLSERVER, TERADATA. Use ListDataSources to return a list of all data sources.
    */
  var Type: DataSourceType = js.native
  /**
    * Use this parameter only when you want QuickSight to use a VPC connection when connecting to your underlying source.
    */
  var VpcConnectionProperties: js.UndefOr[typings.awsSdk.quicksightMod.VpcConnectionProperties] = js.native
}

object CreateDataSourceRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DataSourceId: ResourceId,
    Name: ResourceName,
    Type: DataSourceType,
    Credentials: DataSourceCredentials = null,
    DataSourceParameters: DataSourceParameters = null,
    Permissions: ResourcePermissionList = null,
    SslProperties: SslProperties = null,
    Tags: TagList = null,
    VpcConnectionProperties: VpcConnectionProperties = null
  ): CreateDataSourceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSourceId = DataSourceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials.asInstanceOf[js.Any])
    if (DataSourceParameters != null) __obj.updateDynamic("DataSourceParameters")(DataSourceParameters.asInstanceOf[js.Any])
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    if (SslProperties != null) __obj.updateDynamic("SslProperties")(SslProperties.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcConnectionProperties != null) __obj.updateDynamic("VpcConnectionProperties")(VpcConnectionProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceRequest]
  }
}

