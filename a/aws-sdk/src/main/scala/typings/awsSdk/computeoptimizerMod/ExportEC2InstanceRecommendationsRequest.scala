package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportEC2InstanceRecommendationsRequest extends js.Object {
  /**
    * The IDs of the AWS accounts for which to export instance recommendations. If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to export recommendations. This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive. Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted. You can specify multiple account IDs per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.native
  /**
    * The recommendations data to include in the export file.
    */
  var fieldsToExport: js.UndefOr[ExportableInstanceFields] = js.native
  /**
    * The format of the export file. The only export file format currently supported is Csv.
    */
  var fileFormat: js.UndefOr[FileFormat] = js.native
  /**
    * An array of objects that describe a filter to export a more specific set of instance recommendations.
    */
  var filters: js.UndefOr[Filters] = js.native
  /**
    * Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the master account of an organization. The member accounts must also be opted in to Compute Optimizer. Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted. Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.
    */
  var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.native
  /**
    * An object to specify the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for the export job. You must create the destination Amazon S3 bucket for your recommendations export before you create the export job. Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3 bucket. For more information, see Amazon S3 Bucket Policy for Compute Optimizer in the Compute Optimizer user guide.
    */
  var s3DestinationConfig: S3DestinationConfig = js.native
}

object ExportEC2InstanceRecommendationsRequest {
  @scala.inline
  def apply(
    s3DestinationConfig: S3DestinationConfig,
    accountIds: AccountIds = null,
    fieldsToExport: ExportableInstanceFields = null,
    fileFormat: FileFormat = null,
    filters: Filters = null,
    includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.undefined
  ): ExportEC2InstanceRecommendationsRequest = {
    val __obj = js.Dynamic.literal(s3DestinationConfig = s3DestinationConfig.asInstanceOf[js.Any])
    if (accountIds != null) __obj.updateDynamic("accountIds")(accountIds.asInstanceOf[js.Any])
    if (fieldsToExport != null) __obj.updateDynamic("fieldsToExport")(fieldsToExport.asInstanceOf[js.Any])
    if (fileFormat != null) __obj.updateDynamic("fileFormat")(fileFormat.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(includeMemberAccounts)) __obj.updateDynamic("includeMemberAccounts")(includeMemberAccounts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportEC2InstanceRecommendationsRequest]
  }
}

