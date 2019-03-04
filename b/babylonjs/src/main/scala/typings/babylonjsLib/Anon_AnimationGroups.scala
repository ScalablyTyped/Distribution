package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationGroups extends js.Object {
  var animationGroups: js.Array[babylonjsLib.BABYLONNs.AnimationGroup]
  var meshes: js.Array[babylonjsLib.BABYLONNs.AbstractMesh]
  var particleSystems: js.Array[babylonjsLib.BABYLONNs.IParticleSystem]
  var skeletons: js.Array[babylonjsLib.BABYLONNs.Skeleton]
}

object Anon_AnimationGroups {
  @scala.inline
  def apply(
    animationGroups: js.Array[babylonjsLib.BABYLONNs.AnimationGroup],
    meshes: js.Array[babylonjsLib.BABYLONNs.AbstractMesh],
    particleSystems: js.Array[babylonjsLib.BABYLONNs.IParticleSystem],
    skeletons: js.Array[babylonjsLib.BABYLONNs.Skeleton]
  ): Anon_AnimationGroups = {
    val __obj = js.Dynamic.literal(animationGroups = animationGroups, meshes = meshes, particleSystems = particleSystems, skeletons = skeletons)
  
    __obj.asInstanceOf[Anon_AnimationGroups]
  }
}

