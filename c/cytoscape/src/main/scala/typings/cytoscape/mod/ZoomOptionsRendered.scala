package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomOptionsRendered extends js.Object {
  
  /** The rendered position about which to zoom. */
  var renderedPosition: Position = js.native
}
object ZoomOptionsRendered {
  
  @scala.inline
  def apply(renderedPosition: Position): ZoomOptionsRendered = {
    val __obj = js.Dynamic.literal(renderedPosition = renderedPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptionsRendered]
  }
  
  @scala.inline
  implicit class ZoomOptionsRenderedOps[Self <: ZoomOptionsRendered] (val x: Self) extends AnyVal {
    
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
  }
}
