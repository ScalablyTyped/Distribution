package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrafficMirrorFilterResult extends StObject {
  
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.undefined
}
object DeleteTrafficMirrorFilterResult {
  
  inline def apply(): DeleteTrafficMirrorFilterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrafficMirrorFilterResult]
  }
  
  extension [Self <: DeleteTrafficMirrorFilterResult](x: Self) {
    
    inline def setTrafficMirrorFilterId(value: String): Self = StObject.set(x, "TrafficMirrorFilterId", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorFilterIdUndefined: Self = StObject.set(x, "TrafficMirrorFilterId", js.undefined)
  }
}
