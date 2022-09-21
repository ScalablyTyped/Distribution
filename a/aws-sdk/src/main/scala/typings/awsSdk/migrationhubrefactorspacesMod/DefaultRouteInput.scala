package typings.awsSdk.migrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultRouteInput extends StObject {
  
  /**
    * If set to ACTIVE, traffic is forwarded to this route’s service after the route is created. 
    */
  var ActivationState: js.UndefOr[RouteActivationState] = js.undefined
}
object DefaultRouteInput {
  
  inline def apply(): DefaultRouteInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRouteInput]
  }
  
  extension [Self <: DefaultRouteInput](x: Self) {
    
    inline def setActivationState(value: RouteActivationState): Self = StObject.set(x, "ActivationState", value.asInstanceOf[js.Any])
    
    inline def setActivationStateUndefined: Self = StObject.set(x, "ActivationState", js.undefined)
  }
}
