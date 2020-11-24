package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpolateValueAction extends Action {
  
  var _effectiveTarget: js.Any = js.native
  
  var _property: js.Any = js.native
  
  var _target: js.Any = js.native
  
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
