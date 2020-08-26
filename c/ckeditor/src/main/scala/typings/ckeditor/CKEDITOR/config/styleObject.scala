package typings.ckeditor.CKEDITOR.config

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait styleObject extends js.Object {
  var attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  var element: String = js.native
  var name: js.UndefOr[String] = js.native
  var overrides: js.UndefOr[StringDictionary[js.Any]] = js.native
  var styles: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object styleObject {
  @scala.inline
  def apply(element: String): styleObject = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[styleObject]
  }
  @scala.inline
  implicit class styleObjectOps[Self <: styleObject] (val x: Self) extends AnyVal {
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
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: StringDictionary[js.Any]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOverrides(value: StringDictionary[js.Any]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setStyles(value: StringDictionary[js.Any]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

