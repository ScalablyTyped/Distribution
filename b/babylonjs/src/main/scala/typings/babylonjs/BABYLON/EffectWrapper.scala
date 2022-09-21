package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectWrapper extends StObject {
  
  /** @hidden */
  var _drawWrapper: DrawWrapper = js.native
  
  /* private */ var _onContextRestoredObserver: Any = js.native
  
  /**
    * Disposes of the effect wrapper
    */
  def dispose(): Unit = js.native
  
  /**
    * The underlying effect
    */
  def effect: Effect = js.native
  def effect_=(effect: Effect): Unit = js.native
  
  /**
    * Event that is fired right before the effect is drawn (should be used to update uniforms)
    */
  var onApplyObservable: Observable[js.Object] = js.native
}
