package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportGenerator extends StObject {
  
  /**
    * Time the report was created.
    */
  var CreateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the report generator.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Time the last report was generated at.
    */
  var LastReportGenerationTime: js.UndefOr[String] = js.undefined
  
  /**
    * Failure message for the last report generation attempt.
    */
  var LastRunFailureReason: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the last report generation attempt.
    */
  var LastRunStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the report generator.
    */
  var LicenseManagerReportGeneratorArn: js.UndefOr[String] = js.undefined
  
  /**
    * License configuration type for this generator.
    */
  var ReportContext: js.UndefOr[typings.awsSdk.licensemanagerMod.ReportContext] = js.undefined
  
  /**
    * The Amazon Web Services account ID used to create the report generator.
    */
  var ReportCreatorAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Details about how frequently reports are generated.
    */
  var ReportFrequency: js.UndefOr[typings.awsSdk.licensemanagerMod.ReportFrequency] = js.undefined
  
  /**
    * Name of the report generator.
    */
  var ReportGeneratorName: js.UndefOr[String] = js.undefined
  
  /**
    * Type of reports that are generated.
    */
  var ReportType: js.UndefOr[ReportTypeList] = js.undefined
  
  /**
    * Details of the S3 bucket that report generator reports are published to.
    */
  var S3Location: js.UndefOr[typings.awsSdk.licensemanagerMod.S3Location] = js.undefined
  
  /**
    * Tags associated with the report generator.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ReportGenerator {
  
  inline def apply(): ReportGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportGenerator]
  }
  
  extension [Self <: ReportGenerator](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastReportGenerationTime(value: String): Self = StObject.set(x, "LastReportGenerationTime", value.asInstanceOf[js.Any])
    
    inline def setLastReportGenerationTimeUndefined: Self = StObject.set(x, "LastReportGenerationTime", js.undefined)
    
    inline def setLastRunFailureReason(value: String): Self = StObject.set(x, "LastRunFailureReason", value.asInstanceOf[js.Any])
    
    inline def setLastRunFailureReasonUndefined: Self = StObject.set(x, "LastRunFailureReason", js.undefined)
    
    inline def setLastRunStatus(value: String): Self = StObject.set(x, "LastRunStatus", value.asInstanceOf[js.Any])
    
    inline def setLastRunStatusUndefined: Self = StObject.set(x, "LastRunStatus", js.undefined)
    
    inline def setLicenseManagerReportGeneratorArn(value: String): Self = StObject.set(x, "LicenseManagerReportGeneratorArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseManagerReportGeneratorArnUndefined: Self = StObject.set(x, "LicenseManagerReportGeneratorArn", js.undefined)
    
    inline def setReportContext(value: ReportContext): Self = StObject.set(x, "ReportContext", value.asInstanceOf[js.Any])
    
    inline def setReportContextUndefined: Self = StObject.set(x, "ReportContext", js.undefined)
    
    inline def setReportCreatorAccount(value: String): Self = StObject.set(x, "ReportCreatorAccount", value.asInstanceOf[js.Any])
    
    inline def setReportCreatorAccountUndefined: Self = StObject.set(x, "ReportCreatorAccount", js.undefined)
    
    inline def setReportFrequency(value: ReportFrequency): Self = StObject.set(x, "ReportFrequency", value.asInstanceOf[js.Any])
    
    inline def setReportFrequencyUndefined: Self = StObject.set(x, "ReportFrequency", js.undefined)
    
    inline def setReportGeneratorName(value: String): Self = StObject.set(x, "ReportGeneratorName", value.asInstanceOf[js.Any])
    
    inline def setReportGeneratorNameUndefined: Self = StObject.set(x, "ReportGeneratorName", js.undefined)
    
    inline def setReportType(value: ReportTypeList): Self = StObject.set(x, "ReportType", value.asInstanceOf[js.Any])
    
    inline def setReportTypeUndefined: Self = StObject.set(x, "ReportType", js.undefined)
    
    inline def setReportTypeVarargs(value: ReportType*): Self = StObject.set(x, "ReportType", js.Array(value*))
    
    inline def setS3Location(value: S3Location): Self = StObject.set(x, "S3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "S3Location", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
