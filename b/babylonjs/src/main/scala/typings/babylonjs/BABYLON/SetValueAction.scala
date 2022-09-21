package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetValueAction
  extends StObject
     with Action {
  
  /* private */ var _effectiveTarget: Any = js.native
  
  /* private */ var _property: Any = js.native
  
  /* private */ var _target: Any = js.native
  
  /**
    * The path of the property to set in the target.
    */
  var propertyPath: String = js.native
  
  /**
    * The value to set in the property
    */
  var value: Any = js.native
}
