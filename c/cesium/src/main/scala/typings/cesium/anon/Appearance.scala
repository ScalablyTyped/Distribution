package typings.cesium.anon

import typings.cesium.mod.GeometryInstance
import typings.cesium.mod.Matrix4
import typings.cesium.mod.ShadowMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appearance extends StObject {
  
  var allowPicking: js.UndefOr[Boolean] = js.undefined
  
  var appearance: js.UndefOr[typings.cesium.mod.Appearance] = js.undefined
  
  var asynchronous: js.UndefOr[Boolean] = js.undefined
  
  var compressVertices: js.UndefOr[Boolean] = js.undefined
  
  var cull: js.UndefOr[Boolean] = js.undefined
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  
  var geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.undefined
  
  var interleave: js.UndefOr[Boolean] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  
  var releaseGeometryInstances: js.UndefOr[Boolean] = js.undefined
  
  var shadows: js.UndefOr[ShadowMode] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var vertexCacheOptimize: js.UndefOr[Boolean] = js.undefined
}
object Appearance {
  
  inline def apply(): Appearance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Appearance]
  }
  
  extension [Self <: Appearance](x: Self) {
    
    inline def setAllowPicking(value: Boolean): Self = StObject.set(x, "allowPicking", value.asInstanceOf[js.Any])
    
    inline def setAllowPickingUndefined: Self = StObject.set(x, "allowPicking", js.undefined)
    
    inline def setAppearance(value: typings.cesium.mod.Appearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    inline def setAsynchronous(value: Boolean): Self = StObject.set(x, "asynchronous", value.asInstanceOf[js.Any])
    
    inline def setAsynchronousUndefined: Self = StObject.set(x, "asynchronous", js.undefined)
    
    inline def setCompressVertices(value: Boolean): Self = StObject.set(x, "compressVertices", value.asInstanceOf[js.Any])
    
    inline def setCompressVerticesUndefined: Self = StObject.set(x, "compressVertices", js.undefined)
    
    inline def setCull(value: Boolean): Self = StObject.set(x, "cull", value.asInstanceOf[js.Any])
    
    inline def setCullUndefined: Self = StObject.set(x, "cull", js.undefined)
    
    inline def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    inline def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    inline def setGeometryInstances(value: js.Array[GeometryInstance] | GeometryInstance): Self = StObject.set(x, "geometryInstances", value.asInstanceOf[js.Any])
    
    inline def setGeometryInstancesUndefined: Self = StObject.set(x, "geometryInstances", js.undefined)
    
    inline def setGeometryInstancesVarargs(value: GeometryInstance*): Self = StObject.set(x, "geometryInstances", js.Array(value :_*))
    
    inline def setInterleave(value: Boolean): Self = StObject.set(x, "interleave", value.asInstanceOf[js.Any])
    
    inline def setInterleaveUndefined: Self = StObject.set(x, "interleave", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    inline def setReleaseGeometryInstances(value: Boolean): Self = StObject.set(x, "releaseGeometryInstances", value.asInstanceOf[js.Any])
    
    inline def setReleaseGeometryInstancesUndefined: Self = StObject.set(x, "releaseGeometryInstances", js.undefined)
    
    inline def setShadows(value: ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setVertexCacheOptimize(value: Boolean): Self = StObject.set(x, "vertexCacheOptimize", value.asInstanceOf[js.Any])
    
    inline def setVertexCacheOptimizeUndefined: Self = StObject.set(x, "vertexCacheOptimize", js.undefined)
  }
}
