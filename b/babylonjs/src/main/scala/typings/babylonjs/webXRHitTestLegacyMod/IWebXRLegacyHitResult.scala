package typings.babylonjs.webXRHitTestLegacyMod

import typings.babylonjs.XRHitResult
import typings.babylonjs.XRHitTestResult
import typings.babylonjs.mathVectorMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRLegacyHitResult extends js.Object {
  
  /**
    * Transformation matrix that can be applied to a node that will put it in the hit point location
    */
  var transformationMatrix: Matrix = js.native
  
  /**
    * The native hit test result
    */
  var xrHitResult: XRHitResult | XRHitTestResult = js.native
}
object IWebXRLegacyHitResult {
  
  @scala.inline
  def apply(transformationMatrix: Matrix, xrHitResult: XRHitResult | XRHitTestResult): IWebXRLegacyHitResult = {
    val __obj = js.Dynamic.literal(transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrHitResult = xrHitResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRLegacyHitResult]
  }
  
  @scala.inline
  implicit class IWebXRLegacyHitResultOps[Self <: IWebXRLegacyHitResult] (val x: Self) extends AnyVal {
    
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
    def setTransformationMatrix(value: Matrix): Self = this.set("transformationMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrHitResult(value: XRHitResult | XRHitTestResult): Self = this.set("xrHitResult", value.asInstanceOf[js.Any])
  }
}
