package typings.babylonjs

import typings.babylonjs.BABYLON.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWeight extends js.Object {
  var blurred: PostProcess
  var weight: Double
}

object AnonWeight {
  @scala.inline
  def apply(blurred: PostProcess, weight: Double): AnonWeight = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWeight]
  }
}

