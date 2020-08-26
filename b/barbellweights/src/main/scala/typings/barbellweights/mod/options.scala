package typings.barbellweights.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait options extends js.Object {
  var bar: js.UndefOr[Double] = js.native
  var plates: js.UndefOr[js.Array[Double]] = js.native
  var program: js.UndefOr[String] = js.native
  var warmup_round_to: js.UndefOr[Double] = js.native
}

object options {
  @scala.inline
  def apply(): options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[options]
  }
  @scala.inline
  implicit class optionsOps[Self <: options] (val x: Self) extends AnyVal {
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
    def setBar(value: Double): Self = this.set("bar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    @scala.inline
    def setPlatesVarargs(value: Double*): Self = this.set("plates", js.Array(value :_*))
    @scala.inline
    def setPlates(value: js.Array[Double]): Self = this.set("plates", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlates: Self = this.set("plates", js.undefined)
    @scala.inline
    def setProgram(value: String): Self = this.set("program", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    @scala.inline
    def setWarmup_round_to(value: Double): Self = this.set("warmup_round_to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarmup_round_to: Self = this.set("warmup_round_to", js.undefined)
  }
  
}

