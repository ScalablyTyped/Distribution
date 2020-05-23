package typings.chance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Likelihood extends js.Object {
  var likelihood: Double
}

object Likelihood {
  @scala.inline
  def apply(likelihood: Double): Likelihood = {
    val __obj = js.Dynamic.literal(likelihood = likelihood.asInstanceOf[js.Any])
    __obj.asInstanceOf[Likelihood]
  }
}

