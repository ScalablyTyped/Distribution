package typings.cytoscape.mod.Css

import typings.cytoscape.mod.EdgeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These properties allow for the creation of overlays on top of nodes or edges,
  * and are often used in the :active state.
  * http://js.cytoscape.org/#style/overlay
  */
@js.native
trait Overlay extends js.Object {
  
  /**
    * The colour of the overlay.
    */
  var `overlay-color`: PropertyValueEdge[Colour] = js.native
  
  /**
    * The opacity of the overlay.
    */
  var `overlay-opacity`: PropertyValueEdge[Double] = js.native
  
  /**
    * The area outside of the element within which the overlay is shown.
    */
  var `overlay-padding`: PropertyValueEdge[Double | String] = js.native
}
object Overlay {
  
  @scala.inline
  def apply(
    `overlay-color`: PropertyValueEdge[Colour],
    `overlay-opacity`: PropertyValueEdge[Double],
    `overlay-padding`: PropertyValueEdge[Double | String]
  ): Overlay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("overlay-color")(`overlay-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("overlay-opacity")(`overlay-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("overlay-padding")(`overlay-padding`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
  
  @scala.inline
  implicit class OverlayOps[Self <: Overlay] (val x: Self) extends AnyVal {
    
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
    def `setOverlay-colorFunction1`(value: EdgeSingular => Colour): Self = this.set("overlay-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-color`(value: PropertyValueEdge[Colour]): Self = this.set("overlay-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverlay-opacityFunction1`(value: EdgeSingular => Double): Self = this.set("overlay-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-opacity`(value: PropertyValueEdge[Double]): Self = this.set("overlay-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverlay-paddingFunction1`(value: EdgeSingular => Double | String): Self = this.set("overlay-padding", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-padding`(value: PropertyValueEdge[Double | String]): Self = this.set("overlay-padding", value.asInstanceOf[js.Any])
  }
}
