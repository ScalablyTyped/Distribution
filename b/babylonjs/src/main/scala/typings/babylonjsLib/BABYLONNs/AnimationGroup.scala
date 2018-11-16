package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Use this class to create coordinated animations on multiple targets
     */
@JSGlobal("BABYLON.AnimationGroup")
@js.native
class AnimationGroup protected () extends IDisposable {
  /**
           * Instantiates a new Animation Group.
           * This helps managing several animations at once.
           * @see http://doc.babylonjs.com/how_to/group
           * @param name Defines the name of the group
           * @param scene Defines the scene the group belongs to
           */
  def this(/** The name of the animation group */
  name: java.lang.String) = this()
  /**
           * Instantiates a new Animation Group.
           * This helps managing several animations at once.
           * @see http://doc.babylonjs.com/how_to/group
           * @param name Defines the name of the group
           * @param scene Defines the scene the group belongs to
           */
  def this(/** The name of the animation group */
  name: java.lang.String, scene: Nullable[Scene]) = this()
  var _animatables: js.Any = js.native
  var _checkAnimationGroupEnded: js.Any = js.native
  var _from: js.Any = js.native
  var _isStarted: js.Any = js.native
  var _scene: js.Any = js.native
  var _speedRatio: js.Any = js.native
  var _targetedAnimations: js.Any = js.native
  var _to: js.Any = js.native
  /**
           * returning the list of animatables controlled by this animation group.
           */
  val animatables: js.Array[Animatable] = js.native
  /**
           * Gets the first frame
           */
  val from: scala.Double = js.native
  /**
           * Define if the animations are started
           */
  val isStarted: scala.Boolean = js.native
  /** The name of the animation group */
  var name: java.lang.String = js.native
  /**
           * This observable will notify when one animation have ended.
           */
  var onAnimationEndObservable: Observable[TargetedAnimation] = js.native
  /**
           * This observable will notify when all animations have ended.
           */
  var onAnimationGroupEndObservable: Observable[AnimationGroup] = js.native
  /**
           * This observable will notify when all animations have paused.
           */
  var onAnimationGroupPauseObservable: Observable[AnimationGroup] = js.native
  /**
           * Gets or sets the speed ratio to use for all animations
           */
  /**
          * Gets or sets the speed ratio to use for all animations
          */
  var speedRatio: scala.Double = js.native
  /**
           * Gets the targeted animations for this animation group
           */
  val targetedAnimations: js.Array[TargetedAnimation] = js.native
  /**
           * Gets the last frame
           */
  val to: scala.Double = js.native
  /**
           * Add an animation (with its target) in the group
           * @param animation defines the animation we want to add
           * @param target defines the target of the animation
           * @returns the TargetedAnimation object
           */
  def addTargetedAnimation(animation: Animation, target: js.Any): TargetedAnimation = js.native
  /**
           * Releases all held resources
           */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
           * Returns the string "AnimationGroup"
           * @returns "AnimationGroup"
           */
  def getClassName(): java.lang.String = js.native
  /**
           * Goes to a specific frame in this animation group
           * @param frame the frame number to go to
           * @return the animationGroup
           */
  def goToFrame(frame: scala.Double): AnimationGroup = js.native
  /**
           * This function will normalize every animation in the group to make sure they all go from beginFrame to endFrame
           * It can add constant keys at begin or end
           * @param beginFrame defines the new begin frame for all animations or the smallest begin frame of all animations if null (defaults to null)
           * @param endFrame defines the new end frame for all animations or the largest end frame of all animations if null (defaults to null)
           * @returns the animation group
           */
  def normalize(): AnimationGroup = js.native
  /**
           * This function will normalize every animation in the group to make sure they all go from beginFrame to endFrame
           * It can add constant keys at begin or end
           * @param beginFrame defines the new begin frame for all animations or the smallest begin frame of all animations if null (defaults to null)
           * @param endFrame defines the new end frame for all animations or the largest end frame of all animations if null (defaults to null)
           * @returns the animation group
           */
  def normalize(beginFrame: Nullable[scala.Double]): AnimationGroup = js.native
  /**
           * This function will normalize every animation in the group to make sure they all go from beginFrame to endFrame
           * It can add constant keys at begin or end
           * @param beginFrame defines the new begin frame for all animations or the smallest begin frame of all animations if null (defaults to null)
           * @param endFrame defines the new end frame for all animations or the largest end frame of all animations if null (defaults to null)
           * @returns the animation group
           */
  def normalize(beginFrame: Nullable[scala.Double], endFrame: Nullable[scala.Double]): AnimationGroup = js.native
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
  /**
           * Play all animations to initial state
           * This function will start() the animations if they were not started or will restart() them if they were paused
           * @param loop defines if animations must loop
           * @returns the animation group
           */
  def play(loop: scala.Boolean): AnimationGroup = js.native
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
           * Set animation weight for all animatables
           * @param weight defines the weight to use
           * @return the animationGroup
           * @see http://doc.babylonjs.com/babylon101/animations#animation-weights
           */
  def setWeightForAllAnimatables(weight: scala.Double): AnimationGroup = js.native
  /**
           * Start all animations on given targets
           * @param loop defines if animations must loop
           * @param speedRatio defines the ratio to apply to animation speed (1 by default)
           * @param from defines the from key (optional)
           * @param to defines the to key (optional)
           * @returns the current animation group
           */
  def start(): AnimationGroup = js.native
  /**
           * Start all animations on given targets
           * @param loop defines if animations must loop
           * @param speedRatio defines the ratio to apply to animation speed (1 by default)
           * @param from defines the from key (optional)
           * @param to defines the to key (optional)
           * @returns the current animation group
           */
  def start(loop: scala.Boolean): AnimationGroup = js.native
  /**
           * Start all animations on given targets
           * @param loop defines if animations must loop
           * @param speedRatio defines the ratio to apply to animation speed (1 by default)
           * @param from defines the from key (optional)
           * @param to defines the to key (optional)
           * @returns the current animation group
           */
  def start(loop: scala.Boolean, speedRatio: scala.Double): AnimationGroup = js.native
  /**
           * Start all animations on given targets
           * @param loop defines if animations must loop
           * @param speedRatio defines the ratio to apply to animation speed (1 by default)
           * @param from defines the from key (optional)
           * @param to defines the to key (optional)
           * @returns the current animation group
           */
  def start(loop: scala.Boolean, speedRatio: scala.Double, from: scala.Double): AnimationGroup = js.native
  /**
           * Start all animations on given targets
           * @param loop defines if animations must loop
           * @param speedRatio defines the ratio to apply to animation speed (1 by default)
           * @param from defines the from key (optional)
           * @param to defines the to key (optional)
           * @returns the current animation group
           */
  def start(loop: scala.Boolean, speedRatio: scala.Double, from: scala.Double, to: scala.Double): AnimationGroup = js.native
  /**
           * Stop all animations
           * @returns the animation group
           */
  def stop(): AnimationGroup = js.native
  /**
           * Synchronize and normalize all animatables with a source animatable
           * @param root defines the root animatable to synchronize with
           * @return the animationGroup
           * @see http://doc.babylonjs.com/babylon101/animations#animation-weights
           */
  def syncAllAnimationsWith(root: Animatable): AnimationGroup = js.native
  /**
           * Creates a detailled string about the object
           * @param fullDetails defines if the output string will support multiple levels of logging within scene loading
           * @returns a string representing the object
           */
  def toString(fullDetails: scala.Boolean): java.lang.String = js.native
}

/**
     * Use this class to create coordinated animations on multiple targets
     */
@JSGlobal("BABYLON.AnimationGroup")
@js.native
object AnimationGroup extends js.Object {
  /**
           * Returns a new AnimationGroup object parsed from the source provided.
           * @param parsedAnimationGroup defines the source
           * @param scene defines the scene that will receive the animationGroup
           * @returns a new AnimationGroup
           */
  def Parse(parsedAnimationGroup: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.AnimationGroup = js.native
}

