package typings.clmtrackr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseWebWorkers extends js.Object {
  
  /** whether to use web workers for face detection (default is true) */
  var useWebWorkers: js.UndefOr[Boolean] = js.native
}
object UseWebWorkers {
  
  @scala.inline
  def apply(): UseWebWorkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseWebWorkers]
  }
  
  @scala.inline
  implicit class UseWebWorkersOps[Self <: UseWebWorkers] (val x: Self) extends AnyVal {
    
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
    def setUseWebWorkers(value: Boolean): Self = this.set("useWebWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseWebWorkers: Self = this.set("useWebWorkers", js.undefined)
  }
}
