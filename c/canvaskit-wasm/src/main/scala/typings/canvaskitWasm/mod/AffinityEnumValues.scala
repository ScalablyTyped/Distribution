package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AffinityEnumValues extends EmbindEnum {
  
  var Downstream: Affinity = js.native
  
  var Upstream: Affinity = js.native
}
object AffinityEnumValues {
  
  @scala.inline
  def apply(Downstream: Affinity, Upstream: Affinity, values: js.Array[Double]): AffinityEnumValues = {
    val __obj = js.Dynamic.literal(Downstream = Downstream.asInstanceOf[js.Any], Upstream = Upstream.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffinityEnumValues]
  }
  
  @scala.inline
  implicit class AffinityEnumValuesMutableBuilder[Self <: AffinityEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownstream(value: Affinity): Self = StObject.set(x, "Downstream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpstream(value: Affinity): Self = StObject.set(x, "Upstream", value.asInstanceOf[js.Any])
  }
}
