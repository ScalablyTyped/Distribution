package typings.babylonjs.indexMod

import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Animation")
@js.native
class Animation protected ()
  extends typings.babylonjs.animationsIndexMod.Animation {
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
  loopMode: js.UndefOr[scala.Nothing],
    /**Specifies if blending should be enabled */
  enableBlending: Boolean
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
object Animation {
  
  @JSImport("babylonjs/index", "Animation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constant Loop Mode
    */
  @JSImport("babylonjs/index", "Animation.ANIMATIONLOOPMODE_CONSTANT")
  @js.native
  val ANIMATIONLOOPMODE_CONSTANT: Double = js.native
  
  /**
    * Cycle Loop Mode
    */
  @JSImport("babylonjs/index", "Animation.ANIMATIONLOOPMODE_CYCLE")
  @js.native
  val ANIMATIONLOOPMODE_CYCLE: Double = js.native
  
  /**
    * Relative Loop Mode
    */
  @JSImport("babylonjs/index", "Animation.ANIMATIONLOOPMODE_RELATIVE")
  @js.native
  val ANIMATIONLOOPMODE_RELATIVE: Double = js.native
  
  /**
    * Color3 animation type
    */
  @JSImport("babylonjs/index", "Animation.ANIMATIONTYPE_COLOR3")
  @js.native
  val ANIMATIONTYPE_COLOR3: Double = js.native
  
  /**
    * Color3 animation type
    */
  @JSImport("babylonjs/index", "Animation.ANIMATIONTYPE_COLOR4")
  @js.native
  val ANIMATIONTYPE_COLOR4: Double = js.native
  
  /**
    * Float animation type
    */
  @JSImport("babylonjs/index", "Animation.ANIMATIONTYPE_FLOAT")
  @js.native
  val ANIMATIONTYPE_FLOAT: Double = js.native
  
  /**
    * Matrix animation type
    */
  @JSImport("babylonjs/index", "Animation.ANIMATIONTYPE_MATRIX")
  @js.native
  val ANIMATIONTYPE_MATRIX: Double = js.native
  
  /**
    * Quaternion animation type
    */
  @JSImport("babylonjs/index", "Animation.ANIMATIONTYPE_QUATERNION")
  @js.native
  val ANIMATIONTYPE_QUATERNION: Double = js.native
  
  /**
    * Size animation type
    */
  @JSImport("babylonjs/index", "Animation.ANIMATIONTYPE_SIZE")
  @js.native
  val ANIMATIONTYPE_SIZE: Double = js.native
  
  /**
    * Vector2 animation type
    */
  @JSImport("babylonjs/index", "Animation.ANIMATIONTYPE_VECTOR2")
  @js.native
  val ANIMATIONTYPE_VECTOR2: Double = js.native
  
  /**
    * Vector3 animation type
    */
  @JSImport("babylonjs/index", "Animation.ANIMATIONTYPE_VECTOR3")
  @js.native
  val ANIMATIONTYPE_VECTOR3: Double = js.native
  
  /**
    * Use matrix interpolation instead of using direct key value when animating matrices
    */
  @JSImport("babylonjs/index", "Animation.AllowMatricesInterpolation")
  @js.native
  def AllowMatricesInterpolation: Boolean = js.native
  @scala.inline
  def AllowMatricesInterpolation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowMatricesInterpolation")(x.asInstanceOf[js.Any])
  
  /**
    * When matrix interpolation is enabled, this boolean forces the system to use Matrix.DecomposeLerp instead of Matrix.Lerp. Interpolation is more precise but slower
    */
  @JSImport("babylonjs/index", "Animation.AllowMatrixDecomposeForInterpolation")
  @js.native
  def AllowMatrixDecomposeForInterpolation: Boolean = js.native
  @scala.inline
  def AllowMatrixDecomposeForInterpolation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowMatrixDecomposeForInterpolation")(x.asInstanceOf[js.Any])
  
  /**
    * Appends the serialized animations from the source animations
    * @param source Source containing the animations
    * @param destination Target to store the animations
    */
  @JSImport("babylonjs/index", "Animation.AppendSerializedAnimations")
  @js.native
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
  @JSImport("babylonjs/index", "Animation.CreateAndStartAnimation")
  @js.native
  def CreateAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartAnimation")
  @js.native
  def CreateAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: js.UndefOr[scala.Nothing],
    easingFunction: js.UndefOr[scala.Nothing],
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartAnimation")
  @js.native
  def CreateAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: js.UndefOr[scala.Nothing],
    easingFunction: typings.babylonjs.easingMod.EasingFunction
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartAnimation")
  @js.native
  def CreateAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: js.UndefOr[scala.Nothing],
    easingFunction: typings.babylonjs.easingMod.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartAnimation")
  @js.native
  def CreateAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartAnimation")
  @js.native
  def CreateAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: js.UndefOr[scala.Nothing],
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartAnimation")
  @js.native
  def CreateAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.easingMod.EasingFunction
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartAnimation")
  @js.native
  def CreateAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.easingMod.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  
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
  @JSImport("babylonjs/index", "Animation.CreateAndStartHierarchyAnimation")
  @js.native
  def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any
  ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartHierarchyAnimation")
  @js.native
  def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: js.UndefOr[scala.Nothing],
    easingFunction: js.UndefOr[scala.Nothing],
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartHierarchyAnimation")
  @js.native
  def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: js.UndefOr[scala.Nothing],
    easingFunction: typings.babylonjs.easingMod.EasingFunction
  ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartHierarchyAnimation")
  @js.native
  def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: js.UndefOr[scala.Nothing],
    easingFunction: typings.babylonjs.easingMod.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartHierarchyAnimation")
  @js.native
  def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double
  ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartHierarchyAnimation")
  @js.native
  def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: js.UndefOr[scala.Nothing],
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartHierarchyAnimation")
  @js.native
  def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.easingMod.EasingFunction
  ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = js.native
  @JSImport("babylonjs/index", "Animation.CreateAndStartHierarchyAnimation")
  @js.native
  def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.easingMod.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = js.native
  
  /**
    * Sets up an animation
    * @param property The property to animate
    * @param animationType The animation type to apply
    * @param framePerSecond The frames per second of the animation
    * @param easingFunction The easing function used in the animation
    * @returns The created animation
    */
  @JSImport("babylonjs/index", "Animation.CreateAnimation")
  @js.native
  def CreateAnimation(
    property: String,
    animationType: Double,
    framePerSecond: Double,
    easingFunction: typings.babylonjs.easingMod.EasingFunction
  ): typings.babylonjs.animationMod.Animation = js.native
  
  /**
    * Creates an animation or an array of animations from a snippet saved by the Inspector
    * @param snippetId defines the snippet to load
    * @returns a promise that will resolve to the new animation or a new array of animations
    */
  @JSImport("babylonjs/index", "Animation.CreateFromSnippetAsync")
  @js.native
  def CreateFromSnippetAsync(snippetId: String): js.Promise[
    typings.babylonjs.animationMod.Animation | js.Array[typings.babylonjs.animationMod.Animation]
  ] = js.native
  
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
  @JSImport("babylonjs/index", "Animation.CreateMergeAndStartAnimation")
  @js.native
  def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateMergeAndStartAnimation")
  @js.native
  def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: js.UndefOr[scala.Nothing],
    easingFunction: js.UndefOr[scala.Nothing],
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateMergeAndStartAnimation")
  @js.native
  def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: js.UndefOr[scala.Nothing],
    easingFunction: typings.babylonjs.easingMod.EasingFunction
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateMergeAndStartAnimation")
  @js.native
  def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: js.UndefOr[scala.Nothing],
    easingFunction: typings.babylonjs.easingMod.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateMergeAndStartAnimation")
  @js.native
  def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateMergeAndStartAnimation")
  @js.native
  def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: js.UndefOr[scala.Nothing],
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateMergeAndStartAnimation")
  @js.native
  def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.easingMod.EasingFunction
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.CreateMergeAndStartAnimation")
  @js.native
  def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.nodeMod.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.easingMod.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  
  /**
    * Convert the keyframes for all animations belonging to the group to be relative to a given reference frame.
    * @param sourceAnimation defines the Animation containing keyframes to convert
    * @param referenceFrame defines the frame that keyframes in the range will be relative to
    * @param range defines the name of the AnimationRange belonging to the Animation to convert
    * @param cloneOriginal defines whether or not to clone the animation and convert the clone or convert the original animation (default is false)
    * @param clonedName defines the name of the resulting cloned Animation if cloneOriginal is true
    * @returns a new Animation if cloneOriginal is true or the original Animation if cloneOriginal is false
    */
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(sourceAnimation: typings.babylonjs.animationMod.Animation): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: js.UndefOr[scala.Nothing],
    cloneOriginal: js.UndefOr[scala.Nothing],
    clonedName: String
  ): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: js.UndefOr[scala.Nothing],
    cloneOriginal: Boolean
  ): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: js.UndefOr[scala.Nothing],
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: String
  ): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: String,
    cloneOriginal: js.UndefOr[scala.Nothing],
    clonedName: String
  ): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: String,
    cloneOriginal: Boolean
  ): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: String,
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(sourceAnimation: typings.babylonjs.animationMod.Animation, referenceFrame: Double): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: Double,
    range: js.UndefOr[scala.Nothing],
    cloneOriginal: js.UndefOr[scala.Nothing],
    clonedName: String
  ): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: Double,
    range: js.UndefOr[scala.Nothing],
    cloneOriginal: Boolean
  ): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: Double,
    range: js.UndefOr[scala.Nothing],
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(sourceAnimation: typings.babylonjs.animationMod.Animation, referenceFrame: Double, range: String): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: Double,
    range: String,
    cloneOriginal: js.UndefOr[scala.Nothing],
    clonedName: String
  ): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: Double,
    range: String,
    cloneOriginal: Boolean
  ): typings.babylonjs.animationMod.Animation = js.native
  @JSImport("babylonjs/index", "Animation.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.animationMod.Animation,
    referenceFrame: Double,
    range: String,
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.animationMod.Animation = js.native
  
  /**
    * Parses an animation object and creates an animation
    * @param parsedAnimation Parsed animation object
    * @returns Animation object
    */
  @JSImport("babylonjs/index", "Animation.Parse")
  @js.native
  def Parse(parsedAnimation: js.Any): typings.babylonjs.animationMod.Animation = js.native
  
  /**
    * Creates a new animation or an array of animations from a snippet saved in a remote file
    * @param name defines the name of the animation to create (can be null or empty to use the one from the json data)
    * @param url defines the url to load from
    * @returns a promise that will resolve to the new animation or an array of animations
    */
  @JSImport("babylonjs/index", "Animation.ParseFromFileAsync")
  @js.native
  def ParseFromFileAsync(name: Nullable[String], url: String): js.Promise[
    typings.babylonjs.animationMod.Animation | js.Array[typings.babylonjs.animationMod.Animation]
  ] = js.native
  
  /** Define the Url to load snippets */
  @JSImport("babylonjs/index", "Animation.SnippetUrl")
  @js.native
  def SnippetUrl: String = js.native
  @scala.inline
  def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
  
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
  @JSImport("babylonjs/index", "Animation.TransitionTo")
  @js.native
  def TransitionTo(
    property: String,
    targetValue: js.Any,
    host: js.Any,
    scene: typings.babylonjs.sceneMod.Scene,
    frameRate: Double,
    transition: typings.babylonjs.animationMod.Animation,
    duration: Double
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  @JSImport("babylonjs/index", "Animation.TransitionTo")
  @js.native
  def TransitionTo(
    property: String,
    targetValue: js.Any,
    host: js.Any,
    scene: typings.babylonjs.sceneMod.Scene,
    frameRate: Double,
    transition: typings.babylonjs.animationMod.Animation,
    duration: Double,
    onAnimationEnd: Nullable[js.Function0[Unit]]
  ): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
  
  /**
    * @hidden Internal use
    */
  @JSImport("babylonjs/index", "Animation._PrepareAnimation")
  @js.native
  def _PrepareAnimation(
    name: String,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any
  ): Nullable[typings.babylonjs.animationMod.Animation] = js.native
  @JSImport("babylonjs/index", "Animation._PrepareAnimation")
  @js.native
  def _PrepareAnimation(
    name: String,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: js.UndefOr[scala.Nothing],
    easingFunction: typings.babylonjs.easingMod.EasingFunction
  ): Nullable[typings.babylonjs.animationMod.Animation] = js.native
  @JSImport("babylonjs/index", "Animation._PrepareAnimation")
  @js.native
  def _PrepareAnimation(
    name: String,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double
  ): Nullable[typings.babylonjs.animationMod.Animation] = js.native
  @JSImport("babylonjs/index", "Animation._PrepareAnimation")
  @js.native
  def _PrepareAnimation(
    name: String,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: js.Any,
    to: js.Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.easingMod.EasingFunction
  ): Nullable[typings.babylonjs.animationMod.Animation] = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "Animation._UniversalLerp")
  @js.native
  def _UniversalLerp(left: js.Any, right: js.Any, amount: Double): js.Any = js.native
}
