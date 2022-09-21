package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteComponentTypeResponse extends StObject {
  
  /**
    * The current state of the component type to be deleted.
    */
  var state: State
}
object DeleteComponentTypeResponse {
  
  inline def apply(state: State): DeleteComponentTypeResponse = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteComponentTypeResponse]
  }
  
  extension [Self <: DeleteComponentTypeResponse](x: Self) {
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
