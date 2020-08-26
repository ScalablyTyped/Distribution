package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ratio extends js.Object {
  /**
    * Set max width of each bar
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Set the width of each bar by ratio
    * Defaults to `0.6`.
    */
  var ratio: Double = js.native
}

object Ratio {
  @scala.inline
  def apply(ratio: Double): Ratio = {
    val __obj = js.Dynamic.literal(ratio = ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ratio]
  }
  @scala.inline
  implicit class RatioOps[Self <: Ratio] (val x: Self) extends AnyVal {
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
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
  }
  
}

