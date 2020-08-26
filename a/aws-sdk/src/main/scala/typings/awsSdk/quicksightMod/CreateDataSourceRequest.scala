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
  def apply(AwsAccountId: AwsAccountId, DataSourceId: ResourceId, Name: ResourceName, Type: DataSourceType): CreateDataSourceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSourceId = DataSourceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceRequest]
  }
  @scala.inline
  implicit class CreateDataSourceRequestOps[Self <: CreateDataSourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSourceId(value: ResourceId): Self = this.set("DataSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DataSourceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentials(value: DataSourceCredentials): Self = this.set("Credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("Credentials", js.undefined)
    @scala.inline
    def setDataSourceParameters(value: DataSourceParameters): Self = this.set("DataSourceParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceParameters: Self = this.set("DataSourceParameters", js.undefined)
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = this.set("Permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: ResourcePermissionList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
    @scala.inline
    def setSslProperties(value: SslProperties): Self = this.set("SslProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslProperties: Self = this.set("SslProperties", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVpcConnectionProperties(value: VpcConnectionProperties): Self = this.set("VpcConnectionProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConnectionProperties: Self = this.set("VpcConnectionProperties", js.undefined)
  }
  
}

