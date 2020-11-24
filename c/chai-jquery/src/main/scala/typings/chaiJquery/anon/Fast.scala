package typings.chaiJquery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fast extends js.Object {
  
  var fast: Double = js.native
  
  var slow: Double = js.native
}
object Fast {
  
  @scala.inline
  def apply(fast: Double, slow: Double): Fast = {
    val __obj = js.Dynamic.literal(fast = fast.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fast]
  }
  
  @scala.inline
  implicit class FastOps[Self <: Fast] (val x: Self) extends AnyVal {
    
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
    def setFast(value: Double): Self = this.set("fast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlow(value: Double): Self = this.set("slow", value.asInstanceOf[js.Any])
  }
}
