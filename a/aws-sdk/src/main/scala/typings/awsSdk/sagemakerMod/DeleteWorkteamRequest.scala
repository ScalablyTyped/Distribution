package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkteamRequest extends StObject {
  
  /**
    * The name of the work team to delete.
    */
  var WorkteamName: typings.awsSdk.sagemakerMod.WorkteamName
}
object DeleteWorkteamRequest {
  
  @scala.inline
  def apply(WorkteamName: WorkteamName): DeleteWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkteamRequest]
  }
  
  @scala.inline
  implicit class DeleteWorkteamRequestMutableBuilder[Self <: DeleteWorkteamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkteamName(value: WorkteamName): Self = StObject.set(x, "WorkteamName", value.asInstanceOf[js.Any])
  }
}
