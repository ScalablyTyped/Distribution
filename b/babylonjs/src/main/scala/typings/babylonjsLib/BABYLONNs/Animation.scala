package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to store any kind of animation
     */
@JSGlobal("BABYLON.Animation")
@js.native
class Animation protected () extends js.Object {
  /**
           * Initializes the animation
           * @param name Name of the animation
           * @param targetProperty Property to animate
           * @param framePerSecond The frames per second of the animation
           * @param dataType The data type of the animation
           * @param loopMode The loop mode of the animation
           * @param enableBlendings Specifies if blending should be enabled
           */
  def this(/**Name of the animation */
  name: java.lang.String, /**Property to animate */
  targetProperty: java.lang.String, /**The frames per second of the animation */
  framePerSecond: scala.Double, /**The data type of the animation */
  dataType: scala.Double) = this()
  /**
           * Initializes the animation
           * @param name Name of the animation
           * @param targetProperty Property to animate
           * @param framePerSecond The frames per second of the animation
           * @param dataType The data type of the animation
           * @param loopMode The loop mode of the animation
           * @param enableBlendings Specifies if blending should be enabled
           */
  def this(/**Name of the animation */
  name: java.lang.String, /**Property to animate */
  targetProperty: java.lang.String, /**The frames per second of the animation */
  framePerSecond: scala.Double, /**The data type of the animation */
  dataType: scala.Double, /**The loop mode of the animation */
  loopMode: scala.Double) = this()
  /**
           * Initializes the animation
           * @param name Name of the animation
           * @param targetProperty Property to animate
           * @param framePerSecond The frames per second of the animation
           * @param dataType The data type of the animation
           * @param loopMode The loop mode of the animation
           * @param enableBlendings Specifies if blending should be enabled
           */
  def this(/**Name of the animation */
  name: java.lang.String, /**Property to animate */
  targetProperty: java.lang.String, /**The frames per second of the animation */
  framePerSecond: scala.Double, /**The data type of the animation */
  dataType: scala.Double, /**The loop mode of the animation */
  loopMode: js.UndefOr[scala.Nothing], /**Specifies if blending should be enabled */
  enableBlending: scala.Boolean) = this()
  /**
           * Initializes the animation
           * @param name Name of the animation
           * @param targetProperty Property to animate
           * @param framePerSecond The frames per second of the animation
           * @param dataType The data type of the animation
           * @param loopMode The loop mode of the animation
           * @param enableBlendings Specifies if blending should be enabled
           */
  def this(/**Name of the animation */
  name: java.lang.String, /**Property to animate */
  targetProperty: java.lang.String, /**The frames per second of the animation */
  framePerSecond: scala.Double, /**The data type of the animation */
  dataType: scala.Double, /**The loop mode of the animation */
  loopMode: scala.Double, /**Specifies if blending should be enabled */
  enableBlending: scala.Boolean) = this()
  /**
           * Stores the easing function of the animation
           */
  var _easingFunction: js.Any = js.native
  /**
           * The set of event that will be linked to this animation
           */
  var _events: js.Any = js.native
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
           * Stores the blending speed of the animation
           */
  var blendingSpeed: scala.Double = js.native
  /**The data type of the animation */
  var dataType: scala.Double = js.native
  /**Specifies if blending should be enabled */
  var enableBlending: js.UndefOr[scala.Boolean] = js.native
  /**The frames per second of the animation */
  var framePerSecond: scala.Double = js.native
  /**
           * Specifies if any of the runtime animations are currently running
           */
  val hasRunningRuntimeAnimations: scala.Boolean = js.native
  /**The loop mode of the animation */
  var loopMode: js.UndefOr[scala.Double] = js.native
  /**Name of the animation */
  var name: java.lang.String = js.native
  /**
           * Return the array of runtime animations currently using this animation
           */
  val runtimeAnimations: js.Array[RuntimeAnimation] = js.native
  /**Property to animate */
  var targetProperty: java.lang.String = js.native
  /**
           * Stores an array of target property paths
           */
  var targetPropertyPath: js.Array[java.lang.String] = js.native
  /**
           * @hidden Internal use only
           */
  def _getKeyValue(value: js.Any): js.Any = js.native
  /**
           * @hidden Internal use only
           */
  def _interpolate(currentFrame: scala.Double, repeatCount: scala.Double): js.Any = js.native
  /**
           * @hidden Internal use only
           */
  def _interpolate(currentFrame: scala.Double, repeatCount: scala.Double, workValue: js.Any): js.Any = js.native
  /**
           * @hidden Internal use only
           */
  def _interpolate(currentFrame: scala.Double, repeatCount: scala.Double, workValue: js.Any, loopMode: scala.Double): js.Any = js.native
  /**
           * @hidden Internal use only
           */
  def _interpolate(
    currentFrame: scala.Double,
    repeatCount: scala.Double,
    workValue: js.Any,
    loopMode: scala.Double,
    offsetValue: js.Any
  ): js.Any = js.native
  /**
           * @hidden Internal use only
           */
  def _interpolate(
    currentFrame: scala.Double,
    repeatCount: scala.Double,
    workValue: js.Any,
    loopMode: scala.Double,
    offsetValue: js.Any,
    highLimitValue: js.Any
  ): js.Any = js.native
  /**
           * Add an event to this animation
           * @param event Event to add
           */
  def addEvent(event: AnimationEvent): scala.Unit = js.native
  /**
           * Interpolates a Color3 linearly
           * @param startValue Start value of the animation curve
           * @param endValue End value of the animation curve
           * @param gradient Scalar amount to interpolate
           * @returns Interpolated Color3 value
           */
  def color3InterpolateFunction(startValue: Color3, endValue: Color3, gradient: scala.Double): Color3 = js.native
  /**
           * Creates an animation range
           * @param name Name of the animation range
           * @param from Starting frame of the animation range
           * @param to Ending frame of the animation
           */
  def createRange(name: java.lang.String, from: scala.Double, to: scala.Double): scala.Unit = js.native
  /**
           * Deletes an animation range by name
           * @param name Name of the animation range to delete
           * @param deleteFrames Specifies if the key frames for the range should also be deleted (true) or not (false)
           */
  def deleteRange(name: java.lang.String): scala.Unit = js.native
  /**
           * Deletes an animation range by name
           * @param name Name of the animation range to delete
           * @param deleteFrames Specifies if the key frames for the range should also be deleted (true) or not (false)
           */
  def deleteRange(name: java.lang.String, deleteFrames: scala.Boolean): scala.Unit = js.native
  /**
           * Interpolates a scalar linearly
           * @param startValue Start value of the animation curve
           * @param endValue End value of the animation curve
           * @param gradient Scalar amount to interpolate
           * @returns Interpolated scalar value
           */
  def floatInterpolateFunction(startValue: scala.Double, endValue: scala.Double, gradient: scala.Double): scala.Double = js.native
  /**
           * Interpolates a scalar cubically
           * @param startValue Start value of the animation curve
           * @param outTangent End tangent of the animation
           * @param endValue End value of the animation curve
           * @param inTangent Start tangent of the animation curve
           * @param gradient Scalar amount to interpolate
           * @returns Interpolated scalar value
           */
  def floatInterpolateFunctionWithTangents(
    startValue: scala.Double,
    outTangent: scala.Double,
    endValue: scala.Double,
    inTangent: scala.Double,
    gradient: scala.Double
  ): scala.Double = js.native
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
  def getHighestFrame(): scala.Double = js.native
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
  def getRange(name: java.lang.String): Nullable[AnimationRange] = js.native
  /**
           * Defines the function to use to interpolate matrices
           * @param startValue defines the start matrix
           * @param endValue defines the end matrix
           * @param gradient defines the gradient between both matrices
           * @param result defines an optional target matrix where to store the interpolation
           * @returns the interpolated matrix
           */
  def matrixInterpolateFunction(startValue: Matrix, endValue: Matrix, gradient: scala.Double): Matrix = js.native
  /**
           * Defines the function to use to interpolate matrices
           * @param startValue defines the start matrix
           * @param endValue defines the end matrix
           * @param gradient defines the gradient between both matrices
           * @param result defines an optional target matrix where to store the interpolation
           * @returns the interpolated matrix
           */
  def matrixInterpolateFunction(startValue: Matrix, endValue: Matrix, gradient: scala.Double, result: Matrix): Matrix = js.native
  /**
           * Interpolates a quaternion using a spherical linear interpolation
           * @param startValue Start value of the animation curve
           * @param endValue End value of the animation curve
           * @param gradient Scalar amount to interpolate
           * @returns Interpolated quaternion value
           */
  def quaternionInterpolateFunction(startValue: Quaternion, endValue: Quaternion, gradient: scala.Double): Quaternion = js.native
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
    gradient: scala.Double
  ): Quaternion = js.native
  /**
           * Remove all events found at the given frame
           * @param frame The frame to remove events from
           */
  def removeEvents(frame: scala.Double): scala.Unit = js.native
  /**
           * Serializes the animation to an object
           * @returns Serialized object
           */
  def serialize(): js.Any = js.native
  /**
           * Sets the easing function of the animation
           * @param easingFunction A custom mathematical formula for animation
           */
  def setEasingFunction(easingFunction: EasingFunction): scala.Unit = js.native
  /**
           * Sets the key frames of the animation
           * @param values The animation key frames to set
           */
  def setKeys(values: js.Array[IAnimationKey]): scala.Unit = js.native
  /**
           * Interpolates a size linearly
           * @param startValue Start value of the animation curve
           * @param endValue End value of the animation curve
           * @param gradient Scalar amount to interpolate
           * @returns Interpolated Size value
           */
  def sizeInterpolateFunction(startValue: Size, endValue: Size, gradient: scala.Double): Size = js.native
  /**
           * Converts the animation to a string
           * @param fullDetails support for multiple levels of logging within scene loading
           * @returns String form of the animation
           */
  def toString(fullDetails: scala.Boolean): java.lang.String = js.native
  /**
           * Interpolates a Vector2 linearly
           * @param startValue Start value of the animation curve
           * @param endValue End value of the animation curve
           * @param gradient Scalar amount to interpolate
           * @returns Interpolated Vector2 value
           */
  def vector2InterpolateFunction(startValue: Vector2, endValue: Vector2, gradient: scala.Double): Vector2 = js.native
  /**
           * Interpolates a Vector2 cubically
           * @param startValue Start value of the animation curve
           * @param outTangent End tangent of the animation
           * @param endValue End value of the animation curve
           * @param inTangent Start tangent of the animation curve
           * @param gradient Scalar amount to interpolate
           * @returns Interpolated Vector2 value
           */
  def vector2InterpolateFunctionWithTangents(
    startValue: Vector2,
    outTangent: Vector2,
    endValue: Vector2,
    inTangent: Vector2,
    gradient: scala.Double
  ): Vector2 = js.native
  /**
           * Interpolates a Vector3 linearl
           * @param startValue Start value of the animation curve
           * @param endValue End value of the animation curve
           * @param gradient Scalar amount to interpolate
           * @returns Interpolated scalar value
           */
  def vector3InterpolateFunction(startValue: Vector3, endValue: Vector3, gradient: scala.Double): Vector3 = js.native
  /**
           * Interpolates a Vector3 cubically
           * @param startValue Start value of the animation curve
           * @param outTangent End tangent of the animation
           * @param endValue End value of the animation curve
           * @param inTangent Start tangent of the animation curve
           * @param gradient Scalar amount to interpolate
           * @returns InterpolatedVector3 value
           */
  def vector3InterpolateFunctionWithTangents(
    startValue: Vector3,
    outTangent: Vector3,
    endValue: Vector3,
    inTangent: Vector3,
    gradient: scala.Double
  ): Vector3 = js.native
}

/**
     * Class used to store any kind of animation
     */
@JSGlobal("BABYLON.Animation")
@js.native
object Animation extends js.Object {
  /**
           * Get the Constant Loop Mode
           */
  val ANIMATIONLOOPMODE_CONSTANT: scala.Double = js.native
  /**
           * Get the Cycle Loop Mode
           */
  val ANIMATIONLOOPMODE_CYCLE: scala.Double = js.native
  /**
           * Get the Relative Loop Mode
           */
  val ANIMATIONLOOPMODE_RELATIVE: scala.Double = js.native
  /**
           * Get the Color3 animation type
           */
  val ANIMATIONTYPE_COLOR3: scala.Double = js.native
  /**
           * Get the float animation type
           */
  val ANIMATIONTYPE_FLOAT: scala.Double = js.native
  /**
           * Get the Matrix animation type
           */
  val ANIMATIONTYPE_MATRIX: scala.Double = js.native
  /**
           * Get the Quaternion animation type
           */
  val ANIMATIONTYPE_QUATERNION: scala.Double = js.native
  /**
           * Get the Size animation type
           */
  val ANIMATIONTYPE_SIZE: scala.Double = js.native
  /**
           * Get the Vector2 animation type
           */
  val ANIMATIONTYPE_VECTOR2: scala.Double = js.native
  /**
           * Get the Vector3 animation type
           */
  val ANIMATIONTYPE_VECTOR3: scala.Double = js.native
  /**
           * Use matrix interpolation instead of using direct key value when animating matrices
           */
  var AllowMatricesInterpolation: scala.Boolean = js.native
  /**
           * When matrix interpolation is enabled, this boolean forces the system to use Matrix.DecomposeLerp instead of Matrix.Lerp. Interpolation is more precise but slower
           */
  var AllowMatrixDecomposeForInterpolation: scala.Boolean = js.native
  /**
           * Constant Loop Mode
           */
  var _ANIMATIONLOOPMODE_CONSTANT: js.Any = js.native
  /**
           * Cycle Loop Mode
           */
  var _ANIMATIONLOOPMODE_CYCLE: js.Any = js.native
  /**
           * Relative Loop Mode
           */
  var _ANIMATIONLOOPMODE_RELATIVE: js.Any = js.native
  /**
           * Color3 animation type
           */
  var _ANIMATIONTYPE_COLOR3: js.Any = js.native
  /**
           * Float animation type
           */
  var _ANIMATIONTYPE_FLOAT: js.Any = js.native
  /**
           * Matrix animation type
           */
  var _ANIMATIONTYPE_MATRIX: js.Any = js.native
  /**
           * Quaternion animation type
           */
  var _ANIMATIONTYPE_QUATERNION: js.Any = js.native
  /**
           * Size animation type
           */
  var _ANIMATIONTYPE_SIZE: js.Any = js.native
  /**
           * Vector2 animation type
           */
  var _ANIMATIONTYPE_VECTOR2: js.Any = js.native
  /**
           * Vector3 animation type
           */
  var _ANIMATIONTYPE_VECTOR3: js.Any = js.native
  /**
           * Appends the serialized animations from the source animations
           * @param source Source containing the animations
           * @param destination Target to store the animations
           */
  def AppendSerializedAnimations(source: babylonjsLib.BABYLONNs.IAnimatable, destination: js.Any): scala.Unit = js.native
  /**
           * Create and start an animation on a node
           * @param name defines the name of the global animation that will be run on all nodes
           * @param node defines the root node where the animation will take place
           * @param targetProperty defines property to animate
           * @param framePerSecond defines the number of frame per second yo use
           * @param totalFrame defines the number of frames in total
           * @param from defines the initial value
           * @param to defines the final value
           * @param loopMode defines which loop mode you want to use (off by default)
           * @param easingFunction defines the easing function to use (linear by default)
           * @param onAnimationEnd defines the callback to call when animation end
           * @returns the animatable created for this animation
           */
  def CreateAndStartAnimation(
    name: java.lang.String,
    node: babylonjsLib.BABYLONNs.Node,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animatable] = js.native
  /**
           * Create and start an animation on a node
           * @param name defines the name of the global animation that will be run on all nodes
           * @param node defines the root node where the animation will take place
           * @param targetProperty defines property to animate
           * @param framePerSecond defines the number of frame per second yo use
           * @param totalFrame defines the number of frames in total
           * @param from defines the initial value
           * @param to defines the final value
           * @param loopMode defines which loop mode you want to use (off by default)
           * @param easingFunction defines the easing function to use (linear by default)
           * @param onAnimationEnd defines the callback to call when animation end
           * @returns the animatable created for this animation
           */
  def CreateAndStartAnimation(
    name: java.lang.String,
    node: babylonjsLib.BABYLONNs.Node,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any,
    loopMode: scala.Double
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animatable] = js.native
  /**
           * Create and start an animation on a node
           * @param name defines the name of the global animation that will be run on all nodes
           * @param node defines the root node where the animation will take place
           * @param targetProperty defines property to animate
           * @param framePerSecond defines the number of frame per second yo use
           * @param totalFrame defines the number of frames in total
           * @param from defines the initial value
           * @param to defines the final value
           * @param loopMode defines which loop mode you want to use (off by default)
           * @param easingFunction defines the easing function to use (linear by default)
           * @param onAnimationEnd defines the callback to call when animation end
           * @returns the animatable created for this animation
           */
  def CreateAndStartAnimation(
    name: java.lang.String,
    node: babylonjsLib.BABYLONNs.Node,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any,
    loopMode: scala.Double,
    easingFunction: babylonjsLib.BABYLONNs.EasingFunction
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animatable] = js.native
  /**
           * Create and start an animation on a node
           * @param name defines the name of the global animation that will be run on all nodes
           * @param node defines the root node where the animation will take place
           * @param targetProperty defines property to animate
           * @param framePerSecond defines the number of frame per second yo use
           * @param totalFrame defines the number of frames in total
           * @param from defines the initial value
           * @param to defines the final value
           * @param loopMode defines which loop mode you want to use (off by default)
           * @param easingFunction defines the easing function to use (linear by default)
           * @param onAnimationEnd defines the callback to call when animation end
           * @returns the animatable created for this animation
           */
  def CreateAndStartAnimation(
    name: java.lang.String,
    node: babylonjsLib.BABYLONNs.Node,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any,
    loopMode: scala.Double,
    easingFunction: babylonjsLib.BABYLONNs.EasingFunction,
    onAnimationEnd: js.Function0[scala.Unit]
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animatable] = js.native
  /**
           * Create and start an animation on a node and its descendants
           * @param name defines the name of the global animation that will be run on all nodes
           * @param node defines the root node where the animation will take place
           * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used
           * @param targetProperty defines property to animate
           * @param framePerSecond defines the number of frame per second to use
           * @param totalFrame defines the number of frames in total
           * @param from defines the initial value
           * @param to defines the final value
           * @param loopMode defines which loop mode you want to use (off by default)
           * @param easingFunction defines the easing function to use (linear by default)
           * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
           * @returns the list of animatables created for all nodes
           * @example https://www.babylonjs-playground.com/#MH0VLI
           */
  def CreateAndStartHierarchyAnimation(
    name: java.lang.String,
    node: babylonjsLib.BABYLONNs.Node,
    directDescendantsOnly: scala.Boolean,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any
  ): babylonjsLib.BABYLONNs.Nullable[js.Array[babylonjsLib.BABYLONNs.Animatable]] = js.native
  /**
           * Create and start an animation on a node and its descendants
           * @param name defines the name of the global animation that will be run on all nodes
           * @param node defines the root node where the animation will take place
           * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used
           * @param targetProperty defines property to animate
           * @param framePerSecond defines the number of frame per second to use
           * @param totalFrame defines the number of frames in total
           * @param from defines the initial value
           * @param to defines the final value
           * @param loopMode defines which loop mode you want to use (off by default)
           * @param easingFunction defines the easing function to use (linear by default)
           * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
           * @returns the list of animatables created for all nodes
           * @example https://www.babylonjs-playground.com/#MH0VLI
           */
  def CreateAndStartHierarchyAnimation(
    name: java.lang.String,
    node: babylonjsLib.BABYLONNs.Node,
    directDescendantsOnly: scala.Boolean,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any,
    loopMode: scala.Double
  ): babylonjsLib.BABYLONNs.Nullable[js.Array[babylonjsLib.BABYLONNs.Animatable]] = js.native
  /**
           * Create and start an animation on a node and its descendants
           * @param name defines the name of the global animation that will be run on all nodes
           * @param node defines the root node where the animation will take place
           * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used
           * @param targetProperty defines property to animate
           * @param framePerSecond defines the number of frame per second to use
           * @param totalFrame defines the number of frames in total
           * @param from defines the initial value
           * @param to defines the final value
           * @param loopMode defines which loop mode you want to use (off by default)
           * @param easingFunction defines the easing function to use (linear by default)
           * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
           * @returns the list of animatables created for all nodes
           * @example https://www.babylonjs-playground.com/#MH0VLI
           */
  def CreateAndStartHierarchyAnimation(
    name: java.lang.String,
    node: babylonjsLib.BABYLONNs.Node,
    directDescendantsOnly: scala.Boolean,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any,
    loopMode: scala.Double,
    easingFunction: babylonjsLib.BABYLONNs.EasingFunction
  ): babylonjsLib.BABYLONNs.Nullable[js.Array[babylonjsLib.BABYLONNs.Animatable]] = js.native
  /**
           * Create and start an animation on a node and its descendants
           * @param name defines the name of the global animation that will be run on all nodes
           * @param node defines the root node where the animation will take place
           * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used
           * @param targetProperty defines property to animate
           * @param framePerSecond defines the number of frame per second to use
           * @param totalFrame defines the number of frames in total
           * @param from defines the initial value
           * @param to defines the final value
           * @param loopMode defines which loop mode you want to use (off by default)
           * @param easingFunction defines the easing function to use (linear by default)
           * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
           * @returns the list of animatables created for all nodes
           * @example https://www.babylonjs-playground.com/#MH0VLI
           */
  def CreateAndStartHierarchyAnimation(
    name: java.lang.String,
    node: babylonjsLib.BABYLONNs.Node,
    directDescendantsOnly: scala.Boolean,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any,
    loopMode: scala.Double,
    easingFunction: babylonjsLib.BABYLONNs.EasingFunction,
    onAnimationEnd: js.Function0[scala.Unit]
  ): babylonjsLib.BABYLONNs.Nullable[js.Array[babylonjsLib.BABYLONNs.Animatable]] = js.native
  /**
           * Sets up an animation
           * @param property The property to animate
           * @param animationType The animation type to apply
           * @param framePerSecond The frames per second of the animation
           * @param easingFunction The easing function used in the animation
           * @returns The created animation
           */
  def CreateAnimation(
    property: java.lang.String,
    animationType: scala.Double,
    framePerSecond: scala.Double,
    easingFunction: babylonjsLib.BABYLONNs.EasingFunction
  ): babylonjsLib.BABYLONNs.Animation = js.native
  /**
           * Creates a new animation, merges it with the existing animations and starts it
           * @param name Name of the animation
           * @param node Node which contains the scene that begins the animations
           * @param targetProperty Specifies which property to animate
           * @param framePerSecond The frames per second of the animation
           * @param totalFrame The total number of frames
           * @param from The frame at the beginning of the animation
           * @param to The frame at the end of the animation
           * @param loopMode Specifies the loop mode of the animation
           * @param easingFunction (Optional) The easing function of the animation, which allow custom mathematical formulas for animations
           * @param onAnimationEnd Callback to run once the animation is complete
           * @returns Nullable animation
           */
  def CreateMergeAndStartAnimation(
    name: java.lang.String,
    node: babylonjsLib.BABYLONNs.Node,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animatable] = js.native
  /**
           * Creates a new animation, merges it with the existing animations and starts it
           * @param name Name of the animation
           * @param node Node which contains the scene that begins the animations
           * @param targetProperty Specifies which property to animate
           * @param framePerSecond The frames per second of the animation
           * @param totalFrame The total number of frames
           * @param from The frame at the beginning of the animation
           * @param to The frame at the end of the animation
           * @param loopMode Specifies the loop mode of the animation
           * @param easingFunction (Optional) The easing function of the animation, which allow custom mathematical formulas for animations
           * @param onAnimationEnd Callback to run once the animation is complete
           * @returns Nullable animation
           */
  def CreateMergeAndStartAnimation(
    name: java.lang.String,
    node: babylonjsLib.BABYLONNs.Node,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any,
    loopMode: scala.Double
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animatable] = js.native
  /**
           * Creates a new animation, merges it with the existing animations and starts it
           * @param name Name of the animation
           * @param node Node which contains the scene that begins the animations
           * @param targetProperty Specifies which property to animate
           * @param framePerSecond The frames per second of the animation
           * @param totalFrame The total number of frames
           * @param from The frame at the beginning of the animation
           * @param to The frame at the end of the animation
           * @param loopMode Specifies the loop mode of the animation
           * @param easingFunction (Optional) The easing function of the animation, which allow custom mathematical formulas for animations
           * @param onAnimationEnd Callback to run once the animation is complete
           * @returns Nullable animation
           */
  def CreateMergeAndStartAnimation(
    name: java.lang.String,
    node: babylonjsLib.BABYLONNs.Node,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any,
    loopMode: scala.Double,
    easingFunction: babylonjsLib.BABYLONNs.EasingFunction
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animatable] = js.native
  /**
           * Creates a new animation, merges it with the existing animations and starts it
           * @param name Name of the animation
           * @param node Node which contains the scene that begins the animations
           * @param targetProperty Specifies which property to animate
           * @param framePerSecond The frames per second of the animation
           * @param totalFrame The total number of frames
           * @param from The frame at the beginning of the animation
           * @param to The frame at the end of the animation
           * @param loopMode Specifies the loop mode of the animation
           * @param easingFunction (Optional) The easing function of the animation, which allow custom mathematical formulas for animations
           * @param onAnimationEnd Callback to run once the animation is complete
           * @returns Nullable animation
           */
  def CreateMergeAndStartAnimation(
    name: java.lang.String,
    node: babylonjsLib.BABYLONNs.Node,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any,
    loopMode: scala.Double,
    easingFunction: babylonjsLib.BABYLONNs.EasingFunction,
    onAnimationEnd: js.Function0[scala.Unit]
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animatable] = js.native
  /**
           * Parses an animation object and creates an animation
           * @param parsedAnimation Parsed animation object
           * @returns Animation object
           */
  def Parse(parsedAnimation: js.Any): babylonjsLib.BABYLONNs.Animation = js.native
  /**
           * Transition property of an host to the target Value
           * @param property The property to transition
           * @param targetValue The target Value of the property
           * @param host The object where the property to animate belongs
           * @param scene Scene used to run the animation
           * @param frameRate Framerate (in frame/s) to use
           * @param transition The transition type we want to use
           * @param duration The duration of the animation, in milliseconds
           * @param onAnimationEnd Callback trigger at the end of the animation
           * @returns Nullable animation
           */
  def TransitionTo(
    property: java.lang.String,
    targetValue: js.Any,
    host: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    frameRate: scala.Double,
    transition: babylonjsLib.BABYLONNs.Animation,
    duration: scala.Double
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animatable] = js.native
  /**
           * Transition property of an host to the target Value
           * @param property The property to transition
           * @param targetValue The target Value of the property
           * @param host The object where the property to animate belongs
           * @param scene Scene used to run the animation
           * @param frameRate Framerate (in frame/s) to use
           * @param transition The transition type we want to use
           * @param duration The duration of the animation, in milliseconds
           * @param onAnimationEnd Callback trigger at the end of the animation
           * @returns Nullable animation
           */
  def TransitionTo(
    property: java.lang.String,
    targetValue: js.Any,
    host: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    frameRate: scala.Double,
    transition: babylonjsLib.BABYLONNs.Animation,
    duration: scala.Double,
    onAnimationEnd: babylonjsLib.BABYLONNs.Nullable[js.Function0[scala.Unit]]
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animatable] = js.native
  /**
           * @hidden Internal use
           */
  def _PrepareAnimation(
    name: java.lang.String,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animation] = js.native
  /**
           * @hidden Internal use
           */
  def _PrepareAnimation(
    name: java.lang.String,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any,
    loopMode: scala.Double
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animation] = js.native
  /**
           * @hidden Internal use
           */
  def _PrepareAnimation(
    name: java.lang.String,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any,
    loopMode: scala.Double,
    easingFunction: babylonjsLib.BABYLONNs.EasingFunction
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animation] = js.native
  /** @hidden */
  def _UniversalLerp(left: js.Any, right: js.Any, amount: scala.Double): js.Any = js.native
}

