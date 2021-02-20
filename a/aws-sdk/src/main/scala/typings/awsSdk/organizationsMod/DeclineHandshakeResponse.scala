package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclineHandshakeResponse extends StObject {
  
  /**
    * A structure that contains details about the declined handshake. The state is updated to show the value DECLINED.
    */
  var Handshake: js.UndefOr[typings.awsSdk.organizationsMod.Handshake] = js.native
}
object DeclineHandshakeResponse {
  
  @scala.inline
  def apply(): DeclineHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclineHandshakeResponse]
  }
  
  @scala.inline
  implicit class DeclineHandshakeResponseMutableBuilder[Self <: DeclineHandshakeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
