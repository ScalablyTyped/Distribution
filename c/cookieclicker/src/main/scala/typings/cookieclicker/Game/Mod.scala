package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mod extends js.Object {
  
  var id: js.UndefOr[Double] = js.native
  
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  
  var load: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.native
  
  var save: js.UndefOr[js.Function0[String]] = js.native
}
object Mod {
  
  @scala.inline
  def apply(): Mod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mod]
  }
  
  @scala.inline
  implicit class ModOps[Self <: Mod] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setLoad(value: /* data */ String => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setSave(value: () => String): Self = this.set("save", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
  }
}
