package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartProjectVersionResponse extends StObject {
  
  /**
    * The current running status of the model. 
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.undefined
}
object StartProjectVersionResponse {
  
  inline def apply(): StartProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartProjectVersionResponse]
  }
  
  extension [Self <: StartProjectVersionResponse](x: Self) {
    
    inline def setStatus(value: ProjectVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
