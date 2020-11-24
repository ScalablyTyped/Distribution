package typings.canvaskitWasm.mod

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
  implicit class AffinityEnumValuesOps[Self <: AffinityEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDownstream(value: Affinity): Self = this.set("Downstream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpstream(value: Affinity): Self = this.set("Upstream", value.asInstanceOf[js.Any])
  }
}
