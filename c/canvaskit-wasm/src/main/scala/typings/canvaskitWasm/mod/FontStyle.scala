package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontStyle extends js.Object {
  
  var slant: js.UndefOr[FontSlant] = js.native
  
  var weight: js.UndefOr[FontWeight] = js.native
  
  var width: js.UndefOr[FontWidth] = js.native
}
object FontStyle {
  
  @scala.inline
  def apply(): FontStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyle]
  }
  
  @scala.inline
  implicit class FontStyleOps[Self <: FontStyle] (val x: Self) extends AnyVal {
    
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
    def setSlant(value: FontSlant): Self = this.set("slant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlant: Self = this.set("slant", js.undefined)
    
    @scala.inline
    def setWeight(value: FontWeight): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    
    @scala.inline
    def setWidth(value: FontWidth): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
