package typings.camljs.anon

import typings.camljs.mod.Aggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stdev extends Aggregation {
  var stdev: String = js.native
}

object Stdev {
  @scala.inline
  def apply(stdev: String): Stdev = {
    val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stdev]
  }
  @scala.inline
  implicit class StdevOps[Self <: Stdev] (val x: Self) extends AnyVal {
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
    def setStdev(value: String): Self = this.set("stdev", value.asInstanceOf[js.Any])
  }
  
}

