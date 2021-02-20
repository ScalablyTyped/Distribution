package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInterconnectRequest extends StObject {
  
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId = js.native
}
object DeleteInterconnectRequest {
  
  @scala.inline
  def apply(interconnectId: InterconnectId): DeleteInterconnectRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInterconnectRequest]
  }
  
  @scala.inline
  implicit class DeleteInterconnectRequestMutableBuilder[Self <: DeleteInterconnectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterconnectId(value: InterconnectId): Self = StObject.set(x, "interconnectId", value.asInstanceOf[js.Any])
  }
}
