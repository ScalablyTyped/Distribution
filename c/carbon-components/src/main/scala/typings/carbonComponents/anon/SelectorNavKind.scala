package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectorNavKind extends js.Object {
  var selectorInit: String = js.native
  var selectorNavKind: String = js.native
  var selectorSubmenu: String = js.native
  var selectorSubmenuItem: String = js.native
  var selectorSubmenuLink: String = js.native
}

object SelectorNavKind {
  @scala.inline
  def apply(
    selectorInit: String,
    selectorNavKind: String,
    selectorSubmenu: String,
    selectorSubmenuItem: String,
    selectorSubmenuLink: String
  ): SelectorNavKind = {
    val __obj = js.Dynamic.literal(selectorInit = selectorInit.asInstanceOf[js.Any], selectorNavKind = selectorNavKind.asInstanceOf[js.Any], selectorSubmenu = selectorSubmenu.asInstanceOf[js.Any], selectorSubmenuItem = selectorSubmenuItem.asInstanceOf[js.Any], selectorSubmenuLink = selectorSubmenuLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNavKind]
  }
  @scala.inline
  implicit class SelectorNavKindOps[Self <: SelectorNavKind] (val x: Self) extends AnyVal {
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
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorNavKind(value: String): Self = this.set("selectorNavKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorSubmenu(value: String): Self = this.set("selectorSubmenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorSubmenuItem(value: String): Self = this.set("selectorSubmenuItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorSubmenuLink(value: String): Self = this.set("selectorSubmenuLink", value.asInstanceOf[js.Any])
  }
  
}

