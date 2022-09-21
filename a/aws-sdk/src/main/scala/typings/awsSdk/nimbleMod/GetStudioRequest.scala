package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStudioRequest extends StObject {
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetStudioRequest {
  
  inline def apply(studioId: String): GetStudioRequest = {
    val __obj = js.Dynamic.literal(studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStudioRequest]
  }
  
  extension [Self <: GetStudioRequest](x: Self) {
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
