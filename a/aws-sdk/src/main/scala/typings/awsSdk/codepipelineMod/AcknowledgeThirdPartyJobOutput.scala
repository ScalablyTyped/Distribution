package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcknowledgeThirdPartyJobOutput extends StObject {
  
  /**
    * The status information for the third party job, if any.
    */
  var status: js.UndefOr[JobStatus] = js.native
}
object AcknowledgeThirdPartyJobOutput {
  
  @scala.inline
  def apply(): AcknowledgeThirdPartyJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcknowledgeThirdPartyJobOutput]
  }
  
  @scala.inline
  implicit class AcknowledgeThirdPartyJobOutputMutableBuilder[Self <: AcknowledgeThirdPartyJobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
