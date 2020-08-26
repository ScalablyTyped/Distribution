package typings.catalog.mod

import typings.catalog.catalogNumbers.`1`
import typings.catalog.catalogNumbers.`2`
import typings.catalog.catalogNumbers.`3`
import typings.catalog.catalogNumbers.`4`
import typings.catalog.catalogNumbers.`5`
import typings.catalog.catalogNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecimenProps extends js.Object {
  var rawBody: js.UndefOr[String] = js.native
  var rawOptions: js.UndefOr[String] = js.native
  var span: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.native
}

object SpecimenProps {
  @scala.inline
  def apply(): SpecimenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenProps]
  }
  @scala.inline
  implicit class SpecimenPropsOps[Self <: SpecimenProps] (val x: Self) extends AnyVal {
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
    def setRawBody(value: String): Self = this.set("rawBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawBody: Self = this.set("rawBody", js.undefined)
    @scala.inline
    def setRawOptions(value: String): Self = this.set("rawOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawOptions: Self = this.set("rawOptions", js.undefined)
    @scala.inline
    def setSpan(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
  }
  
}

