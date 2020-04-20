package typings.babylonjs.BABYLON

import typings.babylonjs.XRHitResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRHitResult extends js.Object {
  /**
    * Transformation matrix that can be applied to a node that will put it in the hit point location
    */
  var transformationMatrix: Matrix
  /**
    * The native hit test result
    */
  var xrHitResult: XRHitResult
}

object IWebXRHitResult {
  @scala.inline
  def apply(transformationMatrix: Matrix, xrHitResult: XRHitResult): IWebXRHitResult = {
    val __obj = js.Dynamic.literal(transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrHitResult = xrHitResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRHitResult]
  }
}

