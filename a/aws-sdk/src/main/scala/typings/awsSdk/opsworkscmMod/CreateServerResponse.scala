package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServerResponse extends StObject {
  
  /**
    * The server that is created by the request. 
    */
  var Server: js.UndefOr[typings.awsSdk.opsworkscmMod.Server] = js.undefined
}
object CreateServerResponse {
  
  @scala.inline
  def apply(): CreateServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServerResponse]
  }
  
  @scala.inline
  implicit class CreateServerResponseMutableBuilder[Self <: CreateServerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: Server): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
  }
}
