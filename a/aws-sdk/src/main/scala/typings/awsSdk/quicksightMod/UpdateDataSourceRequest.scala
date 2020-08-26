package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourceRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The credentials that QuickSight that uses to connect to your underlying source. Currently, only credentials based on user name and password are supported.
    */
  var Credentials: js.UndefOr[DataSourceCredentials] = js.native
  /**
    * The ID of the data source. This ID is unique per AWS Region for each AWS account. 
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
    * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
    */
  var SslProperties: js.UndefOr[typings.awsSdk.quicksightMod.SslProperties] = js.native
  /**
    * Use this parameter only when you want QuickSight to use a VPC connection when connecting to your underlying source.
    */
  var VpcConnectionProperties: js.UndefOr[typings.awsSdk.quicksightMod.VpcConnectionProperties] = js.native
}

object UpdateDataSourceRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSourceId: ResourceId, Name: ResourceName): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSourceId = DataSourceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
  @scala.inline
  implicit class UpdateDataSourceRequestOps[Self <: UpdateDataSourceRequest] (val x: Self) extends AnyVal {
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
    def setCredentials(value: DataSourceCredentials): Self = this.set("Credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("Credentials", js.undefined)
    @scala.inline
    def setDataSourceParameters(value: DataSourceParameters): Self = this.set("DataSourceParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceParameters: Self = this.set("DataSourceParameters", js.undefined)
    @scala.inline
    def setSslProperties(value: SslProperties): Self = this.set("SslProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslProperties: Self = this.set("SslProperties", js.undefined)
    @scala.inline
    def setVpcConnectionProperties(value: VpcConnectionProperties): Self = this.set("VpcConnectionProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConnectionProperties: Self = this.set("VpcConnectionProperties", js.undefined)
  }
  
}

