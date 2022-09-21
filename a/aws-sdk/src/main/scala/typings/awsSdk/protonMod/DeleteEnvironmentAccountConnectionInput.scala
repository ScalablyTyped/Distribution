package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentAccountConnectionInput extends StObject {
  
  /**
    * The ID of the environment account connection to delete.
    */
  var id: EnvironmentAccountConnectionId
}
object DeleteEnvironmentAccountConnectionInput {
  
  inline def apply(id: EnvironmentAccountConnectionId): DeleteEnvironmentAccountConnectionInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentAccountConnectionInput]
  }
  
  extension [Self <: DeleteEnvironmentAccountConnectionInput](x: Self) {
    
    inline def setId(value: EnvironmentAccountConnectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
