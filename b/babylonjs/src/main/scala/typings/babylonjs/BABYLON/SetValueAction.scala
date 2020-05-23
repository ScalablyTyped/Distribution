package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetValueAction extends Action {
  var _effectiveTarget: js.Any = js.native
  var _property: js.Any = js.native
  var _target: js.Any = js.native
  /**
    * The path of the property to set in the target.
    */
  var propertyPath: String = js.native
  /**
    * The value to set in the property
    */
  var value: js.Any = js.native
}

