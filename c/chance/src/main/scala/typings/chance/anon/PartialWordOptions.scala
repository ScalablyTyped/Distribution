package typings.chance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.WordOptions> */
@js.native
trait PartialWordOptions extends js.Object {
  var capitalize: js.UndefOr[Boolean] = js.native
  var length: js.UndefOr[Double] = js.native
  var syllables: js.UndefOr[Double] = js.native
}

object PartialWordOptions {
  @scala.inline
  def apply(): PartialWordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWordOptions]
  }
  @scala.inline
  implicit class PartialWordOptionsOps[Self <: PartialWordOptions] (val x: Self) extends AnyVal {
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
    def setCapitalize(value: Boolean): Self = this.set("capitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapitalize: Self = this.set("capitalize", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setSyllables(value: Double): Self = this.set("syllables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyllables: Self = this.set("syllables", js.undefined)
  }
  
}

