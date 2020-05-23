package typings.babylonjs.anon

import typings.babylonjs.postProcessMod.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blurred extends js.Object {
  var blurred: PostProcess
  var weight: Double
}

object Blurred {
  @scala.inline
  def apply(blurred: PostProcess, weight: Double): Blurred = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blurred]
  }
}

