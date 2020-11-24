package typings.babylonjs.audioSceneComponentMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.soundMod.Sound
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractScene extends js.Object {
  
  /**
    * The list of sounds used in the scene.
    */
  var sounds: Nullable[js.Array[Sound]] = js.native
}
object AbstractScene {
  
  @scala.inline
  def apply(): AbstractScene = {
    val __obj = js.Dynamic.literal()
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
    def setSoundsVarargs(value: Sound*): Self = this.set("sounds", js.Array(value :_*))
    
    @scala.inline
    def setSounds(value: Nullable[js.Array[Sound]]): Self = this.set("sounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundsNull: Self = this.set("sounds", null)
  }
}
