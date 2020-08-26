package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttribLabelCollapse extends js.Object {
  var attribLabelCollapse: String = js.native
  var attribLabelExpand: String = js.native
  var classNavigationMenuPanelHeaderActionActive: String = js.native
  var eventAfterCollapsed: String = js.native
  var eventAfterExpanded: String = js.native
  var eventBeforeCollapsed: String = js.native
  var eventBeforeExpanded: String = js.native
  var initEventNames: js.Array[String] = js.native
  var selectorFocusableMenuItem: String = js.native
}

object AttribLabelCollapse {
  @scala.inline
  def apply(
    attribLabelCollapse: String,
    attribLabelExpand: String,
    classNavigationMenuPanelHeaderActionActive: String,
    eventAfterCollapsed: String,
    eventAfterExpanded: String,
    eventBeforeCollapsed: String,
    eventBeforeExpanded: String,
    initEventNames: js.Array[String],
    selectorFocusableMenuItem: String
  ): AttribLabelCollapse = {
    val __obj = js.Dynamic.literal(attribLabelCollapse = attribLabelCollapse.asInstanceOf[js.Any], attribLabelExpand = attribLabelExpand.asInstanceOf[js.Any], classNavigationMenuPanelHeaderActionActive = classNavigationMenuPanelHeaderActionActive.asInstanceOf[js.Any], eventAfterCollapsed = eventAfterCollapsed.asInstanceOf[js.Any], eventAfterExpanded = eventAfterExpanded.asInstanceOf[js.Any], eventBeforeCollapsed = eventBeforeCollapsed.asInstanceOf[js.Any], eventBeforeExpanded = eventBeforeExpanded.asInstanceOf[js.Any], initEventNames = initEventNames.asInstanceOf[js.Any], selectorFocusableMenuItem = selectorFocusableMenuItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttribLabelCollapse]
  }
  @scala.inline
  implicit class AttribLabelCollapseOps[Self <: AttribLabelCollapse] (val x: Self) extends AnyVal {
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
    def setAttribLabelCollapse(value: String): Self = this.set("attribLabelCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttribLabelExpand(value: String): Self = this.set("attribLabelExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassNavigationMenuPanelHeaderActionActive(value: String): Self = this.set("classNavigationMenuPanelHeaderActionActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventAfterCollapsed(value: String): Self = this.set("eventAfterCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventAfterExpanded(value: String): Self = this.set("eventAfterExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventBeforeCollapsed(value: String): Self = this.set("eventBeforeCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventBeforeExpanded(value: String): Self = this.set("eventBeforeExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitEventNamesVarargs(value: String*): Self = this.set("initEventNames", js.Array(value :_*))
    @scala.inline
    def setInitEventNames(value: js.Array[String]): Self = this.set("initEventNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorFocusableMenuItem(value: String): Self = this.set("selectorFocusableMenuItem", value.asInstanceOf[js.Any])
  }
  
}

