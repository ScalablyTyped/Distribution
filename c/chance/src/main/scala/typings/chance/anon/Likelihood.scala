package typings.chance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Likelihood extends js.Object {
  var likelihood: Double = js.native
}

object Likelihood {
  @scala.inline
  def apply(likelihood: Double): Likelihood = {
    val __obj = js.Dynamic.literal(likelihood = likelihood.asInstanceOf[js.Any])
    __obj.asInstanceOf[Likelihood]
  }
  @scala.inline
  implicit class LikelihoodOps[Self <: Likelihood] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLikelihood(value: Double): Self = this.set("likelihood", value.asInstanceOf[js.Any])
  }
  
}

