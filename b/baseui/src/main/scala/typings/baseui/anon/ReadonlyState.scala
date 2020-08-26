package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/phone-input.State> */
@js.native
trait ReadonlyState extends js.Object {
  val country: ReadonlyCountry = js.native
  val text: js.UndefOr[String] = js.native
}

object ReadonlyState {
  @scala.inline
  def apply(country: ReadonlyCountry): ReadonlyState = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyState]
  }
  @scala.inline
  implicit class ReadonlyStateOps[Self <: ReadonlyState] (val x: Self) extends AnyVal {
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
    def setCountry(value: ReadonlyCountry): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

