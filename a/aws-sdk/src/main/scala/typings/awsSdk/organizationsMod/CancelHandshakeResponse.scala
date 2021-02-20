package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelHandshakeResponse extends StObject {
  
  /**
    * A structure that contains details about the handshake that you canceled.
    */
  var Handshake: js.UndefOr[typings.awsSdk.organizationsMod.Handshake] = js.native
}
object CancelHandshakeResponse {
  
  @scala.inline
  def apply(): CancelHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelHandshakeResponse]
  }
  
  @scala.inline
  implicit class CancelHandshakeResponseMutableBuilder[Self <: CancelHandshakeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
