package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stylesheet extends Node {
  var stylesheet: js.UndefOr[StyleRules] = js.native
}

object Stylesheet {
  @scala.inline
  def apply(): Stylesheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stylesheet]
  }
  @scala.inline
  implicit class StylesheetOps[Self <: Stylesheet] (val x: Self) extends AnyVal {
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
    def setStylesheet(value: StyleRules): Self = this.set("stylesheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylesheet: Self = this.set("stylesheet", js.undefined)
  }
  
}

