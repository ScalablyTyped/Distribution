package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelAnchorNodeName extends js.Object {
  
  var labelAnchorNodeName: String = js.native
  
  var rootNodeName: String = js.native
  
  var touchPointNodeName: String = js.native
}
object LabelAnchorNodeName {
  
  @scala.inline
  def apply(labelAnchorNodeName: String, rootNodeName: String, touchPointNodeName: String): LabelAnchorNodeName = {
    val __obj = js.Dynamic.literal(labelAnchorNodeName = labelAnchorNodeName.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], touchPointNodeName = touchPointNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelAnchorNodeName]
  }
  
  @scala.inline
  implicit class LabelAnchorNodeNameOps[Self <: LabelAnchorNodeName] (val x: Self) extends AnyVal {
    
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
    def setLabelAnchorNodeName(value: String): Self = this.set("labelAnchorNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNodeName(value: String): Self = this.set("rootNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchPointNodeName(value: String): Self = this.set("touchPointNodeName", value.asInstanceOf[js.Any])
  }
}
