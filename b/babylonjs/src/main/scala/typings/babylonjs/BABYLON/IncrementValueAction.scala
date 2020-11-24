package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncrementValueAction extends Action {
  
  var _effectiveTarget: js.Any = js.native
  
  var _property: js.Any = js.native
  
  var _target: js.Any = js.native
  
  /**
    * The path of the property to increment in the target.
    */
  var propertyPath: String = js.native
  
  /**
    * The value we should increment the property by.
    */
  var value: js.Any = js.native
}
