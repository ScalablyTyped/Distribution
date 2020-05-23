package typings.babylonjs.anon

import typings.babylonjs.BABYLON.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Weight extends js.Object {
  var blurred: PostProcess
  var weight: Double
}

object Weight {
  @scala.inline
  def apply(blurred: PostProcess, weight: Double): Weight = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weight]
  }
}

