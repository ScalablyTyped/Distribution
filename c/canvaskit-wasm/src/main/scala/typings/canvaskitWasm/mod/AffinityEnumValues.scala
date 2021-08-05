package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffinityEnumValues
  extends StObject
     with EmbindEnum {
  
  var Downstream: Affinity
  
  var Upstream: Affinity
}
object AffinityEnumValues {
  
  inline def apply(Downstream: Affinity, Upstream: Affinity, values: js.Array[Double]): AffinityEnumValues = {
    val __obj = js.Dynamic.literal(Downstream = Downstream.asInstanceOf[js.Any], Upstream = Upstream.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffinityEnumValues]
  }
  
  extension [Self <: AffinityEnumValues](x: Self) {
    
    inline def setDownstream(value: Affinity): Self = StObject.set(x, "Downstream", value.asInstanceOf[js.Any])
    
    inline def setUpstream(value: Affinity): Self = StObject.set(x, "Upstream", value.asInstanceOf[js.Any])
  }
}
