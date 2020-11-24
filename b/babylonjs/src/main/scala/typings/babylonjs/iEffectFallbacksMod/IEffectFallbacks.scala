package typings.babylonjs.iEffectFallbacksMod

import typings.babylonjs.effectMod.Effect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEffectFallbacks extends js.Object {
  
  /**
    * Checks to see if more fallbacks are still availible.
    */
  var hasMoreFallbacks: Boolean = js.native
  
  /**
    * Removes the defines that should be removed when falling back.
    * @param currentDefines defines the current define statements for the shader.
    * @param effect defines the current effect we try to compile
    * @returns The resulting defines with defines of the current rank removed.
    */
  def reduce(currentDefines: String, effect: Effect): String = js.native
  
  /**
    * Removes the fallback from the bound mesh.
    */
  def unBindMesh(): Unit = js.native
}
object IEffectFallbacks {
  
  @scala.inline
  def apply(hasMoreFallbacks: Boolean, reduce: (String, Effect) => String, unBindMesh: () => Unit): IEffectFallbacks = {
    val __obj = js.Dynamic.literal(hasMoreFallbacks = hasMoreFallbacks.asInstanceOf[js.Any], reduce = js.Any.fromFunction2(reduce), unBindMesh = js.Any.fromFunction0(unBindMesh))
    __obj.asInstanceOf[IEffectFallbacks]
  }
  
  @scala.inline
  implicit class IEffectFallbacksOps[Self <: IEffectFallbacks] (val x: Self) extends AnyVal {
    
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
    def setHasMoreFallbacks(value: Boolean): Self = this.set("hasMoreFallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReduce(value: (String, Effect) => String): Self = this.set("reduce", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnBindMesh(value: () => Unit): Self = this.set("unBindMesh", js.Any.fromFunction0(value))
  }
}
