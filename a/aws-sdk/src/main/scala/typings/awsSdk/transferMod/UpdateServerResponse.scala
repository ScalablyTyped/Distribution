package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServerResponse extends StObject {
  
  /**
    * A system-assigned unique identifier for a server that the user account is assigned to.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
}
object UpdateServerResponse {
  
  @scala.inline
  def apply(ServerId: ServerId): UpdateServerResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerResponse]
  }
  
  @scala.inline
  implicit class UpdateServerResponseMutableBuilder[Self <: UpdateServerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
