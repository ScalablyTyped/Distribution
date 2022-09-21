package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationGroup
  extends StObject
     with IDisposable {
  
  /* private */ var _animatables: Any = js.native
  
  /* private */ var _animationLoopCount: Any = js.native
  
  /* private */ var _animationLoopFlags: Any = js.native
  
  /* private */ var _checkAnimationGroupEnded: Any = js.native
  
  /* private */ var _from: Any = js.native
  
  /* private */ var _isAdditive: Any = js.native
  
  /* private */ var _isPaused: Any = js.native
  
  /* private */ var _isStarted: Any = js.native
  
  /* private */ var _loopAnimation: Any = js.native
  
  /** @hidden */
  var _parentContainer: Nullable[AbstractScene] = js.native
  
  /* private */ var _processLoop: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _speedRatio: Any = js.native
  
  /* private */ var _targetedAnimations: Any = js.native
  
  /* private */ var _to: Any = js.native
  
  /**
    * Add an animation (with its target) in the group
    * @param animation defines the animation we want to add
    * @param target defines the target of the animation
    * @returns the TargetedAnimation object
    */
  def addTargetedAnimation(animation: Animation, target: Any): TargetedAnimation = js.native
  
  /**
    * returning the list of animatables controlled by this animation group.
    */
  def animatables: js.Array[Animatable] = js.native
  
  /**
    * Gets the list of target animations
    */
  def children: js.Array[TargetedAnimation] = js.native
  
  /**
    * Clone the current animation group and returns a copy
    * @param newName defines the name of the new group
    * @param targetConverter defines an optional function used to convert current animation targets to new ones
    * @param cloneAnimations defines if the animations should be cloned or referenced
    * @returns the new animation group
    */
  def clone(newName: String): AnimationGroup = js.native
  def clone(newName: String, targetConverter: js.Function1[/* oldTarget */ Any, Any]): AnimationGroup = js.native
  def clone(newName: String, targetConverter: js.Function1[/* oldTarget */ Any, Any], cloneAnimations: Boolean): AnimationGroup = js.native
  def clone(newName: String, targetConverter: Unit, cloneAnimations: Boolean): AnimationGroup = js.native
  
  /**
    * Gets the first frame
    */
  def from: Double = js.native
  
  /**
    * Returns the string "AnimationGroup"
    * @returns "AnimationGroup"
    */
  def getClassName(): String = js.native
  
  /**
    * Goes to a specific frame in this animation group
    * @param frame the frame number to go to
    * @returns the animationGroup
    */
  def goToFrame(frame: Double): AnimationGroup = js.native
  
  /**
    * Gets or sets if all animations should be evaluated additively
    */
  def isAdditive: Boolean = js.native
  def isAdditive_=(value: Boolean): Unit = js.native
  
  /**
    * Gets a value indicating that the current group is playing
    */
  def isPlaying: Boolean = js.native
  
  /**
    * Define if the animations are started
    */
  def isStarted: Boolean = js.native
  
  /**
    * Gets or sets if all animations should loop or not
    */
  def loopAnimation: Boolean = js.native
  def loopAnimation_=(value: Boolean): Unit = js.native
  
  /**
    * Gets or sets an object used to store user defined information for the node
    */
  var metadata: Any = js.native
  
  /** The name of the animation group */
  var name: String = js.native
  
  /**
    * This function will normalize every animation in the group to make sure they all go from beginFrame to endFrame
    * It can add constant keys at begin or end
    * @param beginFrame defines the new begin frame for all animations or the smallest begin frame of all animations if null (defaults to null)
    * @param endFrame defines the new end frame for all animations or the largest end frame of all animations if null (defaults to null)
    * @returns the animation group
    */
  def normalize(): AnimationGroup = js.native
  def normalize(beginFrame: Unit, endFrame: Nullable[Double]): AnimationGroup = js.native
  def normalize(beginFrame: Nullable[Double]): AnimationGroup = js.native
  def normalize(beginFrame: Nullable[Double], endFrame: Nullable[Double]): AnimationGroup = js.native
  
  /**
    * This observable will notify when one animation have ended
    */
  var onAnimationEndObservable: Observable[TargetedAnimation] = js.native
  
  /**
    * This observable will notify when all animations have ended.
    */
  var onAnimationGroupEndObservable: Observable[AnimationGroup] = js.native
  
  /**
    * Observer raised when all animations have looped
    */
  var onAnimationGroupLoopObservable: Observable[AnimationGroup] = js.native
  
  /**
    * This observable will notify when all animations have paused.
    */
  var onAnimationGroupPauseObservable: Observable[AnimationGroup] = js.native
  
  /**
    * This observable will notify when all animations are playing.
    */
  var onAnimationGroupPlayObservable: Observable[AnimationGroup] = js.native
  
  /**
    * Observer raised when one animation loops
    */
  var onAnimationLoopObservable: Observable[TargetedAnimation] = js.native
  
  /**
    * Pause all animations
    * @returns the animation group
    */
  def pause(): AnimationGroup = js.native
  
  /**
    * Play all animations to initial state
    * This function will start() the animations if they were not started or will restart() them if they were paused
    * @param loop defines if animations must loop
    * @returns the animation group
    */
  def play(): AnimationGroup = js.native
  def play(loop: Boolean): AnimationGroup = js.native
  
  /**
    * Reset all animations to initial state
    * @returns the animation group
    */
  def reset(): AnimationGroup = js.native
  
  /**
    * Restart animations from key 0
    * @returns the animation group
    */
  def restart(): AnimationGroup = js.native
  
  /**
    * Serializes the animationGroup to an object
    * @returns Serialized object
    */
  def serialize(): Any = js.native
  
  /**
    * Set animation weight for all animatables
    * @param weight defines the weight to use
    * @returns the animationGroup
    * @see https://doc.babylonjs.com/babylon101/animations#animation-weights
    */
  def setWeightForAllAnimatables(weight: Double): AnimationGroup = js.native
  
  /**
    * Gets or sets the speed ratio to use for all animations
    */
  def speedRatio: Double = js.native
  /**
    * Gets or sets the speed ratio to use for all animations
    */
  def speedRatio_=(value: Double): Unit = js.native
  
  /**
    * Start all animations on given targets
    * @param loop defines if animations must loop
    * @param speedRatio defines the ratio to apply to animation speed (1 by default)
    * @param from defines the from key (optional)
    * @param to defines the to key (optional)
    * @param isAdditive defines the additive state for the resulting animatables (optional)
    * @returns the current animation group
    */
  def start(): AnimationGroup = js.native
  def start(loop: Boolean): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Double): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Double, from: Double): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Double, from: Double, to: Double): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Double, from: Double, to: Double, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Double, from: Double, to: Unit, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Double, from: Unit, to: Double): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Double, from: Unit, to: Double, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Double, from: Unit, to: Unit, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Unit, from: Double): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Unit, from: Double, to: Double): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Unit, from: Double, to: Double, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Unit, from: Double, to: Unit, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Unit, from: Unit, to: Double): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Unit, from: Unit, to: Double, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Boolean, speedRatio: Unit, from: Unit, to: Unit, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Double): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Double, from: Double): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Double, from: Double, to: Double): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Double, from: Double, to: Double, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Double, from: Double, to: Unit, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Double, from: Unit, to: Double): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Double, from: Unit, to: Double, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Double, from: Unit, to: Unit, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Unit, from: Double): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Unit, from: Double, to: Double): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Unit, from: Double, to: Double, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Unit, from: Double, to: Unit, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Unit, from: Unit, to: Double): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Unit, from: Unit, to: Double, isAdditive: Boolean): AnimationGroup = js.native
  def start(loop: Unit, speedRatio: Unit, from: Unit, to: Unit, isAdditive: Boolean): AnimationGroup = js.native
  
  /**
    * Stop all animations
    * @returns the animation group
    */
  def stop(): AnimationGroup = js.native
  
  /**
    * Synchronize and normalize all animatables with a source animatable
    * @param root defines the root animatable to synchronize with (null to stop synchronizing)
    * @returns the animationGroup
    * @see https://doc.babylonjs.com/babylon101/animations#animation-weights
    */
  def syncAllAnimationsWith(root: Nullable[Animatable]): AnimationGroup = js.native
  
  /**
    * Gets the targeted animations for this animation group
    */
  def targetedAnimations: js.Array[TargetedAnimation] = js.native
  
  /**
    * Gets the last frame
    */
  def to: Double = js.native
  
  def toString(fullDetails: Boolean): String = js.native
  
  /**
    * Gets or sets the unique id of the node
    */
  var uniqueId: Double = js.native
}
