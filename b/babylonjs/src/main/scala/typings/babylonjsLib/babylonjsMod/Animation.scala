package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store any kind of animation
  */
@JSImport("babylonjs", "Animation")
@js.native
class Animation protected ()
  extends babylonjsLib.BABYLONNs.Animation {
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
  def this(/**Name of the animation */
  name: java.lang.String, /**Property to animate */
  targetProperty: java.lang.String, /**The frames per second of the animation */
  framePerSecond: scala.Double, /**The data type of the animation */
  dataType: scala.Double, /**The loop mode of the animation */
  loopMode: scala.Double) = this()
  def this(/**Name of the animation */
  name: java.lang.String, /**Property to animate */
  targetProperty: java.lang.String, /**The frames per second of the animation */
  framePerSecond: scala.Double, /**The data type of the animation */
  dataType: scala.Double, /**The loop mode of the animation */
  loopMode: js.UndefOr[scala.Nothing], /**Specifies if blending should be enabled */
  enableBlending: scala.Boolean) = this()
  def this(/**Name of the animation */
  name: java.lang.String, /**Property to animate */
  targetProperty: java.lang.String, /**The frames per second of the animation */
  framePerSecond: scala.Double, /**The data type of the animation */
  dataType: scala.Double, /**The loop mode of the animation */
  loopMode: scala.Double, /**Specifies if blending should be enabled */
  enableBlending: scala.Boolean) = this()
}

/**
  * Class used to store any kind of animation
  */
@JSImport("babylonjs", "Animation")
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
  def _PrepareAnimation(
    name: java.lang.String,
    targetProperty: java.lang.String,
    framePerSecond: scala.Double,
    totalFrame: scala.Double,
    from: js.Any,
    to: js.Any,
    loopMode: scala.Double
  ): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Animation] = js.native
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

