package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteWorkteamResponse extends StObject {
  
  /**
    * Returns true if the work team was successfully deleted; otherwise, returns false.
    */
  var Success: typings.awsSdk.sagemakerMod.Success = js.native
}
object DeleteWorkteamResponse {
  
  @scala.inline
  def apply(Success: Success): DeleteWorkteamResponse = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkteamResponse]
  }
  
  @scala.inline
  implicit class DeleteWorkteamResponseMutableBuilder[Self <: DeleteWorkteamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
  }
}
