package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateOrganizationsAccessReportResponse extends StObject {
  
  /**
    * The job identifier that you can use in the GetOrganizationsAccessReport operation.
    */
  var JobId: js.UndefOr[jobIDType] = js.native
}
object GenerateOrganizationsAccessReportResponse {
  
  @scala.inline
  def apply(): GenerateOrganizationsAccessReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOrganizationsAccessReportResponse]
  }
  
  @scala.inline
  implicit class GenerateOrganizationsAccessReportResponseMutableBuilder[Self <: GenerateOrganizationsAccessReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: jobIDType): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
