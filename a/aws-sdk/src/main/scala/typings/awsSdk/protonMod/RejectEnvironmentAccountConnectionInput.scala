package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectEnvironmentAccountConnectionInput extends StObject {
  
  /**
    * The ID of the environment account connection to reject.
    */
  var id: EnvironmentAccountConnectionId
}
object RejectEnvironmentAccountConnectionInput {
  
  inline def apply(id: EnvironmentAccountConnectionId): RejectEnvironmentAccountConnectionInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectEnvironmentAccountConnectionInput]
  }
  
  extension [Self <: RejectEnvironmentAccountConnectionInput](x: Self) {
    
    inline def setId(value: EnvironmentAccountConnectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
