package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Far extends StObject {
  
  var aspectRatio: Double = js.native
  
  var far: js.UndefOr[Double] = js.native
  
  var fov: Double = js.native
  
  var near: js.UndefOr[Double] = js.native
  
  var xOffset: js.UndefOr[Double] = js.native
  
  var yOffset: js.UndefOr[Double] = js.native
}
object Far {
  
  @scala.inline
  def apply(aspectRatio: Double, fov: Double): Far = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], fov = fov.asInstanceOf[js.Any])
    __obj.asInstanceOf[Far]
  }
  
  @scala.inline
  implicit class FarMutableBuilder[Self <: Far] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarUndefined: Self = StObject.set(x, "far", js.undefined)
    
    @scala.inline
    def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearUndefined: Self = StObject.set(x, "near", js.undefined)
    
    @scala.inline
    def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
    
    @scala.inline
    def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
  }
}
