package typings.babylonjs

import typings.babylonjs.postProcessMod.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlurSteps extends js.Object {
  var blurSteps: js.Array[PostProcess]
  var circleOfConfusion: PostProcess
}

object AnonBlurSteps {
  @scala.inline
  def apply(blurSteps: js.Array[PostProcess], circleOfConfusion: PostProcess): AnonBlurSteps = {
    val __obj = js.Dynamic.literal(blurSteps = blurSteps.asInstanceOf[js.Any], circleOfConfusion = circleOfConfusion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlurSteps]
  }
}

