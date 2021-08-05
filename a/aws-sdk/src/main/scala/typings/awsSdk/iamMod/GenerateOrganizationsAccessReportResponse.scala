package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateOrganizationsAccessReportResponse extends StObject {
  
  /**
    * The job identifier that you can use in the GetOrganizationsAccessReport operation.
    */
  var JobId: js.UndefOr[jobIDType] = js.undefined
}
object GenerateOrganizationsAccessReportResponse {
  
  inline def apply(): GenerateOrganizationsAccessReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOrganizationsAccessReportResponse]
  }
  
  extension [Self <: GenerateOrganizationsAccessReportResponse](x: Self) {
    
    inline def setJobId(value: jobIDType): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
