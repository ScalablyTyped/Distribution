package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TitledComponentProperties extends js.Object {
  /**
    * The title for the component. This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.native
}

object TitledComponentProperties {
  @scala.inline
  def apply(): TitledComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitledComponentProperties]
  }
  @scala.inline
  implicit class TitledComponentPropertiesOps[Self <: TitledComponentProperties] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

