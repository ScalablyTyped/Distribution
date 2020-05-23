package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IAnimatable
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Animation")
@js.native
class Animation protected ()
  extends typings.babylonjs.BABYLON.Animation {
  /**
    * Initializes the animation
    * @param name Name of the animation
    * @param targetProperty Property to animate
    * @param framePerSecond The frames per second of the animation
    * @param dataType The data type of the animation
    * @param loopMode The loop mode of the animation
    * @param enableBlending Specifies if blending should be enabled
    */
  def this(
    /**Name of the animation */
  name: String,
    /**Property to animate */
  targetProperty: String,
    /**The frames per second of the animation */
  framePerSecond: Double,
    /**The data type of the animation */
  dataType: Double
  ) = this()
  def this(
    /**Name of the animation */
  name: String,
    /**Property to animate */
  targetProperty: String,
    /**The frames per second of the animation */
  framePerSecond: Double,
    /**The data type of the animation */
  dataType: Double,
    /**The loop mode of the animation */
  loopMode: Double
  ) = this()
  def this(
    /**Name of the animation */
  name: String,
    /**Property to animate */
  targetProperty: String,
    /**The frames per second of the animation */
  framePerSecond: Double,
    /**The data type of the animation */
  dataType: Double,
    /**The loop mode of the animation */
  loopMode: Double,
    /**Specifies if blending should be enabled */
  enableBlending: Boolean
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.Animation")
@js.native
object Animation extends js.Object {
  /**
    * Constant Loop Mode
    */
  val ANIMATIONLOOPMODE_CONSTANT: Double = js.native
  /**
    * Cycle Loop Mode
    */
  val ANIMATIONLOOPMODE_CYCLE: Double = js.native
  /**
    * Relative Loop Mode
    */
  val ANIMATIONLOOPMODE_RELATIVE: Double = js.native
  /**
    * Color3 animation type
    */
  val ANIMATIONTYPE_COLOR3: Double = js.native
  /**
    * Color3 animation type
    */
  val ANIMATIONTYPE_COLOR4: Double = js.native
  /**
    * Float animation type
    */
  val ANIMATIONTYPE_FLOAT: Double = js.native
  /**
    * Matrix animation type
    */
  val ANIMATIONTYPE_MATRIX: Double = js.native
  /**
    * Quaternion animation type
    */
  val ANIMATIONTYPE_QUATERNION: Double = js.native
  /**
    * Size animation type
    */
  val ANIMATIONTYPE_SIZE: Double = js.native
  /**
    * Vector2 animation type
    */
  val ANIMATIONTYPE_VECTOR2: Double = js.native
  /**
    * Vector3 animation type
    */
  val ANIMATIONTYPE_VECTOR3: Double = js.native
  /**
    * Use matrix interpolation instead of using direct key value when animating matrices
    */
  var AllowMatricesInterpolation: Boolean = js.native
  /**
    * When matrix interpolation is enabled, this boolean forces the system to use Matrix.DecomposeLerp instead of Matrix.Lerp. Interpolation is more precise but slower
    */
  var AllowMatrixDecomposeForInterpolation: Boolean = js.native
  /**
    * Appends the serialized animations from the source animations
    * @param source Source containing the animations
    * @param destination Target to store the animations
    */
  def AppendSerializedAnimations(source: IAnimatable, destination: js.Any): Unit = js.native
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
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = js.native
  def CreateAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = js.native
  def CreateAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = js.native
  def CreateAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = js.native
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
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any
  ): Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]] = js.native
  def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double
  ): Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]] = js.native
  def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]] = js.native
  def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]] = js.native
  /**
    * Sets up an animation
    * @param property The property to animate
    * @param animationType The animation type to apply
    * @param framePerSecond The frames per second of the animation
    * @param easingFunction The easing function used in the animation
    * @returns The created animation
    */
  def CreateAnimation(
    property: String,
    animationType: Double,
    framePerSecond: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): typings.babylonjs.BABYLON.Animation = js.native
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
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = js.native
  def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = js.native
  def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = js.native
  def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = js.native
  /**
    * Parses an animation object and creates an animation
    * @param parsedAnimation Parsed animation object
    * @returns Animation object
    */
  def Parse(parsedAnimation: js.Any): typings.babylonjs.BABYLON.Animation = js.native
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
    property: String,
    targetValue: js.Any,
    host: js.Any,
    scene: typings.babylonjs.BABYLON.Scene,
    frameRate: Double,
    transition: typings.babylonjs.BABYLON.Animation,
    duration: Double
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = js.native
  def TransitionTo(
    property: String,
    targetValue: js.Any,
    host: js.Any,
    scene: typings.babylonjs.BABYLON.Scene,
    frameRate: Double,
    transition: typings.babylonjs.BABYLON.Animation,
    duration: Double,
    onAnimationEnd: Nullable[js.Function0[Unit]]
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = js.native
  /**
    * @hidden Internal use
    */
  def _PrepareAnimation(
    name: String,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any
  ): Nullable[typings.babylonjs.BABYLON.Animation] = js.native
  def _PrepareAnimation(
    name: String,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double
  ): Nullable[typings.babylonjs.BABYLON.Animation] = js.native
  def _PrepareAnimation(
    name: String,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): Nullable[typings.babylonjs.BABYLON.Animation] = js.native
  /** @hidden */
  def _UniversalLerp(left: js.Any, right: js.Any, amount: Double): js.Any = js.native
}

