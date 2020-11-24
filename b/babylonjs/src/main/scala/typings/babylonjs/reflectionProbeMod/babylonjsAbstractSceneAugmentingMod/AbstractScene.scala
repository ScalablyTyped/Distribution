package typings.babylonjs.reflectionProbeMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.reflectionProbeMod.ReflectionProbe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractScene extends js.Object {
  
  /**
    * Adds the given reflection probe to this scene.
    * @param newReflectionProbe The reflection probe to add
    */
  def addReflectionProbe(newReflectionProbe: ReflectionProbe): Unit = js.native
  
  /**
    * The list of reflection probes added to the scene
    * @see https://doc.babylonjs.com/how_to/how_to_use_reflection_probes
    */
  var reflectionProbes: js.Array[ReflectionProbe] = js.native
  
  /**
    * Removes the given reflection probe from this scene.
    * @param toRemove The reflection probe to remove
    * @returns The index of the removed reflection probe
    */
  def removeReflectionProbe(toRemove: ReflectionProbe): Double = js.native
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
  
  @scala.inline
  implicit class AbstractSceneOps[Self <: AbstractScene] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddReflectionProbe(value: ReflectionProbe => Unit): Self = this.set("addReflectionProbe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReflectionProbesVarargs(value: ReflectionProbe*): Self = this.set("reflectionProbes", js.Array(value :_*))
    
    @scala.inline
    def setReflectionProbes(value: js.Array[ReflectionProbe]): Self = this.set("reflectionProbes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveReflectionProbe(value: ReflectionProbe => Double): Self = this.set("removeReflectionProbe", js.Any.fromFunction1(value))
  }
}
