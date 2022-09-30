package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IAnimatable
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Animation")
@js.native
open class Animation protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Animation {
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
  loopMode: Unit,
    /**Specifies if blending should be enabled */
  enableBlending: Boolean
  ) = this()
}
/* static members */
object Animation {
  
  @JSGlobal("BABYLON.Animation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constant Loop Mode
    */
  @JSGlobal("BABYLON.Animation.ANIMATIONLOOPMODE_CONSTANT")
  @js.native
  val ANIMATIONLOOPMODE_CONSTANT: /* 2 */ Double = js.native
  
  /**
    * Cycle Loop Mode
    */
  @JSGlobal("BABYLON.Animation.ANIMATIONLOOPMODE_CYCLE")
  @js.native
  val ANIMATIONLOOPMODE_CYCLE: /* 1 */ Double = js.native
  
  /**
    * Relative Loop Mode
    */
  @JSGlobal("BABYLON.Animation.ANIMATIONLOOPMODE_RELATIVE")
  @js.native
  val ANIMATIONLOOPMODE_RELATIVE: /* 0 */ Double = js.native
  
  /**
    * Color3 animation type
    */
  @JSGlobal("BABYLON.Animation.ANIMATIONTYPE_COLOR3")
  @js.native
  val ANIMATIONTYPE_COLOR3: /* 4 */ Double = js.native
  
  /**
    * Color3 animation type
    */
  @JSGlobal("BABYLON.Animation.ANIMATIONTYPE_COLOR4")
  @js.native
  val ANIMATIONTYPE_COLOR4: /* 7 */ Double = js.native
  
  /**
    * Float animation type
    */
  @JSGlobal("BABYLON.Animation.ANIMATIONTYPE_FLOAT")
  @js.native
  val ANIMATIONTYPE_FLOAT: /* 0 */ Double = js.native
  
  /**
    * Matrix animation type
    */
  @JSGlobal("BABYLON.Animation.ANIMATIONTYPE_MATRIX")
  @js.native
  val ANIMATIONTYPE_MATRIX: /* 3 */ Double = js.native
  
  /**
    * Quaternion animation type
    */
  @JSGlobal("BABYLON.Animation.ANIMATIONTYPE_QUATERNION")
  @js.native
  val ANIMATIONTYPE_QUATERNION: /* 2 */ Double = js.native
  
  /**
    * Size animation type
    */
  @JSGlobal("BABYLON.Animation.ANIMATIONTYPE_SIZE")
  @js.native
  val ANIMATIONTYPE_SIZE: /* 6 */ Double = js.native
  
  /**
    * Vector2 animation type
    */
  @JSGlobal("BABYLON.Animation.ANIMATIONTYPE_VECTOR2")
  @js.native
  val ANIMATIONTYPE_VECTOR2: /* 5 */ Double = js.native
  
  /**
    * Vector3 animation type
    */
  @JSGlobal("BABYLON.Animation.ANIMATIONTYPE_VECTOR3")
  @js.native
  val ANIMATIONTYPE_VECTOR3: /* 1 */ Double = js.native
  
  /**
    * Use matrix interpolation instead of using direct key value when animating matrices
    */
  @JSGlobal("BABYLON.Animation.AllowMatricesInterpolation")
  @js.native
  def AllowMatricesInterpolation: Boolean = js.native
  inline def AllowMatricesInterpolation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowMatricesInterpolation")(x.asInstanceOf[js.Any])
  
  /**
    * When matrix interpolation is enabled, this boolean forces the system to use Matrix.DecomposeLerp instead of Matrix.Lerp. Interpolation is more precise but slower
    */
  @JSGlobal("BABYLON.Animation.AllowMatrixDecomposeForInterpolation")
  @js.native
  def AllowMatrixDecomposeForInterpolation: Boolean = js.native
  inline def AllowMatrixDecomposeForInterpolation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowMatrixDecomposeForInterpolation")(x.asInstanceOf[js.Any])
  
  /**
    * Appends the serialized animations from the source animations
    * @param source Source containing the animations
    * @param destination Target to store the animations
    */
  inline def AppendSerializedAnimations(source: IAnimatable, destination: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendSerializedAnimations")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create and start an animation on a node
    * @param name defines the name of the global animation that will be run on all nodes
    * @param target defines the target where the animation will take place
    * @param targetProperty defines property to animate
    * @param framePerSecond defines the number of frame per second yo use
    * @param totalFrame defines the number of frames in total
    * @param from defines the initial value
    * @param to defines the final value
    * @param loopMode defines which loop mode you want to use (off by default)
    * @param easingFunction defines the easing function to use (linear by default)
    * @param onAnimationEnd defines the callback to call when animation end
    * @param scene defines the hosting scene
    * @returns the animatable created for this animation
    */
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: Unit,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: Unit,
    onAnimationEnd: js.Function0[Unit],
    scene: typings.babylonjs.BABYLON.Scene
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: Unit,
    onAnimationEnd: Unit,
    scene: typings.babylonjs.BABYLON.Scene
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: js.Function0[Unit],
    scene: typings.babylonjs.BABYLON.Scene
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: Unit,
    scene: typings.babylonjs.BABYLON.Scene
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: Unit,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: Unit,
    onAnimationEnd: js.Function0[Unit],
    scene: typings.babylonjs.BABYLON.Scene
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: Unit,
    onAnimationEnd: Unit,
    scene: typings.babylonjs.BABYLON.Scene
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: js.Function0[Unit],
    scene: typings.babylonjs.BABYLON.Scene
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateAndStartAnimation(
    name: String,
    target: Any,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: Unit,
    scene: typings.babylonjs.BABYLON.Scene
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  
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
  inline def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any
  ): Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]]]
  inline def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double
  ): Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]]]
  inline def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: Unit,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]]]
  inline def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]]]
  inline def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]]]
  inline def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: Unit,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]]]
  inline def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]]]
  inline def CreateAndStartHierarchyAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    directDescendantsOnly: Boolean,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.BABYLON.Animatable]]]
  
  /**
    * Sets up an animation
    * @param property The property to animate
    * @param animationType The animation type to apply
    * @param framePerSecond The frames per second of the animation
    * @param easingFunction The easing function used in the animation
    * @returns The created animation
    */
  inline def CreateAnimation(
    property: String,
    animationType: Double,
    framePerSecond: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAnimation")(property.asInstanceOf[js.Any], animationType.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  
  /**
    * Creates an animation or an array of animations from a snippet saved by the Inspector
    * @deprecated Please use ParseFromSnippetAsync instead
    * @param snippetId defines the snippet to load
    * @returns a promise that will resolve to the new animation or a new array of animations
    */
  @JSGlobal("BABYLON.Animation.CreateFromSnippetAsync")
  @js.native
  def CreateFromSnippetAsync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Animation.ParseFromSnippetAsync */ Any = js.native
  inline def CreateFromSnippetAsync_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Animation.ParseFromSnippetAsync */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateFromSnippetAsync")(x.asInstanceOf[js.Any])
  
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
  inline def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: Unit,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: Unit,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def CreateMergeAndStartAnimation(
    name: String,
    node: typings.babylonjs.BABYLON.Node,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction,
    onAnimationEnd: js.Function0[Unit]
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  
  /**
    * Convert the keyframes for all animations belonging to the group to be relative to a given reference frame.
    * @param sourceAnimation defines the Animation containing keyframes to convert
    * @param referenceFrame defines the frame that keyframes in the range will be relative to
    * @param range defines the name of the AnimationRange belonging to the Animation to convert
    * @param cloneOriginal defines whether or not to clone the animation and convert the clone or convert the original animation (default is false)
    * @param clonedName defines the name of the resulting cloned Animation if cloneOriginal is true
    * @returns a new Animation if cloneOriginal is true or the original Animation if cloneOriginal is false
    */
  inline def MakeAnimationAdditive(sourceAnimation: typings.babylonjs.BABYLON.Animation): typings.babylonjs.BABYLON.Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(sourceAnimation: typings.babylonjs.BABYLON.Animation, referenceFrame: Double): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(sourceAnimation: typings.babylonjs.BABYLON.Animation, referenceFrame: Double, range: String): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.BABYLON.Animation,
    referenceFrame: Double,
    range: String,
    cloneOriginal: Boolean
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.BABYLON.Animation,
    referenceFrame: Double,
    range: String,
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.BABYLON.Animation,
    referenceFrame: Double,
    range: String,
    cloneOriginal: Unit,
    clonedName: String
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.BABYLON.Animation,
    referenceFrame: Double,
    range: Unit,
    cloneOriginal: Boolean
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.BABYLON.Animation,
    referenceFrame: Double,
    range: Unit,
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.BABYLON.Animation,
    referenceFrame: Double,
    range: Unit,
    cloneOriginal: Unit,
    clonedName: String
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(sourceAnimation: typings.babylonjs.BABYLON.Animation, referenceFrame: Unit, range: String): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.BABYLON.Animation,
    referenceFrame: Unit,
    range: String,
    cloneOriginal: Boolean
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.BABYLON.Animation,
    referenceFrame: Unit,
    range: String,
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.BABYLON.Animation,
    referenceFrame: Unit,
    range: String,
    cloneOriginal: Unit,
    clonedName: String
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.BABYLON.Animation,
    referenceFrame: Unit,
    range: Unit,
    cloneOriginal: Boolean
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.BABYLON.Animation,
    referenceFrame: Unit,
    range: Unit,
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  inline def MakeAnimationAdditive(
    sourceAnimation: typings.babylonjs.BABYLON.Animation,
    referenceFrame: Unit,
    range: Unit,
    cloneOriginal: Unit,
    clonedName: String
  ): typings.babylonjs.BABYLON.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  
  /**
    * Parses an animation object and creates an animation
    * @param parsedAnimation Parsed animation object
    * @returns Animation object
    */
  inline def Parse(parsedAnimation: Any): typings.babylonjs.BABYLON.Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedAnimation.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Animation]
  
  /**
    * Creates a new animation or an array of animations from a snippet saved in a remote file
    * @param name defines the name of the animation to create (can be null or empty to use the one from the json data)
    * @param url defines the url to load from
    * @returns a promise that will resolve to the new animation or an array of animations
    */
  inline def ParseFromFileAsync(name: Nullable[String], url: String): js.Promise[
    typings.babylonjs.BABYLON.Animation | js.Array[typings.babylonjs.BABYLON.Animation]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.babylonjs.BABYLON.Animation | js.Array[typings.babylonjs.BABYLON.Animation]
  ]]
  
  /**
    * Creates an animation or an array of animations from a snippet saved by the Inspector
    * @param snippetId defines the snippet to load
    * @returns a promise that will resolve to the new animation or a new array of animations
    */
  inline def ParseFromSnippetAsync(snippetId: String): js.Promise[
    typings.babylonjs.BABYLON.Animation | js.Array[typings.babylonjs.BABYLON.Animation]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.babylonjs.BABYLON.Animation | js.Array[typings.babylonjs.BABYLON.Animation]
  ]]
  
  /** Define the Url to load snippets */
  @JSGlobal("BABYLON.Animation.SnippetUrl")
  @js.native
  def SnippetUrl: String = js.native
  inline def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
  
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
  inline def TransitionTo(
    property: String,
    targetValue: Any,
    host: Any,
    scene: typings.babylonjs.BABYLON.Scene,
    frameRate: Double,
    transition: typings.babylonjs.BABYLON.Animation,
    duration: Double
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("TransitionTo")(property.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any], host.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any], transition.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  inline def TransitionTo(
    property: String,
    targetValue: Any,
    host: Any,
    scene: typings.babylonjs.BABYLON.Scene,
    frameRate: Double,
    transition: typings.babylonjs.BABYLON.Animation,
    duration: Double,
    onAnimationEnd: Nullable[js.Function0[Unit]]
  ): Nullable[typings.babylonjs.BABYLON.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("TransitionTo")(property.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any], host.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any], transition.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animatable]]
  
  /**
    * @internal Internal use
    */
  inline def _PrepareAnimation(
    name: String,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any
  ): Nullable[typings.babylonjs.BABYLON.Animation] = (^.asInstanceOf[js.Dynamic].applyDynamic("_PrepareAnimation")(name.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animation]]
  inline def _PrepareAnimation(
    name: String,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double
  ): Nullable[typings.babylonjs.BABYLON.Animation] = (^.asInstanceOf[js.Dynamic].applyDynamic("_PrepareAnimation")(name.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animation]]
  inline def _PrepareAnimation(
    name: String,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Double,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): Nullable[typings.babylonjs.BABYLON.Animation] = (^.asInstanceOf[js.Dynamic].applyDynamic("_PrepareAnimation")(name.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animation]]
  inline def _PrepareAnimation(
    name: String,
    targetProperty: String,
    framePerSecond: Double,
    totalFrame: Double,
    from: Any,
    to: Any,
    loopMode: Unit,
    easingFunction: typings.babylonjs.BABYLON.EasingFunction
  ): Nullable[typings.babylonjs.BABYLON.Animation] = (^.asInstanceOf[js.Dynamic].applyDynamic("_PrepareAnimation")(name.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Animation]]
  
  @JSGlobal("BABYLON.Animation._UniqueIdGenerator")
  @js.native
  def _UniqueIdGenerator: Any = js.native
  inline def _UniqueIdGenerator_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UniqueIdGenerator")(x.asInstanceOf[js.Any])
  
  /**
    * @internal
    */
  inline def _UniversalLerp(left: Any, right: Any, amount: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_UniversalLerp")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Any]
}
