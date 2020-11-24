package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Multiplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSNodeMultiplier extends DSNode {
  
  var comma: Boolean = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var term: DSNodeMultiplied = js.native
  
  var `type`: Multiplier = js.native
}
object DSNodeMultiplier {
  
  @scala.inline
  def apply(comma: Boolean, max: Double, min: Double, term: DSNodeMultiplied, `type`: Multiplier): DSNodeMultiplier = {
    val __obj = js.Dynamic.literal(comma = comma.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeMultiplier]
  }
  
  @scala.inline
  implicit class DSNodeMultiplierOps[Self <: DSNodeMultiplier] (val x: Self) extends AnyVal {
    
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
    def setComma(value: Boolean): Self = this.set("comma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerm(value: DSNodeMultiplied): Self = this.set("term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Multiplier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
