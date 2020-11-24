package typings.browserSync.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn extends js.Object {
  
  var fn: js.UndefOr[js.Function2[/* snippet */ String, /* match */ String, _]] = js.native
  
  var `match`: js.UndefOr[RegExp] = js.native
}
object Fn {
  
  @scala.inline
  def apply(): Fn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fn]
  }
  
  @scala.inline
  implicit class FnOps[Self <: Fn] (val x: Self) extends AnyVal {
    
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
    def setFn(value: (/* snippet */ String, /* match */ String) => _): Self = this.set("fn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    
    @scala.inline
    def setMatch(value: RegExp): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
  }
}
