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
  def apply(s3DestinationConfig: S3DestinationConfig): ExportEC2InstanceRecommendationsRequest = {
    val __obj = js.Dynamic.literal(s3DestinationConfig = s3DestinationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportEC2InstanceRecommendationsRequest]
  }
  @scala.inline
  implicit class ExportEC2InstanceRecommendationsRequestOps[Self <: ExportEC2InstanceRecommendationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setS3DestinationConfig(value: S3DestinationConfig): Self = this.set("s3DestinationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = this.set("accountIds", js.Array(value :_*))
    @scala.inline
    def setAccountIds(value: AccountIds): Self = this.set("accountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountIds: Self = this.set("accountIds", js.undefined)
    @scala.inline
    def setFieldsToExportVarargs(value: ExportableInstanceField*): Self = this.set("fieldsToExport", js.Array(value :_*))
    @scala.inline
    def setFieldsToExport(value: ExportableInstanceFields): Self = this.set("fieldsToExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldsToExport: Self = this.set("fieldsToExport", js.undefined)
    @scala.inline
    def setFileFormat(value: FileFormat): Self = this.set("fileFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileFormat: Self = this.set("fileFormat", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: Filters): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setIncludeMemberAccounts(value: IncludeMemberAccounts): Self = this.set("includeMemberAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeMemberAccounts: Self = this.set("includeMemberAccounts", js.undefined)
  }
  
}

