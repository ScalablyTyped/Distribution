package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadJobResponse extends StObject {
  
  /**
    * A section of the response body that provides information about the job.
    */
  var Job: js.UndefOr[typings.awsSdk.elastictranscoderMod.Job] = js.undefined
}
object ReadJobResponse {
  
  @scala.inline
  def apply(): ReadJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadJobResponse]
  }
  
  @scala.inline
  implicit class ReadJobResponseMutableBuilder[Self <: ReadJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: Job): Self = StObject.set(x, "Job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "Job", js.undefined)
  }
}
