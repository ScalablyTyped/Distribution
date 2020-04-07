package typings.babylonjs.reflectionProbeMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.reflectionProbeMod.ReflectionProbe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractScene extends js.Object {
  /**
    * The list of reflection probes added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_reflection_probes
    */
  var reflectionProbes: js.Array[ReflectionProbe]
  /**
    * Adds the given reflection probe to this scene.
    * @param newReflectionProbe The reflection probe to add
    */
  def addReflectionProbe(newReflectionProbe: ReflectionProbe): Unit
  /**
    * Removes the given reflection probe from this scene.
    * @param toRemove The reflection probe to remove
    * @returns The index of the removed reflection probe
    */
  def removeReflectionProbe(toRemove: ReflectionProbe): Double
}

object AbstractScene {
  @scala.inline
  def apply(
    addReflectionProbe: ReflectionProbe => Unit,
    reflectionProbes: js.Array[ReflectionProbe],
    removeReflectionProbe: ReflectionProbe => Double
  ): AbstractScene = {
    val __obj = js.Dynamic.literal(addReflectionProbe = js.Any.fromFunction1(addReflectionProbe), reflectionProbes = reflectionProbes.asInstanceOf[js.Any], removeReflectionProbe = js.Any.fromFunction1(removeReflectionProbe))
  
    __obj.asInstanceOf[AbstractScene]
  }
}

