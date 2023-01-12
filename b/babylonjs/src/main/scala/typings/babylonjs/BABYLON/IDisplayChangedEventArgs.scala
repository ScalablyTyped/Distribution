package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDisplayChangedEventArgs extends StObject {
  
  /** Gets the vrDisplay object (if any) */
  var vrDisplay: Nullable[Any]
  
  /** Gets a boolean indicating if webVR is supported */
  var vrSupported: Boolean
}
object IDisplayChangedEventArgs {
  
  inline def apply(vrSupported: Boolean): IDisplayChangedEventArgs = {
    val __obj = js.Dynamic.literal(vrSupported = vrSupported.asInstanceOf[js.Any], vrDisplay = null)
    __obj.asInstanceOf[IDisplayChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDisplayChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setVrDisplay(value: Nullable[Any]): Self = StObject.set(x, "vrDisplay", value.asInstanceOf[js.Any])
    
    inline def setVrDisplayNull: Self = StObject.set(x, "vrDisplay", null)
    
    inline def setVrSupported(value: Boolean): Self = StObject.set(x, "vrSupported", value.asInstanceOf[js.Any])
  }
}
