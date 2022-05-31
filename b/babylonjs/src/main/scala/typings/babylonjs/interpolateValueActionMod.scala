package typings.babylonjs

import typings.babylonjs.actionMod.Action
import typings.babylonjs.conditionMod.Condition
import typings.babylonjs.observableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpolateValueActionMod {
  
  @JSImport("babylonjs/Actions/interpolateValueAction", "InterpolateValueAction")
  @js.native
  class InterpolateValueAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the value to interpolate
      * @param propertyPath defines the path to the property in the target object
      * @param value defines the target value at the end of the interpolation
      * @param duration deines the time it will take for the property to interpolate to the value.
      * @param condition defines the trigger related conditions
      * @param stopOtherAnimations defines if the other scene animations should be stopped when the action has been triggered
      * @param onInterpolationDone defines a callback raised once the interpolation animation has been done
      */
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any) = this()
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any, duration: Double) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: Condition
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Unit,
      condition: Condition
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: Unit,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: Condition,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Unit,
      condition: Unit,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Unit,
      condition: Condition,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: Unit,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: Unit,
      stopOtherAnimations: Unit,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: Condition,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: Condition,
      stopOtherAnimations: Unit,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Unit,
      condition: Unit,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Unit,
      condition: Unit,
      stopOtherAnimations: Unit,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Unit,
      condition: Condition,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Unit,
      condition: Condition,
      stopOtherAnimations: Unit,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    
    /* private */ var _effectiveTarget: js.Any = js.native
    
    /* private */ var _property: js.Any = js.native
    
    /* private */ var _target: js.Any = js.native
    
    /**
      * Defines the time it will take for the property to interpolate to the value.
      */
    var duration: Double = js.native
    
    /**
      * Defines a callback raised once the interpolation animation has been done.
      */
    var onInterpolationDone: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Observable triggered once the interpolation animation has been done.
      */
    var onInterpolationDoneObservable: Observable[InterpolateValueAction] = js.native
    
    /**
      * Defines the path of the property where the value should be interpolated
      */
    var propertyPath: String = js.native
    
    /**
      * Defines if the other scene animations should be stopped when the action has been triggered
      */
    var stopOtherAnimations: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the target value at the end of the interpolation.
      */
    var value: js.Any = js.native
  }
}
