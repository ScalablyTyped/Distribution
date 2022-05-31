package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshParticleEmitter
  extends StObject
     with IParticleEmitterType {
  
  /* private */ var _indices: js.Any = js.native
  
  /* private */ var _mesh: js.Any = js.native
  
  /* private */ var _normals: js.Any = js.native
  
  /* private */ var _positions: js.Any = js.native
  
  /* private */ var _storedNormal: js.Any = js.native
  
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
