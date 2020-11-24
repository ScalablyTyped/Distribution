package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PressedNodeName extends js.Object {
  
  var pressedNodeName: String = js.native
  
  var unpressedNodeName: String = js.native
  
  var valueNodeName: String = js.native
}
object PressedNodeName {
  
  @scala.inline
  def apply(pressedNodeName: String, unpressedNodeName: String, valueNodeName: String): PressedNodeName = {
    val __obj = js.Dynamic.literal(pressedNodeName = pressedNodeName.asInstanceOf[js.Any], unpressedNodeName = unpressedNodeName.asInstanceOf[js.Any], valueNodeName = valueNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressedNodeName]
  }
  
  @scala.inline
  implicit class PressedNodeNameOps[Self <: PressedNodeName] (val x: Self) extends AnyVal {
    
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
    def setPressedNodeName(value: String): Self = this.set("pressedNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpressedNodeName(value: String): Self = this.set("unpressedNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNodeName(value: String): Self = this.set("valueNodeName", value.asInstanceOf[js.Any])
  }
}
