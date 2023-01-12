package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRMesh extends StObject {
  
  var indices: js.typedarray.Uint32Array
  
  var lastChangedTime: Double
  
  var meshSpace: XRSpace
  
  var normals: js.UndefOr[js.typedarray.Float32Array] = js.undefined
  
  var parentSceneObject: js.UndefOr[XRSceneObject] = js.undefined
  
  var positions: js.typedarray.Float32Array
}
object XRMesh {
  
  inline def apply(
    indices: js.typedarray.Uint32Array,
    lastChangedTime: Double,
    meshSpace: XRSpace,
    positions: js.typedarray.Float32Array
  ): XRMesh = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], lastChangedTime = lastChangedTime.asInstanceOf[js.Any], meshSpace = meshSpace.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRMesh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRMesh] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: js.typedarray.Uint32Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setLastChangedTime(value: Double): Self = StObject.set(x, "lastChangedTime", value.asInstanceOf[js.Any])
    
    inline def setMeshSpace(value: XRSpace): Self = StObject.set(x, "meshSpace", value.asInstanceOf[js.Any])
    
    inline def setNormals(value: js.typedarray.Float32Array): Self = StObject.set(x, "normals", value.asInstanceOf[js.Any])
    
    inline def setNormalsUndefined: Self = StObject.set(x, "normals", js.undefined)
    
    inline def setParentSceneObject(value: XRSceneObject): Self = StObject.set(x, "parentSceneObject", value.asInstanceOf[js.Any])
    
    inline def setParentSceneObjectUndefined: Self = StObject.set(x, "parentSceneObject", js.undefined)
    
    inline def setPositions(value: js.typedarray.Float32Array): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
  }
}
