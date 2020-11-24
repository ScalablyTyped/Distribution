package typings.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<better-scroll.better-scroll.ScrollBarOption> */
@js.native
trait PartialScrollBarOption extends js.Object {
  
  var fade: js.UndefOr[Boolean] = js.native
}
object PartialScrollBarOption {
  
  @scala.inline
  def apply(): PartialScrollBarOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollBarOption]
  }
  
  @scala.inline
  implicit class PartialScrollBarOptionOps[Self <: PartialScrollBarOption] (val x: Self) extends AnyVal {
    
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
    def setFade(value: Boolean): Self = this.set("fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFade: Self = this.set("fade", js.undefined)
  }
}
