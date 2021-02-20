package typings.cesium.anon

import typings.cesium.mod.ClippingPlane
import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeColor extends StObject {
  
  var edgeColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  
  var edgeWidth: js.UndefOr[Double] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  
  var planes: js.UndefOr[js.Array[ClippingPlane]] = js.native
  
  var unionClippingRegions: js.UndefOr[Boolean] = js.native
}
object EdgeColor {
  
  @scala.inline
  def apply(): EdgeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeColor]
  }
  
  @scala.inline
  implicit class EdgeColorMutableBuilder[Self <: EdgeColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdgeColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "edgeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeColorUndefined: Self = StObject.set(x, "edgeColor", js.undefined)
    
    @scala.inline
    def setEdgeWidth(value: Double): Self = StObject.set(x, "edgeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeWidthUndefined: Self = StObject.set(x, "edgeWidth", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    @scala.inline
    def setPlanes(value: js.Array[ClippingPlane]): Self = StObject.set(x, "planes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanesUndefined: Self = StObject.set(x, "planes", js.undefined)
    
    @scala.inline
    def setPlanesVarargs(value: ClippingPlane*): Self = StObject.set(x, "planes", js.Array(value :_*))
    
    @scala.inline
    def setUnionClippingRegions(value: Boolean): Self = StObject.set(x, "unionClippingRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnionClippingRegionsUndefined: Self = StObject.set(x, "unionClippingRegions", js.undefined)
  }
}
