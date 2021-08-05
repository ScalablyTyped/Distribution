package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopProjectVersionResponse extends StObject {
  
  /**
    * The current status of the stop operation. 
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.undefined
}
object StopProjectVersionResponse {
  
  inline def apply(): StopProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopProjectVersionResponse]
  }
  
  extension [Self <: StopProjectVersionResponse](x: Self) {
    
    inline def setStatus(value: ProjectVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
