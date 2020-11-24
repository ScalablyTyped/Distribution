package typings.babelTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cooked extends js.Object {
  
  var cooked: js.UndefOr[String] = js.native
  
  var raw: js.UndefOr[String] = js.native
}
object Cooked {
  
  @scala.inline
  def apply(): Cooked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cooked]
  }
  
  @scala.inline
  implicit class CookedOps[Self <: Cooked] (val x: Self) extends AnyVal {
    
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
    def setCooked(value: String): Self = this.set("cooked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCooked: Self = this.set("cooked", js.undefined)
    
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
}
