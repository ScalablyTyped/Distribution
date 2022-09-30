package typings.babylonjs.mod

import typings.babylonjs.typesMod.IndicesArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMeshesSubMeshAugmentingMod {
  
  trait SubMesh extends StObject {
    
    /** @internal */
    def _projectOnTrianglesToRef(
      vector: typings.babylonjs.mathVectorMod.Vector3,
      positions: js.Array[typings.babylonjs.mathVectorMod.Vector3],
      indices: IndicesArray,
      step: Double,
      checkStopper: Boolean,
      ref: typings.babylonjs.mathVectorMod.Vector3
    ): Double
    
    /** @internal */
    def _projectOnUnIndexedTrianglesToRef(
      vector: typings.babylonjs.mathVectorMod.Vector3,
      positions: js.Array[typings.babylonjs.mathVectorMod.Vector3],
      indices: IndicesArray,
      ref: typings.babylonjs.mathVectorMod.Vector3
    ): Double
    
    /**
      * Projects a point on this submesh and stores the result in "ref"
      *
      * @param vector point to project
      * @param positions defines mesh's positions array
      * @param indices defines mesh's indices array
      * @param ref vector that will store the result
      * @returns distance from the point and the submesh, or -1 if the mesh rendering mode doesn't support projections
      */
    def projectToRef(
      vector: typings.babylonjs.mathVectorMod.Vector3,
      positions: js.Array[typings.babylonjs.mathVectorMod.Vector3],
      indices: IndicesArray,
      ref: typings.babylonjs.mathVectorMod.Vector3
    ): Double
  }
  object SubMesh {
    
    inline def apply(
      _projectOnTrianglesToRef: (typings.babylonjs.mathVectorMod.Vector3, js.Array[typings.babylonjs.mathVectorMod.Vector3], IndicesArray, Double, Boolean, typings.babylonjs.mathVectorMod.Vector3) => Double,
      _projectOnUnIndexedTrianglesToRef: (typings.babylonjs.mathVectorMod.Vector3, js.Array[typings.babylonjs.mathVectorMod.Vector3], IndicesArray, typings.babylonjs.mathVectorMod.Vector3) => Double,
      projectToRef: (typings.babylonjs.mathVectorMod.Vector3, js.Array[typings.babylonjs.mathVectorMod.Vector3], IndicesArray, typings.babylonjs.mathVectorMod.Vector3) => Double
    ): typings.babylonjs.mod.babylonjsMeshesSubMeshAugmentingMod.SubMesh = {
      val __obj = js.Dynamic.literal(_projectOnTrianglesToRef = js.Any.fromFunction6(_projectOnTrianglesToRef), _projectOnUnIndexedTrianglesToRef = js.Any.fromFunction4(_projectOnUnIndexedTrianglesToRef), projectToRef = js.Any.fromFunction4(projectToRef))
      __obj.asInstanceOf[typings.babylonjs.mod.babylonjsMeshesSubMeshAugmentingMod.SubMesh]
    }
    
    extension [Self <: typings.babylonjs.mod.babylonjsMeshesSubMeshAugmentingMod.SubMesh](x: Self) {
      
      inline def setProjectToRef(
        value: (typings.babylonjs.mathVectorMod.Vector3, js.Array[typings.babylonjs.mathVectorMod.Vector3], IndicesArray, typings.babylonjs.mathVectorMod.Vector3) => Double
      ): Self = StObject.set(x, "projectToRef", js.Any.fromFunction4(value))
      
      inline def set_projectOnTrianglesToRef(
        value: (typings.babylonjs.mathVectorMod.Vector3, js.Array[typings.babylonjs.mathVectorMod.Vector3], IndicesArray, Double, Boolean, typings.babylonjs.mathVectorMod.Vector3) => Double
      ): Self = StObject.set(x, "_projectOnTrianglesToRef", js.Any.fromFunction6(value))
      
      inline def set_projectOnUnIndexedTrianglesToRef(
        value: (typings.babylonjs.mathVectorMod.Vector3, js.Array[typings.babylonjs.mathVectorMod.Vector3], IndicesArray, typings.babylonjs.mathVectorMod.Vector3) => Double
      ): Self = StObject.set(x, "_projectOnUnIndexedTrianglesToRef", js.Any.fromFunction4(value))
    }
  }
}
