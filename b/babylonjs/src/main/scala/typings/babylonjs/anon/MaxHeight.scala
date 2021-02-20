package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Color3
import typings.babylonjs.BABYLON.GroundMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxHeight extends StObject {
  
  var alphaFilter: js.UndefOr[Double] = js.native
  
  var colorFilter: js.UndefOr[Color3] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var onReady: js.UndefOr[js.Function1[/* mesh */ GroundMesh, Unit]] = js.native
  
  var subdivisions: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object MaxHeight {
  
  @scala.inline
  def apply(): MaxHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxHeight]
  }
  
  @scala.inline
  implicit class MaxHeightMutableBuilder[Self <: MaxHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaFilter(value: Double): Self = StObject.set(x, "alphaFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaFilterUndefined: Self = StObject.set(x, "alphaFilter", js.undefined)
    
    @scala.inline
    def setColorFilter(value: Color3): Self = StObject.set(x, "colorFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorFilterUndefined: Self = StObject.set(x, "colorFilter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setOnReady(value: /* mesh */ GroundMesh => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
