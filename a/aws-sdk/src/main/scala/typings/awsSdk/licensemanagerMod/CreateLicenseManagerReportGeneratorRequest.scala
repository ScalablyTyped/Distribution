package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLicenseManagerReportGeneratorRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: ClientRequestToken
  
  /**
    * Description of the report generator.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the type of license configuration the report generator tracks.
    */
  var ReportContext: typings.awsSdk.licensemanagerMod.ReportContext
  
  /**
    * Frequency by which reports are generated. Reports can be generated daily, monthly, or weekly.
    */
  var ReportFrequency: typings.awsSdk.licensemanagerMod.ReportFrequency
  
  /**
    * Name of the report generator.
    */
  var ReportGeneratorName: typings.awsSdk.licensemanagerMod.ReportGeneratorName
  
  /**
    * Tags to add to the report generator.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Type of reports to generate. The following report types an be generated:   License configuration report - Reports the number and details of consumed licenses for a license configuration.   Resource report - Reports the tracked licenses and resource consumption for a license configuration.  
    */
  var Type: ReportTypeList
}
object CreateLicenseManagerReportGeneratorRequest {
  
  inline def apply(
    ClientToken: ClientRequestToken,
    ReportContext: ReportContext,
    ReportFrequency: ReportFrequency,
    ReportGeneratorName: ReportGeneratorName,
    Type: ReportTypeList
  ): CreateLicenseManagerReportGeneratorRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], ReportContext = ReportContext.asInstanceOf[js.Any], ReportFrequency = ReportFrequency.asInstanceOf[js.Any], ReportGeneratorName = ReportGeneratorName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLicenseManagerReportGeneratorRequest]
  }
  
  extension [Self <: CreateLicenseManagerReportGeneratorRequest](x: Self) {
    
    inline def setClientToken(value: ClientRequestToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setReportContext(value: ReportContext): Self = StObject.set(x, "ReportContext", value.asInstanceOf[js.Any])
    
    inline def setReportFrequency(value: ReportFrequency): Self = StObject.set(x, "ReportFrequency", value.asInstanceOf[js.Any])
    
    inline def setReportGeneratorName(value: ReportGeneratorName): Self = StObject.set(x, "ReportGeneratorName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: ReportTypeList): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: ReportType*): Self = StObject.set(x, "Type", js.Array(value*))
  }
}
