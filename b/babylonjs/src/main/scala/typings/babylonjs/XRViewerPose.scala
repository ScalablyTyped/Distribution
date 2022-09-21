package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRViewerPose
  extends StObject
     with XRPose {
  
  val views: js.Array[XRView]
}
object XRViewerPose {
  
  inline def apply(emulatedPosition: Boolean, transform: XRRigidTransform, views: js.Array[XRView]): XRViewerPose = {
    val __obj = js.Dynamic.literal(emulatedPosition = emulatedPosition.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRViewerPose]
  }
  
  extension [Self <: XRViewerPose](x: Self) {
    
    inline def setViews(value: js.Array[XRView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsVarargs(value: XRView*): Self = StObject.set(x, "views", js.Array(value*))
  }
}
