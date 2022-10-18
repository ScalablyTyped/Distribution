package typings.babylonjs

import typings.babylonjs.actionsActionMod.Action
import typings.babylonjs.actionsConditionMod.Condition
import typings.babylonjs.miscObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsInterpolateValueActionMod {
  
  @JSImport("babylonjs/Actions/interpolateValueAction", "InterpolateValueAction")
  @js.native
  open class InterpolateValueAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the value to interpolate
      * @param propertyPath defines the path to the property in the target object
      * @param value defines the target value at the end of the interpolation
      * @param duration defines the time it will take for the property to interpolate to the value.
      * @param condition defines the trigger related conditions
      * @param stopOtherAnimations defines if the other scene animations should be stopped when the action has been triggered
      * @param onInterpolationDone defines a callback raised once the interpolation animation has been done
      */
    def this(triggerOptions: Any, target: Any, propertyPath: String, value: Any) = this()
    def this(triggerOptions: Any, target: Any, propertyPath: String, value: Any, duration: Double) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: Condition
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: Condition
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: Unit,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: Condition,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: Unit,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: Condition,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: Unit,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: Unit,
      stopOtherAnimations: Unit,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: Condition,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Double,
      condition: Condition,
      stopOtherAnimations: Unit,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: Unit,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: Unit,
      stopOtherAnimations: Unit,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: Condition,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: Any,
      target: Any,
      propertyPath: String,
      value: Any,
      duration: Unit,
      condition: Condition,
      stopOtherAnimations: Unit,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    
    /* private */ var _effectiveTarget: Any = js.native
    
    /* private */ var _property: Any = js.native
    
    /* private */ var _target: Any = js.native
    
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
    var value: Any = js.native
  }
}
