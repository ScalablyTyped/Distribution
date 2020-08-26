package typings.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionConstructionOptions extends js.Object {
  /**
    * Prevents error on missing element. (undocumented)
    */
  var allowMissingEl: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the element for the region to manage. This may be
    * a selector string, a raw DOM node reference or a jQuery wrapped
    * DOM node.
    */
  var el: js.UndefOr[js.Any] = js.native
  /**
    * Element to use as context when finding el via jQuery. Defaults to the
    * the document. (undocumented)
    */
  var parentEl: js.UndefOr[String] = js.native
  /**
    * Overwrite the parent el of the region with the rendered contents of
    * the inner View.
    */
  var replaceElement: js.UndefOr[String] = js.native
}

object RegionConstructionOptions {
  @scala.inline
  def apply(): RegionConstructionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionConstructionOptions]
  }
  @scala.inline
  implicit class RegionConstructionOptionsOps[Self <: RegionConstructionOptions] (val x: Self) extends AnyVal {
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
    def setAllowMissingEl(value: Boolean): Self = this.set("allowMissingEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMissingEl: Self = this.set("allowMissingEl", js.undefined)
    @scala.inline
    def setEl(value: js.Any): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    @scala.inline
    def setParentEl(value: String): Self = this.set("parentEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentEl: Self = this.set("parentEl", js.undefined)
    @scala.inline
    def setReplaceElement(value: String): Self = this.set("replaceElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceElement: Self = this.set("replaceElement", js.undefined)
  }
  
}

