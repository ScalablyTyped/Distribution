package typings.baseui.layerMod

import typings.baseui.anon.Arrow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopperDataObject extends js.Object {
  
  var offsets: Arrow = js.native
  
  var placement: String = js.native
}
object PopperDataObject {
  
  @scala.inline
  def apply(offsets: Arrow, placement: String): PopperDataObject = {
    val __obj = js.Dynamic.literal(offsets = offsets.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperDataObject]
  }
  
  @scala.inline
  implicit class PopperDataObjectOps[Self <: PopperDataObject] (val x: Self) extends AnyVal {
    
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
    def setOffsets(value: Arrow): Self = this.set("offsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
  }
}
