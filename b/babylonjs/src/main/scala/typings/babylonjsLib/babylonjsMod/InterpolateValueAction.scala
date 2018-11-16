package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This defines an action responsible to change the value of a property
     * by interpolating between its current value and the newly set one once triggered.
     * @see http://doc.babylonjs.com/how_to/how_to_use_actions
     */
@JSImport("babylonjs", "InterpolateValueAction")
@js.native
class InterpolateValueAction protected ()
  extends babylonjsLib.BABYLONNs.InterpolateValueAction {
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
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: java.lang.String, value: js.Any) = this()
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
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: java.lang.String, value: js.Any, duration: scala.Double) = this()
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
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: java.lang.String, value: js.Any, duration: scala.Double, condition: babylonjsLib.BABYLONNs.Condition) = this()
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
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: java.lang.String, value: js.Any, duration: scala.Double, condition: babylonjsLib.BABYLONNs.Condition, stopOtherAnimations: scala.Boolean) = this()
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
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: java.lang.String, value: js.Any, duration: scala.Double, condition: babylonjsLib.BABYLONNs.Condition, stopOtherAnimations: scala.Boolean, onInterpolationDone: js.Function0[scala.Unit]) = this()
}

