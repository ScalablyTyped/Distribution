package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrafficMirrorFilterResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the Traffic Mirror filter.
    */
  var TrafficMirrorFilter: js.UndefOr[typings.awsSdk.ec2Mod.TrafficMirrorFilter] = js.undefined
}
object CreateTrafficMirrorFilterResult {
  
  inline def apply(): CreateTrafficMirrorFilterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrafficMirrorFilterResult]
  }
  
  extension [Self <: CreateTrafficMirrorFilterResult](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setTrafficMirrorFilter(value: TrafficMirrorFilter): Self = StObject.set(x, "TrafficMirrorFilter", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorFilterUndefined: Self = StObject.set(x, "TrafficMirrorFilter", js.undefined)
  }
}
