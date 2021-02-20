package typings.cesium.anon

import typings.cesium.mod.GeometryInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugShowShadowVolume extends StObject {
  
  var allowPicking: js.UndefOr[Boolean] = js.native
  
  var appearance: js.UndefOr[typings.cesium.mod.Appearance] = js.native
  
  var asynchronous: js.UndefOr[Boolean] = js.native
  
  var classificationType: js.UndefOr[typings.cesium.mod.ClassificationType] = js.native
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  
  var debugShowShadowVolume: js.UndefOr[Boolean] = js.native
  
  var geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.native
  
  var interleave: js.UndefOr[Boolean] = js.native
  
  var releaseGeometryInstances: js.UndefOr[Boolean] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object DebugShowShadowVolume {
  
  @scala.inline
  def apply(): DebugShowShadowVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugShowShadowVolume]
  }
  
  @scala.inline
  implicit class DebugShowShadowVolumeMutableBuilder[Self <: DebugShowShadowVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPicking(value: Boolean): Self = StObject.set(x, "allowPicking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPickingUndefined: Self = StObject.set(x, "allowPicking", js.undefined)
    
    @scala.inline
    def setAppearance(value: typings.cesium.mod.Appearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    @scala.inline
    def setAsynchronous(value: Boolean): Self = StObject.set(x, "asynchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsynchronousUndefined: Self = StObject.set(x, "asynchronous", js.undefined)
    
    @scala.inline
    def setClassificationType(value: typings.cesium.mod.ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
    
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    @scala.inline
    def setDebugShowShadowVolume(value: Boolean): Self = StObject.set(x, "debugShowShadowVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowShadowVolumeUndefined: Self = StObject.set(x, "debugShowShadowVolume", js.undefined)
    
    @scala.inline
    def setGeometryInstances(value: js.Array[GeometryInstance] | GeometryInstance): Self = StObject.set(x, "geometryInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryInstancesUndefined: Self = StObject.set(x, "geometryInstances", js.undefined)
    
    @scala.inline
    def setGeometryInstancesVarargs(value: GeometryInstance*): Self = StObject.set(x, "geometryInstances", js.Array(value :_*))
    
    @scala.inline
    def setInterleave(value: Boolean): Self = StObject.set(x, "interleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterleaveUndefined: Self = StObject.set(x, "interleave", js.undefined)
    
    @scala.inline
    def setReleaseGeometryInstances(value: Boolean): Self = StObject.set(x, "releaseGeometryInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseGeometryInstancesUndefined: Self = StObject.set(x, "releaseGeometryInstances", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
