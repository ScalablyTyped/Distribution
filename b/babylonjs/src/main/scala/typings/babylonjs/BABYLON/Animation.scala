package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends js.Object {
  
  /**
    * Stores the easing function of the animation
    */
  var _easingFunction: js.Any = js.native
  
  /**
    * The set of event that will be linked to this animation
    */
  var _events: js.Any = js.native
  
  /**
    * @hidden Internal use only
    */
  def _getKeyValue(value: js.Any): js.Any = js.native
  
  /**
    * @hidden Internal use only
    */
  def _interpolate(currentFrame: Double, state: IAnimationState): js.Any = js.native
  
  /**
    * Stores the key frames of the animation
    */
  var _keys: js.Any = js.native
  
  /**
    * Stores the animation ranges for the animation
    */
  var _ranges: js.Any = js.native
  
  /**
    * @hidden Internal use only
    */
  var _runtimeAnimations: js.Array[RuntimeAnimation] = js.native
  
  /**
    * Add an event to this animation
    * @param event Event to add
    */
  def addEvent(event: AnimationEvent): Unit = js.native
  
  /**
    * Stores the blending speed of the animation
    */
  var blendingSpeed: Double = js.native
  
  /**
    * Interpolates a Color3 linearly
    * @param startValue Start value of the animation curve
    * @param endValue End value of the animation curve
    * @param gradient Scalar amount to interpolate
    * @returns Interpolated Color3 value
    */
  def color3InterpolateFunction(startValue: Color3, endValue: Color3, gradient: Double): Color3 = js.native
  
  /**
    * Interpolates a Color4 linearly
    * @param startValue Start value of the animation curve
    * @param endValue End value of the animation curve
    * @param gradient Scalar amount to interpolate
    * @returns Interpolated Color3 value
    */
  def color4InterpolateFunction(startValue: Color4, endValue: Color4, gradient: Double): Color4 = js.native
  
  /**
    * Creates an animation range
    * @param name Name of the animation range
    * @param from Starting frame of the animation range
    * @param to Ending frame of the animation
    */
  def createRange(name: String, from: Double, to: Double): Unit = js.native
  
  /**The data type of the animation */
  var dataType: Double = js.native
  
  /**
    * Deletes an animation range by name
    * @param name Name of the animation range to delete
    * @param deleteFrames Specifies if the key frames for the range should also be deleted (true) or not (false)
    */
  def deleteRange(name: String): Unit = js.native
  def deleteRange(name: String, deleteFrames: Boolean): Unit = js.native
  
  /**Specifies if blending should be enabled */
  var enableBlending: js.UndefOr[Boolean] = js.native
  
  /**
    * Interpolates a scalar linearly
    * @param startValue Start value of the animation curve
    * @param endValue End value of the animation curve
    * @param gradient Scalar amount to interpolate
    * @returns Interpolated scalar value
    */
  def floatInterpolateFunction(startValue: Double, endValue: Double, gradient: Double): Double = js.native
  
  /**
    * Interpolates a scalar cubically
    * @param startValue Start value of the animation curve
    * @param outTangent End tangent of the animation
    * @param endValue End value of the animation curve
    * @param inTangent Start tangent of the animation curve
    * @param gradient Scalar amount to interpolate
    * @returns Interpolated scalar value
    */
  def floatInterpolateFunctionWithTangents(startValue: Double, outTangent: Double, endValue: Double, inTangent: Double, gradient: Double): Double = js.native
  
  /**The frames per second of the animation */
  var framePerSecond: Double = js.native
  
  /**
    * Gets the easing function of the animation
    * @returns Easing function of the animation
    */
  def getEasingFunction(): IEasingFunction = js.native
  
  /**
    * Retrieves all the events from the animation
    * @returns Events from the animation
    */
  def getEvents(): js.Array[AnimationEvent] = js.native
  
  /**
    * Gets the highest frame rate of the animation
    * @returns Highest frame rate of the animation
    */
  def getHighestFrame(): Double = js.native
  
  /**
    * Gets the key frames from the animation
    * @returns The key frames of the animation
    */
  def getKeys(): js.Array[IAnimationKey] = js.native
  
  /**
    * Gets the animation range by name, or null if not defined
    * @param name Name of the animation range
    * @returns Nullable animation range
    */
  def getRange(name: String): Nullable[AnimationRange] = js.native
  
  /**
    * Specifies if any of the runtime animations are currently running
    */
  def hasRunningRuntimeAnimations: Boolean = js.native
  
  /**The loop mode of the animation */
  var loopMode: js.UndefOr[Double] = js.native
  
  /**
    * Defines the function to use to interpolate matrices
    * @param startValue defines the start matrix
    * @param endValue defines the end matrix
    * @param gradient defines the gradient between both matrices
    * @param result defines an optional target matrix where to store the interpolation
    * @returns the interpolated matrix
    */
  def matrixInterpolateFunction(startValue: Matrix, endValue: Matrix, gradient: Double): Matrix = js.native
  def matrixInterpolateFunction(startValue: Matrix, endValue: Matrix, gradient: Double, result: Matrix): Matrix = js.native
  
  /**Name of the animation */
  var name: String = js.native
  
  /**
    * Interpolates a quaternion using a spherical linear interpolation
    * @param startValue Start value of the animation curve
    * @param endValue End value of the animation curve
    * @param gradient Scalar amount to interpolate
    * @returns Interpolated quaternion value
    */
  def quaternionInterpolateFunction(startValue: Quaternion, endValue: Quaternion, gradient: Double): Quaternion = js.native
  
  /**
    * Interpolates a quaternion cubically
    * @param startValue Start value of the animation curve
    * @param outTangent End tangent of the animation curve
    * @param endValue End value of the animation curve
    * @param inTangent Start tangent of the animation curve
    * @param gradient Scalar amount to interpolate
    * @returns Interpolated quaternion value
    */
  def quaternionInterpolateFunctionWithTangents(
    startValue: Quaternion,
    outTangent: Quaternion,
    endValue: Quaternion,
    inTangent: Quaternion,
    gradient: Double
  ): Quaternion = js.native
  
  /**
    * Remove all events found at the given frame
    * @param frame The frame to remove events from
    */
  def removeEvents(frame: Double): Unit = js.native
  
  /**
    * Return the array of runtime animations currently using this animation
    */
  def runtimeAnimations: js.Array[RuntimeAnimation] = js.native
  
  /**
    * Serializes the animation to an object
    * @returns Serialized object
    */
  def serialize(): js.Any = js.native
  
  /**
    * Sets the easing function of the animation
    * @param easingFunction A custom mathematical formula for animation
    */
  def setEasingFunction(easingFunction: EasingFunction): Unit = js.native
  
  /**
    * Sets the key frames of the animation
    * @param values The animation key frames to set
    */
  def setKeys(values: js.Array[IAnimationKey]): Unit = js.native
  
  /**
    * Interpolates a size linearly
    * @param startValue Start value of the animation curve
    * @param endValue End value of the animation curve
    * @param gradient Scalar amount to interpolate
    * @returns Interpolated Size value
    */
  def sizeInterpolateFunction(startValue: Size, endValue: Size, gradient: Double): Size = js.native
  
  /** Snippet ID if the animation was created from the snippet server */
  var snippetId: String = js.native
  
  /**Property to animate */
  var targetProperty: String = js.native
  
  /**
    * Stores an array of target property paths
    */
  var targetPropertyPath: js.Array[String] = js.native
  
  def toString(fullDetails: Boolean): String = js.native
  
  /**
    * Interpolates a Vector2 linearly
    * @param startValue Start value of the animation curve
    * @param endValue End value of the animation curve
    * @param gradient Scalar amount to interpolate
    * @returns Interpolated Vector2 value
    */
  def vector2InterpolateFunction(startValue: Vector2, endValue: Vector2, gradient: Double): Vector2 = js.native
  
  /**
    * Interpolates a Vector2 cubically
    * @param startValue Start value of the animation curve
    * @param outTangent End tangent of the animation
    * @param endValue End value of the animation curve
    * @param inTangent Start tangent of the animation curve
    * @param gradient Scalar amount to interpolate
    * @returns Interpolated Vector2 value
    */
  def vector2InterpolateFunctionWithTangents(startValue: Vector2, outTangent: Vector2, endValue: Vector2, inTangent: Vector2, gradient: Double): Vector2 = js.native
  
  /**
    * Interpolates a Vector3 linearl
    * @param startValue Start value of the animation curve
    * @param endValue End value of the animation curve
    * @param gradient Scalar amount to interpolate
    * @returns Interpolated scalar value
    */
  def vector3InterpolateFunction(startValue: Vector3, endValue: Vector3, gradient: Double): Vector3 = js.native
  
  /**
    * Interpolates a Vector3 cubically
    * @param startValue Start value of the animation curve
    * @param outTangent End tangent of the animation
    * @param endValue End value of the animation curve
    * @param inTangent Start tangent of the animation curve
    * @param gradient Scalar amount to interpolate
    * @returns InterpolatedVector3 value
    */
  def vector3InterpolateFunctionWithTangents(startValue: Vector3, outTangent: Vector3, endValue: Vector3, inTangent: Vector3, gradient: Double): Vector3 = js.native
}
