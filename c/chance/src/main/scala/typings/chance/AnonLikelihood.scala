package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLikelihood extends js.Object {
  var likelihood: Double
}

object AnonLikelihood {
  @scala.inline
  def apply(likelihood: Double): AnonLikelihood = {
    val __obj = js.Dynamic.literal(likelihood = likelihood.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLikelihood]
  }
}

