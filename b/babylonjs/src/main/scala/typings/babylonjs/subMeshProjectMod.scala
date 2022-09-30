package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.IndicesArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subMeshProjectMod {
  
  /* augmented module */
  object babylonjsMeshesSubMeshAugmentingMod {
    
    trait SubMesh extends StObject {
      
      /** @internal */
      def _projectOnTrianglesToRef(
        vector: Vector3,
        positions: js.Array[Vector3],
        indices: IndicesArray,
        step: Double,
        checkStopper: Boolean,
        ref: Vector3
      ): Double
      
      /** @internal */
      def _projectOnUnIndexedTrianglesToRef(vector: Vector3, positions: js.Array[Vector3], indices: IndicesArray, ref: Vector3): Double
      
      /**
        * Projects a point on this submesh and stores the result in "ref"
        *
        * @param vector point to project
        * @param positions defines mesh's positions array
        * @param indices defines mesh's indices array
        * @param ref vector that will store the result
        * @returns distance from the point and the submesh, or -1 if the mesh rendering mode doesn't support projections
        */
      def projectToRef(vector: Vector3, positions: js.Array[Vector3], indices: IndicesArray, ref: Vector3): Double
    }
    object SubMesh {
      
      inline def apply(
        _projectOnTrianglesToRef: (Vector3, js.Array[Vector3], IndicesArray, Double, Boolean, Vector3) => Double,
        _projectOnUnIndexedTrianglesToRef: (Vector3, js.Array[Vector3], IndicesArray, Vector3) => Double,
        projectToRef: (Vector3, js.Array[Vector3], IndicesArray, Vector3) => Double
      ): SubMesh = {
        val __obj = js.Dynamic.literal(_projectOnTrianglesToRef = js.Any.fromFunction6(_projectOnTrianglesToRef), _projectOnUnIndexedTrianglesToRef = js.Any.fromFunction4(_projectOnUnIndexedTrianglesToRef), projectToRef = js.Any.fromFunction4(projectToRef))
        __obj.asInstanceOf[SubMesh]
      }
      
      extension [Self <: SubMesh](x: Self) {
        
        inline def setProjectToRef(value: (Vector3, js.Array[Vector3], IndicesArray, Vector3) => Double): Self = StObject.set(x, "projectToRef", js.Any.fromFunction4(value))
        
        inline def set_projectOnTrianglesToRef(value: (Vector3, js.Array[Vector3], IndicesArray, Double, Boolean, Vector3) => Double): Self = StObject.set(x, "_projectOnTrianglesToRef", js.Any.fromFunction6(value))
        
        inline def set_projectOnUnIndexedTrianglesToRef(value: (Vector3, js.Array[Vector3], IndicesArray, Vector3) => Double): Self = StObject.set(x, "_projectOnUnIndexedTrianglesToRef", js.Any.fromFunction4(value))
      }
    }
  }
}
