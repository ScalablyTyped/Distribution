package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.EffectWrapperCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EffectWrapper")
@js.native
class EffectWrapper protected ()
  extends StObject
     with typings.babylonjs.BABYLON.EffectWrapper {
  /**
    * Creates an effect to be renderer
    * @param creationOptions options to create the effect
    */
  def this(creationOptions: EffectWrapperCreationOptions) = this()
  
  /**
    * Disposes of the effect wrapper
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * The underlying effect
    */
  /* CompleteClass */
  var effect: typings.babylonjs.BABYLON.Effect = js.native
  
  /**
    * Event that is fired right before the effect is drawn (should be used to update uniforms)
    */
  /* CompleteClass */
  var onApplyObservable: typings.babylonjs.BABYLON.Observable[js.Object] = js.native
}
