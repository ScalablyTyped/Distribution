package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobRequest extends StObject {
  
  /**
    * The name of the job definition to retrieve.
    */
  var JobName: NameString
}
object GetJobRequest {
  
  @scala.inline
  def apply(JobName: NameString): GetJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRequest]
  }
  
  @scala.inline
  implicit class GetJobRequestMutableBuilder[Self <: GetJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
  }
}
