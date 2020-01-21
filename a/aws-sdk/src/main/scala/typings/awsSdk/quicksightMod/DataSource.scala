package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the data source.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The time that this data source was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * The ID of the data source. This ID is unique per AWS Region for each AWS account.
    */
  var DataSourceId: js.UndefOr[ResourceId] = js.native
  /**
    * The parameters that Amazon QuickSight uses to connect to your underlying source. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  var DataSourceParameters: js.UndefOr[typings.awsSdk.quicksightMod.DataSourceParameters] = js.native
  /**
    * Error information from the last update or the creation of the data source.
    */
  var ErrorInfo: js.UndefOr[DataSourceErrorInfo] = js.native
  /**
    * The last time that this data source was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * A display name for the data source.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying source.
    */
  var SslProperties: js.UndefOr[typings.awsSdk.quicksightMod.SslProperties] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  /**
    * The type of the data source. This type indicates which database engine the data source connects to.
    */
  var Type: js.UndefOr[DataSourceType] = js.native
  /**
    * The VPC connection information. You need to use this parameter only when you want QuickSight to use a VPC connection when connecting to your underlying source.
    */
  var VpcConnectionProperties: js.UndefOr[typings.awsSdk.quicksightMod.VpcConnectionProperties] = js.native
}

object DataSource {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreatedTime: Timestamp_ = null,
    DataSourceId: ResourceId = null,
    DataSourceParameters: DataSourceParameters = null,
    ErrorInfo: DataSourceErrorInfo = null,
    LastUpdatedTime: Timestamp_ = null,
    Name: ResourceName = null,
    SslProperties: SslProperties = null,
    Status: ResourceStatus = null,
    Type: DataSourceType = null,
    VpcConnectionProperties: VpcConnectionProperties = null
  ): DataSource = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DataSourceId != null) __obj.updateDynamic("DataSourceId")(DataSourceId.asInstanceOf[js.Any])
    if (DataSourceParameters != null) __obj.updateDynamic("DataSourceParameters")(DataSourceParameters.asInstanceOf[js.Any])
    if (ErrorInfo != null) __obj.updateDynamic("ErrorInfo")(ErrorInfo.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SslProperties != null) __obj.updateDynamic("SslProperties")(SslProperties.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VpcConnectionProperties != null) __obj.updateDynamic("VpcConnectionProperties")(VpcConnectionProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

