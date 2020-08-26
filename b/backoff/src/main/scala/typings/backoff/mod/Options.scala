package typings.backoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var initialDelay: js.UndefOr[Double] = js.native
  var maxDelay: js.UndefOr[Double] = js.native
  var randomisationFactor: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setInitialDelay(value: Double): Self = this.set("initialDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialDelay: Self = this.set("initialDelay", js.undefined)
    @scala.inline
    def setMaxDelay(value: Double): Self = this.set("maxDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDelay: Self = this.set("maxDelay", js.undefined)
    @scala.inline
    def setRandomisationFactor(value: Double): Self = this.set("randomisationFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomisationFactor: Self = this.set("randomisationFactor", js.undefined)
  }
  
}

