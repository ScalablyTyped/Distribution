package typings.babylonjs.particlesIndexMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Particles/index", "MeshParticleEmitter")
@js.native
/**
  * Creates a new instance MeshParticleEmitter
  * @param mesh defines the mesh to use as source
  */
class MeshParticleEmitter ()
  extends typings.babylonjs.emitterTypesIndexMod.MeshParticleEmitter {
  def this(/** Defines the mesh to use as source */
  mesh: AbstractMesh) = this()
}

