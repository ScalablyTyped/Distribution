package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeProperties extends ComponentProperties {
  var withCheckbox: js.UndefOr[Boolean] = js.native
}

object TreeProperties {
  @scala.inline
  def apply(): TreeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeProperties]
  }
  @scala.inline
  implicit class TreePropertiesOps[Self <: TreeProperties] (val x: Self) extends AnyVal {
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
    def setWithCheckbox(value: Boolean): Self = this.set("withCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCheckbox: Self = this.set("withCheckbox", js.undefined)
  }
  
}

