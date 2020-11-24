package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.iparticleemittertypeMod.IParticleEmitterType
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/EmitterTypes/meshParticleEmitter", JSImport.Namespace)
@js.native
object meshParticleEmitterMod extends js.Object {
  
  @js.native
  /**
    * Creates a new instance MeshParticleEmitter
    * @param mesh defines the mesh to use as source
    */
  class MeshParticleEmitter () extends IParticleEmitterType {
    def this(mesh: Nullable[AbstractMesh]) = this()
    
    var _indices: js.Any = js.native
    
    var _mesh: js.Any = js.native
    
    var _normals: js.Any = js.native
    
    var _positions: js.Any = js.native
    
    var _storedNormal: js.Any = js.native
    
    /**
      * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
      */
    var direction1: Vector3 = js.native
    
    /**
      * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
      */
    var direction2: Vector3 = js.native
    
    /** Defines the mesh to use as source */
    def mesh: Nullable[AbstractMesh] = js.native
    def mesh_=(value: Nullable[AbstractMesh]): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating that particle directions must be built from mesh face normals
      */
    var useMeshNormalsForDirection: Boolean = js.native
  }
}
