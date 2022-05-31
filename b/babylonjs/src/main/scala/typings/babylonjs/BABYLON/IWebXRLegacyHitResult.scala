package typings.babylonjs.BABYLON

import typings.babylonjs.XRHitResult
import typings.babylonjs.XRHitTestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRLegacyHitResult extends StObject {
  
  /**
    * Transformation matrix that can be applied to a node that will put it in the hit point location
    */
  var transformationMatrix: Matrix
  
  /**
    * The native hit test result
    */
  var xrHitResult: XRHitResult | XRHitTestResult
}
object IWebXRLegacyHitResult {
  
  inline def apply(transformationMatrix: Matrix, xrHitResult: XRHitResult | XRHitTestResult): IWebXRLegacyHitResult = {
    val __obj = js.Dynamic.literal(transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrHitResult = xrHitResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRLegacyHitResult]
  }
  
  extension [Self <: IWebXRLegacyHitResult](x: Self) {
    
    inline def setTransformationMatrix(value: Matrix): Self = StObject.set(x, "transformationMatrix", value.asInstanceOf[js.Any])
    
    inline def setXrHitResult(value: XRHitResult | XRHitTestResult): Self = StObject.set(x, "xrHitResult", value.asInstanceOf[js.Any])
  }
}
