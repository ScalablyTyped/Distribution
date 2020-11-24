package typings.bson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relaxed extends js.Object {
  
  var relaxed: js.UndefOr[Boolean] = js.native
}
object Relaxed {
  
  @scala.inline
  def apply(): Relaxed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relaxed]
  }
  
  @scala.inline
  implicit class RelaxedOps[Self <: Relaxed] (val x: Self) extends AnyVal {
    
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
    def setRelaxed(value: Boolean): Self = this.set("relaxed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelaxed: Self = this.set("relaxed", js.undefined)
  }
}
