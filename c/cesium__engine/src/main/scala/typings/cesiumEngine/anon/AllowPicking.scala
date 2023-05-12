package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.ClassificationType
import typings.cesiumEngine.mod.GeometryInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowPicking extends StObject {
  
  var allowPicking: js.UndefOr[Boolean] = js.undefined
  
  var appearance: js.UndefOr[typings.cesiumEngine.mod.Appearance] = js.undefined
  
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  
  var classificationType: js.UndefOr[ClassificationType] = js.undefined
  
  var compressVertices: js.UndefOr[Boolean] = js.undefined
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  
  var debugShowShadowVolume: js.UndefOr[Boolean] = js.undefined
  
  var geometryInstances: js.UndefOr[js.Array[Any] | GeometryInstance] = js.undefined
  
  var interleave: js.UndefOr[Boolean] = js.undefined
  
  var releaseGeometryInstances: js.UndefOr[Boolean] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var vertexCacheOptimize: js.UndefOr[Boolean] = js.undefined
}
object AllowPicking {
  
  inline def apply(): AllowPicking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowPicking]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowPicking] (val x: Self) extends AnyVal {
    
    inline def setAllowPicking(value: Boolean): Self = StObject.set(x, "allowPicking", value.asInstanceOf[js.Any])
    
    inline def setAllowPickingUndefined: Self = StObject.set(x, "allowPicking", js.undefined)
    
    inline def setAppearance(value: typings.cesiumEngine.mod.Appearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    inline def setAsynchronous(value: Boolean): Self = StObject.set(x, "asynchronous", value.asInstanceOf[js.Any])
    
    inline def setAsynchronousUndefined: Self = StObject.set(x, "asynchronous", js.undefined)
    
    inline def setClassificationType(value: ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    inline def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
    
    inline def setCompressVertices(value: Boolean): Self = StObject.set(x, "compressVertices", value.asInstanceOf[js.Any])
    
    inline def setCompressVerticesUndefined: Self = StObject.set(x, "compressVertices", js.undefined)
    
    inline def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    inline def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    inline def setDebugShowShadowVolume(value: Boolean): Self = StObject.set(x, "debugShowShadowVolume", value.asInstanceOf[js.Any])
    
    inline def setDebugShowShadowVolumeUndefined: Self = StObject.set(x, "debugShowShadowVolume", js.undefined)
    
    inline def setGeometryInstances(value: js.Array[Any] | GeometryInstance): Self = StObject.set(x, "geometryInstances", value.asInstanceOf[js.Any])
    
    inline def setGeometryInstancesUndefined: Self = StObject.set(x, "geometryInstances", js.undefined)
    
    inline def setGeometryInstancesVarargs(value: Any*): Self = StObject.set(x, "geometryInstances", js.Array(value*))
    
    inline def setInterleave(value: Boolean): Self = StObject.set(x, "interleave", value.asInstanceOf[js.Any])
    
    inline def setInterleaveUndefined: Self = StObject.set(x, "interleave", js.undefined)
    
    inline def setReleaseGeometryInstances(value: Boolean): Self = StObject.set(x, "releaseGeometryInstances", value.asInstanceOf[js.Any])
    
    inline def setReleaseGeometryInstancesUndefined: Self = StObject.set(x, "releaseGeometryInstances", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setVertexCacheOptimize(value: Boolean): Self = StObject.set(x, "vertexCacheOptimize", value.asInstanceOf[js.Any])
    
    inline def setVertexCacheOptimizeUndefined: Self = StObject.set(x, "vertexCacheOptimize", js.undefined)
  }
}
