package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMaterialCompilationOptions extends StObject {
  
  /**
    * Defines whether clip planes are enabled.
    */
  var clipPlane: Boolean
  
  /**
    * Defines whether instances are enabled.
    */
  var useInstances: Boolean
}
object IMaterialCompilationOptions {
  
  inline def apply(clipPlane: Boolean, useInstances: Boolean): IMaterialCompilationOptions = {
    val __obj = js.Dynamic.literal(clipPlane = clipPlane.asInstanceOf[js.Any], useInstances = useInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialCompilationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMaterialCompilationOptions] (val x: Self) extends AnyVal {
    
    inline def setClipPlane(value: Boolean): Self = StObject.set(x, "clipPlane", value.asInstanceOf[js.Any])
    
    inline def setUseInstances(value: Boolean): Self = StObject.set(x, "useInstances", value.asInstanceOf[js.Any])
  }
}
