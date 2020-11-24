package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeDefinition extends ElementDefinition {
  
  @JSName("data")
  var data_EdgeDefinition: EdgeDataDefinition = js.native
}
object EdgeDefinition {
  
  @scala.inline
  def apply(data: EdgeDataDefinition): EdgeDefinition = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeDefinition]
  }
  
  @scala.inline
  implicit class EdgeDefinitionOps[Self <: EdgeDefinition] (val x: Self) extends AnyVal {
    
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
    def setData(value: EdgeDataDefinition): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
