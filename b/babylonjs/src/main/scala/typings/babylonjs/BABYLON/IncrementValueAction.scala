package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncrementValueAction
  extends StObject
     with Action {
  
  /* private */ var _effectiveTarget: Any = js.native
  
  /* private */ var _property: Any = js.native
  
  /* private */ var _target: Any = js.native
  
  /**
    * The path of the property to increment in the target.
    */
  var propertyPath: String = js.native
  
  /**
    * The value we should increment the property by.
    */
  var value: Any = js.native
}
