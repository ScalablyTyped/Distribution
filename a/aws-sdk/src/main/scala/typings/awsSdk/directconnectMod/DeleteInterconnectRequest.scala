package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInterconnectRequest extends StObject {
  
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId
}
object DeleteInterconnectRequest {
  
  inline def apply(interconnectId: InterconnectId): DeleteInterconnectRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInterconnectRequest]
  }
  
  extension [Self <: DeleteInterconnectRequest](x: Self) {
    
    inline def setInterconnectId(value: InterconnectId): Self = StObject.set(x, "interconnectId", value.asInstanceOf[js.Any])
  }
}
