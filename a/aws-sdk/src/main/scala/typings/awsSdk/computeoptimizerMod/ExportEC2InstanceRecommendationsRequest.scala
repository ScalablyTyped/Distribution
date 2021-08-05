package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportEC2InstanceRecommendationsRequest extends StObject {
  
  /**
    * The IDs of the AWS accounts for which to export instance recommendations. If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to export recommendations. This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive. Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted. You can specify multiple account IDs per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.undefined
  
  /**
    * The recommendations data to include in the export file. For more information about the fields that can be exported, see Exported files in the Compute Optimizer User Guide.
    */
  var fieldsToExport: js.UndefOr[ExportableInstanceFields] = js.undefined
  
  /**
    * The format of the export file. The only export file format currently supported is Csv.
    */
  var fileFormat: js.UndefOr[FileFormat] = js.undefined
  
  /**
    * An array of objects that describe a filter to export a more specific set of instance recommendations.
    */
  var filters: js.UndefOr[Filters] = js.undefined
  
  /**
    * Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the master account of an organization. The member accounts must also be opted in to Compute Optimizer. Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted. Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.
    */
  var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.undefined
  
  /**
    * An object to specify the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for the export job. You must create the destination Amazon S3 bucket for your recommendations export before you create the export job. Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3 bucket. For more information, see Amazon S3 Bucket Policy for Compute Optimizer in the Compute Optimizer user guide.
    */
  var s3DestinationConfig: S3DestinationConfig
}
object ExportEC2InstanceRecommendationsRequest {
  
  inline def apply(s3DestinationConfig: S3DestinationConfig): ExportEC2InstanceRecommendationsRequest = {
    val __obj = js.Dynamic.literal(s3DestinationConfig = s3DestinationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportEC2InstanceRecommendationsRequest]
  }
  
  extension [Self <: ExportEC2InstanceRecommendationsRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
    
    inline def setFieldsToExport(value: ExportableInstanceFields): Self = StObject.set(x, "fieldsToExport", value.asInstanceOf[js.Any])
    
    inline def setFieldsToExportUndefined: Self = StObject.set(x, "fieldsToExport", js.undefined)
    
    inline def setFieldsToExportVarargs(value: ExportableInstanceField*): Self = StObject.set(x, "fieldsToExport", js.Array(value :_*))
    
    inline def setFileFormat(value: FileFormat): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    inline def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setIncludeMemberAccounts(value: IncludeMemberAccounts): Self = StObject.set(x, "includeMemberAccounts", value.asInstanceOf[js.Any])
    
    inline def setIncludeMemberAccountsUndefined: Self = StObject.set(x, "includeMemberAccounts", js.undefined)
    
    inline def setS3DestinationConfig(value: S3DestinationConfig): Self = StObject.set(x, "s3DestinationConfig", value.asInstanceOf[js.Any])
  }
}
