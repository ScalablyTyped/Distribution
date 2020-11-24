package typings.bodyScrollLock.mod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyScrollOptions extends js.Object {
  
  var allowTouchMove: js.UndefOr[js.Function1[/* el */ HTMLElement | Element, Unit]] = js.native
  
  var reserveScrollBarGap: js.UndefOr[Boolean] = js.native
}
object BodyScrollOptions {
  
  @scala.inline
  def apply(): BodyScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyScrollOptions]
  }
  
  @scala.inline
  implicit class BodyScrollOptionsOps[Self <: BodyScrollOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowTouchMove(value: /* el */ HTMLElement | Element => Unit): Self = this.set("allowTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAllowTouchMove: Self = this.set("allowTouchMove", js.undefined)
    
    @scala.inline
    def setReserveScrollBarGap(value: Boolean): Self = this.set("reserveScrollBarGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserveScrollBarGap: Self = this.set("reserveScrollBarGap", js.undefined)
  }
}
