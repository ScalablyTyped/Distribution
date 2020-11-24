package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyListenerOutput extends js.Object {
  
  /**
    * Information about the modified listener.
    */
  var Listeners: js.UndefOr[typings.awsSdk.elbv2Mod.Listeners] = js.native
}
object ModifyListenerOutput {
  
  @scala.inline
  def apply(): ModifyListenerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyListenerOutput]
  }
  
  @scala.inline
  implicit class ModifyListenerOutputOps[Self <: ModifyListenerOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setListenersVarargs(value: Listener*): Self = this.set("Listeners", js.Array(value :_*))
    
    @scala.inline
    def setListeners(value: Listeners): Self = this.set("Listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListeners: Self = this.set("Listeners", js.undefined)
  }
}
