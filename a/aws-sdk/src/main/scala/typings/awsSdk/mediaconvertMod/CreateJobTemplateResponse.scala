package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateJobTemplateResponse extends StObject {
  
  /**
    * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
    */
  var JobTemplate: js.UndefOr[typings.awsSdk.mediaconvertMod.JobTemplate] = js.native
}
object CreateJobTemplateResponse {
  
  @scala.inline
  def apply(): CreateJobTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobTemplateResponse]
  }
  
  @scala.inline
  implicit class CreateJobTemplateResponseMutableBuilder[Self <: CreateJobTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobTemplate(value: JobTemplate): Self = StObject.set(x, "JobTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTemplateUndefined: Self = StObject.set(x, "JobTemplate", js.undefined)
  }
}
