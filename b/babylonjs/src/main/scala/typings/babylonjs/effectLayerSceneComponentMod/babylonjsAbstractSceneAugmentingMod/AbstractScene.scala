package typings.babylonjs.effectLayerSceneComponentMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.effectLayerMod.EffectLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractScene extends js.Object {
  /**
    * The list of effect layers (highlights/glow) added to the scene
    * @see http://doc.babylonjs.com/how_to/highlight_layer
    * @see http://doc.babylonjs.com/how_to/glow_layer
    */
  var effectLayers: js.Array[EffectLayer]
  /**
    * Adds the given effect layer to this scene
    * @param newEffectLayer defines the effect layer to add
    */
  def addEffectLayer(newEffectLayer: EffectLayer): Unit
  /**
    * Removes the given effect layer from this scene.
    * @param toRemove defines the effect layer to remove
    * @returns the index of the removed effect layer
    */
  def removeEffectLayer(toRemove: EffectLayer): Double
}

object AbstractScene {
  @scala.inline
  def apply(
    addEffectLayer: EffectLayer => Unit,
    effectLayers: js.Array[EffectLayer],
    removeEffectLayer: EffectLayer => Double
  ): AbstractScene = {
    val __obj = js.Dynamic.literal(addEffectLayer = js.Any.fromFunction1(addEffectLayer), effectLayers = effectLayers.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer))
    __obj.asInstanceOf[AbstractScene]
  }
}

