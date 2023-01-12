package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRWorldInformation extends StObject {
  
  var detectedMeshes: js.UndefOr[XRMeshSet] = js.undefined
  
  var detectedPlanes: js.UndefOr[XRPlaneSet] = js.undefined
}
object XRWorldInformation {
  
  inline def apply(): XRWorldInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRWorldInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRWorldInformation] (val x: Self) extends AnyVal {
    
    inline def setDetectedMeshes(value: XRMeshSet): Self = StObject.set(x, "detectedMeshes", value.asInstanceOf[js.Any])
    
    inline def setDetectedMeshesUndefined: Self = StObject.set(x, "detectedMeshes", js.undefined)
    
    inline def setDetectedPlanes(value: XRPlaneSet): Self = StObject.set(x, "detectedPlanes", value.asInstanceOf[js.Any])
    
    inline def setDetectedPlanesUndefined: Self = StObject.set(x, "detectedPlanes", js.undefined)
  }
}
