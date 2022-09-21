package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEntityResponse extends StObject {
  
  /**
    * The current state of the deleted entity.
    */
  var state: State
}
object DeleteEntityResponse {
  
  inline def apply(state: State): DeleteEntityResponse = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEntityResponse]
  }
  
  extension [Self <: DeleteEntityResponse](x: Self) {
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
