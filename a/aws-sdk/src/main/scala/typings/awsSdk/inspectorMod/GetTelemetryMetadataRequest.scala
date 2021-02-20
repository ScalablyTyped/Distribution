package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTelemetryMetadataRequest extends StObject {
  
  /**
    * The ARN that specifies the assessment run that has the telemetry data that you want to obtain.
    */
  var assessmentRunArn: Arn = js.native
}
object GetTelemetryMetadataRequest {
  
  @scala.inline
  def apply(assessmentRunArn: Arn): GetTelemetryMetadataRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTelemetryMetadataRequest]
  }
  
  @scala.inline
  implicit class GetTelemetryMetadataRequestMutableBuilder[Self <: GetTelemetryMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentRunArn(value: Arn): Self = StObject.set(x, "assessmentRunArn", value.asInstanceOf[js.Any])
  }
}
