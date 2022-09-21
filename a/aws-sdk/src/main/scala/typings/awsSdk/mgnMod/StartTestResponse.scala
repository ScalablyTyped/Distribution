package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTestResponse extends StObject {
  
  /**
    * Start Test Job response.
    */
  var job: js.UndefOr[Job] = js.undefined
}
object StartTestResponse {
  
  inline def apply(): StartTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTestResponse]
  }
  
  extension [Self <: StartTestResponse](x: Self) {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
