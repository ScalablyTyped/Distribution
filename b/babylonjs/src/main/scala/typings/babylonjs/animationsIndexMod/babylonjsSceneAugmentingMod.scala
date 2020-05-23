package typings.babylonjs.animationsIndexMod

import typings.babylonjs.anon.Animations
import typings.babylonjs.anon.OriginalValue
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/Animations/index", "babylonjs/scene")
@js.native
object babylonjsSceneAugmentingMod extends js.Object {
  @js.native
  trait Scene extends js.Object {
    /**
      * Gets the current delta time used by animation engine
      */
    var deltaTime: Double = js.native
    /** @hidden */
    def _processLateAnimationBindings(): Unit = js.native
    /** @hidden */
    def _processLateAnimationBindingsForMatrices(holder: Animations): js.Any = js.native
    /** @hidden */
    def _processLateAnimationBindingsForQuaternions(holder: OriginalValue, refQuaternion: Quaternion): Quaternion = js.native
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
      onAnimationLoop: js.UndefOr[js.Function0[Unit]]
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
      onAnimationLoop: js.UndefOr[js.Function0[Unit]]
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
      onAnimationLoop: js.UndefOr[js.Function0[Unit]]
    ): typings.babylonjs.animatableMod.Animatable = js.native
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

