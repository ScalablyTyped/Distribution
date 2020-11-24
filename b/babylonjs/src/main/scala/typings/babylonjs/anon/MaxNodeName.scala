package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxNodeName extends js.Object {
  
  var maxNodeName: String = js.native
  
  var minNodeName: String = js.native
  
  var valueNodeName: String = js.native
}
object MaxNodeName {
  
  @scala.inline
  def apply(maxNodeName: String, minNodeName: String, valueNodeName: String): MaxNodeName = {
    val __obj = js.Dynamic.literal(maxNodeName = maxNodeName.asInstanceOf[js.Any], minNodeName = minNodeName.asInstanceOf[js.Any], valueNodeName = valueNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxNodeName]
  }
  
  @scala.inline
  implicit class MaxNodeNameOps[Self <: MaxNodeName] (val x: Self) extends AnyVal {
    
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
    def setMaxNodeName(value: String): Self = this.set("maxNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNodeName(value: String): Self = this.set("minNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNodeName(value: String): Self = this.set("valueNodeName", value.asInstanceOf[js.Any])
  }
}
