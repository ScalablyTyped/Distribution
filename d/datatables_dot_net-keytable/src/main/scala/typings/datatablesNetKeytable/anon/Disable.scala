package typings.datatablesNetKeytable.anon

import typings.datatablesNetKeytable.DataTables.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disable extends js.Object {
  
  /*
    * Disable KeyTable's interactions (mouse and keyboard)
    */
  def disable(): Api = js.native
  
  /*
    * Enable or disable KeyTable's interactions (mouse and keyboard)
    */
  def enable(): Api = js.native
}
object Disable {
  
  @scala.inline
  def apply(disable: () => Api, enable: () => Api): Disable = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
    __obj.asInstanceOf[Disable]
  }
  
  @scala.inline
  implicit class DisableOps[Self <: Disable] (val x: Self) extends AnyVal {
    
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
    def setDisable(value: () => Api): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => Api): Self = this.set("enable", js.Any.fromFunction0(value))
  }
}
