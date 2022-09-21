package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetsForPolicyResponse extends StObject {
  
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
  
  /**
    * The policy targets.
    */
  var targets: js.UndefOr[PolicyTargets] = js.undefined
}
object ListTargetsForPolicyResponse {
  
  inline def apply(): ListTargetsForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsForPolicyResponse]
  }
  
  extension [Self <: ListTargetsForPolicyResponse](x: Self) {
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
    
    inline def setTargets(value: PolicyTargets): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: PolicyTarget*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
