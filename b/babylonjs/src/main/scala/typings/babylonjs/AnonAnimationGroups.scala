package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animationGroupMod.AnimationGroup
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.skeletonMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationGroups extends js.Object {
  var animationGroups: js.Array[AnimationGroup]
  var meshes: js.Array[AbstractMesh]
  var particleSystems: js.Array[IParticleSystem]
  var skeletons: js.Array[Skeleton]
}

object AnonAnimationGroups {
  @scala.inline
  def apply(
    animationGroups: js.Array[AnimationGroup],
    meshes: js.Array[AbstractMesh],
    particleSystems: js.Array[IParticleSystem],
    skeletons: js.Array[Skeleton]
  ): AnonAnimationGroups = {
    val __obj = js.Dynamic.literal(animationGroups = animationGroups.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any], particleSystems = particleSystems.asInstanceOf[js.Any], skeletons = skeletons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationGroups]
  }
}

