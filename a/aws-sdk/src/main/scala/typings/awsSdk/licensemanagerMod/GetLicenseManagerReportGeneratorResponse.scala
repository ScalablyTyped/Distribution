package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLicenseManagerReportGeneratorResponse extends StObject {
  
  /**
    * A report generator that creates periodic reports about your license configurations.
    */
  var ReportGenerator: js.UndefOr[typings.awsSdk.licensemanagerMod.ReportGenerator] = js.undefined
}
object GetLicenseManagerReportGeneratorResponse {
  
  inline def apply(): GetLicenseManagerReportGeneratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLicenseManagerReportGeneratorResponse]
  }
  
  extension [Self <: GetLicenseManagerReportGeneratorResponse](x: Self) {
    
    inline def setReportGenerator(value: ReportGenerator): Self = StObject.set(x, "ReportGenerator", value.asInstanceOf[js.Any])
    
    inline def setReportGeneratorUndefined: Self = StObject.set(x, "ReportGenerator", js.undefined)
  }
}
