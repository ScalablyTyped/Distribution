package typings.babylonjs

import typings.babylonjs.meshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshExploderMod {
  
  @JSImport("babylonjs/Misc/meshExploder", "MeshExploder")
  @js.native
  class MeshExploder protected () extends StObject {
    /**
      * Explodes meshes from a center mesh.
      * @param meshes The meshes to explode.
      * @param centerMesh The mesh to be center of explosion.
      */
    def this(meshes: js.Array[Mesh]) = this()
    def this(meshes: js.Array[Mesh], centerMesh: Mesh) = this()
    
    var _centerMesh: js.Any = js.native
    
    var _centerPosition: js.Any = js.native
    
    var _meshes: js.Any = js.native
    
    var _meshesOrigins: js.Any = js.native
    
    var _newPosition: js.Any = js.native
    
    var _scaledDirection: js.Any = js.native
    
    var _setCenterMesh: js.Any = js.native
    
    var _toCenterVectors: js.Any = js.native
    
    /**
      * Explodes meshes giving a specific direction
      * @param direction Number to multiply distance of each mesh's origin from center. Use a negative number to implode, or zero to reset.
      */
    def explode(): Unit = js.native
    def explode(direction: Double): Unit = js.native
    
    /**
      * Get class name
      * @returns "MeshExploder"
      */
    def getClassName(): String = js.native
    
    /**
      * "Exploded meshes"
      * @returns Array of meshes with the centerMesh at index 0.
      */
    def getMeshes(): js.Array[Mesh] = js.native
  }
}
