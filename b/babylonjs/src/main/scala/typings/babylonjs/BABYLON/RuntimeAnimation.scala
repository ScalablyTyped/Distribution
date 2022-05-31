package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeAnimation extends StObject {
  
  /**
    * The active target of the runtime animation
    */
  /* private */ var _activeTargets: js.Any = js.native
  
  /**
    * The animation used by the runtime animation
    */
  /* private */ var _animation: js.Any = js.native
  
  /** @hidden */
  var _animationState: IAnimationState = js.native
  
  /**
    * The blending factor of the runtime animation
    */
  /* private */ var _blendingFactor: js.Any = js.native
  
  /* private */ var _currentActiveTarget: js.Any = js.native
  
  /**
    * The current frame of the runtime animation
    */
  /* private */ var _currentFrame: js.Any = js.native
  
  /**
    * The current value of the runtime animation
    */
  /* private */ var _currentValue: js.Any = js.native
  
  /* private */ var _directTarget: js.Any = js.native
  
  /* private */ var _enableBlending: js.Any = js.native
  
  /* private */ var _events: js.Any = js.native
  
  /**
    * Gets the loop pmode of the runtime animation
    * @returns Loop Mode
    */
  /* private */ var _getCorrectLoopMode: js.Any = js.native
  
  /* private */ var _getOriginalValues: js.Any = js.native
  
  /**
    * The high limits cache of the runtime animation
    */
  /* private */ var _highLimitsCache: js.Any = js.native
  
  /**
    * The initiating animatable
    */
  /* private */ var _host: js.Any = js.native
  
  /* private */ var _keys: js.Any = js.native
  
  /* private */ var _maxFrame: js.Any = js.native
  
  /* private */ var _maxValue: js.Any = js.native
  
  /* private */ var _minFrame: js.Any = js.native
  
  /* private */ var _minValue: js.Any = js.native
  
  /**
    * The offsets cache of the runtime animation
    */
  /* private */ var _offsetsCache: js.Any = js.native
  
  /** @hidden */
  def _onLoop(): Unit = js.native
  
  /**
    * The original blend value of the runtime animation
    */
  /* private */ var _originalBlendValue: js.Any = js.native
  
  /**
    * The original value of the runtime animation
    */
  /* private */ var _originalValue: js.Any = js.native
  
  /**
    * @hidden Internal use only
    */
  def _prepareForSpeedRatioChange(newSpeedRatio: Double): Unit = js.native
  
  /* private */ var _preparePath: js.Any = js.native
  
  /**
    * The previous delay of the runtime animation
    */
  /* private */ var _previousDelay: js.Any = js.native
  
  /**
    * The previous ratio of the runtime animation
    */
  /* private */ var _previousRatio: js.Any = js.native
  
  /**
    * The ratio offset of the runtime animation
    */
  /* private */ var _ratioOffset: js.Any = js.native
  
  /**
    * The BabylonJS scene
    */
  /* private */ var _scene: js.Any = js.native
  
  /* private */ var _setValue: js.Any = js.native
  
  /**
    * Specifies if the runtime animation has been stopped
    */
  /* private */ var _stopped: js.Any = js.native
  
  /**
    * The target of the runtime animation
    */
  /* private */ var _target: js.Any = js.native
  
  /* private */ var _targetIsArray: js.Any = js.native
  
  /**
    * The target path of the runtime animation
    */
  /* private */ var _targetPath: js.Any = js.native
  
  /**
    * The weight of the runtime animation
    */
  /* private */ var _weight: js.Any = js.native
  
  /**
    * Execute the current animation
    * @param delay defines the delay to add to the current frame
    * @param from defines the lower bound of the animation range
    * @param to defines the upper bound of the animation range
    * @param loop defines if the current animation must loop
    * @param speedRatio defines the current speed ratio
    * @param weight defines the weight of the animation (default is -1 so no weight)
    * @param onLoop optional callback called when animation loops
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
  def currentValue: js.Any = js.native
  
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
  def setValue(currentValue: js.Any, weight: Double): Unit = js.native
  
  /**
    * Gets the actual target of the runtime animation
    */
  def target: js.Any = js.native
  
  /**
    * Gets the target path of the runtime animation
    */
  def targetPath: String = js.native
  
  /**
    * Gets the weight of the runtime animation
    */
  def weight: Double = js.native
}
