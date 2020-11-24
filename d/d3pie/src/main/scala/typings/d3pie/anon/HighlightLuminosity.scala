package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightLuminosity extends js.Object {
  
  var highlightLuminosity: js.UndefOr[Double] = js.native
  
  var highlightSegmentOnMouseover: js.UndefOr[Boolean] = js.native
  
  var load: js.UndefOr[Effect] = js.native
  
  var pullOutSegmentOnClick: js.UndefOr[Size] = js.native
}
object HighlightLuminosity {
  
  @scala.inline
  def apply(): HighlightLuminosity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightLuminosity]
  }
  
  @scala.inline
  implicit class HighlightLuminosityOps[Self <: HighlightLuminosity] (val x: Self) extends AnyVal {
    
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
    def setHighlightLuminosity(value: Double): Self = this.set("highlightLuminosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightLuminosity: Self = this.set("highlightLuminosity", js.undefined)
    
    @scala.inline
    def setHighlightSegmentOnMouseover(value: Boolean): Self = this.set("highlightSegmentOnMouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightSegmentOnMouseover: Self = this.set("highlightSegmentOnMouseover", js.undefined)
    
    @scala.inline
    def setLoad(value: Effect): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setPullOutSegmentOnClick(value: Size): Self = this.set("pullOutSegmentOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullOutSegmentOnClick: Self = this.set("pullOutSegmentOnClick", js.undefined)
  }
}
