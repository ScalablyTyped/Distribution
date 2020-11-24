package typings.bootstrap.anon

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<bootstrap.bootstrap/js/dist/collapse.Collapse.Options> */
@js.native
trait PartialOptionsParent extends js.Object {
  
  var parent: js.UndefOr[String | Element | JQuery[HTMLElement]] = js.native
  
  var toggle: js.UndefOr[Boolean] = js.native
}
object PartialOptionsParent {
  
  @scala.inline
  def apply(): PartialOptionsParent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsParent]
  }
  
  @scala.inline
  implicit class PartialOptionsParentOps[Self <: PartialOptionsParent] (val x: Self) extends AnyVal {
    
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
    def setParent(value: String | Element | JQuery[HTMLElement]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
}
