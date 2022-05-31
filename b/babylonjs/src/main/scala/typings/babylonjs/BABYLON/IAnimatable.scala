package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimatable extends StObject {
  
  /**
    * Array of animations
    */
  var animations: Nullable[js.Array[Animation]]
}
object IAnimatable {
  
  inline def apply(): IAnimatable = {
    val __obj = js.Dynamic.literal(animations = null)
    __obj.asInstanceOf[IAnimatable]
  }
  
  extension [Self <: IAnimatable](x: Self) {
    
    inline def setAnimations(value: Nullable[js.Array[Animation]]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsNull: Self = StObject.set(x, "animations", null)
    
    inline def setAnimationsVarargs(value: Animation*): Self = StObject.set(x, "animations", js.Array(value :_*))
  }
}
