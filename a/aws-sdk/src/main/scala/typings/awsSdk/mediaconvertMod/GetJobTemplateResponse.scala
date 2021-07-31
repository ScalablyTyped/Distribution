package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobTemplateResponse extends StObject {
  
  /**
    * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
    */
  var JobTemplate: js.UndefOr[typings.awsSdk.mediaconvertMod.JobTemplate] = js.undefined
}
object GetJobTemplateResponse {
  
  @scala.inline
  def apply(): GetJobTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobTemplateResponse]
  }
  
  @scala.inline
  implicit class GetJobTemplateResponseMutableBuilder[Self <: GetJobTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobTemplate(value: JobTemplate): Self = StObject.set(x, "JobTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTemplateUndefined: Self = StObject.set(x, "JobTemplate", js.undefined)
  }
}
