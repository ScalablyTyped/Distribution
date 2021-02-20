package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitiateJobOutput extends StObject {
  
  /**
    * The ID of the job.
    */
  var jobId: js.UndefOr[String] = js.native
  
  /**
    * The path to the location of where the select results are stored.
    */
  var jobOutputPath: js.UndefOr[String] = js.native
  
  /**
    * The relative URI path of the job.
    */
  var location: js.UndefOr[String] = js.native
}
object InitiateJobOutput {
  
  @scala.inline
  def apply(): InitiateJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateJobOutput]
  }
  
  @scala.inline
  implicit class InitiateJobOutputMutableBuilder[Self <: InitiateJobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setJobOutputPath(value: String): Self = StObject.set(x, "jobOutputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobOutputPathUndefined: Self = StObject.set(x, "jobOutputPath", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
