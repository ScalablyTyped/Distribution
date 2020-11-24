package typings.bootbox

import typings.jquery.JQuery
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options available for custom modals */
@js.native
trait BootboxDialogOptions[T] extends BootboxBaseOptions[T] {
  
  var centerVertical: js.UndefOr[Boolean] = js.native
  
  var message: JQuery[HTMLElement] | js.Array[_] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]]) = js.native
  
  var swapButtonOrder: js.UndefOr[Boolean] = js.native
}
object BootboxDialogOptions {
  
  @scala.inline
  def apply[T](
    message: JQuery[HTMLElement] | js.Array[_] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
  ): BootboxDialogOptions[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxDialogOptions[T]]
  }
  
  @scala.inline
  implicit class BootboxDialogOptionsOps[Self <: BootboxDialogOptions[_], T] (val x: Self with BootboxDialogOptions[T]) extends AnyVal {
    
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
    def setMessageFunction2(value: (/* index */ Double, /* html */ String) => String | Element | JQuery[HTMLElement]): Self = this.set("message", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMessageVarargs(value: js.Any*): Self = this.set("message", js.Array(value :_*))
    
    @scala.inline
    def setMessage(
      value: JQuery[HTMLElement] | js.Array[_] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
    ): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterVertical(value: Boolean): Self = this.set("centerVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterVertical: Self = this.set("centerVertical", js.undefined)
    
    @scala.inline
    def setSwapButtonOrder(value: Boolean): Self = this.set("swapButtonOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapButtonOrder: Self = this.set("swapButtonOrder", js.undefined)
  }
}
