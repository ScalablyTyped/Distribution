package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectFromServiceRequest extends StObject {
  
  /**
    * Request to disconnect Source Server from service by Server ID.
    */
  var sourceServerID: SourceServerID
}
object DisconnectFromServiceRequest {
  
  inline def apply(sourceServerID: SourceServerID): DisconnectFromServiceRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectFromServiceRequest]
  }
  
  extension [Self <: DisconnectFromServiceRequest](x: Self) {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
