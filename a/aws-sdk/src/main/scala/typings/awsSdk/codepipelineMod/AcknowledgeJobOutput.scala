package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcknowledgeJobOutput extends StObject {
  
  /**
    * Whether the job worker has received the specified job.
    */
  var status: js.UndefOr[JobStatus] = js.native
}
object AcknowledgeJobOutput {
  
  @scala.inline
  def apply(): AcknowledgeJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcknowledgeJobOutput]
  }
  
  @scala.inline
  implicit class AcknowledgeJobOutputMutableBuilder[Self <: AcknowledgeJobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
