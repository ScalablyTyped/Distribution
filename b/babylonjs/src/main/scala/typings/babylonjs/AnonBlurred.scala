package typings.babylonjs

import typings.babylonjs.postProcessMod.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlurred extends js.Object {
  var blurred: PostProcess
  var weight: Double
}

object AnonBlurred {
  @scala.inline
  def apply(blurred: PostProcess, weight: Double): AnonBlurred = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlurred]
  }
}

