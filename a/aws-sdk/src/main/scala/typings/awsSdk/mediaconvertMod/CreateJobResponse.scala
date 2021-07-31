package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobResponse extends StObject {
  
  /**
    * Each job converts an input file into an output file or files. For more information, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  var Job: js.UndefOr[typings.awsSdk.mediaconvertMod.Job] = js.undefined
}
object CreateJobResponse {
  
  @scala.inline
  def apply(): CreateJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobResponse]
  }
  
  @scala.inline
  implicit class CreateJobResponseMutableBuilder[Self <: CreateJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: Job): Self = StObject.set(x, "Job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "Job", js.undefined)
  }
}
