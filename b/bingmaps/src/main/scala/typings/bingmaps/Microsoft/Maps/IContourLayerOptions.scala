package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The contour layer options
  */
@js.native
trait IContourLayerOptions extends js.Object {
  
  /** A callback function which defines the color of the contour line fill. */
  var colorCallback: js.UndefOr[js.Function1[/* contourValue */ Double | String, String | Color]] = js.native
  
  /** The polygon options that apply to all contour lines of this layer */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.native
  
  /** Whether the layer is visible */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** The z-index of this layer */
  var zIndex: js.UndefOr[Double] = js.native
}
object IContourLayerOptions {
  
  @scala.inline
  def apply(): IContourLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContourLayerOptions]
  }
  
  @scala.inline
  implicit class IContourLayerOptionsOps[Self <: IContourLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setColorCallback(value: /* contourValue */ Double | String => String | Color): Self = this.set("colorCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColorCallback: Self = this.set("colorCallback", js.undefined)
    
    @scala.inline
    def setPolygonOptions(value: IPolygonOptions): Self = this.set("polygonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonOptions: Self = this.set("polygonOptions", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
