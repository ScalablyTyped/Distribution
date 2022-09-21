package typings.awsSdk.ivschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRoomRequest extends StObject {
  
  /**
    * Identifier of the room to be deleted. Currently this must be an ARN.
    */
  var identifier: RoomIdentifier
}
object DeleteRoomRequest {
  
  inline def apply(identifier: RoomIdentifier): DeleteRoomRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoomRequest]
  }
  
  extension [Self <: DeleteRoomRequest](x: Self) {
    
    inline def setIdentifier(value: RoomIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
