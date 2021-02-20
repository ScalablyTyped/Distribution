package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMaintenanceResponse extends StObject {
  
  /**
    * Contains the response to a StartMaintenance request. 
    */
  var Server: js.UndefOr[typings.awsSdk.opsworkscmMod.Server] = js.native
}
object StartMaintenanceResponse {
  
  @scala.inline
  def apply(): StartMaintenanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMaintenanceResponse]
  }
  
  @scala.inline
  implicit class StartMaintenanceResponseMutableBuilder[Self <: StartMaintenanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: Server): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
  }
}
