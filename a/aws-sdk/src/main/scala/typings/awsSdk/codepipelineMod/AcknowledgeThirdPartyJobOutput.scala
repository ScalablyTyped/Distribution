package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcknowledgeThirdPartyJobOutput extends StObject {
  
  /**
    * The status information for the third party job, if any.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
}
object AcknowledgeThirdPartyJobOutput {
  
  inline def apply(): AcknowledgeThirdPartyJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcknowledgeThirdPartyJobOutput]
  }
  
  extension [Self <: AcknowledgeThirdPartyJobOutput](x: Self) {
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
