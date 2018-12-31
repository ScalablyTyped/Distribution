package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a runtime animation
  */
@JSGlobal("BABYLON.RuntimeAnimation")
@js.native
class RuntimeAnimation protected () extends js.Object {
  /**
    * Create a new RuntimeAnimation object
    * @param target defines the target of the animation
    * @param animation defines the source animation object
    * @param scene defines the hosting scene
    * @param host defines the initiating Animatable
    */
  def this(target: js.Any, animation: Animation, scene: Scene, host: Animatable) = this()
  /**
    * The active target of the runtime animation
    */
  var _activeTarget: js.Any = js.native
  /**
    * The animation used by the runtime animation
    */
  var _animation: js.Any = js.native
  /**
    * The blending factor of the runtime animation
    */
  var _blendingFactor: js.Any = js.native
  /**
    * The current frame of the runtime animation
    */
  var _currentFrame: js.Any = js.native
  /**
    * The current value of the runtime animation
    */
  var _currentValue: js.Any = js.native
  var _events: js.Any = js.native
  /**
    * Gets the loop pmode of the runtime animation
    * @returns Loop Mode
    */
  var _getCorrectLoopMode: js.Any = js.native
  /**
    * The high limits cache of the runtime animation
    */
  var _highLimitsCache: js.Any = js.native
  /**
    * The initiating animatable
    */
  var _host: js.Any = js.native
  /**
    * Interpolates the animation from the current frame
    * @param currentFrame The frame to interpolate the animation to
    * @param repeatCount The number of times that the animation should loop
    * @param loopMode The type of looping mode to use
    * @param offsetValue Animation offset value
    * @param highLimitValue The high limit value
    * @returns The interpolated value
    */
  var _interpolate: js.Any = js.native
  /**
    * The offsets cache of the runtime animation
    */
  var _offsetsCache: js.Any = js.native
  /**
    * The original blend value of the runtime animation
    */
  var _originalBlendValue: js.Any = js.native
  /**
    * The original value of the runtime animation
    */
  var _originalValue: js.Any = js.native
  /**
    * The previous delay of the runtime animation
    */
  var _previousDelay: js.Any = js.native
  /**
    * The previous ratio of the runtime animation
    */
  var _previousRatio: js.Any = js.native
  /**
    * The ratio offset of the runtime animation
    */
  var _ratioOffset: js.Any = js.native
  /**
    * The BabylonJS scene
    */
  var _scene: js.Any = js.native
  var _setValue: js.Any = js.native
  /**
    * Specifies if the runtime animation has been stopped
    */
  var _stopped: js.Any = js.native
  /**
    * The target of the runtime animation
    */
  var _target: js.Any = js.native
  /**
    * The target path of the runtime animation
    */
  var _targetPath: js.Any = js.native
  /**
    * The weight of the runtime animation
    */
  var _weight: js.Any = js.native
  /** @hidden */
  var _workValue: js.Any = js.native
  /**
    * Gets the animation from the runtime animation
    */
  val animation: Animation = js.native
  /**
    * Gets the current frame of the runtime animation
    */
  val currentFrame: scala.Double = js.native
  /**
    * Gets the current value of the runtime animation
    */
  val currentValue: js.Any = js.native
  /**
    * Gets the actual target of the runtime animation
    */
  val target: js.Any = js.native
  /**
    * Gets the target path of the runtime animation
    */
  val targetPath: java.lang.String = js.native
  /**
    * Gets the weight of the runtime animation
    */
  val weight: scala.Double = js.native
  /**
    * @hidden Internal use only
    */
  def _prepareForSpeedRatioChange(newSpeedRatio: scala.Double): scala.Unit = js.native
  /**
    * Execute the current animation
    * @param delay defines the delay to add to the current frame
    * @param from defines the lower bound of the animation range
    * @param to defines the upper bound of the animation range
    * @param loop defines if the current animation must loop
    * @param speedRatio defines the current speed ratio
    * @param weight defines the weight of the animation (default is -1 so no weight)
    * @returns a boolean indicating if the animation is running
    */
  def animate(
    delay: scala.Double,
    from: scala.Double,
    to: scala.Double,
    loop: scala.Boolean,
    speedRatio: scala.Double
  ): scala.Boolean = js.native
  def animate(
    delay: scala.Double,
    from: scala.Double,
    to: scala.Double,
    loop: scala.Boolean,
    speedRatio: scala.Double,
    weight: scala.Double
  ): scala.Boolean = js.native
  /**
    * Disposes of the runtime animation
    */
  def dispose(): scala.Unit = js.native
  /**
    * Move the current animation to a given frame
    * @param frame defines the frame to move to
    */
  def goToFrame(frame: scala.Double): scala.Unit = js.native
  /**
    * Specifies if the runtime animation is stopped
    * @returns Boolean specifying if the runtime animation is stopped
    */
  def isStopped(): scala.Boolean = js.native
  /**
    * Resets the runtime animation to the beginning
    * @param restoreOriginal defines whether to restore the target property to the original value
    */
  def reset(): scala.Unit = js.native
  def reset(restoreOriginal: scala.Boolean): scala.Unit = js.native
  /**
    * Apply the interpolated value to the target
    * @param currentValue defines the value computed by the animation
    * @param weight defines the weight to apply to this value (Defaults to 1.0)
    */
  def setValue(currentValue: js.Any): scala.Unit = js.native
  def setValue(currentValue: js.Any, weight: scala.Double): scala.Unit = js.native
}

