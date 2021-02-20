package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tube extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var p: js.UndefOr[Double] = js.native
  
  var q: js.UndefOr[Double] = js.native
  
  var radialSegments: js.UndefOr[Double] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var tube: js.UndefOr[Double] = js.native
  
  var tubularSegments: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
}
object Tube {
  
  @scala.inline
  def apply(): Tube = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tube]
  }
  
  @scala.inline
  implicit class TubeMutableBuilder[Self <: Tube] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    @scala.inline
    def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    @scala.inline
    def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setRadialSegments(value: Double): Self = StObject.set(x, "radialSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialSegmentsUndefined: Self = StObject.set(x, "radialSegments", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    @scala.inline
    def setTube(value: Double): Self = StObject.set(x, "tube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTubeUndefined: Self = StObject.set(x, "tube", js.undefined)
    
    @scala.inline
    def setTubularSegments(value: Double): Self = StObject.set(x, "tubularSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTubularSegmentsUndefined: Self = StObject.set(x, "tubularSegments", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
