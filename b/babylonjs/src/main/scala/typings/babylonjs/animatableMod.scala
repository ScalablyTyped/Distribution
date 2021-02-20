package typings.babylonjs

import typings.babylonjs.animationMod.Animation
import typings.babylonjs.anon.AdditiveAnimations
import typings.babylonjs.anon.Animations
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.runtimeAnimationMod.RuntimeAnimation
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatableMod {
  
  @JSImport("babylonjs/Animations/animatable", "Animatable")
  @js.native
  class Animatable protected () extends StObject {
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
      animations: js.UndefOr[js.Array[Animation]],
      /** defines a callback to call when animation loops */
    onAnimationLoop: js.UndefOr[js.Function0[Unit] | Null],
      /** defines whether the animation should be evaluated additively */
    isAdditive: js.UndefOr[Boolean]
    ) = this()
    
    /** @hidden */
    def _animate(delay: Double): Boolean = js.native
    
    var _localDelayOffset: js.Any = js.native
    
    var _paused: js.Any = js.native
    
    var _pausedDelay: js.Any = js.native
    
    var _raiseOnAnimationEnd: js.Any = js.native
    
    var _runtimeAnimations: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _speedRatio: js.Any = js.native
    
    var _syncRoot: js.Any = js.native
    
    var _weight: js.Any = js.native
    
    /**
      * Gets a boolean indicating if the animation has started
      */
    var animationStarted: Boolean = js.native
    
    /**
      * Adds more animations to the current animatable
      * @param target defines the target of the animations
      * @param animations defines the new animations to add
      */
    def appendAnimations(target: js.Any, animations: js.Array[Animation]): Unit = js.native
    
    /**
      * Disable animation blending
      * @see https://doc.babylonjs.com/babylon101/animations#animation-blending
      */
    def disableBlending(): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating if the animatable must be disposed and removed at the end of the animation.
      * This will only apply for non looping animation (default is true)
      */
    var disposeOnEnd: Boolean = js.native
    
    /**
      * Allows the animatable to blend with current running animations
      * @see https://doc.babylonjs.com/babylon101/animations#animation-blending
      * @param blendingSpeed defines the blending speed to use
      */
    def enableBlending(blendingSpeed: Double): Unit = js.native
    
    /** defines the starting frame number (default is 0) */
    var fromFrame: Double = js.native
    
    /**
      * Gets the source animation for a specific property
      * @param property defines the propertyu to look for
      * @returns null or the source animation for the given property
      */
    def getAnimationByTargetProperty(property: String): Nullable[Animation] = js.native
    
    /**
      * Gets the list of runtime animations
      * @returns an array of RuntimeAnimation
      */
    def getAnimations(): js.Array[RuntimeAnimation] = js.native
    
    /**
      * Gets the runtime animation for a specific property
      * @param property defines the propertyu to look for
      * @returns null or the runtime animation for the given property
      */
    def getRuntimeAnimationByTargetProperty(property: String): Nullable[RuntimeAnimation] = js.native
    
    /**
      * Jump directly to a given frame
      * @param frame defines the frame to jump to
      */
    def goToFrame(frame: Double): Unit = js.native
    
    /** defines whether the animation should be evaluated additively */
    var isAdditive: Boolean = js.native
    
    /** defines if the animation must loop (default is false)  */
    var loopAnimation: Boolean = js.native
    
    /**
      * Gets the current frame of the first RuntimeAnimation
      * Used to synchronize Animatables
      */
    def masterFrame: Double = js.native
    
    /** defines a callback to call when animation ends if it is not looping */
    var onAnimationEnd: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    /**
      * Observer raised when the animation ends
      */
    var onAnimationEndObservable: Observable[Animatable] = js.native
    
    /** defines a callback to call when animation loops */
    var onAnimationLoop: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    /**
      * Observer raised when the animation loops
      */
    var onAnimationLoopObservable: Observable[Animatable] = js.native
    
    /**
      * Pause the animation
      */
    def pause(): Unit = js.native
    
    /**
      * Resets the animatable to its original state
      */
    def reset(): Unit = js.native
    
    /**
      * Restart the animation
      */
    def restart(): Unit = js.native
    
    /**
      * Gets or sets the speed ratio to apply to the animatable (1.0 by default)
      */
    def speedRatio: Double = js.native
    def speedRatio_=(value: Double): Unit = js.native
    
    /**
      * Stop and delete the current animation
      * @param animationName defines a string used to only stop some of the runtime animations instead of all
      * @param targetMask - a function that determines if the animation should be stopped based on its target (all animations will be stopped if both this and animationName are empty)
      */
    def stop(): Unit = js.native
    def stop(animationName: js.UndefOr[scala.Nothing], targetMask: js.Function1[/* target */ js.Any, Boolean]): Unit = js.native
    def stop(animationName: String): Unit = js.native
    def stop(animationName: String, targetMask: js.Function1[/* target */ js.Any, Boolean]): Unit = js.native
    
    /**
      * Gets the root Animatable used to synchronize and normalize animations
      */
    def syncRoot: Nullable[Animatable] = js.native
    
    /**
      * Synchronize and normalize current Animatable with a source Animatable
      * This is useful when using animation weights and when animations are not of the same length
      * @param root defines the root Animatable to synchronize with
      * @returns the current Animatable
      */
    def syncWith(root: Animatable): Animatable = js.native
    
    /** defines the target object */
    var target: js.Any = js.native
    
    /** defines the ending frame number (default is 100) */
    var toFrame: Double = js.native
    
    /**
      * Wait asynchronously for the animation to end
      * @returns a promise which will be fullfilled when the animation ends
      */
    def waitAsync(): js.Promise[Animatable] = js.native
    
    /**
      * Gets or sets the animatable weight (-1.0 by default meaning not weighted)
      */
    def weight: Double = js.native
    def weight_=(value: Double): Unit = js.native
  }
  
  /* augmented module */
  object babylonjsBonesBoneAugmentingMod {
    
    @js.native
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
        source: Bone,
        rangeName: String,
        frameOffset: Double,
        rescaleAsRequired: Boolean,
        skelDimensionsRatio: Nullable[Vector3]
      ): Boolean = js.native
    }
    object Bone {
      
      @scala.inline
      def apply(copyAnimationRange: (Bone, String, Double, Boolean, Nullable[Vector3]) => Boolean): Bone = {
        val __obj = js.Dynamic.literal(copyAnimationRange = js.Any.fromFunction5(copyAnimationRange))
        __obj.asInstanceOf[Bone]
      }
      
      @scala.inline
      implicit class BoneMutableBuilder[Self <: Bone] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCopyAnimationRange(value: (Bone, String, Double, Boolean, Nullable[Vector3]) => Boolean): Self = StObject.set(x, "copyAnimationRange", js.Any.fromFunction5(value))
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
      def _registerTargetForLateAnimationBinding(runtimeAnimation: RuntimeAnimation, originalValue: js.Any): Unit = js.native
      
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
        animatable: js.UndefOr[Animatable],
        stopCurrent: js.UndefOr[Boolean],
        targetMask: js.UndefOr[js.Function1[/* target */ js.Any, Boolean]],
        onAnimationLoop: js.UndefOr[js.Function0[Unit]],
        isAdditive: js.UndefOr[Boolean]
      ): Animatable = js.native
      
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
      def beginDirectAnimation(target: js.Any, animations: js.Array[Animation], from: Double, to: Double): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit]
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit]
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(target: js.Any, animations: js.Array[Animation], from: Double, to: Double, loop: Boolean): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit]
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit]
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): Animatable = js.native
      def beginDirectAnimation(
        target: js.Any,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): Animatable = js.native
      
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
        animations: js.Array[Animation],
        from: Double,
        to: Double
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit]
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit]
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: js.UndefOr[scala.Nothing],
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit]
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: js.UndefOr[scala.Nothing],
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.UndefOr[scala.Nothing],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit]
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.UndefOr[scala.Nothing],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit]
      ): js.Array[Animatable] = js.native
      def beginDirectHierarchyAnimation(
        target: Node,
        directDescendantsOnly: Boolean,
        animations: js.Array[Animation],
        from: Double,
        to: Double,
        loop: Boolean,
        speedRatio: Double,
        onAnimationEnd: js.Function0[Unit],
        onAnimationLoop: js.Function0[Unit],
        isAdditive: Boolean
      ): js.Array[Animatable] = js.native
      
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
        animatable: js.UndefOr[Animatable],
        stopCurrent: js.UndefOr[Boolean],
        targetMask: js.UndefOr[js.Function1[/* target */ js.Any, Boolean]],
        onAnimationLoop: js.UndefOr[js.Function0[Unit]],
        isAdditive: js.UndefOr[Boolean]
      ): js.Array[Animatable] = js.native
      
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
        animatable: js.UndefOr[Animatable],
        targetMask: js.UndefOr[js.Function1[/* target */ js.Any, Boolean]],
        onAnimationLoop: js.UndefOr[js.Function0[Unit]],
        isAdditive: js.UndefOr[Boolean]
      ): Animatable = js.native
      
      /**
        * Gets the current delta time used by animation engine
        */
      var deltaTime: Double = js.native
      
      /**
        * Gets all animatables associated with a given target
        * @param target defines the target to look animatables for
        * @returns an array of Animatables
        */
      def getAllAnimatablesByTarget(target: js.Any): js.Array[Animatable] = js.native
      
      /**
        * Gets the animatable associated with a specific target
        * @param target defines the target of the animatable
        * @returns the required animatable if found
        */
      def getAnimatableByTarget(target: js.Any): Nullable[Animatable] = js.native
      
      /**
        * Stops and removes all animations that have been applied to the scene
        */
      def stopAllAnimations(): Unit = js.native
    }
  }
}
