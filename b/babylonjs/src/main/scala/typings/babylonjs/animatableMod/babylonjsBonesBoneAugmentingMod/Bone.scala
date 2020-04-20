package typings.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bone extends js.Object {
  /**
    * Copy an animation range from another bone
    * @param source defines the source bone
    * @param rangeName defines the range name to copy
    * @param frameOffset defines the frame offset
    * @param rescaleAsRequired defines if rescaling must be applied if required
    * @param skelDimensionsRatio defines the scaling ratio
    * @returns true if operation was successful
    */
  def copyAnimationRange(
    source: Bone,
    rangeName: String,
    frameOffset: Double,
    rescaleAsRequired: Boolean,
    skelDimensionsRatio: Nullable[Vector3]
  ): Boolean
}

object Bone {
  @scala.inline
  def apply(copyAnimationRange: (Bone, String, Double, Boolean, Nullable[Vector3]) => Boolean): Bone = {
    val __obj = js.Dynamic.literal(copyAnimationRange = js.Any.fromFunction5(copyAnimationRange))
    __obj.asInstanceOf[Bone]
  }
}

