package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassActive extends js.Object {
  var classActive: String = js.native
  var selectorAccordionContent: String = js.native
  var selectorAccordionItem: String = js.native
  var selectorAccordionItemHeading: String = js.native
  var selectorInit: String = js.native
}

object ClassActive {
  @scala.inline
  def apply(
    classActive: String,
    selectorAccordionContent: String,
    selectorAccordionItem: String,
    selectorAccordionItemHeading: String,
    selectorInit: String
  ): ClassActive = {
    val __obj = js.Dynamic.literal(classActive = classActive.asInstanceOf[js.Any], selectorAccordionContent = selectorAccordionContent.asInstanceOf[js.Any], selectorAccordionItem = selectorAccordionItem.asInstanceOf[js.Any], selectorAccordionItemHeading = selectorAccordionItemHeading.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassActive]
  }
  @scala.inline
  implicit class ClassActiveOps[Self <: ClassActive] (val x: Self) extends AnyVal {
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
    def setClassActive(value: String): Self = this.set("classActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorAccordionContent(value: String): Self = this.set("selectorAccordionContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorAccordionItem(value: String): Self = this.set("selectorAccordionItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorAccordionItemHeading(value: String): Self = this.set("selectorAccordionItemHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
  }
  
}

