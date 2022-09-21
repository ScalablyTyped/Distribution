package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackConstraints
  extends StObject
     with MediaTrackConstraintSet {
  
  var advanced: js.UndefOr[Array[MediaTrackConstraintSet]] = js.undefined
}
object MediaTrackConstraints {
  
  inline def apply(): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraints]
  }
  
  extension [Self <: MediaTrackConstraints](x: Self) {
    
    inline def setAdvanced(value: Array[MediaTrackConstraintSet]): Self = StObject.set(x, "advanced", value.asInstanceOf[js.Any])
    
    inline def setAdvancedUndefined: Self = StObject.set(x, "advanced", js.undefined)
  }
}
