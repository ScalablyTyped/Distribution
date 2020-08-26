package typings.commonTags.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conjunction extends js.Object {
  var conjunction: js.UndefOr[String] = js.native
  var separator: js.UndefOr[String] = js.native
  var serial: js.UndefOr[Boolean] = js.native
}

object Conjunction {
  @scala.inline
  def apply(): Conjunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conjunction]
  }
  @scala.inline
  implicit class ConjunctionOps[Self <: Conjunction] (val x: Self) extends AnyVal {
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
    def setConjunction(value: String): Self = this.set("conjunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConjunction: Self = this.set("conjunction", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setSerial(value: Boolean): Self = this.set("serial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerial: Self = this.set("serial", js.undefined)
  }
  
}

