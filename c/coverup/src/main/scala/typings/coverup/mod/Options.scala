package typings.coverup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var char: js.UndefOr[String] = js.native
  var compactTo: js.UndefOr[Double] = js.native
  var keepLeft: js.UndefOr[Double] = js.native
  var keepRight: js.UndefOr[Double] = js.native
  var keepSymbols: js.UndefOr[Boolean] = js.native
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
    def setChar(value: String): Self = this.set("char", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChar: Self = this.set("char", js.undefined)
    @scala.inline
    def setCompactTo(value: Double): Self = this.set("compactTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactTo: Self = this.set("compactTo", js.undefined)
    @scala.inline
    def setKeepLeft(value: Double): Self = this.set("keepLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepLeft: Self = this.set("keepLeft", js.undefined)
    @scala.inline
    def setKeepRight(value: Double): Self = this.set("keepRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepRight: Self = this.set("keepRight", js.undefined)
    @scala.inline
    def setKeepSymbols(value: Boolean): Self = this.set("keepSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepSymbols: Self = this.set("keepSymbols", js.undefined)
  }
  
}

