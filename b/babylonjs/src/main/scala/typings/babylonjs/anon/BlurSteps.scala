package typings.babylonjs.anon

import typings.babylonjs.postProcessMod.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlurSteps extends js.Object {
  var blurSteps: js.Array[PostProcess]
  var circleOfConfusion: PostProcess
}

object BlurSteps {
  @scala.inline
  def apply(blurSteps: js.Array[PostProcess], circleOfConfusion: PostProcess): BlurSteps = {
    val __obj = js.Dynamic.literal(blurSteps = blurSteps.asInstanceOf[js.Any], circleOfConfusion = circleOfConfusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurSteps]
  }
}

