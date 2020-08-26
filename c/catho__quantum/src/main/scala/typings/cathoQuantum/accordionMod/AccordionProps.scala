package typings.cathoQuantum.accordionMod

import typings.cathoQuantum.anon.BaseFontSize
import typings.cathoQuantum.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionProps extends js.Object {
  var items: js.Array[Content] = js.native
  var keepOnlyOneOpen: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[BaseFontSize] = js.native
}

object AccordionProps {
  @scala.inline
  def apply(items: js.Array[Content]): AccordionProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps]
  }
  @scala.inline
  implicit class AccordionPropsOps[Self <: AccordionProps] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Content*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Content]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepOnlyOneOpen(value: Boolean): Self = this.set("keepOnlyOneOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepOnlyOneOpen: Self = this.set("keepOnlyOneOpen", js.undefined)
    @scala.inline
    def setTheme(value: BaseFontSize): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

