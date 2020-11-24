package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait COMPLETIONSTATUSKHR extends js.Object {
  
  var COMPLETION_STATUS_KHR: Double = js.native
}
object COMPLETIONSTATUSKHR {
  
  @scala.inline
  def apply(COMPLETION_STATUS_KHR: Double): COMPLETIONSTATUSKHR = {
    val __obj = js.Dynamic.literal(COMPLETION_STATUS_KHR = COMPLETION_STATUS_KHR.asInstanceOf[js.Any])
    __obj.asInstanceOf[COMPLETIONSTATUSKHR]
  }
  
  @scala.inline
  implicit class COMPLETIONSTATUSKHROps[Self <: COMPLETIONSTATUSKHR] (val x: Self) extends AnyVal {
    
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
    def setCOMPLETION_STATUS_KHR(value: Double): Self = this.set("COMPLETION_STATUS_KHR", value.asInstanceOf[js.Any])
  }
}
