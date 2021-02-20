package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDisplayChangedEventArgs extends StObject {
  
  /** Gets the vrDisplay object (if any) */
  var vrDisplay: Nullable[_] = js.native
  
  /** Gets a boolean indicating if webVR is supported */
  var vrSupported: Boolean = js.native
}
object IDisplayChangedEventArgs {
  
  @scala.inline
  def apply(vrSupported: Boolean): IDisplayChangedEventArgs = {
    val __obj = js.Dynamic.literal(vrSupported = vrSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayChangedEventArgs]
  }
  
  @scala.inline
  implicit class IDisplayChangedEventArgsMutableBuilder[Self <: IDisplayChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVrDisplay(value: Nullable[_]): Self = StObject.set(x, "vrDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVrDisplayNull: Self = StObject.set(x, "vrDisplay", null)
    
    @scala.inline
    def setVrSupported(value: Boolean): Self = StObject.set(x, "vrSupported", value.asInstanceOf[js.Any])
  }
}
