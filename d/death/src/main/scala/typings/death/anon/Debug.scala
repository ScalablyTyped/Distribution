package typings.death.anon

import typings.death.deathBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debug extends js.Object {
  
  var SIGINT: js.UndefOr[Boolean] = js.native
  
  var SIGQUIT: js.UndefOr[Boolean] = js.native
  
  var SIGTERM: js.UndefOr[Boolean] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var uncaughtException: `true` = js.native
}
object Debug {
  
  @scala.inline
  def apply(uncaughtException: `true`): Debug = {
    val __obj = js.Dynamic.literal(uncaughtException = uncaughtException.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit class DebugOps[Self <: Debug] (val x: Self) extends AnyVal {
    
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
    def setUncaughtException(value: `true`): Self = this.set("uncaughtException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGINT(value: Boolean): Self = this.set("SIGINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSIGINT: Self = this.set("SIGINT", js.undefined)
    
    @scala.inline
    def setSIGQUIT(value: Boolean): Self = this.set("SIGQUIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSIGQUIT: Self = this.set("SIGQUIT", js.undefined)
    
    @scala.inline
    def setSIGTERM(value: Boolean): Self = this.set("SIGTERM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSIGTERM: Self = this.set("SIGTERM", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
  }
}
