package typings.babylonjs.anon

import typings.babylonjs.BABYLON.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOfConfusion extends js.Object {
  var blurSteps: js.Array[PostProcess]
  var circleOfConfusion: PostProcess
}

object CircleOfConfusion {
  @scala.inline
  def apply(blurSteps: js.Array[PostProcess], circleOfConfusion: PostProcess): CircleOfConfusion = {
    val __obj = js.Dynamic.literal(blurSteps = blurSteps.asInstanceOf[js.Any], circleOfConfusion = circleOfConfusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOfConfusion]
  }
}

