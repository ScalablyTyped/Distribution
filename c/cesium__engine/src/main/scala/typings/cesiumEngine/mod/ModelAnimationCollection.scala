package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.AnimationTime
import typings.cesiumEngine.anon.Delay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "ModelAnimationCollection")
@js.native
open class ModelAnimationCollection () extends StObject {
  
  /**
    * Creates and adds an animation with the specified initial properties to the collection.
    * <p>
    * This raises the {@link ModelAnimationCollection#animationAdded} event so, for example, a UI can stay in sync.
    * </p>
    * @example
    * // Example 1. Add an animation by name
    * model.activeAnimations.add({
    *   name : 'animation name'
    * });
    * @example
    * // Example 2. Add an animation by index
    * model.activeAnimations.add({
    *   index : 0
    * });
    * @example
    * // Example 3. Add an animation and provide all properties and events
    * const startTime = Cesium.JulianDate.now();
    *
    * const animation = model.activeAnimations.add({
    *   name : 'another animation name',
    *   startTime : startTime,
    *   delay : 0.0,                                 // Play at startTime (default)
    *   stopTime : Cesium.JulianDate.addSeconds(startTime, 4.0, new Cesium.JulianDate()),
    *   removeOnStop : false,                        // Do not remove when animation stops (default)
    *   multiplier : 2.0,                            // Play at double speed
    *   reverse : true,                              // Play in reverse
    *   loop : Cesium.ModelAnimationLoop.REPEAT      // Loop the animation
    * });
    *
    * animation.start.addEventListener(function(model, animation) {
    *   console.log(`Animation started: ${animation.name}`);
    * });
    * animation.update.addEventListener(function(model, animation, time) {
    *   console.log(`Animation updated: ${animation.name}. glTF animation time: ${time}`);
    * });
    * animation.stop.addEventListener(function(model, animation) {
    *   console.log(`Animation stopped: ${animation.name}`);
    * });
    * @param options - Object with the following properties:
    * @param [options.name] - The glTF animation name that identifies the animation. Must be defined if <code>options.index</code> is <code>undefined</code>.
    * @param [options.index] - The glTF animation index that identifies the animation. Must be defined if <code>options.name</code> is <code>undefined</code>.
    * @param [options.startTime] - The scene time to start playing the animation.  When this is <code>undefined</code>, the animation starts at the next frame.
    * @param [options.delay = 0.0] - The delay, in seconds, from <code>startTime</code> to start playing. This will only affect the animation if <code>options.loop</code> is ModelAnimationLoop.NONE.
    * @param [options.stopTime] - The scene time to stop playing the animation.  When this is <code>undefined</code>, the animation is played for its full duration.
    * @param [options.removeOnStop = false] - When <code>true</code>, the animation is removed after it stops playing. This will only affect the animation if <code>options.loop</code> is ModelAnimationLoop.NONE.
    * @param [options.multiplier = 1.0] - Values greater than <code>1.0</code> increase the speed that the animation is played relative to the scene clock speed; values less than <code>1.0</code> decrease the speed.
    * @param [options.reverse = false] - When <code>true</code>, the animation is played in reverse.
    * @param [options.loop = ModelAnimationLoop.NONE] - Determines if and how the animation is looped.
    * @param [options.animationTime] - If defined, computes the local animation time for this animation.
    * @returns The animation that was added to the collection.
    */
  def add(options: AnimationTime): ModelAnimation = js.native
  
  /**
    * Creates and adds animations with the specified initial properties to the collection
    * for all animations in the model.
    * <p>
    * This raises the {@link ModelAnimationCollection#animationAdded} event for each model so, for example, a UI can stay in sync.
    * </p>
    * @example
    * model.activeAnimations.addAll({
    *   multiplier : 0.5,                            // Play at half-speed
    *   loop : Cesium.ModelAnimationLoop.REPEAT      // Loop the animations
    * });
    * @param [options] - Object with the following properties:
    * @param [options.startTime] - The scene time to start playing the animations. When this is <code>undefined</code>, the animations starts at the next frame.
    * @param [options.delay = 0.0] - The delay, in seconds, from <code>startTime</code> to start playing. This will only affect the animation if <code>options.loop</code> is ModelAnimationLoop.NONE.
    * @param [options.stopTime] - The scene time to stop playing the animations. When this is <code>undefined</code>, the animations are played for its full duration.
    * @param [options.removeOnStop = false] - When <code>true</code>, the animations are removed after they stop playing. This will only affect the animation if <code>options.loop</code> is ModelAnimationLoop.NONE.
    * @param [options.multiplier = 1.0] - Values greater than <code>1.0</code> increase the speed that the animations play relative to the scene clock speed; values less than <code>1.0</code> decrease the speed.
    * @param [options.reverse = false] - When <code>true</code>, the animations are played in reverse.
    * @param [options.loop = ModelAnimationLoop.NONE] - Determines if and how the animations are looped.
    * @param [options.animationTime] - If defined, computes the local animation time for all of the animations.
    * @returns An array of {@link ModelAnimation} objects, one for each animation added to the collection.  If there are no glTF animations, the array is empty.
    */
  def addAll(): js.Array[ModelAnimation] = js.native
  def addAll(options: Delay): js.Array[ModelAnimation] = js.native
  
  /**
    * When true, the animation will play even when the scene time is paused. However,
    * whether animation takes place will depend on the animationTime functions assigned
    * to the model's animations. By default, this is based on scene time, so models using
    * the default will not animate regardless of this setting.
    */
  var animateWhilePaused: Boolean = js.native
  
  /**
    * The event fired when an animation is added to the collection.  This can be used, for
    * example, to keep a UI in sync.
    * @example
    * model.activeAnimations.animationAdded.addEventListener(function(model, animation) {
    *   console.log(`Animation added: ${animation.name}`);
    * });
    */
  var animationAdded: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * The event fired when an animation is removed from the collection.  This can be used, for
    * example, to keep a UI in sync.
    * @example
    * model.activeAnimations.animationRemoved.addEventListener(function(model, animation) {
    *   console.log(`Animation removed: ${animation.name}`);
    * });
    */
  var animationRemoved: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Determines whether this collection contains a given animation.
    * @param runtimeAnimation - The runtime animation to check for.
    * @returns <code>true</code> if this collection contains the animation, <code>false</code> otherwise.
    */
  def contains(runtimeAnimation: ModelAnimation): Boolean = js.native
  
  /**
    * Returns the animation in the collection at the specified index.  Indices are zero-based
    * and increase as animations are added.  Removing an animation shifts all animations after
    * it to the left, changing their indices.  This function is commonly used to iterate over
    * all the animations in the collection.
    * @example
    * // Output the names of all the animations in the collection.
    * const animations = model.activeAnimations;
    * const length = animations.length;
    * for (let i = 0; i < length; ++i) {
    *   console.log(animations.get(i).name);
    * }
    * @param index - The zero-based index of the animation.
    * @returns The runtime animation at the specified index.
    */
  def get(index: Double): ModelAnimation = js.native
  
  /**
    * The number of animations in the collection.
    */
  val length: Double = js.native
  
  /**
    * The model that owns this animation collection.
    */
  val model: Model = js.native
  
  /**
    * Removes an animation from the collection.
    * <p>
    * This raises the {@link ModelAnimationCollection#animationRemoved} event so, for example, a UI can stay in sync.
    * </p>
    * <p>
    * An animation can also be implicitly removed from the collection by setting {@link ModelAnimationCollection#removeOnStop} to
    * <code>true</code>.  The {@link ModelAnimationCollection#animationRemoved} event is still fired when the animation is removed.
    * </p>
    * @example
    * const a = model.activeAnimations.add({
    *   name : 'animation name'
    * });
    * model.activeAnimations.remove(a); // Returns true
    * @param runtimeAnimation - The runtime animation to remove.
    * @returns <code>true</code> if the animation was removed; <code>false</code> if the animation was not found in the collection.
    */
  def remove(runtimeAnimation: ModelAnimation): Boolean = js.native
  
  /**
    * Removes all animations from the collection.
    * <p>
    * This raises the {@link ModelAnimationCollection#animationRemoved} event for each
    * animation so, for example, a UI can stay in sync.
    * </p>
    */
  def removeAll(): Unit = js.native
}
