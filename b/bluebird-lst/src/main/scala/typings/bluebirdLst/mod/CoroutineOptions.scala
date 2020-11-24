package typings.bluebirdLst.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoroutineOptions extends js.Object {
  
  def yieldHandler(value: js.Any): js.Any = js.native
}
object CoroutineOptions {
  
  @scala.inline
  def apply(yieldHandler: js.Any => js.Any): CoroutineOptions = {
    val __obj = js.Dynamic.literal(yieldHandler = js.Any.fromFunction1(yieldHandler))
    __obj.asInstanceOf[CoroutineOptions]
  }
  
  @scala.inline
  implicit class CoroutineOptionsOps[Self <: CoroutineOptions] (val x: Self) extends AnyVal {
    
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
    def setYieldHandler(value: js.Any => js.Any): Self = this.set("yieldHandler", js.Any.fromFunction1(value))
  }
}
