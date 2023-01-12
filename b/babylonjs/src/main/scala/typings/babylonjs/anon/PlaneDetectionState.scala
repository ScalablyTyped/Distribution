package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaneDetectionState extends StObject {
  
  var planeDetectionState: js.UndefOr[Enabled] = js.undefined
}
object PlaneDetectionState {
  
  inline def apply(): PlaneDetectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaneDetectionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaneDetectionState] (val x: Self) extends AnyVal {
    
    inline def setPlaneDetectionState(value: Enabled): Self = StObject.set(x, "planeDetectionState", value.asInstanceOf[js.Any])
    
    inline def setPlaneDetectionStateUndefined: Self = StObject.set(x, "planeDetectionState", js.undefined)
  }
}
