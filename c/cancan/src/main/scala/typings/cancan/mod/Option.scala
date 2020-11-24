package typings.cancan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends js.Object {
  
  var createError: js.UndefOr[js.Function0[_]] = js.native
  
  var instanceOf: js.UndefOr[js.Function2[/* instance */ js.Any, /* model */ js.Any, Boolean]] = js.native
}
object Option {
  
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    
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
    def setCreateError(value: () => _): Self = this.set("createError", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCreateError: Self = this.set("createError", js.undefined)
    
    @scala.inline
    def setInstanceOf(value: (/* instance */ js.Any, /* model */ js.Any) => Boolean): Self = this.set("instanceOf", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInstanceOf: Self = this.set("instanceOf", js.undefined)
  }
}
