package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementAnimateOptionRen extends ElementAnimateOptionsBase {
  
  /** A rendered position to which the elements will be animated. */
  var renderedPosition: js.UndefOr[Position] = js.native
}
object ElementAnimateOptionRen {
  
  @scala.inline
  def apply(): ElementAnimateOptionRen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementAnimateOptionRen]
  }
  
  @scala.inline
  implicit class ElementAnimateOptionRenOps[Self <: ElementAnimateOptionRen] (val x: Self) extends AnyVal {
    
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
    def setRenderedPosition(value: Position): Self = this.set("renderedPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderedPosition: Self = this.set("renderedPosition", js.undefined)
  }
}
