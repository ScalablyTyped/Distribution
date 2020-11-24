package typings.babylonjs.BABYLON

import typings.babylonjs.XRHitTestResult
import typings.babylonjs.XRInputSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRHitResult extends IWebXRLegacyHitResult {
  
  /**
    * The input source that generated this hit test (if transient)
    */
  var inputSource: js.UndefOr[XRInputSource] = js.native
  
  /**
    * Is this a transient hit test
    */
  var isTransient: js.UndefOr[Boolean] = js.native
  
  /**
    * Position of the hit test result
    */
  var position: Vector3 = js.native
  
  /**
    * Rotation of the hit test result
    */
  var rotationQuaternion: Quaternion = js.native
  
  /**
    * The native hit test result
    */
  @JSName("xrHitResult")
  var xrHitResult_IWebXRHitResult: XRHitTestResult = js.native
}
object IWebXRHitResult {
  
  @scala.inline
  def apply(
    position: Vector3,
    rotationQuaternion: Quaternion,
    transformationMatrix: Matrix,
    xrHitResult: XRHitTestResult
  ): IWebXRHitResult = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], rotationQuaternion = rotationQuaternion.asInstanceOf[js.Any], transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrHitResult = xrHitResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRHitResult]
  }
  
  @scala.inline
  implicit class IWebXRHitResultOps[Self <: IWebXRHitResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPosition(value: Vector3): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationQuaternion(value: Quaternion): Self = this.set("rotationQuaternion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrHitResult(value: XRHitTestResult): Self = this.set("xrHitResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSource(value: XRInputSource): Self = this.set("inputSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSource: Self = this.set("inputSource", js.undefined)
    
    @scala.inline
    def setIsTransient(value: Boolean): Self = this.set("isTransient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTransient: Self = this.set("isTransient", js.undefined)
  }
}
