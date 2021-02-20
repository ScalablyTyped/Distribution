package typings.babylonjs.anon

import typings.babylonjs.XRPlaneSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectedPlanes extends StObject {
  
  var detectedPlanes: js.UndefOr[XRPlaneSet] = js.native
}
object DetectedPlanes {
  
  @scala.inline
  def apply(): DetectedPlanes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedPlanes]
  }
  
  @scala.inline
  implicit class DetectedPlanesMutableBuilder[Self <: DetectedPlanes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectedPlanes(value: XRPlaneSet): Self = StObject.set(x, "detectedPlanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedPlanesUndefined: Self = StObject.set(x, "detectedPlanes", js.undefined)
  }
}
