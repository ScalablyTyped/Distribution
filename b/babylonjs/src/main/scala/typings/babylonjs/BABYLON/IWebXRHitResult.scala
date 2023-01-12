package typings.babylonjs.BABYLON

import typings.babylonjs.XRHitTestResult
import typings.babylonjs.XRInputSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRHitResult
  extends StObject
     with IWebXRLegacyHitResult {
  
  /**
    * The input source that generated this hit test (if transient)
    */
  var inputSource: js.UndefOr[XRInputSource] = js.undefined
  
  /**
    * Is this a transient hit test
    */
  var isTransient: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Position of the hit test result
    */
  var position: Vector3
  
  /**
    * Rotation of the hit test result
    */
  var rotationQuaternion: Quaternion
  
  /**
    * The native hit test result
    */
  @JSName("xrHitResult")
  var xrHitResult_IWebXRHitResult: XRHitTestResult
}
object IWebXRHitResult {
  
  inline def apply(
    position: Vector3,
    rotationQuaternion: Quaternion,
    transformationMatrix: Matrix,
    xrHitResult: XRHitTestResult
  ): IWebXRHitResult = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], rotationQuaternion = rotationQuaternion.asInstanceOf[js.Any], transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrHitResult = xrHitResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRHitResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRHitResult] (val x: Self) extends AnyVal {
    
    inline def setInputSource(value: XRInputSource): Self = StObject.set(x, "inputSource", value.asInstanceOf[js.Any])
    
    inline def setInputSourceUndefined: Self = StObject.set(x, "inputSource", js.undefined)
    
    inline def setIsTransient(value: Boolean): Self = StObject.set(x, "isTransient", value.asInstanceOf[js.Any])
    
    inline def setIsTransientUndefined: Self = StObject.set(x, "isTransient", js.undefined)
    
    inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRotationQuaternion(value: Quaternion): Self = StObject.set(x, "rotationQuaternion", value.asInstanceOf[js.Any])
    
    inline def setXrHitResult(value: XRHitTestResult): Self = StObject.set(x, "xrHitResult", value.asInstanceOf[js.Any])
  }
}
