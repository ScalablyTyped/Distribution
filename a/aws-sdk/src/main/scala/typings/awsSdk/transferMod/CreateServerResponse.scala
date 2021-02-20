package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateServerResponse extends StObject {
  
  /**
    * The service-assigned ID of the server that is created.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
}
object CreateServerResponse {
  
  @scala.inline
  def apply(ServerId: ServerId): CreateServerResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServerResponse]
  }
  
  @scala.inline
  implicit class CreateServerResponseMutableBuilder[Self <: CreateServerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
