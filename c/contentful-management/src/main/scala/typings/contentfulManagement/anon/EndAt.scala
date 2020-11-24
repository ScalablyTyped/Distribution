package typings.contentfulManagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndAt extends js.Object {
  
  var endAt: String = js.native
  
  var startAt: String = js.native
}
object EndAt {
  
  @scala.inline
  def apply(endAt: String, startAt: String): EndAt = {
    val __obj = js.Dynamic.literal(endAt = endAt.asInstanceOf[js.Any], startAt = startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndAt]
  }
  
  @scala.inline
  implicit class EndAtOps[Self <: EndAt] (val x: Self) extends AnyVal {
    
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
    def setEndAt(value: String): Self = this.set("endAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAt(value: String): Self = this.set("startAt", value.asInstanceOf[js.Any])
  }
}
