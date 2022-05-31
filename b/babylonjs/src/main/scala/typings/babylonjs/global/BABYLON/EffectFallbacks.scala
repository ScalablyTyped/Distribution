package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EffectFallbacks")
@js.native
class EffectFallbacks ()
  extends StObject
     with typings.babylonjs.BABYLON.EffectFallbacks {
  
  /**
    * Checks to see if more fallbacks are still availible.
    */
  /* CompleteClass */
  var hasMoreFallbacks: Boolean = js.native
  
  /**
    * Removes the defines that should be removed when falling back.
    * @param currentDefines defines the current define statements for the shader.
    * @param effect defines the current effect we try to compile
    * @returns The resulting defines with defines of the current rank removed.
    */
  /* CompleteClass */
  override def reduce(currentDefines: String, effect: typings.babylonjs.BABYLON.Effect): String = js.native
  
  /**
    * Removes the fallback from the bound mesh.
    */
  /* CompleteClass */
  override def unBindMesh(): Unit = js.native
}
