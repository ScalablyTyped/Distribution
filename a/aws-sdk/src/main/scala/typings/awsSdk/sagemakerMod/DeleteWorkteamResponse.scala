package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkteamResponse extends StObject {
  
  /**
    * Returns true if the work team was successfully deleted; otherwise, returns false.
    */
  var Success: typings.awsSdk.sagemakerMod.Success
}
object DeleteWorkteamResponse {
  
  inline def apply(Success: Success): DeleteWorkteamResponse = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkteamResponse]
  }
  
  extension [Self <: DeleteWorkteamResponse](x: Self) {
    
    inline def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
  }
}
