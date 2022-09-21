package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EasingFunction {
  
  /**
    * Back in.
    */
  @JSImport("cesium", "EasingFunction.BACK_IN")
  @js.native
  val BACK_IN: Callback = js.native
  
  /**
    * Back in then out.
    */
  @JSImport("cesium", "EasingFunction.BACK_IN_OUT")
  @js.native
  val BACK_IN_OUT: Callback = js.native
  
  /**
    * Back out.
    */
  @JSImport("cesium", "EasingFunction.BACK_OUT")
  @js.native
  val BACK_OUT: Callback = js.native
  
  /**
    * Bounce in.
    */
  @JSImport("cesium", "EasingFunction.BOUNCE_IN")
  @js.native
  val BOUNCE_IN: Callback = js.native
  
  /**
    * Bounce in then out.
    */
  @JSImport("cesium", "EasingFunction.BOUNCE_IN_OUT")
  @js.native
  val BOUNCE_IN_OUT: Callback = js.native
  
  /**
    * Bounce out.
    */
  @JSImport("cesium", "EasingFunction.BOUNCE_OUT")
  @js.native
  val BOUNCE_OUT: Callback = js.native
  
  /**
    * Circular in.
    */
  @JSImport("cesium", "EasingFunction.CIRCULAR_IN")
  @js.native
  val CIRCULAR_IN: Callback = js.native
  
  /**
    * Circular in then out.
    */
  @JSImport("cesium", "EasingFunction.CIRCULAR_IN_OUT")
  @js.native
  val CIRCULAR_IN_OUT: Callback = js.native
  
  /**
    * Circular out.
    */
  @JSImport("cesium", "EasingFunction.CIRCULAR_OUT")
  @js.native
  val CIRCULAR_OUT: Callback = js.native
  
  /**
    * Cubic in.
    */
  @JSImport("cesium", "EasingFunction.CUBIC_IN")
  @js.native
  val CUBIC_IN: Callback = js.native
  
  /**
    * Cubic in then out.
    */
  @JSImport("cesium", "EasingFunction.CUBIC_IN_OUT")
  @js.native
  val CUBIC_IN_OUT: Callback = js.native
  
  /**
    * Cubic out.
    */
  @JSImport("cesium", "EasingFunction.CUBIC_OUT")
  @js.native
  val CUBIC_OUT: Callback = js.native
  
  /**
    * Elastic in.
    */
  @JSImport("cesium", "EasingFunction.ELASTIC_IN")
  @js.native
  val ELASTIC_IN: Callback = js.native
  
  /**
    * Elastic in then out.
    */
  @JSImport("cesium", "EasingFunction.ELASTIC_IN_OUT")
  @js.native
  val ELASTIC_IN_OUT: Callback = js.native
  
  /**
    * Elastic out.
    */
  @JSImport("cesium", "EasingFunction.ELASTIC_OUT")
  @js.native
  val ELASTIC_OUT: Callback = js.native
  
  /**
    * Exponential in.
    */
  @JSImport("cesium", "EasingFunction.EXPONENTIAL_IN")
  @js.native
  val EXPONENTIAL_IN: Callback = js.native
  
  /**
    * Exponential in then out.
    */
  @JSImport("cesium", "EasingFunction.EXPONENTIAL_IN_OUT")
  @js.native
  val EXPONENTIAL_IN_OUT: Callback = js.native
  
  /**
    * Exponential out.
    */
  @JSImport("cesium", "EasingFunction.EXPONENTIAL_OUT")
  @js.native
  val EXPONENTIAL_OUT: Callback = js.native
  
  /**
    * Linear easing.
    */
  @JSImport("cesium", "EasingFunction.LINEAR_NONE")
  @js.native
  val LINEAR_NONE: Callback = js.native
  
  /**
    * Quadratic in.
    */
  @JSImport("cesium", "EasingFunction.QUADRATIC_IN")
  @js.native
  val QUADRATIC_IN: Callback = js.native
  
  /**
    * Quadratic in then out.
    */
  @JSImport("cesium", "EasingFunction.QUADRATIC_IN_OUT")
  @js.native
  val QUADRATIC_IN_OUT: Callback = js.native
  
  /**
    * Quadratic out.
    */
  @JSImport("cesium", "EasingFunction.QUADRATIC_OUT")
  @js.native
  val QUADRATIC_OUT: Callback = js.native
  
  /**
    * Quartic in.
    */
  @JSImport("cesium", "EasingFunction.QUARTIC_IN")
  @js.native
  val QUARTIC_IN: Callback = js.native
  
  /**
    * Quartic in then out.
    */
  @JSImport("cesium", "EasingFunction.QUARTIC_IN_OUT")
  @js.native
  val QUARTIC_IN_OUT: Callback = js.native
  
  /**
    * Quartic out.
    */
  @JSImport("cesium", "EasingFunction.QUARTIC_OUT")
  @js.native
  val QUARTIC_OUT: Callback = js.native
  
  /**
    * Quintic in.
    */
  @JSImport("cesium", "EasingFunction.QUINTIC_IN")
  @js.native
  val QUINTIC_IN: Callback = js.native
  
  /**
    * Quintic in then out.
    */
  @JSImport("cesium", "EasingFunction.QUINTIC_IN_OUT")
  @js.native
  val QUINTIC_IN_OUT: Callback = js.native
  
  /**
    * Quintic out.
    */
  @JSImport("cesium", "EasingFunction.QUINTIC_OUT")
  @js.native
  val QUINTIC_OUT: Callback = js.native
  
  /**
    * Sinusoidal in.
    */
  @JSImport("cesium", "EasingFunction.SINUSOIDAL_IN")
  @js.native
  val SINUSOIDAL_IN: Callback = js.native
  
  /**
    * Sinusoidal in then out.
    */
  @JSImport("cesium", "EasingFunction.SINUSOIDAL_IN_OUT")
  @js.native
  val SINUSOIDAL_IN_OUT: Callback = js.native
  
  /**
    * Sinusoidal out.
    */
  @JSImport("cesium", "EasingFunction.SINUSOIDAL_OUT")
  @js.native
  val SINUSOIDAL_OUT: Callback = js.native
  
  /**
    * Function interface for implementing a custom easing function.
    * @example
    * function quadraticIn(time) {
    *     return time * time;
    * }
    * @example
    * function quadraticOut(time) {
    *     return time * (2.0 - time);
    * }
    * @param time - The time in the range <code>[0, 1]</code>.
    */
  type Callback = js.Function1[/* time */ Double, Double]
}
