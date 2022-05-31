package typings.babylonjs

import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.anon.AdditiveAnimations
import typings.babylonjs.anon.Animations
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsIndexMod {
  
  @JSImport("babylonjs/Animations/index", "Animatable")
  @js.native
  class Animatable protected ()
    extends typings.babylonjs.animatableMod.Animatable {
    /**
      * Creates a new Animatable
      * @param scene defines the hosting scene
      * @param target defines the target object
      * @param fromFrame defines the starting frame number (default is 0)
      * @param toFrame defines the ending frame number (default is 100)
      * @param loopAnimation defines if the animation must loop (default is false)
      * @param speedRatio defines the factor to apply to animation speed (default is 1)
      * @param onAnimationEnd defines a callback to call when animation ends if it is not looping
      * @param animations defines a group of animation to add to the new Animatable
      * @param onAnimationLoop defines a callback to call when animation loops
      * @param isAdditive defines whether the animation should be evaluated additively
      */
    def this(
      scene: Scene,
      /** defines the target object */
    target: js.Any,
      /** defines the starting frame number (default is 0) */
    fromFrame: js.UndefOr[Double],
      /** defines the ending frame number (default is 100) */
    toFrame: js.UndefOr[Double],
      /** defines if the animation must loop (default is false)  */
    loopAnimation: js.UndefOr[Boolean],
      speedRatio: js.UndefOr[Double],
      /** defines a callback to call when animation ends if it is not looping */
    onAnimationEnd: js.UndefOr[js.Function0[Unit] | Null],
      animations: js.UndefOr[js.Array[typings.babylonjs.animationMod.Animation]],
      /** defines a callback to call when animation loops */
    onAnimationLoop: js.UndefOr[js.Function0[Unit] | Null],
      /** defines whether the animation should be evaluated additively */
    isAdditive: js.UndefOr[Boolean]
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "Animation")
  @js.native
  class Animation protected ()
    extends typings.babylonjs.animationMod.Animation {
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
    
    @JSImport("babylonjs/Animations/index", "Animation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constant Loop Mode
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONLOOPMODE_CONSTANT")
    @js.native
    val ANIMATIONLOOPMODE_CONSTANT: Double = js.native
    
    /**
      * Cycle Loop Mode
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONLOOPMODE_CYCLE")
    @js.native
    val ANIMATIONLOOPMODE_CYCLE: Double = js.native
    
    /**
      * Relative Loop Mode
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONLOOPMODE_RELATIVE")
    @js.native
    val ANIMATIONLOOPMODE_RELATIVE: Double = js.native
    
    /**
      * Color3 animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_COLOR3")
    @js.native
    val ANIMATIONTYPE_COLOR3: Double = js.native
    
    /**
      * Color3 animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_COLOR4")
    @js.native
    val ANIMATIONTYPE_COLOR4: Double = js.native
    
    /**
      * Float animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_FLOAT")
    @js.native
    val ANIMATIONTYPE_FLOAT: Double = js.native
    
    /**
      * Matrix animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_MATRIX")
    @js.native
    val ANIMATIONTYPE_MATRIX: Double = js.native
    
    /**
      * Quaternion animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_QUATERNION")
    @js.native
    val ANIMATIONTYPE_QUATERNION: Double = js.native
    
    /**
      * Size animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_SIZE")
    @js.native
    val ANIMATIONTYPE_SIZE: Double = js.native
    
    /**
      * Vector2 animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_VECTOR2")
    @js.native
    val ANIMATIONTYPE_VECTOR2: Double = js.native
    
    /**
      * Vector3 animation type
      */
    @JSImport("babylonjs/Animations/index", "Animation.ANIMATIONTYPE_VECTOR3")
    @js.native
    val ANIMATIONTYPE_VECTOR3: Double = js.native
    
    /**
      * Use matrix interpolation instead of using direct key value when animating matrices
      */
    @JSImport("babylonjs/Animations/index", "Animation.AllowMatricesInterpolation")
    @js.native
    def AllowMatricesInterpolation: Boolean = js.native
    inline def AllowMatricesInterpolation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowMatricesInterpolation")(x.asInstanceOf[js.Any])
    
    /**
      * When matrix interpolation is enabled, this boolean forces the system to use Matrix.DecomposeLerp instead of Matrix.Lerp. Interpolation is more precise but slower
      */
    @JSImport("babylonjs/Animations/index", "Animation.AllowMatrixDecomposeForInterpolation")
    @js.native
    def AllowMatrixDecomposeForInterpolation: Boolean = js.native
    inline def AllowMatrixDecomposeForInterpolation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowMatrixDecomposeForInterpolation")(x.asInstanceOf[js.Any])
    
    /**
      * Appends the serialized animations from the source animations
      * @param source Source containing the animations
      * @param destination Target to store the animations
      */
    inline def AppendSerializedAnimations(source: IAnimatable, destination: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendSerializedAnimations")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typings.babylonjs.easingMod.EasingFunction
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typings.babylonjs.easingMod.EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Unit,
      easingFunction: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Unit,
      easingFunction: typings.babylonjs.easingMod.EasingFunction
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Unit,
      easingFunction: typings.babylonjs.easingMod.EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    
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
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any
    ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]]]
    inline def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double
    ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]]]
    inline def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]]]
    inline def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typings.babylonjs.easingMod.EasingFunction
    ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]]]
    inline def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typings.babylonjs.easingMod.EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]]]
    inline def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Unit,
      easingFunction: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]]]
    inline def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Unit,
      easingFunction: typings.babylonjs.easingMod.EasingFunction
    ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]]]
    inline def CreateAndStartHierarchyAnimation(
      name: String,
      node: Node,
      directDescendantsOnly: Boolean,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Unit,
      easingFunction: typings.babylonjs.easingMod.EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndStartHierarchyAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], directDescendantsOnly.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[typings.babylonjs.animatableMod.Animatable]]]
    
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
      easingFunction: typings.babylonjs.easingMod.EasingFunction
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAnimation")(property.asInstanceOf[js.Any], animationType.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    
    /**
      * Creates an animation or an array of animations from a snippet saved by the Inspector
      * @param snippetId defines the snippet to load
      * @returns a promise that will resolve to the new animation or a new array of animations
      */
    inline def CreateFromSnippetAsync(snippetId: String): js.Promise[
        typings.babylonjs.animationMod.Animation | js.Array[typings.babylonjs.animationMod.Animation]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromSnippetAsync")(snippetId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
        typings.babylonjs.animationMod.Animation | js.Array[typings.babylonjs.animationMod.Animation]
      ]]
    
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
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typings.babylonjs.easingMod.EasingFunction
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typings.babylonjs.easingMod.EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Unit,
      easingFunction: Unit,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Unit,
      easingFunction: typings.babylonjs.easingMod.EasingFunction
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def CreateMergeAndStartAnimation(
      name: String,
      node: Node,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Unit,
      easingFunction: typings.babylonjs.easingMod.EasingFunction,
      onAnimationEnd: js.Function0[Unit]
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateMergeAndStartAnimation")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    
    /**
      * Convert the keyframes for all animations belonging to the group to be relative to a given reference frame.
      * @param sourceAnimation defines the Animation containing keyframes to convert
      * @param referenceFrame defines the frame that keyframes in the range will be relative to
      * @param range defines the name of the AnimationRange belonging to the Animation to convert
      * @param cloneOriginal defines whether or not to clone the animation and convert the clone or convert the original animation (default is false)
      * @param clonedName defines the name of the resulting cloned Animation if cloneOriginal is true
      * @returns a new Animation if cloneOriginal is true or the original Animation if cloneOriginal is false
      */
    inline def MakeAnimationAdditive(sourceAnimation: typings.babylonjs.animationMod.Animation): typings.babylonjs.animationMod.Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(sourceAnimation: typings.babylonjs.animationMod.Animation, referenceFrame: Double): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(sourceAnimation: typings.babylonjs.animationMod.Animation, referenceFrame: Double, range: String): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(
      sourceAnimation: typings.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Boolean
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(
      sourceAnimation: typings.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Boolean,
      clonedName: String
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(
      sourceAnimation: typings.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Unit,
      clonedName: String
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(
      sourceAnimation: typings.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: Unit,
      cloneOriginal: Boolean
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(
      sourceAnimation: typings.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: Unit,
      cloneOriginal: Boolean,
      clonedName: String
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(
      sourceAnimation: typings.babylonjs.animationMod.Animation,
      referenceFrame: Double,
      range: Unit,
      cloneOriginal: Unit,
      clonedName: String
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(sourceAnimation: typings.babylonjs.animationMod.Animation, referenceFrame: Unit, range: String): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(
      sourceAnimation: typings.babylonjs.animationMod.Animation,
      referenceFrame: Unit,
      range: String,
      cloneOriginal: Boolean
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(
      sourceAnimation: typings.babylonjs.animationMod.Animation,
      referenceFrame: Unit,
      range: String,
      cloneOriginal: Boolean,
      clonedName: String
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(
      sourceAnimation: typings.babylonjs.animationMod.Animation,
      referenceFrame: Unit,
      range: String,
      cloneOriginal: Unit,
      clonedName: String
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(
      sourceAnimation: typings.babylonjs.animationMod.Animation,
      referenceFrame: Unit,
      range: Unit,
      cloneOriginal: Boolean
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(
      sourceAnimation: typings.babylonjs.animationMod.Animation,
      referenceFrame: Unit,
      range: Unit,
      cloneOriginal: Boolean,
      clonedName: String
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    inline def MakeAnimationAdditive(
      sourceAnimation: typings.babylonjs.animationMod.Animation,
      referenceFrame: Unit,
      range: Unit,
      cloneOriginal: Unit,
      clonedName: String
    ): typings.babylonjs.animationMod.Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimation.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationMod.Animation]
    
    /**
      * Parses an animation object and creates an animation
      * @param parsedAnimation Parsed animation object
      * @returns Animation object
      */
    inline def Parse(parsedAnimation: js.Any): typings.babylonjs.animationMod.Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedAnimation.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.animationMod.Animation]
    
    /**
      * Creates a new animation or an array of animations from a snippet saved in a remote file
      * @param name defines the name of the animation to create (can be null or empty to use the one from the json data)
      * @param url defines the url to load from
      * @returns a promise that will resolve to the new animation or an array of animations
      */
    inline def ParseFromFileAsync(name: Nullable[String], url: String): js.Promise[
        typings.babylonjs.animationMod.Animation | js.Array[typings.babylonjs.animationMod.Animation]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        typings.babylonjs.animationMod.Animation | js.Array[typings.babylonjs.animationMod.Animation]
      ]]
    
    /** Define the Url to load snippets */
    @JSImport("babylonjs/Animations/index", "Animation.SnippetUrl")
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
      targetValue: js.Any,
      host: js.Any,
      scene: Scene,
      frameRate: Double,
      transition: typings.babylonjs.animationMod.Animation,
      duration: Double
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("TransitionTo")(property.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any], host.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any], transition.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    inline def TransitionTo(
      property: String,
      targetValue: js.Any,
      host: js.Any,
      scene: Scene,
      frameRate: Double,
      transition: typings.babylonjs.animationMod.Animation,
      duration: Double,
      onAnimationEnd: Nullable[js.Function0[Unit]]
    ): Nullable[typings.babylonjs.animatableMod.Animatable] = (^.asInstanceOf[js.Dynamic].applyDynamic("TransitionTo")(property.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any], host.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any], transition.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onAnimationEnd.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animatableMod.Animatable]]
    
    /**
      * @hidden Internal use
      */
    inline def _PrepareAnimation(
      name: String,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any
    ): Nullable[typings.babylonjs.animationMod.Animation] = (^.asInstanceOf[js.Dynamic].applyDynamic("_PrepareAnimation")(name.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animationMod.Animation]]
    inline def _PrepareAnimation(
      name: String,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double
    ): Nullable[typings.babylonjs.animationMod.Animation] = (^.asInstanceOf[js.Dynamic].applyDynamic("_PrepareAnimation")(name.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animationMod.Animation]]
    inline def _PrepareAnimation(
      name: String,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Double,
      easingFunction: typings.babylonjs.easingMod.EasingFunction
    ): Nullable[typings.babylonjs.animationMod.Animation] = (^.asInstanceOf[js.Dynamic].applyDynamic("_PrepareAnimation")(name.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animationMod.Animation]]
    inline def _PrepareAnimation(
      name: String,
      targetProperty: String,
      framePerSecond: Double,
      totalFrame: Double,
      from: js.Any,
      to: js.Any,
      loopMode: Unit,
      easingFunction: typings.babylonjs.easingMod.EasingFunction
    ): Nullable[typings.babylonjs.animationMod.Animation] = (^.asInstanceOf[js.Dynamic].applyDynamic("_PrepareAnimation")(name.asInstanceOf[js.Any], targetProperty.asInstanceOf[js.Any], framePerSecond.asInstanceOf[js.Any], totalFrame.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], loopMode.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.animationMod.Animation]]
    
    /** @hidden */
    inline def _UniversalLerp(left: js.Any, right: js.Any, amount: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_UniversalLerp")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @JSImport("babylonjs/Animations/index", "AnimationEvent")
  @js.native
  class AnimationEvent protected ()
    extends typings.babylonjs.animationEventMod.AnimationEvent {
    /**
      * Initializes the animation event
      * @param frame The frame for which the event is triggered
      * @param action The event to perform when triggered
      * @param onlyOnce Specifies if the event should be triggered only once
      */
    def this(
      /** The frame for which the event is triggered **/
    frame: Double,
      /** The event to perform when triggered **/
    action: js.Function1[/* currentFrame */ Double, Unit]
    ) = this()
    def this(
      /** The frame for which the event is triggered **/
    frame: Double,
      /** The event to perform when triggered **/
    action: js.Function1[/* currentFrame */ Double, Unit],
      /** Specifies if the event should be triggered only once**/
    onlyOnce: Boolean
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "AnimationGroup")
  @js.native
  class AnimationGroup protected ()
    extends typings.babylonjs.animationGroupMod.AnimationGroup {
    /**
      * Instantiates a new Animation Group.
      * This helps managing several animations at once.
      * @see https://doc.babylonjs.com/how_to/group
      * @param name Defines the name of the group
      * @param scene Defines the scene the group belongs to
      */
    def this(/** The name of the animation group */
    name: String) = this()
    def this(/** The name of the animation group */
    name: String, scene: Nullable[Scene]) = this()
  }
  /* static members */
  object AnimationGroup {
    
    @JSImport("babylonjs/Animations/index", "AnimationGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert the keyframes for all animations belonging to the group to be relative to a given reference frame.
      * @param sourceAnimationGroup defines the AnimationGroup containing animations to convert
      * @param referenceFrame defines the frame that keyframes in the range will be relative to
      * @param range defines the name of the AnimationRange belonging to the animations in the group to convert
      * @param cloneOriginal defines whether or not to clone the group and convert the clone or convert the original group (default is false)
      * @param clonedName defines the name of the resulting cloned AnimationGroup if cloneOriginal is true
      * @returns a new AnimationGroup if cloneOriginal is true or the original AnimationGroup if cloneOriginal is false
      */
    inline def MakeAnimationAdditive(sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup): typings.babylonjs.animationGroupMod.AnimationGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup, referenceFrame: Double): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: String
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Boolean
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Boolean,
      clonedName: String
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Unit,
      clonedName: String
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: Unit,
      cloneOriginal: Boolean
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: Unit,
      cloneOriginal: Boolean,
      clonedName: String
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Double,
      range: Unit,
      cloneOriginal: Unit,
      clonedName: String
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Unit,
      range: String
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Unit,
      range: String,
      cloneOriginal: Boolean
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Unit,
      range: String,
      cloneOriginal: Boolean,
      clonedName: String
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Unit,
      range: String,
      cloneOriginal: Unit,
      clonedName: String
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Unit,
      range: Unit,
      cloneOriginal: Boolean
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Unit,
      range: Unit,
      cloneOriginal: Boolean,
      clonedName: String
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    inline def MakeAnimationAdditive(
      sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
      referenceFrame: Unit,
      range: Unit,
      cloneOriginal: Unit,
      clonedName: String
    ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
    
    /**
      * Returns a new AnimationGroup object parsed from the source provided.
      * @param parsedAnimationGroup defines the source
      * @param scene defines the scene that will receive the animationGroup
      * @returns a new AnimationGroup
      */
    inline def Parse(parsedAnimationGroup: js.Any, scene: Scene): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedAnimationGroup.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  }
  
  @JSImport("babylonjs/Animations/index", "AnimationKeyInterpolation")
  @js.native
  object AnimationKeyInterpolation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.animationKeyMod.AnimationKeyInterpolation & Double] = js.native
    
    /* 1 */ val STEP: typings.babylonjs.animationKeyMod.AnimationKeyInterpolation.STEP & Double = js.native
  }
  
  @JSImport("babylonjs/Animations/index", "AnimationPropertiesOverride")
  @js.native
  class AnimationPropertiesOverride ()
    extends typings.babylonjs.animationPropertiesOverrideMod.AnimationPropertiesOverride
  
  @JSImport("babylonjs/Animations/index", "AnimationRange")
  @js.native
  class AnimationRange protected ()
    extends typings.babylonjs.animationRangeMod.AnimationRange {
    /**
      * Initializes the range of an animation
      * @param name The name of the animation range
      * @param from The starting frame of the animation
      * @param to The ending frame of the animation
      */
    def this(
      /**The name of the animation range**/
    name: String,
      /**The starting frame of the animation */
    from: Double,
      /**The ending frame of the animation*/
    to: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "BackEase")
  @js.native
  /**
    * Instantiates a back ease easing
    * @see https://easings.net/#easeInBack
    * @param amplitude Defines the amplitude of the function
    */
  class BackEase ()
    extends typings.babylonjs.easingMod.BackEase {
    def this(/** Defines the amplitude of the function */
    amplitude: Double) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "BezierCurveEase")
  @js.native
  /**
    * Instantiates a bezier function
    * @see http://cubic-bezier.com/#.17,.67,.83,.67
    * @param x1 Defines the x component of the start tangent in the bezier curve
    * @param y1 Defines the y component of the start tangent in the bezier curve
    * @param x2 Defines the x component of the end tangent in the bezier curve
    * @param y2 Defines the y component of the end tangent in the bezier curve
    */
  class BezierCurveEase ()
    extends typings.babylonjs.easingMod.BezierCurveEase {
    def this(/** Defines the x component of the start tangent in the bezier curve */
    x1: Double) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Unit,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Unit,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Unit,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Unit,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Double,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Unit,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Unit,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Double,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Unit,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Unit,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Double,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
    def this(
      /** Defines the x component of the start tangent in the bezier curve */
    x1: Unit,
      /** Defines the y component of the start tangent in the bezier curve */
    y1: Unit,
      /** Defines the x component of the end tangent in the bezier curve */
    x2: Unit,
      /** Defines the y component of the end tangent in the bezier curve */
    y2: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "BounceEase")
  @js.native
  /**
    * Instantiates a bounce easing
    * @see https://easings.net/#easeInBounce
    * @param bounces Defines the number of bounces
    * @param bounciness Defines the amplitude of the bounce
    */
  class BounceEase ()
    extends typings.babylonjs.easingMod.BounceEase {
    def this(/** Defines the number of bounces */
    bounces: Double) = this()
    def this(
      /** Defines the number of bounces */
    bounces: Double,
      /** Defines the amplitude of the bounce */
    bounciness: Double
    ) = this()
    def this(
      /** Defines the number of bounces */
    bounces: Unit,
      /** Defines the amplitude of the bounce */
    bounciness: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "CircleEase")
  @js.native
  class CircleEase ()
    extends typings.babylonjs.easingMod.CircleEase
  
  @JSImport("babylonjs/Animations/index", "CubicEase")
  @js.native
  class CubicEase ()
    extends typings.babylonjs.easingMod.CubicEase
  
  @JSImport("babylonjs/Animations/index", "EasingFunction")
  @js.native
  class EasingFunction ()
    extends typings.babylonjs.easingMod.EasingFunction
  /* static members */
  object EasingFunction {
    
    /**
      * Interpolation follows the mathematical formula associated with the easing function.
      */
    @JSImport("babylonjs/Animations/index", "EasingFunction.EASINGMODE_EASEIN")
    @js.native
    val EASINGMODE_EASEIN: Double = js.native
    
    /**
      * Interpolation uses EaseIn for the first half of the animation and EaseOut for the second half.
      */
    @JSImport("babylonjs/Animations/index", "EasingFunction.EASINGMODE_EASEINOUT")
    @js.native
    val EASINGMODE_EASEINOUT: Double = js.native
    
    /**
      * Interpolation follows 100% interpolation minus the output of the formula associated with the easing function.
      */
    @JSImport("babylonjs/Animations/index", "EasingFunction.EASINGMODE_EASEOUT")
    @js.native
    val EASINGMODE_EASEOUT: Double = js.native
  }
  
  @JSImport("babylonjs/Animations/index", "ElasticEase")
  @js.native
  /**
    * Instantiates an elastic easing function
    * @see https://easings.net/#easeInElastic
    * @param oscillations Defines the number of oscillations
    * @param springiness Defines the amplitude of the oscillations
    */
  class ElasticEase ()
    extends typings.babylonjs.easingMod.ElasticEase {
    def this(/** Defines the number of oscillations*/
    oscillations: Double) = this()
    def this(
      /** Defines the number of oscillations*/
    oscillations: Double,
      /** Defines the amplitude of the oscillations*/
    springiness: Double
    ) = this()
    def this(
      /** Defines the number of oscillations*/
    oscillations: Unit,
      /** Defines the amplitude of the oscillations*/
    springiness: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "ExponentialEase")
  @js.native
  /**
    * Instantiates an exponential easing function
    * @see https://easings.net/#easeInExpo
    * @param exponent Defines the exponent of the function
    */
  class ExponentialEase ()
    extends typings.babylonjs.easingMod.ExponentialEase {
    def this(/** Defines the exponent of the function */
    exponent: Double) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "_IAnimationState")
  @js.native
  class IAnimationState ()
    extends typings.babylonjs.animationMod.IAnimationState
  
  @JSImport("babylonjs/Animations/index", "PowerEase")
  @js.native
  /**
    * Instantiates an power base easing function
    * @see https://easings.net/#easeInQuad
    * @param power Defines the power of the function
    */
  class PowerEase ()
    extends typings.babylonjs.easingMod.PowerEase {
    def this(/** Defines the power of the function */
    power: Double) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "QuadraticEase")
  @js.native
  class QuadraticEase ()
    extends typings.babylonjs.easingMod.QuadraticEase
  
  @JSImport("babylonjs/Animations/index", "QuarticEase")
  @js.native
  class QuarticEase ()
    extends typings.babylonjs.easingMod.QuarticEase
  
  @JSImport("babylonjs/Animations/index", "QuinticEase")
  @js.native
  class QuinticEase ()
    extends typings.babylonjs.easingMod.QuinticEase
  
  @JSImport("babylonjs/Animations/index", "RuntimeAnimation")
  @js.native
  class RuntimeAnimation protected ()
    extends typings.babylonjs.runtimeAnimationMod.RuntimeAnimation {
    /**
      * Create a new RuntimeAnimation object
      * @param target defines the target of the animation
      * @param animation defines the source animation object
      * @param scene defines the hosting scene
      * @param host defines the initiating Animatable
      */
    def this(
      target: js.Any,
      animation: typings.babylonjs.animationMod.Animation,
      scene: Scene,
      host: typings.babylonjs.animatableMod.Animatable
    ) = this()
  }
  
  @JSImport("babylonjs/Animations/index", "SineEase")
  @js.native
  class SineEase ()
    extends typings.babylonjs.easingMod.SineEase
  
  @JSImport("babylonjs/Animations/index", "TargetedAnimation")
  @js.native
  class TargetedAnimation ()
    extends typings.babylonjs.animationGroupMod.TargetedAnimation
  
  /* augmented module */
  object babylonjsBonesBoneAugmentingMod {
    
    trait Bone extends StObject {
      
      /**
        * Copy an animation range from another bone
        * @param source defines the source bone
        * @param rangeName defines the range name to copy
        * @param frameOffset defines the frame offset
        * @param rescaleAsRequired defines if rescaling must be applied if required
        * @param skelDimensionsRatio defines the scaling ratio
        * @returns true if operation was successful
        */
      def copyAnimationRange(
        source: typings.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone,
        rangeName: String,
        frameOffset: Double,
        rescaleAsRequired: Boolean,
        skelDimensionsRatio: Nullable[Vector3]
      ): Boolean
    }
    object Bone {
      
      inline def apply(
        copyAnimationRange: (typings.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone, String, Double, Boolean, Nullable[Vector3]) => Boolean
      ): Bone = {
        val __obj = js.Dynamic.literal(copyAnimationRange = js.Any.fromFunction5(copyAnimationRange))
        __obj.asInstanceOf[Bone]
      }
      
      extension [Self <: Bone](x: Self) {
        
        inline def setCopyAnimationRange(
          value: (typings.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone, String, Double, Boolean, Nullable[Vector3]) => Boolean
        ): Self = StObject.set(x, "copyAnimationRange", js.Any.fromFunction5(value))
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden */
      def _processLateAnimationBindings(): Unit = js.native
      
      /** @hidden */
      def _processLateAnimationBindingsForMatrices(holder: AdditiveAnimations): js.Any = js.native
      
      /** @hidden */
      def _processLateAnimationBindingsForQuaternions(holder: Animations, refQuaternion: Quaternion): Quaternion = js.native
      
      /** @hidden */
      def _registerTargetForLateAnimationBinding(runtimeAnimation: typings.babylonjs.runtimeAnimationMod.RuntimeAnimation, originalValue: js.Any): Unit = js.native
      
      /**
        * Will start the animation sequence of a given target
        * @param target defines the target
        * @param from defines from which frame should animation start
        * @param to defines until which frame should animation run.
        * @param loop defines if the animation loops
        * @param speedRatio defines the speed in which to run the animation (1.0 by default)
        * @param onAnimationEnd defines the function to be executed when the animation ends
        * @param animatable defines an animatable object. If not provided a new one will be created from the given params
        * @param stopCurrent defines if the current animations must be stopped first (true by default)
        * @param targetMask defines if the target should be animate if animations are present (this is called recursively on descendant animatables regardless of return value)
        * @param onAnimationLoop defines the callback to call when an animation loops
        * @param isAdditive defines whether the animation should be evaluated additively (false by default)
        * @returns the animatable object created for this animation
        */
      def beginAnimation(
        target: js.Any,
        from: Double,
        to: Double,
        loop: js.UndefOr[Boolean],
        speedRatio: js.UndefOr[Double],
        onAnimationEnd: js.UndefOr[js.Function0[Unit]],
        animatable: js.UndefOr[typings.babylonjs.animatableMod.Animatable],
        stopCurrent: js.UndefOr[Boolean],
        targetMask: js.UndefOr[js.Function1[/* target */ js.Any, Boolean]],
        onAnimationLoop: js.UndefOr[js.Function0[Unit]],
        isAdditive: js.UndefOr[Boolean]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      
      /**
        * Begin a new animation on a given node
        * @param target defines the target where the animation will take place
        * @param animations defines the list of animations to start
        * @param from defines the initial value
        * @param to defines the final value
        * @param loop defines if you want animation to loop (off by default)
        * @param speedRatio defines the speed ratio to apply to all animations
        * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
        * @param onAnimationLoop defines the callback to call when an animation loops
        * @param isAdditive defines whether the animation should be evaluated additively (false by default)
        * @returns the list of created animatables
        */
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: Unit,
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: Unit,
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: Unit,
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: Unit,
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): typings.babylonjs.animatableMod.Animatable = js.native
      
      /**
        * Begin a new animation on a given node and its hierarchy
        * @param target defines the root node where the animation will take place
        * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
        * @param animations defines the list of animations to start
        * @param from defines the initial value
        * @param to defines the final value
        * @param loop defines if you want animation to loop (off by default)
        * @param speedRatio defines the speed ratio to apply to all animations
        * @param onAnimationEnd defines the callback to call when an animation ends (will be called once per node)
        * @param onAnimationLoop defines the callback to call when an animation loops
        * @param isAdditive defines whether the animation should be evaluated additively (false by default)
        * @returns the list of animatables created for all nodes
        */
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: Unit,
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Unit,
        onAnimationEnd: Unit,
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Double,
        onAnimationEnd: Unit,
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: Unit,
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[typings.babylonjs.animationMod.Animation],
        from: Double,
        to: Double,
        loop: Unit,
        speedRatio: Unit,
        onAnimationEnd: Unit,
        onAnimationLoop: Unit,
        isAdditive: Boolean
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      
      /**
        * Will start the animation sequence of a given target and its hierarchy
        * @param target defines the target
        * @param directDescendantsOnly if true only direct descendants will be used, if false direct and also indirect (children of children, an so on in a recursive manner) descendants will be used.
        * @param from defines from which frame should animation start
        * @param to defines until which frame should animation run.
        * @param loop defines if the animation loops
        * @param speedRatio defines the speed in which to run the animation (1.0 by default)
        * @param onAnimationEnd defines the function to be executed when the animation ends
        * @param animatable defines an animatable object. If not provided a new one will be created from the given params
        * @param stopCurrent defines if the current animations must be stopped first (true by default)
        * @param targetMask defines if the target should be animated if animations are present (this is called recursively on descendant animatables regardless of return value)
        * @param onAnimationLoop defines the callback to call when an animation loops
        * @param isAdditive defines whether the animation should be evaluated additively (false by default)
        * @returns the list of created animatables
        */
      def beginHierarchyAnimation(
        target: js.Any,
        directDescendantsOnly: Boolean,
        from: Double,
        to: Double,
        loop: js.UndefOr[Boolean],
        speedRatio: js.UndefOr[Double],
        onAnimationEnd: js.UndefOr[js.Function0[Unit]],
        animatable: js.UndefOr[typings.babylonjs.animatableMod.Animatable],
        stopCurrent: js.UndefOr[Boolean],
        targetMask: js.UndefOr[js.Function1[/* target */ js.Any, Boolean]],
        onAnimationLoop: js.UndefOr[js.Function0[Unit]],
        isAdditive: js.UndefOr[Boolean]
      ): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      
      /**
        * Will start the animation sequence of a given target
        * @param target defines the target
        * @param from defines from which frame should animation start
        * @param to defines until which frame should animation run.
        * @param weight defines the weight to apply to the animation (1.0 by default)
        * @param loop defines if the animation loops
        * @param speedRatio defines the speed in which to run the animation (1.0 by default)
        * @param onAnimationEnd defines the function to be executed when the animation ends
        * @param animatable defines an animatable object. If not provided a new one will be created from the given params
        * @param targetMask defines if the target should be animated if animations are present (this is called recursively on descendant animatables regardless of return value)
        * @param onAnimationLoop defines the callback to call when an animation loops
        * @param isAdditive defines whether the animation should be evaluated additively (false by default)
        * @returns the animatable object created for this animation
        */
      def beginWeightedAnimation(
        target: js.Any,
        from: Double,
        to: Double,
        weight: Double,
        loop: js.UndefOr[Boolean],
        speedRatio: js.UndefOr[Double],
        onAnimationEnd: js.UndefOr[js.Function0[Unit]],
        animatable: js.UndefOr[typings.babylonjs.animatableMod.Animatable],
        targetMask: js.UndefOr[js.Function1[/* target */ js.Any, Boolean]],
        onAnimationLoop: js.UndefOr[js.Function0[Unit]],
        isAdditive: js.UndefOr[Boolean]
      ): typings.babylonjs.animatableMod.Animatable = js.native
      
      /**
        * Gets the current delta time used by animation engine
        */
      var deltaTime: Double = js.native
      
      /**
        * Gets all animatables associated with a given target
        * @param target defines the target to look animatables for
        * @returns an array of Animatables
        */
      def getAllAnimatablesByTarget(target: js.Any): js.Array[typings.babylonjs.animatableMod.Animatable] = js.native
      
      /**
        * Gets the animatable associated with a specific target
        * @param target defines the target of the animatable
        * @returns the required animatable if found
        */
      def getAnimatableByTarget(target: js.Any): Nullable[typings.babylonjs.animatableMod.Animatable] = js.native
      
      /**
        * Stops and removes all animations that have been applied to the scene
        */
      def stopAllAnimations(): Unit = js.native
    }
  }
}
