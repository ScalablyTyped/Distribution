package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMaterialCompilationOptions extends StObject {
  
  /**
    * Defines whether clip planes are enabled.
    */
  var clipPlane: Boolean = js.native
  
  /**
    * Defines whether instances are enabled.
    */
  var useInstances: Boolean = js.native
}
object IMaterialCompilationOptions {
  
  @scala.inline
  def apply(clipPlane: Boolean, useInstances: Boolean): IMaterialCompilationOptions = {
    val __obj = js.Dynamic.literal(clipPlane = clipPlane.asInstanceOf[js.Any], useInstances = useInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialCompilationOptions]
  }
  
  @scala.inline
  implicit class IMaterialCompilationOptionsMutableBuilder[Self <: IMaterialCompilationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipPlane(value: Boolean): Self = StObject.set(x, "clipPlane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseInstances(value: Boolean): Self = StObject.set(x, "useInstances", value.asInstanceOf[js.Any])
  }
}
