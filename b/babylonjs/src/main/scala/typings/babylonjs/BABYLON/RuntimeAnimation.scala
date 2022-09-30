package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeAnimation extends StObject {
  
  /**
    * The active target of the runtime animation
    */
  /* private */ var _activeTargets: Any = js.native
  
  /**
    * The animation used by the runtime animation
    */
  /* private */ var _animation: Any = js.native
  
  /** @internal */
  var _animationState: IAnimationState = js.native
  
  /**
    * The blending factor of the runtime animation
    */
  /* private */ var _blendingFactor: Any = js.native
  
  /* private */ var _currentActiveTarget: Any = js.native
  
  /**
    * The current frame of the runtime animation
    */
  /* private */ var _currentFrame: Any = js.native
  
  /**
    * The current value of the runtime animation
    */
  /* private */ var _currentValue: Any = js.native
  
  /* private */ var _directTarget: Any = js.native
  
  /* private */ var _enableBlending: Any = js.native
  
  /* private */ var _events: Any = js.native
  
  /**
    * Gets the loop pmode of the runtime animation
    * @returns Loop Mode
    */
  /* private */ var _getCorrectLoopMode: Any = js.native
  
  /* private */ var _getOriginalValues: Any = js.native
  
  /**
    * The high limits cache of the runtime animation
    */
  /* private */ var _highLimitsCache: Any = js.native
  
  /**
    * The initiating animatable
    */
  /* private */ var _host: Any = js.native
  
  /* private */ var _keys: Any = js.native
  
  /* private */ var _maxFrame: Any = js.native
  
  /* private */ var _maxValue: Any = js.native
  
  /* private */ var _minFrame: Any = js.native
  
  /* private */ var _minValue: Any = js.native
  
  /**
    * The offsets cache of the runtime animation
    */
  /* private */ var _offsetsCache: Any = js.native
  
  /** @internal */
  def _onLoop(): Unit = js.native
  
  /**
    * The original blend value of the runtime animation
    */
  /* private */ var _originalBlendValue: Any = js.native
  
  /**
    * The original value of the runtime animation
    */
  /* private */ var _originalValue: Any = js.native
  
  /**
    * @internal Internal use only
    */
  def _prepareForSpeedRatioChange(newSpeedRatio: Double): Unit = js.native
  
  /* private */ var _preparePath: Any = js.native
  
  /**
    * The previous delay of the runtime animation
    */
  /* private */ var _previousDelay: Any = js.native
  
  /**
    * The previous ratio of the runtime animation
    */
  /* private */ var _previousRatio: Any = js.native
  
  /**
    * The ratio offset of the runtime animation
    */
  /* private */ var _ratioOffset: Any = js.native
  
  /**
    * The BabylonJS scene
    */
  /* private */ var _scene: Any = js.native
  
  /* private */ var _setValue: Any = js.native
  
  /**
    * Specifies if the runtime animation has been stopped
    */
  /* private */ var _stopped: Any = js.native
  
  /**
    * The target of the runtime animation
    */
  /* private */ var _target: Any = js.native
  
  /* private */ var _targetIsArray: Any = js.native
  
  /**
    * The target path of the runtime animation
    */
  /* private */ var _targetPath: Any = js.native
  
  /**
    * The weight of the runtime animation
    */
  /* private */ var _weight: Any = js.native
  
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
  def animate(delay: Double, from: Double, to: Double, loop: Boolean, speedRatio: Double): Boolean = js.native
  def animate(delay: Double, from: Double, to: Double, loop: Boolean, speedRatio: Double, weight: Double): Boolean = js.native
  
  /**
    * Gets the animation from the runtime animation
    */
  def animation: Animation = js.native
  
  /**
    * Gets the current frame of the runtime animation
    */
  def currentFrame: Double = js.native
  
  /**
    * Gets the current value of the runtime animation
    */
  def currentValue: Any = js.native
  
  /**
    * Disposes of the runtime animation
    */
  def dispose(): Unit = js.native
  
  /**
    * Move the current animation to a given frame
    * @param frame defines the frame to move to
    */
  def goToFrame(frame: Double): Unit = js.native
  
  /**
    * Gets the additive state of the runtime animation
    */
  def isAdditive: Boolean = js.native
  
  /**
    * Specifies if the runtime animation is stopped
    * @returns Boolean specifying if the runtime animation is stopped
    */
  def isStopped(): Boolean = js.native
  
  /**
    * Resets the runtime animation to the beginning
    * @param restoreOriginal defines whether to restore the target property to the original value
    */
  def reset(): Unit = js.native
  def reset(restoreOriginal: Boolean): Unit = js.native
  
  /**
    * Apply the interpolated value to the target
    * @param currentValue defines the value computed by the animation
    * @param weight defines the weight to apply to this value (Defaults to 1.0)
    */
  def setValue(currentValue: Any, weight: Double): Unit = js.native
  
  /**
    * Gets the actual target of the runtime animation
    */
  def target: Any = js.native
  
  /**
    * Gets or sets the target path of the runtime animation
    */
  def targetPath: String = js.native
  
  /**
    * Gets the weight of the runtime animation
    */
  def weight: Double = js.native
}
