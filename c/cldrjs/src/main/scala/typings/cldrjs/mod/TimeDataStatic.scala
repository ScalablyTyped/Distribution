package typings.cldrjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeDataStatic extends js.Object {
  
  def allowed(): String = js.native
  
  def preferred(): String = js.native
}
object TimeDataStatic {
  
  @scala.inline
  def apply(allowed: () => String, preferred: () => String): TimeDataStatic = {
    val __obj = js.Dynamic.literal(allowed = js.Any.fromFunction0(allowed), preferred = js.Any.fromFunction0(preferred))
    __obj.asInstanceOf[TimeDataStatic]
  }
  
  @scala.inline
  implicit class TimeDataStaticOps[Self <: TimeDataStatic] (val x: Self) extends AnyVal {
    
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
    def setAllowed(value: () => String): Self = this.set("allowed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreferred(value: () => String): Self = this.set("preferred", js.Any.fromFunction0(value))
  }
}
