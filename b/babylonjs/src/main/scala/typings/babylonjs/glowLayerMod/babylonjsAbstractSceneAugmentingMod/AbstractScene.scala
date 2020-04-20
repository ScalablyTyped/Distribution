package typings.babylonjs.glowLayerMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.glowLayerMod.GlowLayer
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractScene extends js.Object {
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  def getGlowLayerByName(name: String): Nullable[GlowLayer]
}

object AbstractScene {
  @scala.inline
  def apply(getGlowLayerByName: String => Nullable[GlowLayer]): AbstractScene = {
    val __obj = js.Dynamic.literal(getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName))
    __obj.asInstanceOf[AbstractScene]
  }
}

