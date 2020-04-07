package typings.babylonjs

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRHitResult extends js.Object {
  var hitMatrix: Float32Array
}

object XRHitResult {
  @scala.inline
  def apply(hitMatrix: Float32Array): XRHitResult = {
    val __obj = js.Dynamic.literal(hitMatrix = hitMatrix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XRHitResult]
  }
}

