package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkteamResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
    */
  var WorkteamArn: js.UndefOr[typings.awsSdk.sagemakerMod.WorkteamArn] = js.undefined
}
object CreateWorkteamResponse {
  
  @scala.inline
  def apply(): CreateWorkteamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkteamResponse]
  }
  
  @scala.inline
  implicit class CreateWorkteamResponseMutableBuilder[Self <: CreateWorkteamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkteamArn(value: WorkteamArn): Self = StObject.set(x, "WorkteamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkteamArnUndefined: Self = StObject.set(x, "WorkteamArn", js.undefined)
  }
}
