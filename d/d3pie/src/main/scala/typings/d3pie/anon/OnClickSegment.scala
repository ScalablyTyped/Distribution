package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnClickSegment extends js.Object {
  
  var onClickSegment: js.UndefOr[js.Function] = js.native
  
  var onMouseoutSegment: js.UndefOr[js.Function] = js.native
  
  var onMouseoverSegment: js.UndefOr[js.Function] = js.native
  
  var onload: js.UndefOr[js.Function] = js.native
}
object OnClickSegment {
  
  @scala.inline
  def apply(): OnClickSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnClickSegment]
  }
  
  @scala.inline
  implicit class OnClickSegmentOps[Self <: OnClickSegment] (val x: Self) extends AnyVal {
    
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
    def setOnClickSegment(value: js.Function): Self = this.set("onClickSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClickSegment: Self = this.set("onClickSegment", js.undefined)
    
    @scala.inline
    def setOnMouseoutSegment(value: js.Function): Self = this.set("onMouseoutSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseoutSegment: Self = this.set("onMouseoutSegment", js.undefined)
    
    @scala.inline
    def setOnMouseoverSegment(value: js.Function): Self = this.set("onMouseoverSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseoverSegment: Self = this.set("onMouseoverSegment", js.undefined)
    
    @scala.inline
    def setOnload(value: js.Function): Self = this.set("onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
  }
}
