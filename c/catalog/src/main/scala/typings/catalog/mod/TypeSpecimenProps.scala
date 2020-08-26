package typings.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeSpecimenProps extends js.Object {
  var color: js.UndefOr[String] = js.native
  var font: String = js.native
  var headings: js.Array[Double | String] = js.native
  var style: js.UndefOr[String] = js.native
  var weight: String = js.native
}

object TypeSpecimenProps {
  @scala.inline
  def apply(font: String, headings: js.Array[Double | String], weight: String): TypeSpecimenProps = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], headings = headings.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSpecimenProps]
  }
  @scala.inline
  implicit class TypeSpecimenPropsOps[Self <: TypeSpecimenProps] (val x: Self) extends AnyVal {
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
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadingsVarargs(value: (Double | String)*): Self = this.set("headings", js.Array(value :_*))
    @scala.inline
    def setHeadings(value: js.Array[Double | String]): Self = this.set("headings", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: String): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

