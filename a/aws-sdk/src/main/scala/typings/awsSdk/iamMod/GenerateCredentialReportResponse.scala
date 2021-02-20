package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateCredentialReportResponse extends StObject {
  
  /**
    * Information about the credential report.
    */
  var Description: js.UndefOr[ReportStateDescriptionType] = js.native
  
  /**
    * Information about the state of the credential report.
    */
  var State: js.UndefOr[ReportStateType] = js.native
}
object GenerateCredentialReportResponse {
  
  @scala.inline
  def apply(): GenerateCredentialReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateCredentialReportResponse]
  }
  
  @scala.inline
  implicit class GenerateCredentialReportResponseMutableBuilder[Self <: GenerateCredentialReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ReportStateDescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setState(value: ReportStateType): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
