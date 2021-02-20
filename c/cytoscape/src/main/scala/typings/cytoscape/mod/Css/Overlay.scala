package typings.cytoscape.mod.Css

import typings.cytoscape.mod.EdgeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These properties allow for the creation of overlays on top of nodes or edges,
  * and are often used in the :active state.
  * http://js.cytoscape.org/#style/overlay
  */
@js.native
trait Overlay extends StObject {
  
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
  implicit class OverlayMutableBuilder[Self <: Overlay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setOverlay-color`(value: PropertyValueEdge[Colour]): Self = StObject.set(x, "overlay-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverlay-colorFunction1`(value: EdgeSingular => Colour): Self = StObject.set(x, "overlay-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-opacity`(value: PropertyValueEdge[Double]): Self = StObject.set(x, "overlay-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverlay-opacityFunction1`(value: EdgeSingular => Double): Self = StObject.set(x, "overlay-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-padding`(value: PropertyValueEdge[Double | String]): Self = StObject.set(x, "overlay-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverlay-paddingFunction1`(value: EdgeSingular => Double | String): Self = StObject.set(x, "overlay-padding", js.Any.fromFunction1(value))
  }
}
