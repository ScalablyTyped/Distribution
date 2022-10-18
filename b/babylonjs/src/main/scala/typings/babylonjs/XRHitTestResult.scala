package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRHitTestResult extends StObject {
  
  // When anchor system is enabled
  var createAnchor: js.UndefOr[js.Function1[/* pose */ XRRigidTransform, js.UndefOr[js.Promise[XRAnchor]]]] = js.undefined
  
  def getPose(baseSpace: XRSpace): js.UndefOr[XRPose]
}
object XRHitTestResult {
  
  inline def apply(getPose: XRSpace => js.UndefOr[XRPose]): XRHitTestResult = {
    val __obj = js.Dynamic.literal(getPose = js.Any.fromFunction1(getPose))
    __obj.asInstanceOf[XRHitTestResult]
  }
  
  extension [Self <: XRHitTestResult](x: Self) {
    
    inline def setCreateAnchor(value: /* pose */ XRRigidTransform => js.UndefOr[js.Promise[XRAnchor]]): Self = StObject.set(x, "createAnchor", js.Any.fromFunction1(value))
    
    inline def setCreateAnchorUndefined: Self = StObject.set(x, "createAnchor", js.undefined)
    
    inline def setGetPose(value: XRSpace => js.UndefOr[XRPose]): Self = StObject.set(x, "getPose", js.Any.fromFunction1(value))
  }
}
