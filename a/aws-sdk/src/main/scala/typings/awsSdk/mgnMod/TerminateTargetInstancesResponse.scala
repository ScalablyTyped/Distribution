package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateTargetInstancesResponse extends StObject {
  
  /**
    * Terminate Target instance Job response.
    */
  var job: js.UndefOr[Job] = js.undefined
}
object TerminateTargetInstancesResponse {
  
  inline def apply(): TerminateTargetInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateTargetInstancesResponse]
  }
  
  extension [Self <: TerminateTargetInstancesResponse](x: Self) {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
