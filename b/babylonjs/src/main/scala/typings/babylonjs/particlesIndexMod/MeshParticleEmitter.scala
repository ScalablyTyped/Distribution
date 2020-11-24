package typings.babylonjs.particlesIndexMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/index", "MeshParticleEmitter")
@js.native
/**
  * Creates a new instance MeshParticleEmitter
  * @param mesh defines the mesh to use as source
  */
class MeshParticleEmitter ()
  extends typings.babylonjs.emitterTypesIndexMod.MeshParticleEmitter {
  def this(mesh: Nullable[AbstractMesh]) = this()
}
