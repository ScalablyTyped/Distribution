package typings.babylonjs

import typings.babylonjs.BABYLON.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCircleOfConfusion extends js.Object {
  var blurSteps: js.Array[PostProcess]
  var circleOfConfusion: PostProcess
}

object AnonCircleOfConfusion {
  @scala.inline
  def apply(blurSteps: js.Array[PostProcess], circleOfConfusion: PostProcess): AnonCircleOfConfusion = {
    val __obj = js.Dynamic.literal(blurSteps = blurSteps.asInstanceOf[js.Any], circleOfConfusion = circleOfConfusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCircleOfConfusion]
  }
}

