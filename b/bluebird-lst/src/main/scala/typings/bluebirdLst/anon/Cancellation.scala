package typings.bluebirdLst.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancellation extends js.Object {
  
  /** Enable cancellation */
  var cancellation: js.UndefOr[Boolean] = js.native
  
  /** Enable long stack traces */
  var longStackTraces: js.UndefOr[Boolean] = js.native
  
  /** Enable monitoring */
  var monitoring: js.UndefOr[Boolean] = js.native
  
  /** Enable warnings */
  var warnings: js.UndefOr[Boolean | WForgottenReturn] = js.native
}
object Cancellation {
  
  @scala.inline
  def apply(): Cancellation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancellation]
  }
  
  @scala.inline
  implicit class CancellationOps[Self <: Cancellation] (val x: Self) extends AnyVal {
    
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
    def setCancellation(value: Boolean): Self = this.set("cancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancellation: Self = this.set("cancellation", js.undefined)
    
    @scala.inline
    def setLongStackTraces(value: Boolean): Self = this.set("longStackTraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongStackTraces: Self = this.set("longStackTraces", js.undefined)
    
    @scala.inline
    def setMonitoring(value: Boolean): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoring: Self = this.set("monitoring", js.undefined)
    
    @scala.inline
    def setWarnings(value: Boolean | WForgottenReturn): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
