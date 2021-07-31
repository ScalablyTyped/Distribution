package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServerResponse extends StObject {
  
  /**
    * Contains the response to a UpdateServer request. 
    */
  var Server: js.UndefOr[typings.awsSdk.opsworkscmMod.Server] = js.undefined
}
object UpdateServerResponse {
  
  @scala.inline
  def apply(): UpdateServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServerResponse]
  }
  
  @scala.inline
  implicit class UpdateServerResponseMutableBuilder[Self <: UpdateServerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: Server): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
  }
}
