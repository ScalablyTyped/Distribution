package typings.cesium.mod

import typings.cesium.mod.ModelAnimation.AnimationTimeCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ModelAnimation")
@js.native
open class ModelAnimation () extends StObject {
  
  /**
    * If this is defined, it will be used to compute the local animation time
    * instead of the scene's time.
    */
  def animationTime(duration: Double, seconds: Double): Double = js.native
  /**
    * If this is defined, it will be used to compute the local animation time
    * instead of the scene's time.
    */
  @JSName("animationTime")
  var animationTime_Original: AnimationTimeCallback = js.native
  
  /**
    * The delay, in seconds, from {@link ModelAnimation#startTime} to start playing.
    */
  val delay: Double = js.native
  
  /**
    * Determines if and how the animation is looped.
    */
  val loop: ModelAnimationLoop = js.native
  
  /**
    * Values greater than <code>1.0</code> increase the speed that the animation is played relative
    * to the scene clock speed; values less than <code>1.0</code> decrease the speed.  A value of
    * <code>1.0</code> plays the animation at the speed in the glTF animation mapped to the scene
    * clock speed.  For example, if the scene is played at 2x real-time, a two-second glTF animation
    * will play in one second even if <code>multiplier</code> is <code>1.0</code>.
    */
  val multiplier: Double = js.native
  
  /**
    * The name that identifies this animation in the model, if it exists.
    */
  val name: String = js.native
  
  /**
    * When <code>true</code>, the animation is removed after it stops playing.
    * This is slightly more efficient that not removing it, but if, for example,
    * time is reversed, the animation is not played again.
    */
  var removeOnStop: Boolean = js.native
  
  /**
    * When <code>true</code>, the animation is played in reverse.
    */
  val reverse: Boolean = js.native
  
  /**
    * The event fired when this animation is started.  This can be used, for
    * example, to play a sound or start a particle system, when the animation starts.
    * <p>
    * This event is fired at the end of the frame after the scene is rendered.
    * </p>
    * @example
    * animation.start.addEventListener(function(model, animation) {
    *   console.log(`Animation started: ${animation.name}`);
    * });
    */
  var start: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * The scene time to start playing this animation. When this is <code>undefined</code>,
    * the animation starts at the next frame.
    */
  val startTime: JulianDate = js.native
  
  /**
    * The event fired when this animation is stopped.  This can be used, for
    * example, to play a sound or start a particle system, when the animation stops.
    * <p>
    * This event is fired at the end of the frame after the scene is rendered.
    * </p>
    * @example
    * animation.stop.addEventListener(function(model, animation) {
    *   console.log(`Animation stopped: ${animation.name}`);
    * });
    */
  var stop: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * The scene time to stop playing this animation. When this is <code>undefined</code>,
    * the animation is played for its full duration and perhaps repeated depending on
    * {@link ModelAnimation#loop}.
    */
  val stopTime: JulianDate = js.native
  
  /**
    * The event fired when on each frame when this animation is updated.  The
    * current time of the animation, relative to the glTF animation time span, is
    * passed to the event, which allows, for example, starting new animations at a
    * specific time relative to a playing animation.
    * <p>
    * This event is fired at the end of the frame after the scene is rendered.
    * </p>
    * @example
    * animation.update.addEventListener(function(model, animation, time) {
    *   console.log(`Animation updated: ${animation.name}. glTF animation time: ${time}`);
    * });
    */
  var update: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
}
object ModelAnimation {
  
  /**
    * A function used to compute the local animation time for a ModelAnimation.
    * @example
    * // Use real time for model animation (assuming animateWhilePaused was set to true)
    * function animationTime(duration) {
    *     return Date.now() / 1000 / duration;
    * }
    * @example
    * // Offset the phase of the animation, so it starts halfway through its cycle.
    * function animationTime(duration, seconds) {
    *     return seconds / duration + 0.5;
    * }
    * @param duration - The animation's original duration in seconds.
    * @param seconds - The seconds since the animation started, in scene time.
    */
  type AnimationTimeCallback = js.Function2[/* duration */ Double, /* seconds */ Double, Double]
}
